package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.wl */
public class C22660wl {

    /* renamed from: a */
    private boolean f57312a;

    /* renamed from: b */
    private boolean f57313b;

    /* renamed from: c */
    private String f57314c;

    public C22660wl(boolean z, boolean z2, String str) {
        this.f57312a = z;
        this.f57313b = z2;
        this.f57314c = str;
    }

    /* renamed from: a */
    public boolean mo57006a() {
        return this.f57312a;
    }

    /* renamed from: b */
    public boolean mo57007b() {
        return this.f57313b;
    }

    /* renamed from: c */
    public String mo57008c() {
        return this.f57314c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C22660wl wlVar = (C22660wl) obj;
        if (this.f57312a == wlVar.f57312a && this.f57313b == wlVar.f57313b) {
            return this.f57314c.equals(wlVar.f57314c);
        }
        return false;
    }

    public int hashCode() {
        return this.f57314c.hashCode() + ((((this.f57312a ? 1 : 0) * true) + (this.f57313b ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("PhotoConf{useFlash=");
        k.append(this.f57312a);
        k.append(", isFirst=");
        k.append(this.f57313b);
        k.append(", pictureContext='");
        k.append(this.f57314c);
        k.append('\'');
        k.append('}');
        return k.toString();
    }
}
