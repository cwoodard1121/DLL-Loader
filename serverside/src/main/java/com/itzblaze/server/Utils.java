package com.itzblaze.server;

import com.google.gson.*;
import com.itzblaze.objects.User;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

public class Utils {

    public static String key0 = "com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts";


    public static boolean isAllowed(String uuid, String script) {
        File f = new File(System.getProperty("user.dir") + "/uuids/" + uuid + ".json");
        try {
                BufferedReader reader = new BufferedReader(new FileReader(f));
                String line = null;
                StringBuilder b = new StringBuilder();
                while((line = reader.readLine()) != null) {
                    b.append(line);
                }
                Gson gson = new Gson();
                User user = gson.fromJson(b.toString(), User.class);
            System.out.println("pre print");
                System.out.println(b.toString());
                if(user == null) return false;
                System.out.println("License exists");
                String licenseUUID = user.uuid;
                String discordId = user.discordId;
                ArrayList<String> scripts = user.scripts;
                System.out.println(scripts.size());
                // first step - check if incoming scripts are allowed
                boolean hasScript = false;
                for(String entry : scripts) {
                    System.out.println(entry + " " + script.toLowerCase());
                    if (entry.toLowerCase().equals(script.toLowerCase())) {
                        hasScript = true;
                        break;
                    }
                }
                // check if activated
                if(!user.isActivated) {
                    hasScript = false;
                }
                return hasScript;
        } catch (IOException ignored) {
            ignored.printStackTrace();
        }
        return false;
    }

    public static boolean blacklist(String uuid) {
        File f = new File(System.getProperty("user.dir") + "/uuids/" + uuid + ".json");
        try {
            if (f.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(f));
                String line = null;
                StringBuilder b = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    b.append(line);
                }
                System.out.println(b.toString());
                Gson gson = new Gson();
                User user = gson.fromJson(b.toString(), User.class);

                user.isActivated = false;
                BufferedWriter writer = new BufferedWriter(new FileWriter(f));
                writer.write(gson.toJson(user));
                writer.close();
            }
        } catch (IOException ignored) {
            ignored.printStackTrace();
            return false;
        }
        return false;
    }

    public static void writeLicense(String uuid, User user) {
        File f = new File( System.getProperty("user.dir") + "/uuids/" + uuid + ".json");
        System.out.println(f.getPath());
        try {
                BufferedReader reader = new BufferedReader(new FileReader(f));
                String line = null;
                StringBuilder b = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    b.append(line);
                }
                Gson gson = new Gson();
                BufferedWriter writer = new BufferedWriter(new FileWriter(f));
                writer.write(gson.toJson(user));
                writer.close();
        } catch (IOException ignored) {
            ignored.printStackTrace();
        }
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
}
