package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.n */
public abstract class C22045n extends Exception {

    /* renamed from: a */
    public static final boolean f55607a;

    /* renamed from: b */
    public static final StackTraceElement[] f55608b = new StackTraceElement[0];

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f55607a = z;
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
