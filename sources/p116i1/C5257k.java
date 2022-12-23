package p116i1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import mf0.C24361g;

/* renamed from: i1.k */
public final class C5257k {

    /* renamed from: k */
    public static final C5257k f17379k;

    /* renamed from: a */
    public final float f17380a;

    /* renamed from: b */
    public final float f17381b;

    /* renamed from: c */
    public final float f17382c;

    /* renamed from: d */
    public final float f17383d;

    /* renamed from: e */
    public final float f17384e;

    /* renamed from: f */
    public final float f17385f;

    /* renamed from: g */
    public final float[] f17386g;

    /* renamed from: h */
    public final float f17387h;

    /* renamed from: i */
    public final float f17388i;

    /* renamed from: j */
    public final float f17389j;

    static {
        float f;
        float[] fArr = C24361g.f61681j;
        float u0 = (float) ((((double) C24361g.m61190u0()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C24361g.f61679h;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr3[1] * f3;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4 + (fArr3[0] * f2);
        float[] fArr4 = fArr2[1];
        float f7 = fArr4[1] * f3;
        float f8 = (fArr4[2] * f5) + f7 + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = f2 * fArr5[0];
        float f11 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + f9;
        if (((double) 1.0f) >= 0.9d) {
            f = 0.69f;
        } else {
            f = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp((double) (((-u0) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * u0) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) u0) * 5.0d))) + (f13 * u0);
        float u02 = C24361g.m61190u0() / fArr[1];
        double d2 = (double) u02;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f11)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f8)) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        float f17 = ((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f;
        f17379k = new C5257k(u02, (f17 + (((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f))) * pow, pow, pow, f, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public C5257k(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f17385f = f;
        this.f17380a = f2;
        this.f17381b = f3;
        this.f17382c = f4;
        this.f17383d = f5;
        this.f17384e = f6;
        this.f17386g = fArr;
        this.f17387h = f7;
        this.f17388i = f8;
        this.f17389j = f9;
    }
}
