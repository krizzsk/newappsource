package p279v0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: v0.k */
public final class C6832k implements C6834m {

    /* renamed from: a */
    public double f21142a = 0.5d;

    /* renamed from: b */
    public double f21143b;

    /* renamed from: c */
    public double f21144c;

    /* renamed from: d */
    public float f21145d;

    /* renamed from: e */
    public float f21146e;

    /* renamed from: f */
    public float f21147f;

    /* renamed from: g */
    public float f21148g;

    /* renamed from: h */
    public float f21149h;

    /* renamed from: i */
    public int f21150i = 0;

    /* renamed from: a */
    public final float mo23068a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public final boolean mo23069b() {
        double d = ((double) this.f21146e) - this.f21144c;
        double d2 = this.f21143b;
        double d3 = (double) this.f21147f;
        if (Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f21148g))) / d2) <= ((double) this.f21149h)) {
            return true;
        }
        return false;
    }

    public final float getInterpolation(float f) {
        C6832k kVar = this;
        float f2 = f;
        double d = (double) (f2 - kVar.f21145d);
        double d2 = kVar.f21143b;
        double d3 = kVar.f21142a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) kVar.f21148g)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) sqrt);
        int i = 0;
        while (i < sqrt) {
            double d5 = (double) kVar.f21146e;
            double d6 = kVar.f21144c;
            int i2 = sqrt;
            int i3 = i;
            double d7 = (double) kVar.f21147f;
            double d8 = (double) kVar.f21148g;
            double d9 = ((((((-d2) * (d5 - d6)) - (d7 * d3)) / d8) * d4) / 2.0d) + d7;
            double d11 = ((((-((((d4 * d9) / 2.0d) + d5) - d6)) * d2) - (d9 * d3)) / d8) * d4;
            float f3 = (float) (d7 + d11);
            this.f21147f = f3;
            float f4 = (float) ((((d11 / 2.0d) + d7) * d4) + d5);
            this.f21146e = f4;
            int i4 = this.f21150i;
            if (i4 > 0) {
                if (f4 < BitmapDescriptorFactory.HUE_RED && (i4 & 1) == 1) {
                    this.f21146e = -f4;
                    this.f21147f = -f3;
                }
                float f5 = this.f21146e;
                if (f5 > 1.0f && (i4 & 2) == 2) {
                    this.f21146e = 2.0f - f5;
                    this.f21147f = -this.f21147f;
                }
            }
            f2 = f;
            sqrt = i2;
            i = i3 + 1;
            kVar = this;
        }
        C6832k kVar2 = kVar;
        kVar2.f21145d = f2;
        return kVar2.f21146e;
    }
}
