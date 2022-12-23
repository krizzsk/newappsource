package p150ka;

/* renamed from: ka.a */
public final class C5533a {

    /* renamed from: a */
    public final int f18126a = 0;

    /* renamed from: b */
    public final int f18127b;

    /* renamed from: c */
    public final int f18128c;

    public C5533a(int i, int i2) {
        this.f18127b = i;
        this.f18128c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5533a)) {
            return false;
        }
        C5533a aVar = (C5533a) obj;
        if (this.f18126a == aVar.f18126a && this.f18127b == aVar.f18127b && this.f18128c == aVar.f18128c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f18126a) * 31) + this.f18127b) * 31) + this.f18128c;
    }
}
