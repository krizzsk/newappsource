package com.cubic.umo.auth.api.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0017h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¨\u0006\f"}, mo59060d2 = {"Lcom/cubic/umo/auth/api/model/OpenIdToken;", "", "", "accessToken", "", "expiresIn", "refreshExpiresIn", "refreshToken", "tokenType", "copy", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class OpenIdToken {

    /* renamed from: a */
    public final String f7764a;

    /* renamed from: b */
    public final int f7765b;

    /* renamed from: c */
    public final int f7766c;

    /* renamed from: d */
    public final String f7767d;

    /* renamed from: e */
    public final String f7768e;

    public OpenIdToken(@C12943g(name = "access_token") String str, @C12943g(name = "expires_in") int i, @C12943g(name = "refresh_expires_in") int i2, @C12943g(name = "refresh_token") String str2, @C12943g(name = "token_type") String str3) {
        C13437d.m33711q(str, "accessToken", str2, "refreshToken", str3, "tokenType");
        this.f7764a = str;
        this.f7765b = i;
        this.f7766c = i2;
        this.f7767d = str2;
        this.f7768e = str3;
    }

    public final OpenIdToken copy(@C12943g(name = "access_token") String str, @C12943g(name = "expires_in") int i, @C12943g(name = "refresh_expires_in") int i2, @C12943g(name = "refresh_token") String str2, @C12943g(name = "token_type") String str3) {
        C24362h.m61211f(str, "accessToken");
        C24362h.m61211f(str2, "refreshToken");
        C24362h.m61211f(str3, "tokenType");
        return new OpenIdToken(str, i, i2, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenIdToken)) {
            return false;
        }
        OpenIdToken openIdToken = (OpenIdToken) obj;
        return C24362h.m61206a(this.f7764a, openIdToken.f7764a) && this.f7765b == openIdToken.f7765b && this.f7766c == openIdToken.f7766c && C24362h.m61206a(this.f7767d, openIdToken.f7767d) && C24362h.m61206a(this.f7768e, openIdToken.f7768e);
    }

    public final int hashCode() {
        return this.f7768e.hashCode() + C13715c.m34238d(this.f7767d, ((((this.f7764a.hashCode() * 31) + this.f7765b) * 31) + this.f7766c) * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("OpenIdToken(accessToken=");
        k.append(this.f7764a);
        k.append(", expiresIn=");
        k.append(this.f7765b);
        k.append(", refreshExpiresIn=");
        k.append(this.f7766c);
        k.append(", refreshToken=");
        k.append(this.f7767d);
        k.append(", tokenType=");
        return C0017h.m57N(k, this.f7768e, ')');
    }
}
