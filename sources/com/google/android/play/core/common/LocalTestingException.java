package com.google.android.play.core.common;

public final class LocalTestingException extends Exception {
    public LocalTestingException(String str) {
        super(str);
    }

    public LocalTestingException(String str, Exception exc) {
        super(str, exc);
    }
}
