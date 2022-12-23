package na0;

/* renamed from: na0.k */
public final class C12934k {

    /* renamed from: a */
    public final float f32057a;

    /* renamed from: b */
    public final float f32058b;

    public C12934k(float f, float f2) {
        this.f32057a = f;
        this.f32058b = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C12934k.class != obj.getClass()) {
            return false;
        }
        C12934k kVar = (C12934k) obj;
        if (this.f32057a == kVar.f32057a && this.f32058b == kVar.f32058b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Range [min=");
        k.append(this.f32057a);
        k.append(", max=");
        k.append(this.f32058b);
        k.append("]");
        return k.toString();
    }
}
