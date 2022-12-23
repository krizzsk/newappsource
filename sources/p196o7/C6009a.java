package p196o7;

import mf0.C24362h;
import p001a0.C0017h;

/* renamed from: o7.a */
public final class C6009a {

    /* renamed from: a */
    public final String f19202a;

    /* renamed from: b */
    public final String f19203b;

    /* renamed from: c */
    public final String f19204c = "umo-pass";

    /* renamed from: d */
    public final String f19205d = "";

    public C6009a(String str, String str2) {
        C24362h.m61211f(str, "id");
        C24362h.m61211f(str2, "secret");
        this.f19202a = str;
        this.f19203b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6009a)) {
            return false;
        }
        C6009a aVar = (C6009a) obj;
        return C24362h.m61206a(this.f19202a, aVar.f19202a) && C24362h.m61206a(this.f19203b, aVar.f19203b) && C24362h.m61206a(this.f19204c, aVar.f19204c) && C24362h.m61206a(this.f19205d, aVar.f19205d);
    }

    public final int hashCode() {
        return this.f19205d.hashCode() + C13715c.m34238d(this.f19204c, C13715c.m34238d(this.f19203b, this.f19202a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ClientData(id=");
        k.append(this.f19202a);
        k.append(", secret=");
        k.append(this.f19203b);
        k.append(", realmName=");
        k.append(this.f19204c);
        k.append(", callbackUrlScheme=");
        return C0017h.m57N(k, this.f19205d, ')');
    }
}
