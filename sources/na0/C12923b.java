package na0;

import com.nutiteq.components.MapPos;
import p066e0.C4436j0;
import p845um.C19958a;

/* renamed from: na0.b */
public final class C12923b {

    /* renamed from: a */
    public final MapPos f31988a;

    /* renamed from: b */
    public final C12936m f31989b;

    /* renamed from: c */
    public final C4436j0 f31990c;

    /* renamed from: d */
    public final double[] f31991d;

    /* renamed from: e */
    public final float[] f31992e;

    /* renamed from: f */
    public final double[] f31993f;

    /* renamed from: g */
    public final float f31994g;

    /* renamed from: h */
    public final float f31995h;

    /* renamed from: i */
    public final float f31996i;

    /* renamed from: j */
    public final float f31997j;

    public C12923b(MapPos mapPos, C12936m mVar, double[] dArr, float[] fArr, float f, float f2, float f3) {
        this.f31988a = mapPos;
        this.f31989b = mVar;
        this.f31990c = new C4436j0(fArr, dArr);
        this.f31991d = dArr;
        this.f31992e = fArr;
        double[] dArr2 = new double[16];
        C19958a.m47433h(0, dArr2, fArr);
        double[] dArr3 = new double[16];
        this.f31993f = dArr3;
        C19958a.m47438n(dArr3, 0, dArr2, 0, dArr);
        this.f31994g = f;
        this.f31995h = f2;
        this.f31996i = f3;
        this.f31997j = (float) Math.pow(2.0d, (double) f3);
    }
}
