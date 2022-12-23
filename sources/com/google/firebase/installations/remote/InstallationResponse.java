package com.google.firebase.installations.remote;

public abstract class InstallationResponse {

    public enum ResponseCode {
        f36564OK,
        BAD_CONFIG
    }

    /* renamed from: a */
    public abstract TokenResult mo43389a();

    /* renamed from: b */
    public abstract String mo43390b();

    /* renamed from: c */
    public abstract String mo43391c();

    /* renamed from: d */
    public abstract ResponseCode mo43392d();

    /* renamed from: e */
    public abstract String mo43393e();
}
