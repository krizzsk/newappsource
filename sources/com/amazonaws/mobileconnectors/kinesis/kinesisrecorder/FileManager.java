package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class FileManager {
    private final File directory;

    public FileManager(File file) {
        this.directory = file;
    }

    public File createDirectory(String str) {
        File file = new File(this.directory, str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public File createFile(String str) throws IOException {
        return createFile(new File(this.directory, str));
    }

    public boolean deleteFile(String str) {
        return deleteFile(new File(this.directory, str));
    }

    public File getDirectory(String str) {
        return new File(this.directory, str);
    }

    public Set<File> listFilesInDirectory(String str) {
        return listFilesInDirectory(new File(this.directory, str));
    }

    public InputStream newInputStream(String str) throws FileNotFoundException {
        return newInputStream(new File(this.directory, str));
    }

    public OutputStream newOutputStream(String str, boolean z) throws FileNotFoundException {
        return newOutputStream(new File(this.directory, str), z);
    }

    public File createFile(File file) throws IOException {
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        return null;
    }

    public boolean deleteFile(File file) {
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public Set<File> listFilesInDirectory(File file) {
        HashSet hashSet = new HashSet();
        if (file.exists()) {
            for (File add : file.listFiles()) {
                hashSet.add(add);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public InputStream newInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public OutputStream newOutputStream(File file, boolean z) throws FileNotFoundException {
        return new FileOutputStream(file, z);
    }
}
