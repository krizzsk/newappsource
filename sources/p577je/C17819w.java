package p577je;

import p577je.C17785c0;

/* renamed from: je.w */
public final class C17819w extends C17785c0 {

    /* renamed from: a */
    public final C17785c0.C17786a f45767a;

    /* renamed from: b */
    public final C17785c0.C17788c f45768b;

    /* renamed from: c */
    public final C17785c0.C17787b f45769c;

    public C17819w(C17820x xVar, C17822z zVar, C17821y yVar) {
        this.f45767a = xVar;
        this.f45768b = zVar;
        this.f45769c = yVar;
    }

    /* renamed from: a */
    public final C17785c0.C17786a mo50303a() {
        return this.f45767a;
    }

    /* renamed from: b */
    public final C17785c0.C17787b mo50304b() {
        return this.f45769c;
    }

    /* renamed from: c */
    public final C17785c0.C17788c mo50305c() {
        return this.f45768b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17785c0)) {
            return false;
        }
        C17785c0 c0Var = (C17785c0) obj;
        if (!this.f45767a.equals(c0Var.mo50303a()) || !this.f45768b.equals(c0Var.mo50305c()) || !this.f45769c.equals(c0Var.mo50304b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45767a.hashCode() ^ 1000003) * 1000003) ^ this.f45768b.hashCode()) * 1000003) ^ this.f45769c.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("StaticSessionData{appData=");
        k.append(this.f45767a);
        k.append(", osData=");
        k.append(this.f45768b);
        k.append(", deviceData=");
        k.append(this.f45769c);
        k.append("}");
        return k.toString();
    }
}
