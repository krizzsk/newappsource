package p129j1;

import android.graphics.Color;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: j1.a */
public final class C5348a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f17644a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m13405a(float[] fArr) {
        int i;
        int i2;
        int i3 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 2:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                i = 0;
                i2 = 0;
                break;
        }
        return Color.rgb(m13415k(i3), m13415k(i2), m13415k(i));
    }

    /* renamed from: b */
    public static void m13406b(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = ((float) i) / 255.0f;
        float f6 = ((float) i2) / 255.0f;
        float f7 = ((float) i3) / 255.0f;
        float max = Math.max(f5, Math.max(f6, f7));
        float min = Math.min(f5, Math.min(f6, f7));
        float f8 = max - min;
        float f9 = (max + min) / 2.0f;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (max == min) {
            f = BitmapDescriptorFactory.HUE_RED;
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (max == f5) {
                f = ((f6 - f7) / f8) % 6.0f;
            } else if (max == f6) {
                f = ((f7 - f5) / f8) + 2.0f;
            } else {
                f = 4.0f + ((f5 - f6) / f8);
            }
            f2 = f8 / (1.0f - Math.abs((2.0f * f9) - 1.0f));
        }
        float f12 = (f * 60.0f) % 360.0f;
        if (f12 < BitmapDescriptorFactory.HUE_RED) {
            f12 += 360.0f;
        }
        if (f12 < BitmapDescriptorFactory.HUE_RED) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f3 = Math.min(f12, 360.0f);
        }
        fArr[0] = f3;
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            f4 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f4 = Math.min(f2, 1.0f);
        }
        fArr[1] = f4;
        if (f9 >= BitmapDescriptorFactory.HUE_RED) {
            f11 = Math.min(f9, 1.0f);
        }
        fArr[2] = f11;
    }

    /* renamed from: c */
    public static void m13407c(int i, int i2, int i3, double[] dArr) {
        double d;
        double d2;
        double d3;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d4 = ((double) i) / 255.0d;
            if (d4 < 0.04045d) {
                d = d4 / 12.92d;
            } else {
                d = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) i2) / 255.0d;
            if (d5 < 0.04045d) {
                d2 = d5 / 12.92d;
            } else {
                d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) i3) / 255.0d;
            if (d6 < 0.04045d) {
                d3 = d6 / 12.92d;
            } else {
                d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.1805d * d3) + (0.3576d * d2) + (0.4124d * d)) * 100.0d;
            dArr2[1] = ((0.0722d * d3) + (0.7152d * d2) + (0.2126d * d)) * 100.0d;
            double d7 = d3 * 0.9505d;
            dArr2[2] = (d7 + (d2 * 0.1192d) + (d * 0.0193d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: d */
    public static int m13408d(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = ((-0.4986d * d3) + ((-1.5372d * d2) + (3.2406d * d))) / 100.0d;
        double d8 = ((0.0415d * d3) + ((1.8758d * d2) + (-0.9689d * d))) / 100.0d;
        double d9 = ((1.057d * d3) + ((-0.204d * d2) + (0.0557d * d))) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m13415k((int) Math.round(d4 * 255.0d)), m13415k((int) Math.round(d5 * 255.0d)), m13415k((int) Math.round(d6 * 255.0d)));
    }

    /* renamed from: e */
    public static double m13409e(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m13413i(i, i2);
            }
            double f = m13410f(i) + 0.05d;
            double f2 = m13410f(i2) + 0.05d;
            return Math.max(f, f2) / Math.min(f, f2);
        }
        StringBuilder k = C13555b.m33972k("background can not be translucent: #");
        k.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: f */
    public static double m13410f(int i) {
        ThreadLocal<double[]> threadLocal = f17644a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        m13407c(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    /* renamed from: g */
    public static int m13411g(float f, int i, int i2) {
        int alpha = Color.alpha(i2);
        int i3 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        if (alpha == 255) {
            double d = (double) f;
            if (m13409e(m13417m(i, ValidationUtils.APPBOY_STRING_MAX_LENGTH), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m13409e(m13417m(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder k = C13555b.m33972k("background can not be translucent: #");
        k.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: h */
    public static void m13412h(double[] dArr, int i) {
        m13407c(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        if (dArr.length == 3) {
            double l = m13416l(d / 95.047d);
            double l2 = m13416l(d2 / 100.0d);
            double l3 = m13416l(d3 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * l2) - 16.0d);
            dArr[1] = (l - l2) * 500.0d;
            dArr[2] = (l2 - l3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    /* renamed from: i */
    public static int m13413i(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        return Color.argb(i3, m13414j(Color.red(i), alpha2, Color.red(i2), alpha, i3), m13414j(Color.green(i), alpha2, Color.green(i2), alpha, i3), m13414j(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: j */
    public static int m13414j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * ValidationUtils.APPBOY_STRING_MAX_LENGTH) * i2)) / (i5 * ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: k */
    public static int m13415k(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: l */
    public static double m13416l(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    /* renamed from: m */
    public static int m13417m(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
