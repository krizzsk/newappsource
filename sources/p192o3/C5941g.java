package p192o3;

/* renamed from: o3.g */
public final class C5941g {

    /* renamed from: a */
    public final String f19066a;

    /* renamed from: b */
    public final int f19067b;

    public C5941g(String str, int i) {
        this.f19066a = str;
        this.f19067b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5941g)) {
            return false;
        }
        C5941g gVar = (C5941g) obj;
        if (this.f19067b != gVar.f19067b) {
            return false;
        }
        return this.f19066a.equals(gVar.f19066a);
    }

    public final int hashCode() {
        return (this.f19066a.hashCode() * 31) + this.f19067b;
    }
}
