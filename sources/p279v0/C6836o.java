package p279v0;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p001a0.C0016g;

/* renamed from: v0.o */
public abstract class C6836o {

    /* renamed from: a */
    public C6819b f21165a;

    /* renamed from: b */
    public int f21166b = 0;

    /* renamed from: c */
    public int[] f21167c = new int[10];

    /* renamed from: d */
    public float[][] f21168d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e */
    public int f21169e;

    /* renamed from: f */
    public String f21170f;

    /* renamed from: g */
    public float[] f21171g = new float[3];

    /* renamed from: h */
    public boolean f21172h = false;

    /* renamed from: i */
    public long f21173i;

    /* renamed from: j */
    public float f21174j = Float.NaN;

    /* renamed from: a */
    public final float mo23073a(float f) {
        float abs;
        switch (this.f21166b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * 6.2831855f));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * 6.2831855f));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public void mo23074b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f21167c;
        int i3 = this.f21169e;
        iArr[i3] = i;
        float[] fArr = this.f21168d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f21166b = Math.max(this.f21166b, i2);
        this.f21169e++;
    }

    /* renamed from: c */
    public void mo23075c(int i) {
        int i2 = this.f21169e;
        if (i2 == 0) {
            PrintStream printStream = System.err;
            StringBuilder k = C13555b.m33972k("Error no points added to ");
            k.append(this.f21170f);
            printStream.println(k.toString());
            return;
        }
        int[] iArr = this.f21167c;
        float[][] fArr = this.f21168d;
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
                        float[] fArr2 = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = fArr2;
                        i9++;
                    }
                    i8++;
                }
                int i13 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i13;
                float[] fArr3 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = fArr3;
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
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.f21167c;
            if (i17 >= iArr3.length) {
                break;
            }
            if (iArr3[i17] != iArr3[i17 - 1]) {
                i18++;
            }
            i17++;
        }
        if (i18 == 0) {
            i18 = 1;
        }
        double[] dArr = new double[i18];
        int[] iArr4 = new int[2];
        iArr4[1] = 3;
        iArr4[0] = i18;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
        int i19 = 0;
        for (int i21 = 0; i21 < this.f21169e; i21++) {
            if (i21 > 0) {
                int[] iArr5 = this.f21167c;
                if (iArr5[i21] == iArr5[i21 - 1]) {
                }
            }
            dArr[i19] = ((double) this.f21167c[i21]) * 0.01d;
            double[] dArr3 = dArr2[i19];
            float[] fArr4 = this.f21168d[i21];
            dArr3[0] = (double) fArr4[0];
            dArr3[1] = (double) fArr4[1];
            dArr3[2] = (double) fArr4[2];
            i19++;
        }
        this.f21165a = C6819b.m16093a(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f21170f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f21169e; i++) {
            StringBuilder t = C0016g.m36t(str, "[");
            t.append(this.f21167c[i]);
            t.append(" , ");
            t.append(decimalFormat.format(this.f21168d[i]));
            t.append("] ");
            str = t.toString();
        }
        return str;
    }
}
