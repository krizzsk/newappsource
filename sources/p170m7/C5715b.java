package p170m7;

import mf0.C24362h;

/* renamed from: m7.b */
public final class C5715b {

    /* renamed from: a */
    public final C5714a f18529a;

    /* renamed from: b */
    public final C5716c f18530b;

    public C5715b(C5714a aVar, C5716c cVar) {
        this.f18529a = aVar;
        this.f18530b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5715b)) {
            return false;
        }
        C5715b bVar = (C5715b) obj;
        return C24362h.m61206a(this.f18529a, bVar.f18529a) && C24362h.m61206a(this.f18530b, bVar.f18530b);
    }

    public final int hashCode() {
        return this.f18530b.hashCode() + (this.f18529a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AccountWithToken(account=");
        k.append(this.f18529a);
        k.append(", token=");
        k.append(this.f18530b);
        k.append(')');
        return k.toString();
    }
}
