package p143k3;

/* renamed from: k3.b */
public final class C5463b {

    /* renamed from: a */
    public boolean f17984a;

    /* renamed from: b */
    public boolean f17985b;

    /* renamed from: c */
    public boolean f17986c;

    /* renamed from: d */
    public boolean f17987d;

    public C5463b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17984a = z;
        this.f17985b = z2;
        this.f17986c = z3;
        this.f17987d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5463b)) {
            return false;
        }
        C5463b bVar = (C5463b) obj;
        if (this.f17984a == bVar.f17984a && this.f17985b == bVar.f17985b && this.f17986c == bVar.f17986c && this.f17987d == bVar.f17987d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17984a;
        if (this.f17985b) {
            i += 16;
        }
        if (this.f17986c) {
            i += 256;
        }
        if (this.f17987d) {
            return i + 4096;
        }
        return i;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f17984a), Boolean.valueOf(this.f17985b), Boolean.valueOf(this.f17986c), Boolean.valueOf(this.f17987d)});
    }
}
