package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdFileId;", "", "id", "", "key", "", "required", "", "(Ljava/lang/String;IBLjava/lang/String;Z)V", "getId", "()B", "getKey", "()Ljava/lang/String;", "getRequired", "()Z", "COM", "SOD", "CVCA", "DG1", "DG2", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lc */
public enum C21951lc {
    COM((byte) 30, "com", false, 4, (boolean) null),
    SOD((byte) 29, "sod", true),
    CVCA((byte) 28, "cvca", false, 4, (boolean) null),
    DG1((byte) 1, "dg1", true),
    DG2((byte) 2, "dg2", true);
    

    /* renamed from: g */
    private final byte f55462g;

    /* renamed from: h */
    private final String f55463h;

    /* renamed from: i */
    private final boolean f55464i;

    private C21951lc(byte b, String str, boolean z) {
        this.f55462g = b;
        this.f55463h = str;
        this.f55464i = z;
    }

    /* renamed from: a */
    public final byte mo55768a() {
        return this.f55462g;
    }

    /* renamed from: b */
    public final String mo55769b() {
        return this.f55463h;
    }

    /* renamed from: c */
    public final boolean mo55770c() {
        return this.f55464i;
    }
}
