package na0;

import p358af.C13437d;

/* renamed from: na0.f */
public class C12928f {

    /* renamed from: a */
    public final int f32020a;

    /* renamed from: b */
    public final int f32021b;

    /* renamed from: c */
    public final int f32022c;

    /* renamed from: d */
    public final long f32023d;

    public C12928f(int i, int i2, int i3, long j) {
        this.f32020a = i;
        this.f32021b = i2;
        this.f32022c = i3;
        this.f32023d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12928f fVar = (C12928f) obj;
        if (this.f32020a == fVar.f32020a && this.f32021b == fVar.f32021b && this.f32022c == fVar.f32022c && this.f32023d == fVar.f32023d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32020a ^ ((int) this.f32023d)) ^ this.f32021b) ^ this.f32022c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MapTile [x=");
        k.append(this.f32020a);
        k.append(", y=");
        k.append(this.f32021b);
        k.append(", zoom=");
        return C13437d.m33707l(k, this.f32022c, "]");
    }
}
