package p041ca;

import p275u9.C6743n;
import p275u9.C6751s;

/* renamed from: ca.b */
public final class C1810b extends C1824j {

    /* renamed from: a */
    public final long f6308a;

    /* renamed from: b */
    public final C6751s f6309b;

    /* renamed from: c */
    public final C6743n f6310c;

    public C1810b(long j, C6751s sVar, C6743n nVar) {
        this.f6308a = j;
        if (sVar != null) {
            this.f6309b = sVar;
            if (nVar != null) {
                this.f6310c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: a */
    public final C6743n mo6631a() {
        return this.f6310c;
    }

    /* renamed from: b */
    public final long mo6632b() {
        return this.f6308a;
    }

    /* renamed from: c */
    public final C6751s mo6633c() {
        return this.f6309b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1824j)) {
            return false;
        }
        C1824j jVar = (C1824j) obj;
        if (this.f6308a != jVar.mo6632b() || !this.f6309b.equals(jVar.mo6633c()) || !this.f6310c.equals(jVar.mo6631a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f6308a;
        return this.f6310c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f6309b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PersistedEvent{id=");
        k.append(this.f6308a);
        k.append(", transportContext=");
        k.append(this.f6309b);
        k.append(", event=");
        k.append(this.f6310c);
        k.append("}");
        return k.toString();
    }
}
