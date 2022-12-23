package p275u9;

import p237r9.C6269b;
import p237r9.C6270c;
import p237r9.C6271d;

/* renamed from: u9.i */
public final class C6737i extends C6750r {

    /* renamed from: a */
    public final C6751s f20858a;

    /* renamed from: b */
    public final String f20859b;

    /* renamed from: c */
    public final C6270c<?> f20860c;

    /* renamed from: d */
    public final C6271d<?, byte[]> f20861d;

    /* renamed from: e */
    public final C6269b f20862e;

    public C6737i(C6751s sVar, String str, C6270c cVar, C6271d dVar, C6269b bVar) {
        this.f20858a = sVar;
        this.f20859b = str;
        this.f20860c = cVar;
        this.f20861d = dVar;
        this.f20862e = bVar;
    }

    /* renamed from: a */
    public final C6269b mo22902a() {
        return this.f20862e;
    }

    /* renamed from: b */
    public final C6270c<?> mo22903b() {
        return this.f20860c;
    }

    /* renamed from: c */
    public final C6271d<?, byte[]> mo22904c() {
        return this.f20861d;
    }

    /* renamed from: d */
    public final C6751s mo22905d() {
        return this.f20858a;
    }

    /* renamed from: e */
    public final String mo22906e() {
        return this.f20859b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6750r)) {
            return false;
        }
        C6750r rVar = (C6750r) obj;
        if (!this.f20858a.equals(rVar.mo22905d()) || !this.f20859b.equals(rVar.mo22906e()) || !this.f20860c.equals(rVar.mo22903b()) || !this.f20861d.equals(rVar.mo22904c()) || !this.f20862e.equals(rVar.mo22902a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.f20858a.hashCode() ^ 1000003) * 1000003) ^ this.f20859b.hashCode()) * 1000003) ^ this.f20860c.hashCode()) * 1000003) ^ this.f20861d.hashCode()) * 1000003) ^ this.f20862e.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SendRequest{transportContext=");
        k.append(this.f20858a);
        k.append(", transportName=");
        k.append(this.f20859b);
        k.append(", event=");
        k.append(this.f20860c);
        k.append(", transformer=");
        k.append(this.f20861d);
        k.append(", encoding=");
        k.append(this.f20862e);
        k.append("}");
        return k.toString();
    }
}
