package com.moovit.commons.appdata;

public class AppDataPartLoadFailedException extends Exception {
    private final Object reason;

    public AppDataPartLoadFailedException(Object obj, String str, Throwable th) {
        super(str, th);
        this.reason = obj;
    }

    /* renamed from: a */
    public final Object mo46894a() {
        return this.reason;
    }
}
