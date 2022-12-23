package p232r4;

/* renamed from: r4.d */
public final class C6244d {

    /* renamed from: a */
    public int f19699a = Integer.MIN_VALUE;

    /* renamed from: b */
    public int f19700b = Integer.MAX_VALUE;

    /* renamed from: c */
    public boolean f19701c = true;

    /* renamed from: d */
    public boolean f19702d = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6244d)) {
            return false;
        }
        C6244d dVar = (C6244d) obj;
        return this.f19699a == dVar.f19699a && this.f19700b == dVar.f19700b && this.f19701c == dVar.f19701c && this.f19702d == dVar.f19702d;
    }

    public final int hashCode() {
        return (((((this.f19699a * 31) + this.f19700b) * 31) + (this.f19701c ? 1 : 0)) * 31) + (this.f19702d ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("FormatInfo(");
        k.append(this.f19699a);
        k.append(", ");
        k.append(this.f19700b);
        k.append(", ");
        k.append(this.f19701c);
        k.append(", ");
        return C25541a.m63885p(k, this.f19702d, ")");
    }
}
