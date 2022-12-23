package com.masabi.justride.sdk.platform.storage;

public class FileStorageException extends Exception {
    public FileStorageException(String str) {
        super(str);
    }

    public FileStorageException(String str, Exception exc) {
        super(str, exc);
    }
}
