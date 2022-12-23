package p170m7;

import mf0.C24362h;
import p001a0.C0017h;
import p358af.C13437d;

/* renamed from: m7.c */
public final class C5716c {

    /* renamed from: a */
    public final long f18531a;

    /* renamed from: b */
    public final String f18532b;

    /* renamed from: c */
    public final long f18533c;

    /* renamed from: d */
    public final long f18534d;

    /* renamed from: e */
    public final String f18535e;

    /* renamed from: f */
    public final String f18536f;

    public C5716c(long j, String str, long j2, long j3, String str2, String str3) {
        C13437d.m33711q(str, "accessToken", str2, "refreshToken", str3, "tokenType");
        this.f18531a = j;
        this.f18532b = str;
        this.f18533c = j2;
        this.f18534d = j3;
        this.f18535e = str2;
        this.f18536f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5716c)) {
            return false;
        }
        C5716c cVar = (C5716c) obj;
        return this.f18531a == cVar.f18531a && C24362h.m61206a(this.f18532b, cVar.f18532b) && this.f18533c == cVar.f18533c && this.f18534d == cVar.f18534d && C24362h.m61206a(this.f18535e, cVar.f18535e) && C24362h.m61206a(this.f18536f, cVar.f18536f);
    }

    public final int hashCode() {
        long j = this.f18531a;
        int d = C13715c.m34238d(this.f18532b, ((int) (j ^ (j >>> 32))) * 31, 31);
        long j2 = this.f18533c;
        long j3 = this.f18534d;
        return this.f18536f.hashCode() + C13715c.m34238d(this.f18535e, (((d + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Token(accountId=");
        k.append(this.f18531a);
        k.append(", accessToken=");
        k.append(this.f18532b);
        k.append(", accessTokenExpirationTime=");
        k.append(this.f18533c);
        k.append(", refreshTokenExpirationTime=");
        k.append(this.f18534d);
        k.append(", refreshToken=");
        k.append(this.f18535e);
        k.append(", tokenType=");
        return C0017h.m57N(k, this.f18536f, ')');
    }
}
