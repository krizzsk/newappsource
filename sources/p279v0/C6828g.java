package p279v0;

import java.lang.reflect.Array;

/* renamed from: v0.g */
public final class C6828g extends C6819b {

    /* renamed from: a */
    public double[] f21126a;

    /* renamed from: b */
    public double[][] f21127b;

    /* renamed from: c */
    public double[][] f21128c;

    /* renamed from: d */
    public double[] f21129d;

    public C6828g(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        this.f21129d = new double[length2];
        int i = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr3[i4] - dArr3[i3];
                double[] dArr7 = dArr5[i3];
                double d2 = (dArr4[i4][i2] - dArr4[i3][i2]) / d;
                dArr7[i2] = d2;
                if (i3 == 0) {
                    dArr6[i3][i2] = d2;
                } else {
                    dArr6[i3][i2] = (dArr5[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr6[i][i2] = dArr5[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr5[i5][i6];
                if (d3 == 0.0d) {
                    dArr6[i5][i6] = 0.0d;
                    dArr6[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr6[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr6[i7][i6] / d3;
                    double hypot = Math.hypot(d4, d5);
                    if (hypot > 9.0d) {
                        double d6 = 3.0d / hypot;
                        double[] dArr8 = dArr6[i5];
                        double[] dArr9 = dArr5[i5];
                        dArr8[i6] = d4 * d6 * dArr9[i6];
                        dArr6[i7][i6] = d6 * d5 * dArr9[i6];
                    }
                }
            }
        }
        this.f21126a = dArr3;
        this.f21127b = dArr4;
        this.f21128c = dArr6;
    }

    /* renamed from: h */
    public static double m16123h(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 6.0d * d7 * d3;
        double d11 = 3.0d * d;
        double d12 = d11 * d5 * d7;
        return (d * d5) + (((d12 + (((d11 * d6) * d7) + ((d9 + ((d8 * d4) + ((-6.0d * d7) * d4))) - (d8 * d3)))) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    /* renamed from: i */
    public static double m16124i(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d11 = d9 * d4;
        double d12 = d * d6;
        double d13 = d12 * d8;
        double d14 = d * d5;
        return (d14 * d2) + ((((d8 * d14) + (d13 + (((((d8 * 2.0d) * d3) + (d11 + ((-2.0d * d8) * d4))) - (d9 * d3)) + d3))) - (d12 * d7)) - (((2.0d * d) * d5) * d7));
    }

    /* renamed from: b */
    public final double mo23036b(double d) {
        double d2;
        double d3;
        double e;
        double[] dArr = this.f21126a;
        int length = dArr.length;
        double d4 = dArr[0];
        if (d <= d4) {
            d2 = this.f21127b[0][0];
            d3 = d - d4;
            e = mo23039e(d4);
        } else {
            int i = length - 1;
            double d5 = dArr[i];
            if (d >= d5) {
                d2 = this.f21127b[i][0];
                d3 = d - d5;
                e = mo23039e(d5);
            } else {
                int i2 = 0;
                while (i2 < i) {
                    double[] dArr2 = this.f21126a;
                    double d6 = dArr2[i2];
                    if (d == d6) {
                        return this.f21127b[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr2[i3];
                    if (d < d7) {
                        double d8 = d7 - d6;
                        double d9 = (d - d6) / d8;
                        double[][] dArr3 = this.f21127b;
                        double d11 = dArr3[i2][0];
                        double d12 = dArr3[i3][0];
                        double[][] dArr4 = this.f21128c;
                        return m16124i(d8, d9, d11, d12, dArr4[i2][0], dArr4[i3][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
        }
        return (e * d3) + d2;
    }

    /* renamed from: c */
    public final void mo23037c(double d, double[] dArr) {
        double[] dArr2 = this.f21126a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f21127b[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            mo23040f(d2, this.f21129d);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - this.f21126a[0]) * this.f21129d[i2]) + this.f21127b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            mo23040f(d3, this.f21129d);
            while (i < length2) {
                dArr[i] = ((d - this.f21126a[i3]) * this.f21129d[i]) + this.f21127b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == this.f21126a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f21127b[i4][i5];
                }
            }
            double[] dArr3 = this.f21126a;
            int i6 = i4 + 1;
            double d4 = dArr3[i6];
            if (d < d4) {
                double d5 = dArr3[i4];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr4 = this.f21127b;
                    double d8 = dArr4[i4][i];
                    double d9 = dArr4[i6][i];
                    double[][] dArr5 = this.f21128c;
                    dArr[i] = m16124i(d6, d7, d8, d9, dArr5[i4][i], dArr5[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: d */
    public final void mo23038d(double d, float[] fArr) {
        double[] dArr = this.f21126a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f21127b[0].length;
        double d2 = dArr[0];
        if (d <= d2) {
            mo23040f(d2, this.f21129d);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - this.f21126a[0]) * this.f21129d[i2]) + this.f21127b[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr[i3];
        if (d >= d3) {
            mo23040f(d3, this.f21129d);
            while (i < length2) {
                fArr[i] = (float) (((d - this.f21126a[i3]) * this.f21129d[i]) + this.f21127b[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f21126a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f21127b[i4][i5];
                }
            }
            double[] dArr2 = this.f21126a;
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr3 = this.f21127b;
                    double d8 = dArr3[i4][i];
                    double d9 = dArr3[i6][i];
                    double[][] dArr4 = this.f21128c;
                    fArr[i] = (float) m16124i(d6, d7, d8, d9, dArr4[i4][i], dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: e */
    public final double mo23039e(double d) {
        double[] dArr = this.f21126a;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr2 = this.f21126a;
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d2 <= d3) {
                double d4 = dArr2[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                double[][] dArr3 = this.f21127b;
                double d7 = dArr3[i][0];
                double d8 = dArr3[i2][0];
                double[][] dArr4 = this.f21128c;
                return m16123h(d5, d6, d7, d8, dArr4[i][0], dArr4[i2][0]) / d5;
            }
            i = i2;
        }
        return 0.0d;
    }

    /* renamed from: f */
    public final void mo23040f(double d, double[] dArr) {
        double[] dArr2 = this.f21126a;
        int length = dArr2.length;
        int length2 = this.f21127b[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f21126a;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f21127b;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.f21128c;
                    dArr[i3] = m16123h(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    /* renamed from: g */
    public final double[] mo23041g() {
        return this.f21126a;
    }
}
