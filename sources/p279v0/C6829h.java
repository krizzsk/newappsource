package p279v0;

import java.util.Arrays;

/* renamed from: v0.h */
public final class C6829h {

    /* renamed from: a */
    public float[] f21130a = new float[0];

    /* renamed from: b */
    public double[] f21131b = new double[0];

    /* renamed from: c */
    public double[] f21132c;

    /* renamed from: d */
    public C6828g f21133d;

    /* renamed from: e */
    public int f21134e;

    /* renamed from: a */
    public final void mo23060a(double d, float f) {
        int length = this.f21130a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f21131b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f21131b = Arrays.copyOf(this.f21131b, length);
        this.f21130a = Arrays.copyOf(this.f21130a, length);
        this.f21132c = new double[length];
        double[] dArr = this.f21131b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f21131b[binarySearch] = d;
        this.f21130a[binarySearch] = f;
    }

    /* renamed from: b */
    public final double mo23061b(double d) {
        double d2;
        if (d < 0.0d) {
            d2 = 0.0d;
        } else if (d > 1.0d) {
            d2 = 1.0d;
        } else {
            d2 = d;
        }
        int binarySearch = Arrays.binarySearch(this.f21131b, d2);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f21130a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d3 = (double) (f - f2);
        double[] dArr = this.f21131b;
        double d4 = dArr[i];
        double d5 = dArr[i2];
        double d6 = d3 / (d4 - d5);
        return C16530d.m42010c(d2, d5, ((double) f2) - (d6 * d5), this.f21132c[i2]) + ((((d2 * d2) - (d5 * d5)) * d6) / 2.0d);
    }

    /* renamed from: c */
    public final double mo23062c(double d, double d2) {
        double d3;
        double b = mo23061b(d) + d2;
        switch (this.f21134e) {
            case 1:
                return Math.signum(0.5d - (b % 1.0d));
            case 2:
                d3 = Math.abs((((b * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                d3 = ((b * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d2 + b) * 6.283185307179586d);
            case 6:
                double abs = 1.0d - Math.abs(((b * 4.0d) % 4.0d) - 2.0d);
                d3 = abs * abs;
                break;
            case 7:
                return this.f21133d.mo23036b(b % 1.0d);
            default:
                return Math.sin(b * 6.283185307179586d);
        }
        return 1.0d - d3;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("pos =");
        k.append(Arrays.toString(this.f21131b));
        k.append(" period=");
        k.append(Arrays.toString(this.f21130a));
        return k.toString();
    }
}
