package com.itzblaze;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.client.Minecraft;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.*;

class LittleUser {
    public ArrayList<String> scripts;
    public String uuid;

    public LittleUser(ArrayList<String> scripts, String uuid) {
        this.scripts = scripts;
        this.uuid = uuid;
    }
}


public class LicenseUtils {


    public static ArrayList<LittleUser> usersMap = new ArrayList<>();
    public static Thread scriptHashThread = null;
    public static ArrayList<String> scriptHashes = new ArrayList<>();
    public static ArrayList<String> modDigests = new ArrayList<>();
    public static String serverUrl = null;
    public static boolean localBlacklist = false;

    static {
        serverUrl = getServerUrl();
        init();
    }

    public static String encrypt(final String strToEncrypt, final String secret) {
        try {
            byte[] key;
            MessageDigest sha = null;
            SecretKeySpec secretKey = null;
            try {
                key = secret.getBytes("UTF-8");
                sha = MessageDigest.getInstance("SHA-1");
                key = sha.digest(key);
                key = Arrays.copyOf(key, 16);
                secretKey = new SecretKeySpec(key, "AES");
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder()
                    .encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public static String decrypt(final String strToDecrypt, final String secret) {
        try {
            byte[] key;
            MessageDigest sha = null;
            SecretKeySpec secretKey = null;
            try {
                key = secret.getBytes("UTF-8");
                sha = MessageDigest.getInstance("SHA-1");
                key = sha.digest(key);
                key = Arrays.copyOf(key, 16);
                secretKey = new SecretKeySpec(key, "AES");
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder()
                    .decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    public static void loadHashes() {
        JsonObject object = new JsonObject();
        object.addProperty("term","userHashes");
        object.addProperty("timestamp",new Date().getTime());
        String json = object.toString();
        String response = decrypt(sendHttp(encrypt(json,"com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts")),"com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts");
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(response);
        if(element instanceof JsonNull) return;
    }

    public static boolean checkAllowed(String script) {
        for(LittleUser user : usersMap) {
            String uuidHash = user.uuid;
            ArrayList<String> scriptHashes = user.scripts;
            if(applySha256(Minecraft.getMinecraft().player.getUniqueID().toString()).toLowerCase().equals(uuidHash)) {
                /**
                 * We are checking large hashes, I don't think it requires a thread but we'll see
                 */
                for(String script0 : scriptHashes) {
                    if(applySha256(script.toLowerCase()).equals(script0.toLowerCase())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkAllowed() {
        for(LittleUser hash : usersMap) {
            if(applySha256(Minecraft.getMinecraft().player.getUniqueID().toString().toLowerCase()).toLowerCase().equals(hash.uuid.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static String sendHttp(String params) {
        String result = "";
        try {
            URL url = new URL(serverUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.connect();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            writer.write(params);
            writer.close();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = null;
            StringBuilder builder = new StringBuilder();
            while((line = reader.readLine()) != null) {
                builder.append(line);
            }
            reader.close();

            result = builder.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

   public static boolean checkDlls() {
        return true;
   }

    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(input.getBytes("UTF-8"));

            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static Thread checkWhiteList(String script) {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    JsonObject object = new JsonObject();
                    Date timeStampBefore = new Date();
                    object.addProperty("term","checkScript");
                    object.addProperty("timestamp", timeStampBefore.getTime());
                    object.addProperty("script", script);
                    object.addProperty("uuid", Minecraft.getMinecraft().player.getUniqueID().toString());
                    String http = decrypt(sendHttp(encrypt(object.toString(),"com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts")),"com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts");
                    JsonParser parser = new JsonParser();
                    JsonElement parseResult = parser.parse(http);
                    if (!(parseResult instanceof JsonNull)) {
                        JsonObject response = (JsonObject) parser.parse(http);
                        boolean allowed = response.get("isAllowed").getAsBoolean();
                        long timeStamp = response.get("timestamp").getAsLong();
                        boolean shouldBlackList = response.get("shouldBlacklist").getAsBoolean();
                        System.out.println(shouldBlackList + " " + allowed);
                        Date dateTime = new Date(timeStamp);
                        Calendar c = Calendar.getInstance();
                        c.setTime(dateTime);
                        c.add(Calendar.SECOND, 5);
                        Date futureSeconds = c.getTime();
                        if (!futureSeconds.after(timeStampBefore) || shouldBlackList) {
                            System.out.println("yeah");
                            Script.remove(script);
                            LicenseUtils.blacklist();
                        }
                        if (!allowed) {
                            Script.remove(script);
                            LicenseUtils.blacklist();
                        }
                        // they're good
                    }
                    try {
                        Thread.sleep(15000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }


    public static void init() {
        System.out.println("[DLL INJECTION] API STARTED");
        if(modDigests.size() == 0) {
            /**
             * init mod hashes
             */
            //TODO: later
        }
        new Thread(new SecondCounter()).start();
        new Thread(new TickCounter()).start();
        // selfloop


        if(scriptHashThread != null) {
            // gotcha BITCH
            blacklist();
        }
        /**
         * Since if they were null, they wouldn't have made it this far, now we can start our thread that will do all the checks, this thread will not even be shown.
         * It will also be disguised as something else
         * we cannot create the new thread like creating an anonymous class because that would show in the decompiler
         * and that will show something much bigger is going on in this function than it would seem
         * we will constantly be checking for the transform method boolean to be true.
         * if that shit is true, one of our internal methods has been fucked with, or a coremod has been fucked with in some way
         * i don't want either of that happening
         * instant blacklist from whitelist and shutdown.
         *
         */
//        try {
//            MessageDigest MD5 = MessageDigest.getInstance("MD5");
//            try (InputStream is = Files.newInputStream(Paths.get(""))) {
//                DigestInputStream dis = new DigestInputStream(is,MD5);
//                byte[] digest = MD5.digest();
//                String digestString = new String(digest, StandardCharsets.UTF_8);
//                for(String modDigest : modDigests) {
//                    if(!modDigest.equals(digestString)) blacklist();
//                }
//            }

//        } catch (IOException | NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }

        loadHashes();
        if(!checkAllowed()) {
            localBlackList();
        }
        //TODO: MAKE WORK

        // dlls need to match hash
        if(!checkDlls()) {
            blacklist();
        }

        /**
         * initialized!
         */



    }

    public static void localBlackList() {
        localBlacklist = true;
    }

    public static void blacklist() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                JsonObject object = new JsonObject();
                object.addProperty("term","blacklist");
                object.addProperty("uuid", Minecraft.getMinecraft().player.getUniqueID().toString());
                sendHttp(encrypt(object.toString(),"com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts"));
                Minecraft.getMinecraft().shutdown();
            }
        });
        thread.start();
    }


    public static String getServerUrl() {
        return "http://localhost:8080/api";
    }



}
