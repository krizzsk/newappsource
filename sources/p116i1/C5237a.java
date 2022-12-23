package p116i1;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import mf0.C24361g;
import p129j1.C5348a;

/* renamed from: i1.a */
public final class C5237a {

    /* renamed from: a */
    public final float f17339a;

    /* renamed from: b */
    public final float f17340b;

    /* renamed from: c */
    public final float f17341c;

    /* renamed from: d */
    public final float f17342d;

    /* renamed from: e */
    public final float f17343e;

    /* renamed from: f */
    public final float f17344f;

    /* renamed from: g */
    public final float f17345g;

    /* renamed from: h */
    public final float f17346h;

    /* renamed from: i */
    public final float f17347i;

    public C5237a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i) {
        if (i != 1) {
            this.f17339a = f;
            this.f17340b = f2;
            this.f17341c = f3;
            this.f17342d = f4;
            this.f17343e = f5;
            this.f17344f = f6;
            this.f17345g = f7;
            this.f17346h = f8;
            this.f17347i = f9;
            return;
        }
        this.f17339a = f;
        this.f17340b = f4;
        this.f17341c = f7;
        this.f17342d = f2;
        this.f17343e = f5;
        this.f17344f = f8;
        this.f17345g = f3;
        this.f17346h = f6;
        this.f17347i = f9;
    }

    /* renamed from: a */
    public static C5237a m13250a(int i) {
        float f;
        C5257k kVar = C5257k.f17379k;
        float b0 = C24361g.m61158b0(Color.red(i));
        float b02 = C24361g.m61158b0(Color.green(i));
        float b03 = C24361g.m61158b0(Color.blue(i));
        float[][] fArr = C24361g.f61682k;
        float[] fArr2 = fArr[0];
        float f2 = fArr2[1] * b02;
        float f3 = (fArr2[2] * b03) + f2 + (fArr2[0] * b0);
        float[] fArr3 = fArr[1];
        float f4 = fArr3[1] * b02;
        float f5 = (fArr3[2] * b03) + f4 + (fArr3[0] * b0);
        float[] fArr4 = fArr[2];
        float f6 = (b03 * fArr4[2]) + (b02 * fArr4[1]) + (b0 * fArr4[0]);
        float[][] fArr5 = C24361g.f61679h;
        float[] fArr6 = fArr5[0];
        float f7 = fArr6[1] * f5;
        float f8 = (fArr6[2] * f6) + f7 + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f9 = fArr7[1] * f5;
        float f11 = fArr7[2] * f6;
        float[] fArr8 = fArr5[2];
        float f12 = f3 * fArr8[0];
        float f13 = f6 * fArr8[2];
        float[] fArr9 = kVar.f17386g;
        float f14 = fArr9[0] * f8;
        float f15 = fArr9[1] * (f11 + f9 + (fArr7[0] * f3));
        float f16 = fArr9[2] * (f13 + (f5 * fArr8[1]) + f12);
        float pow = (float) Math.pow(((double) (Math.abs(f14) * kVar.f17387h)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f15) * kVar.f17387h)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f16) * kVar.f17387h)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f17 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d)) / 11.0f;
        float f18 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f22 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f18, (double) f17)) * 180.0f) / 3.1415927f;
        if (atan2 < BitmapDescriptorFactory.HUE_RED) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f22 * kVar.f17381b) / kVar.f17380a), (double) (kVar.f17383d * kVar.f17389j))) * 100.0f;
        float sqrt = (kVar.f17380a + 4.0f) * (4.0f / kVar.f17383d) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * kVar.f17388i;
        if (((double) f23) < 20.14d) {
            f = 360.0f + f23;
        } else {
            f = f23;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) kVar.f17385f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f17384e) * kVar.f17382c) * ((float) Math.sqrt((double) ((f18 * f18) + (f17 * f17))))) / (f21 + 0.305f)), 0.9d));
        float sqrt2 = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float f25 = sqrt2 * kVar.f17388i;
        float sqrt3 = ((float) Math.sqrt((double) ((pow5 * kVar.f17383d) / (kVar.f17380a + 4.0f)))) * 50.0f;
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * f25) + 1.0f))) * 43.85965f;
        double d2 = (double) f24;
        return new C5237a(f23, sqrt2, pow4, sqrt, f25, sqrt3, f26, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)), 0);
    }

    /* renamed from: b */
    public static C5237a m13251b(float f, float f2, float f3) {
        float f4 = f;
        C5257k kVar = C5257k.f17379k;
        double d = ((double) f4) / 100.0d;
        float sqrt = (kVar.f17380a + 4.0f) * (4.0f / kVar.f17383d) * ((float) Math.sqrt(d));
        float f5 = kVar.f17388i;
        float f6 = sqrt * f5;
        float f7 = f2 * f5;
        float sqrt2 = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * kVar.f17383d) / (kVar.f17380a + 4.0f)))) * 50.0f;
        float f8 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) f7) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f3) / 180.0f);
        return new C5237a(f3, f2, f, f6, f7, sqrt2, f8, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)), 0);
    }

    /* renamed from: c */
    public static C5237a m13252c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f11 = ((f2 - f4) + f6) - f8;
        if (f9 == BitmapDescriptorFactory.HUE_RED && f11 == BitmapDescriptorFactory.HUE_RED) {
            return new C5237a(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        }
        float f12 = f3 - f5;
        float f13 = f7 - f5;
        float f14 = f4 - f6;
        float f15 = f8 - f6;
        float f16 = (f12 * f15) - (f13 * f14);
        float f17 = ((f15 * f9) - (f13 * f11)) / f16;
        float f18 = ((f12 * f11) - (f9 * f14)) / f16;
        return new C5237a((f17 * f3) + (f3 - f), (f18 * f7) + (f7 - f), f, (f17 * f4) + (f4 - f2), (f18 * f8) + (f8 - f2), f2, f17, f18, 1.0f, 1);
    }

    /* renamed from: d */
    public final int mo21008d(C5257k kVar) {
        float f;
        C5257k kVar2 = kVar;
        float f2 = this.f17340b;
        if (((double) f2) != 0.0d) {
            double d = (double) this.f17341c;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) kVar2.f17385f), 0.73d), 1.1111111111111112d);
                double d2 = (double) ((this.f17339a * 3.1415927f) / 180.0f);
                float pow2 = kVar2.f17380a * ((float) Math.pow(((double) this.f17341c) / 100.0d, (1.0d / ((double) kVar2.f17383d)) / ((double) kVar2.f17389j)));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * kVar2.f17384e * kVar2.f17382c;
                float f3 = pow2 / kVar2.f17381b;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f4 = 11.0f * pow * cos2;
                float f5 = (((0.305f + f3) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f4 + (cos * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f3 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f11 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f12 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / kVar2.f17387h) * Math.signum(f9) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
                float signum2 = (100.0f / kVar2.f17387h) * Math.signum(f11) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d));
                float signum3 = Math.signum(f12);
                float[] fArr = kVar2.f17386g;
                float f13 = signum / fArr[0];
                float f14 = signum2 / fArr[1];
                float pow3 = (((100.0f / kVar2.f17387h) * signum3) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = C24361g.f61680i;
                float[] fArr3 = fArr2[0];
                float f15 = fArr3[1] * f14;
                float f16 = (fArr3[2] * pow3) + f15 + (fArr3[0] * f13);
                float[] fArr4 = fArr2[1];
                float f17 = fArr4[1] * f14;
                float f18 = fArr4[2] * pow3;
                float[] fArr5 = fArr2[2];
                float f19 = f13 * fArr5[0];
                return C5348a.m13408d((double) f16, (double) (f18 + f17 + (fArr4[0] * f13)), (double) ((pow3 * fArr5[2]) + (f14 * fArr5[1]) + f19));
            }
        }
        f = BitmapDescriptorFactory.HUE_RED;
        float pow4 = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) kVar2.f17385f), 0.73d), 1.1111111111111112d);
        double d22 = (double) ((this.f17339a * 3.1415927f) / 180.0f);
        float pow22 = kVar2.f17380a * ((float) Math.pow(((double) this.f17341c) / 100.0d, (1.0d / ((double) kVar2.f17383d)) / ((double) kVar2.f17389j)));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * kVar2.f17384e * kVar2.f17382c;
        float f32 = pow22 / kVar2.f17381b;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f42 = 11.0f * pow4 * cos22;
        float f52 = (((0.305f + f32) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f42 + (cos3 * 23.0f)));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f32 * 460.0f;
        float f92 = ((288.0f * f72) + ((451.0f * f62) + f82)) / 1403.0f;
        float f112 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f122 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / kVar2.f17387h) * Math.signum(f92) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f92)) * 27.13d) / (400.0d - ((double) Math.abs(f92))))), 2.380952380952381d));
        float signum22 = (100.0f / kVar2.f17387h) * Math.signum(f112) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f112)) * 27.13d) / (400.0d - ((double) Math.abs(f112))))), 2.380952380952381d));
        float signum32 = Math.signum(f122);
        float[] fArr6 = kVar2.f17386g;
        float f132 = signum4 / fArr6[0];
        float f142 = signum22 / fArr6[1];
        float pow32 = (((100.0f / kVar2.f17387h) * signum32) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f122)) * 27.13d) / (400.0d - ((double) Math.abs(f122))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = C24361g.f61680i;
        float[] fArr32 = fArr22[0];
        float f152 = fArr32[1] * f142;
        float f162 = (fArr32[2] * pow32) + f152 + (fArr32[0] * f132);
        float[] fArr42 = fArr22[1];
        float f172 = fArr42[1] * f142;
        float f182 = fArr42[2] * pow32;
        float[] fArr52 = fArr22[2];
        float f192 = f132 * fArr52[0];
        return C5348a.m13408d((double) f162, (double) (f182 + f172 + (fArr42[0] * f132)), (double) ((pow32 * fArr52[2]) + (f142 * fArr52[1]) + f192));
    }
}
