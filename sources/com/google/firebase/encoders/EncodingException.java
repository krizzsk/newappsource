package com.google.firebase.encoders;

public final class EncodingException extends RuntimeException {
    public EncodingException(String str) {
        super(str);
    }

    public EncodingException(String str, ClassCastException classCastException) {
        super(str, classCastException);
    }
}
