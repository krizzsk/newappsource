package na0;

/* renamed from: na0.m */
public final class C12936m {

    /* renamed from: a */
    public final double f32066a;

    /* renamed from: b */
    public final double f32067b;

    /* renamed from: c */
    public final double f32068c;

    public C12936m() {
        this(0.0d, 0.0d, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null || C12936m.class != obj.getClass()) {
            return false;
        }
        C12936m mVar = (C12936m) obj;
        if (this.f32066a == mVar.f32066a && this.f32067b == mVar.f32067b && this.f32068c == mVar.f32068c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Vector [x=");
        k.append(this.f32066a);
        k.append(", y=");
        k.append(this.f32067b);
        k.append(", z=");
        k.append(this.f32068c);
        k.append("]");
        return k.toString();
    }

    public C12936m(double d, double d2, int i) {
        this.f32066a = d;
        this.f32067b = d2;
        this.f32068c = 0.0d;
    }

    public C12936m(C12931i iVar) {
        this.f32066a = iVar.f32031a;
        this.f32067b = iVar.f32032b;
        this.f32068c = iVar.f32033c;
    }
}
