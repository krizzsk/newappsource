package com.google.firebase.installations.remote;

public abstract class TokenResult {

    public enum ResponseCode {
        f36565OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public abstract ResponseCode mo43394a();

    /* renamed from: b */
    public abstract String mo43395b();

    /* renamed from: c */
    public abstract long mo43396c();
}
