package com.veriff.sdk.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;

/* renamed from: com.veriff.sdk.internal.aj */
final class C21398aj {

    /* renamed from: a */
    private static final float[][] f53841a;

    static {
        int i;
        int length = C22720y.f57473a.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f53841a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C22720y.f57473a;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = BitmapDescriptorFactory.HUE_RED;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f53841a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m50941a(int[] iArr) {
        int c = m50943c(m50942b(iArr));
        if (c != -1) {
            return c;
        }
        return m50945e(iArr);
    }

    /* renamed from: b */
    private static int[] m50942b(int[] iArr) {
        float a = (float) C22676x.m55279a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = ((((float) i3) * a) / 17.0f) + (a / 34.0f);
            int i4 = iArr[i2];
            if (((float) (i + i4)) <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }

    /* renamed from: c */
    private static int m50943c(int[] iArr) {
        int d = m50944d(iArr);
        if (C22720y.m55474a(d) == -1) {
            return -1;
        }
        return d;
    }

    /* renamed from: d */
    private static int m50944d(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: e */
    private static int m50945e(int[] iArr) {
        int a = C22676x.m55279a(iArr);
        float[] fArr = new float[8];
        if (a > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) a);
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f53841a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C22720y.f57473a[i3];
                f = f2;
            }
            i3++;
        }
    }
}
