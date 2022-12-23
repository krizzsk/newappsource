package p279v0;

/* renamed from: v0.p */
public final class C6837p {

    /* renamed from: a */
    public float f21175a;

    /* renamed from: b */
    public float f21176b;

    /* renamed from: c */
    public float f21177c;

    /* renamed from: d */
    public float f21178d;

    /* renamed from: e */
    public float f21179e;

    /* renamed from: f */
    public float f21180f;

    /* renamed from: a */
    public final void mo23077a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f21177c;
        float f8 = f4 + this.f21178d;
        float f9 = (this.f21175a * f5) + f7;
        float f11 = (this.f21176b * f6) + f8;
        float radians = (float) Math.toRadians((double) this.f21180f);
        float radians2 = (float) Math.toRadians((double) this.f21179e);
        double d = (double) radians;
        double sin = Math.sin(d);
        double d2 = (double) (((float) i2) * f6);
        double cos = Math.cos(d);
        fArr[0] = (((float) ((sin * ((double) (((float) (-i3)) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        fArr[1] = (radians2 * ((float) ((cos * ((double) (((float) i3) * f5))) - (Math.sin(d) * d2)))) + f11;
    }
}
