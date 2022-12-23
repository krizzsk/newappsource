package com.google.zxing;

import java.io.UnsupportedEncodingException;

public final class WriterException extends Exception {
    public WriterException() {
    }

    public WriterException(String str) {
        super(str);
    }

    public WriterException(UnsupportedEncodingException unsupportedEncodingException) {
        super(unsupportedEncodingException);
    }
}
