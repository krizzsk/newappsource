package com.masabi.justride.sdk.crypto;

public class CryptoException extends Exception {
    public CryptoException(String str) {
        super(str);
    }

    public CryptoException(String str, Exception exc) {
        super(str, exc);
    }
}
