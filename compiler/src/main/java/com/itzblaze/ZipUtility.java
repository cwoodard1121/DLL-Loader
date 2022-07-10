package com.itzblaze;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;



//credits: https://gist.github.com/anna-dolbina/28019cfd656bd52a89c43b1c0e3632a1 thank you
public class ZipUtility {

    private final File zipFilePath;

    public ZipUtility(File zipFilePath) throws IOException {
        if (zipFilePath == null) {
            throw new IllegalArgumentException("The source path cannot be null");
        }
        if(!zipFilePath.isFile()) {
            throw new IllegalArgumentException("The passed path does not denote a valid file");
        }
        this.zipFilePath = zipFilePath;
    }

    public void addOrReplaceEntry(String entry, InputStream entryData) throws IOException {
        File temporaryFile = File.createTempFile(zipFilePath.getName(), null);
        temporaryFile.delete();
        zipFilePath.renameTo(temporaryFile);

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFilePath));
        addOrReplaceEntry(temporaryFile, entry, entryData, zipOutputStream);
        zipOutputStream.close();
        temporaryFile.delete();
    }

    public static void addOrReplaceEntry(File source, String entry, InputStream entryData, ZipOutputStream zipOutputStream) throws IOException {
        ZipFile zipSourceFile = new ZipFile(source);

        writeZipEntry(zipOutputStream, entry, entryData);

        Enumeration<? extends ZipEntry> zipEntries = zipSourceFile.entries();
        while (zipEntries.hasMoreElements()) {
            ZipEntry zipEntry = zipEntries.nextElement();
            String entryName = zipEntry.getName();
            if (!entry.equalsIgnoreCase(entryName)) {
                try {
                    writeZipEntry(zipOutputStream, entryName, zipSourceFile.getInputStream(zipEntry));
                } catch (Exception e) {
                    logException(e);
                }
            }
        }
        zipSourceFile.close();
    }

    private static void writeZipEntry(ZipOutputStream zipOutputStream, String entryName, InputStream entryData) throws IOException {
        ZipEntry entry = new ZipEntry(entryName);
        byte[] buf = new byte[1024];
        zipOutputStream.putNextEntry(entry);
        int len;
        while ((len = entryData.read(buf)) > 0) {
            zipOutputStream.write(buf, 0, len);
        }
        zipOutputStream.closeEntry();

    }

    private static void logException(Exception e) {
        e.printStackTrace();
    }

}