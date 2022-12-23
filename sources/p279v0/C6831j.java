package p279v0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p001a0.C0016g;

/* renamed from: v0.j */
public abstract class C6831j {

    /* renamed from: a */
    public C6819b f21137a;

    /* renamed from: b */
    public int[] f21138b = new int[10];

    /* renamed from: c */
    public float[] f21139c = new float[10];

    /* renamed from: d */
    public int f21140d;

    /* renamed from: e */
    public String f21141e;

    /* renamed from: a */
    public final float mo23064a(float f) {
        return (float) this.f21137a.mo23036b((double) f);
    }

    /* renamed from: b */
    public void mo23065b(float f, int i) {
        int[] iArr = this.f21138b;
        if (iArr.length < this.f21140d + 1) {
            this.f21138b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f21139c;
            this.f21139c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f21138b;
        int i2 = this.f21140d;
        iArr2[i2] = i;
        this.f21139c[i2] = f;
        this.f21140d = i2 + 1;
    }

    /* renamed from: c */
    public void mo23066c(int i) {
        int i2 = this.f21140d;
        if (i2 != 0) {
            int[] iArr = this.f21138b;
            float[] fArr = this.f21139c;
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2 - 1;
            iArr2[1] = 0;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int i7 = iArr[i6];
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < i6) {
                        int i11 = iArr[i8];
                        if (i11 <= i7) {
                            int i12 = iArr[i9];
                            iArr[i9] = i11;
                            iArr[i8] = i12;
                            float f = fArr[i9];
                            fArr[i9] = fArr[i8];
                            fArr[i8] = f;
                            i9++;
                        }
                        i8++;
                    }
                    int i13 = iArr[i9];
                    iArr[i9] = iArr[i6];
                    iArr[i6] = i13;
                    float f2 = fArr[i9];
                    fArr[i9] = fArr[i6];
                    fArr[i6] = f2;
                    int i14 = i3 + 1;
                    iArr2[i3] = i9 - 1;
                    int i15 = i14 + 1;
                    iArr2[i14] = i5;
                    int i16 = i15 + 1;
                    iArr2[i15] = i6;
                    i3 = i16 + 1;
                    iArr2[i16] = i9 + 1;
                }
            }
            int i17 = 1;
            for (int i18 = 1; i18 < this.f21140d; i18++) {
                int[] iArr3 = this.f21138b;
                if (iArr3[i18 - 1] != iArr3[i18]) {
                    i17++;
                }
            }
            double[] dArr = new double[i17];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i17;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
            int i19 = 0;
            for (int i21 = 0; i21 < this.f21140d; i21++) {
                if (i21 > 0) {
                    int[] iArr5 = this.f21138b;
                    if (iArr5[i21] == iArr5[i21 - 1]) {
                    }
                }
                dArr[i19] = ((double) this.f21138b[i21]) * 0.01d;
                dArr2[i19][0] = (double) this.f21139c[i21];
                i19++;
            }
            this.f21137a = C6819b.m16093a(i, dArr, dArr2);
        }
    }

    public final String toString() {
        String str = this.f21141e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f21140d; i++) {
            StringBuilder t = C0016g.m36t(str, "[");
            t.append(this.f21138b[i]);
            t.append(" , ");
            t.append(decimalFormat.format((double) this.f21139c[i]));
            t.append("] ");
            str = t.toString();
        }
        return str;
    }
}
