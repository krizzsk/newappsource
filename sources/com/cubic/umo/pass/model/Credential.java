package com.cubic.umo.pass.model;

import android.os.Build;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/Credential;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class Credential {

    /* renamed from: a */
    public final String f8033a;

    /* renamed from: b */
    public final String f8034b;

    /* renamed from: c */
    public final long f8035c;

    /* renamed from: d */
    public final boolean f8036d;

    /* renamed from: e */
    public final double f8037e;

    /* renamed from: f */
    public final double f8038f;

    public Credential(String str, String str2, long j, boolean z, double d, double d2) {
        this.f8033a = str;
        this.f8034b = str2;
        this.f8035c = j;
        this.f8036d = z;
        this.f8037e = d;
        this.f8038f = d2;
        C24362h.m61210e(Build.MODEL, "MODEL");
        C24362h.m61210e(Build.VERSION.RELEASE, "RELEASE");
    }

    @C12943g(name = "deviceType")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @C12943g(name = "osVersion")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return C24362h.m61206a(this.f8033a, credential.f8033a) && C24362h.m61206a(this.f8034b, credential.f8034b) && this.f8035c == credential.f8035c && this.f8036d == credential.f8036d && C24362h.m61206a(Double.valueOf(this.f8037e), Double.valueOf(credential.f8037e)) && C24362h.m61206a(Double.valueOf(this.f8038f), Double.valueOf(credential.f8038f));
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f8034b, this.f8033a.hashCode() * 31, 31);
        long j = this.f8035c;
        int i = (d + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f8036d;
        if (z) {
            z = true;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f8037e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8038f);
        return ((((i + (z ? 1 : 0)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Credential(email=");
        k.append(this.f8033a);
        k.append(", password=");
        k.append(this.f8034b);
        k.append(", deviceId=");
        k.append(this.f8035c);
        k.append(", nfcEnabled=");
        k.append(this.f8036d);
        k.append(", latitude=");
        k.append(this.f8037e);
        k.append(", longitude=");
        k.append(this.f8038f);
        k.append(')');
        return k.toString();
    }
}
