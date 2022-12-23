package p100gb;

/* renamed from: gb.n */
public class C4986n {

    /* renamed from: a */
    public final Object f16857a;

    /* renamed from: b */
    public final int f16858b;

    /* renamed from: c */
    public final int f16859c;

    /* renamed from: d */
    public final long f16860d;

    /* renamed from: e */
    public final int f16861e;

    public C4986n(C4986n nVar) {
        this.f16857a = nVar.f16857a;
        this.f16858b = nVar.f16858b;
        this.f16859c = nVar.f16859c;
        this.f16860d = nVar.f16860d;
        this.f16861e = nVar.f16861e;
    }

    /* renamed from: a */
    public final boolean mo20688a() {
        return this.f16858b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4986n)) {
            return false;
        }
        C4986n nVar = (C4986n) obj;
        if (this.f16857a.equals(nVar.f16857a) && this.f16858b == nVar.f16858b && this.f16859c == nVar.f16859c && this.f16860d == nVar.f16860d && this.f16861e == nVar.f16861e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f16857a.hashCode() + 527) * 31) + this.f16858b) * 31) + this.f16859c) * 31) + ((int) this.f16860d)) * 31) + this.f16861e;
    }

    public C4986n(Object obj, int i, int i2, long j, int i3) {
        this.f16857a = obj;
        this.f16858b = i;
        this.f16859c = i2;
        this.f16860d = j;
        this.f16861e = i3;
    }
}
