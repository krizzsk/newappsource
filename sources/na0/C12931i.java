package na0;

/* renamed from: na0.i */
public final class C12931i {

    /* renamed from: a */
    public double f32031a = 0.0d;

    /* renamed from: b */
    public double f32032b = 0.0d;

    /* renamed from: c */
    public double f32033c = 0.0d;

    public C12931i() {
    }

    /* renamed from: a */
    public final void mo39804a(C12931i iVar, C12931i iVar2) {
        double d = iVar.f32032b;
        double d2 = iVar2.f32033c;
        double d3 = iVar.f32033c;
        double d4 = iVar2.f32032b;
        double d5 = iVar2.f32031a;
        double d6 = iVar.f32031a;
        this.f32031a = (d * d2) - (d3 * d4);
        this.f32032b = (d3 * d5) - (d2 * d6);
        this.f32033c = (d6 * d4) - (d * d5);
    }

    /* renamed from: b */
    public final double mo39805b() {
        return Math.hypot(this.f32031a, this.f32032b);
    }

    /* renamed from: c */
    public final double mo39806c() {
        double d = this.f32031a;
        double d2 = this.f32032b;
        double d3 = (d2 * d2) + (d * d);
        double d4 = this.f32033c;
        return Math.sqrt((d4 * d4) + d3);
    }

    /* renamed from: d */
    public final void mo39807d() {
        double b = mo39805b();
        this.f32031a /= b;
        this.f32032b /= b;
    }

    /* renamed from: e */
    public final void mo39808e() {
        double c = mo39806c();
        this.f32031a /= c;
        this.f32032b /= c;
        this.f32033c /= c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C12931i.class != obj.getClass()) {
            return false;
        }
        C12931i iVar = (C12931i) obj;
        if (this.f32031a == iVar.f32031a && this.f32032b == iVar.f32032b && this.f32033c == iVar.f32033c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo39810f(double d, double d2, double d3) {
        this.f32031a = d;
        this.f32032b = d2;
        this.f32033c = d3;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Vector [x=");
        k.append(this.f32031a);
        k.append(", y=");
        k.append(this.f32032b);
        k.append(", z=");
        k.append(this.f32033c);
        k.append("]");
        return k.toString();
    }

    public C12931i(int i) {
    }
}
