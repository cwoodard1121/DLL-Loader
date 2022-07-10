package com.itzblaze.server;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Aes {
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

}
