package na0;

/* renamed from: na0.a */
public final class C12922a {

    /* renamed from: a */
    public final double f31984a;

    /* renamed from: b */
    public final double f31985b;

    /* renamed from: c */
    public final double f31986c;

    /* renamed from: d */
    public final double f31987d;

    public C12922a(double d, double d2, double d3, double d4) {
        this.f31984a = d;
        this.f31985b = d3;
        this.f31986c = d2;
        this.f31987d = d4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C12922a.class != obj.getClass()) {
            return false;
        }
        C12922a aVar = (C12922a) obj;
        if (this.f31984a == aVar.f31984a && this.f31985b == aVar.f31985b && this.f31986c == aVar.f31986c && this.f31987d == aVar.f31987d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Bounds [left=");
        k.append(this.f31984a);
        k.append(", right=");
        k.append(this.f31985b);
        k.append(", top=");
        k.append(this.f31986c);
        k.append(", bottom=");
        k.append(this.f31987d);
        k.append("]");
        return k.toString();
    }
}
