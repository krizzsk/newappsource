package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: b */
    public static final boolean f36910b;

    /* renamed from: c */
    public static final StackTraceElement[] f36911c = new StackTraceElement[0];

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f36910b = z;
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
