package na0;

/* renamed from: na0.g */
public final class C12929g {

    /* renamed from: a */
    public double f32024a = Double.MAX_VALUE;

    /* renamed from: b */
    public double f32025b = Double.MAX_VALUE;

    /* renamed from: c */
    public double f32026c = -1.7976931348623157E308d;

    /* renamed from: d */
    public double f32027d = -1.7976931348623157E308d;

    /* renamed from: a */
    public final void mo39794a(double d, double d2) {
        this.f32024a = Math.min(this.f32024a, d);
        this.f32025b = Math.min(this.f32025b, d2);
        this.f32026c = Math.max(this.f32026c, d);
        this.f32027d = Math.max(this.f32027d, d2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || C12929g.class != obj.getClass()) {
            return false;
        }
        C12929g gVar = (C12929g) obj;
        if (this.f32024a == gVar.f32024a && this.f32025b == gVar.f32025b && this.f32026c == gVar.f32026c && this.f32027d == gVar.f32027d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Envelope [minX=");
        k.append(this.f32024a);
        k.append(", minY=");
        k.append(this.f32025b);
        k.append(", maxX=");
        k.append(this.f32026c);
        k.append(", maxY=");
        k.append(this.f32027d);
        k.append("]");
        return k.toString();
    }
}
