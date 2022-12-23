package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
public final class C14466a extends InstallationResponse {

    /* renamed from: a */
    public final String f36566a;

    /* renamed from: b */
    public final String f36567b;

    /* renamed from: c */
    public final String f36568c;

    /* renamed from: d */
    public final TokenResult f36569d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f36570e;

    public C14466a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f36566a = str;
        this.f36567b = str2;
        this.f36568c = str3;
        this.f36569d = tokenResult;
        this.f36570e = responseCode;
    }

    /* renamed from: a */
    public final TokenResult mo43389a() {
        return this.f36569d;
    }

    /* renamed from: b */
    public final String mo43390b() {
        return this.f36567b;
    }

    /* renamed from: c */
    public final String mo43391c() {
        return this.f36568c;
    }

    /* renamed from: d */
    public final InstallationResponse.ResponseCode mo43392d() {
        return this.f36570e;
    }

    /* renamed from: e */
    public final String mo43393e() {
        return this.f36566a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f36566a;
        if (str != null ? str.equals(installationResponse.mo43393e()) : installationResponse.mo43393e() == null) {
            String str2 = this.f36567b;
            if (str2 != null ? str2.equals(installationResponse.mo43390b()) : installationResponse.mo43390b() == null) {
                String str3 = this.f36568c;
                if (str3 != null ? str3.equals(installationResponse.mo43391c()) : installationResponse.mo43391c() == null) {
                    TokenResult tokenResult = this.f36569d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo43389a()) : installationResponse.mo43389a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f36570e;
                        if (responseCode == null) {
                            if (installationResponse.mo43392d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo43392d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f36566a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f36567b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f36568c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        TokenResult tokenResult = this.f36569d;
        if (tokenResult == null) {
            i4 = 0;
        } else {
            i4 = tokenResult.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f36570e;
        if (responseCode != null) {
            i5 = responseCode.hashCode();
        }
        return i9 ^ i5;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("InstallationResponse{uri=");
        k.append(this.f36566a);
        k.append(", fid=");
        k.append(this.f36567b);
        k.append(", refreshToken=");
        k.append(this.f36568c);
        k.append(", authToken=");
        k.append(this.f36569d);
        k.append(", responseCode=");
        k.append(this.f36570e);
        k.append("}");
        return k.toString();
    }
}
