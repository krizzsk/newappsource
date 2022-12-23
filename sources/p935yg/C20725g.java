package p935yg;

/* renamed from: yg.g */
public class C20725g {

    /* renamed from: a */
    public final float f52326a;

    /* renamed from: b */
    public final float f52327b;

    public C20725g(float f, float f2) {
        this.f52326a = f;
        this.f52327b = f2;
    }

    /* renamed from: a */
    public static float m48698a(C20725g gVar, C20725g gVar2) {
        float f = gVar.f52326a;
        float f2 = gVar.f52327b;
        float f3 = f - gVar2.f52326a;
        float f4 = f2 - gVar2.f52327b;
        return (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20725g) {
            C20725g gVar = (C20725g) obj;
            if (this.f52326a == gVar.f52326a && this.f52327b == gVar.f52327b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f52327b) + (Float.floatToIntBits(this.f52326a) * 31);
    }

    public final String toString() {
        return "(" + this.f52326a + ',' + this.f52327b + ')';
    }
}
