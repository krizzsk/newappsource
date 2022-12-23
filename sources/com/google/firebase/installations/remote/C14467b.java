package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
public final class C14467b extends TokenResult {

    /* renamed from: a */
    public final String f36571a;

    /* renamed from: b */
    public final long f36572b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f36573c;

    public C14467b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f36571a = str;
        this.f36572b = j;
        this.f36573c = responseCode;
    }

    /* renamed from: a */
    public final TokenResult.ResponseCode mo43394a() {
        return this.f36573c;
    }

    /* renamed from: b */
    public final String mo43395b() {
        return this.f36571a;
    }

    /* renamed from: c */
    public final long mo43396c() {
        return this.f36572b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f36571a;
        if (str != null ? str.equals(tokenResult.mo43395b()) : tokenResult.mo43395b() == null) {
            if (this.f36572b == tokenResult.mo43396c()) {
                TokenResult.ResponseCode responseCode = this.f36573c;
                if (responseCode == null) {
                    if (tokenResult.mo43394a() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo43394a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f36571a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f36572b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f36573c;
        if (responseCode != null) {
            i2 = responseCode.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TokenResult{token=");
        k.append(this.f36571a);
        k.append(", tokenExpirationTimestamp=");
        k.append(this.f36572b);
        k.append(", responseCode=");
        k.append(this.f36573c);
        k.append("}");
        return k.toString();
    }
}
