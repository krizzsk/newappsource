package p210p8;

import mf0.C24362h;

/* renamed from: p8.a */
public final class C6100a {

    /* renamed from: a */
    public final String f19364a;

    /* renamed from: b */
    public final boolean f19365b;

    public C6100a(String str, boolean z) {
        C24362h.m61211f(str, "name");
        this.f19364a = str;
        this.f19365b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6100a)) {
            return false;
        }
        C6100a aVar = (C6100a) obj;
        return C24362h.m61206a(this.f19364a, aVar.f19364a) && this.f19365b == aVar.f19365b;
    }

    public final int hashCode() {
        int hashCode = this.f19364a.hashCode() * 31;
        boolean z = this.f19365b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("GateKeeper(name=");
        k.append(this.f19364a);
        k.append(", value=");
        return C13715c.m34247m(k, this.f19365b, ')');
    }
}
