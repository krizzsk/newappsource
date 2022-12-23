package p279v0;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p001a0.C0016g;

/* renamed from: v0.e */
public abstract class C6824e {

    /* renamed from: a */
    public C6825a f21103a;

    /* renamed from: b */
    public String f21104b;

    /* renamed from: c */
    public int f21105c = 0;

    /* renamed from: d */
    public String f21106d = null;

    /* renamed from: e */
    public int f21107e = 0;

    /* renamed from: f */
    public ArrayList<C6826b> f21108f = new ArrayList<>();

    /* renamed from: v0.e$a */
    public static class C6825a {

        /* renamed from: a */
        public C6829h f21109a;

        /* renamed from: b */
        public float[] f21110b;

        /* renamed from: c */
        public double[] f21111c;

        /* renamed from: d */
        public float[] f21112d;

        /* renamed from: e */
        public float[] f21113e;

        /* renamed from: f */
        public float[] f21114f;

        /* renamed from: g */
        public C6819b f21115g;

        /* renamed from: h */
        public double[] f21116h;

        /* renamed from: i */
        public double[] f21117i;

        public C6825a(int i, String str, int i2) {
            long j;
            String str2 = str;
            int i3 = i2;
            C6829h hVar = new C6829h();
            this.f21109a = hVar;
            hVar.f21134e = i;
            if (str2 != null) {
                double[] dArr = new double[(str.length() / 2)];
                int indexOf = str2.indexOf(40) + 1;
                int indexOf2 = str2.indexOf(44, indexOf);
                char c = 0;
                int i4 = 0;
                while (indexOf2 != -1) {
                    dArr[i4] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str2.indexOf(44, indexOf);
                    i4++;
                }
                dArr[i4] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i4 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d = 1.0d / ((double) length2);
                int[] iArr = new int[2];
                iArr[1] = 1;
                iArr[0] = length;
                double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
                double[] dArr3 = new double[length];
                int i5 = 0;
                while (i5 < copyOf.length) {
                    double d2 = copyOf[i5];
                    int i6 = i5 + length2;
                    dArr2[i6][c] = d2;
                    double d3 = ((double) i5) * d;
                    dArr3[i6] = d3;
                    if (i5 > 0) {
                        int i7 = (length2 * 2) + i5;
                        j = 4607182418800017408L;
                        dArr2[i7][0] = d2 + 1.0d;
                        dArr3[i7] = d3 + 1.0d;
                        int i8 = i5 - 1;
                        dArr2[i8][0] = (d2 - 1.0d) - d;
                        dArr3[i8] = (d3 - 4.0d) - d;
                    } else {
                        j = 4607182418800017408L;
                    }
                    i5++;
                    long j2 = j;
                    c = 0;
                }
                hVar.f21133d = new C6828g(dArr3, dArr2);
            }
            this.f21110b = new float[i3];
            this.f21111c = new double[i3];
            this.f21112d = new float[i3];
            this.f21113e = new float[i3];
            this.f21114f = new float[i3];
            float[] fArr = new float[i3];
        }
    }

    /* renamed from: v0.e$b */
    public static class C6826b {

        /* renamed from: a */
        public int f21118a;

        /* renamed from: b */
        public float f21119b;

        /* renamed from: c */
        public float f21120c;

        /* renamed from: d */
        public float f21121d;

        /* renamed from: e */
        public float f21122e;

        public C6826b(float f, float f2, float f3, float f4, int i) {
            this.f21118a = i;
            this.f21119b = f4;
            this.f21120c = f2;
            this.f21121d = f;
            this.f21122e = f3;
        }
    }

    /* renamed from: a */
    public final float mo23055a(float f) {
        C6825a aVar = this.f21103a;
        C6819b bVar = aVar.f21115g;
        if (bVar != null) {
            bVar.mo23037c((double) f, aVar.f21116h);
        } else {
            double[] dArr = aVar.f21116h;
            dArr[0] = (double) aVar.f21113e[0];
            dArr[1] = (double) aVar.f21114f[0];
            dArr[2] = (double) aVar.f21110b[0];
        }
        double[] dArr2 = aVar.f21116h;
        return (float) ((aVar.f21109a.mo23062c((double) f, dArr2[1]) * aVar.f21116h[2]) + dArr2[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        r5 = r13 * 2.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d6, code lost:
        r5 = r17 * r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d8, code lost:
        r1 = r2.f21117i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ea, code lost:
        return (float) ((r5 * r2.f21116h[2]) + ((r11 * r1[2]) + r1[0]));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo23056b(float r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            v0.e$a r2 = r0.f21103a
            v0.b r3 = r2.f21115g
            r4 = 2
            r5 = 0
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x001d
            double r9 = (double) r1
            double[] r11 = r2.f21117i
            r3.mo23040f(r9, r11)
            v0.b r3 = r2.f21115g
            double[] r11 = r2.f21116h
            r3.mo23037c(r9, r11)
            goto L_0x0025
        L_0x001d:
            double[] r3 = r2.f21117i
            r3[r8] = r5
            r3[r7] = r5
            r3[r4] = r5
        L_0x0025:
            v0.h r3 = r2.f21109a
            double r9 = (double) r1
            double[] r1 = r2.f21116h
            r11 = r1[r7]
            double r11 = r3.mo23062c(r9, r11)
            v0.h r1 = r2.f21109a
            double[] r3 = r2.f21116h
            r13 = r3[r7]
            double[] r3 = r2.f21117i
            r15 = r3[r7]
            double r17 = r1.mo23061b(r9)
            double r17 = r17 + r13
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x004c
            r9 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto L_0x0055
        L_0x004c:
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0055
            r9 = 4607182409792818153(0x3feffffde7210be9, double:0.999999)
        L_0x0055:
            double[] r3 = r1.f21131b
            int r3 = java.util.Arrays.binarySearch(r3, r9)
            if (r3 <= 0) goto L_0x005e
            goto L_0x0080
        L_0x005e:
            if (r3 == 0) goto L_0x0080
            int r3 = -r3
            int r3 = r3 + -1
            float[] r7 = r1.f21130a
            r19 = r7[r3]
            int r20 = r3 + -1
            r7 = r7[r20]
            float r5 = r19 - r7
            double r5 = (double) r5
            double[] r4 = r1.f21131b
            r21 = r4[r3]
            r3 = r4[r20]
            double r21 = r21 - r3
            double r5 = r5 / r21
            double r9 = r9 * r5
            double r13 = (double) r7
            double r5 = r5 * r3
            double r13 = r13 - r5
            double r13 = r13 + r9
            goto L_0x0082
        L_0x0080:
            r13 = 0
        L_0x0082:
            double r13 = r13 + r15
            int r3 = r1.f21134e
            r4 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r9 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r3) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00be;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00a5;
                case 7: goto L_0x009a;
                default: goto L_0x0091;
            }
        L_0x0091:
            double r13 = r13 * r4
            double r17 = r17 * r4
            double r17 = java.lang.Math.cos(r17)
            goto L_0x00d6
        L_0x009a:
            v0.g r1 = r1.f21133d
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r17 % r3
            double r5 = r1.mo23039e(r3)
            goto L_0x00d8
        L_0x00a5:
            double r13 = r13 * r9
            double r17 = r17 * r9
            double r17 = r17 + r6
            double r17 = r17 % r9
            double r17 = r17 - r6
            goto L_0x00d6
        L_0x00b0:
            r6 = -4604611780675359464(0xc01921fb54442d18, double:-6.283185307179586)
            double r13 = r13 * r6
            double r17 = r17 * r4
            double r17 = java.lang.Math.sin(r17)
            goto L_0x00d6
        L_0x00be:
            double r13 = -r13
        L_0x00bf:
            double r5 = r13 * r6
            goto L_0x00d8
        L_0x00c2:
            double r13 = r13 * r9
            double r17 = r17 * r9
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r17 = r17 + r3
            double r17 = r17 % r9
            double r17 = r17 - r6
            double r17 = java.lang.Math.signum(r17)
            goto L_0x00d6
        L_0x00d3:
            r5 = 0
            goto L_0x00d8
        L_0x00d6:
            double r5 = r17 * r13
        L_0x00d8:
            double[] r1 = r2.f21117i
            r3 = r1[r8]
            r7 = 2
            r8 = r1[r7]
            double r11 = r11 * r8
            double r11 = r11 + r3
            double[] r1 = r2.f21116h
            r2 = r1[r7]
            double r5 = r5 * r2
            double r5 = r5 + r11
            float r1 = (float) r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p279v0.C6824e.mo23056b(float):float");
    }

    /* renamed from: c */
    public void mo23057c(ConstraintAttribute constraintAttribute) {
    }

    /* renamed from: d */
    public final void mo23058d() {
        int i;
        int size = this.f21108f.size();
        if (size != 0) {
            Collections.sort(this.f21108f, new C6823d());
            double[] dArr = new double[size];
            char c = 2;
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c2 = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f21103a = new C6825a(this.f21105c, this.f21106d, size);
            Iterator<C6826b> it = this.f21108f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C6826b next = it.next();
                float f = next.f21121d;
                dArr[i2] = ((double) f) * 0.01d;
                double[] dArr3 = dArr2[i2];
                float f2 = next.f21119b;
                dArr3[c2] = (double) f2;
                float f3 = next.f21120c;
                dArr3[1] = (double) f3;
                float f4 = next.f21122e;
                dArr3[c] = (double) f4;
                C6825a aVar = this.f21103a;
                aVar.f21111c[i2] = ((double) next.f21118a) / 100.0d;
                aVar.f21112d[i2] = f;
                aVar.f21113e[i2] = f3;
                aVar.f21114f[i2] = f4;
                aVar.f21110b[i2] = f2;
                i2++;
                dArr2 = dArr2;
                c = 2;
                c2 = 0;
            }
            double[][] dArr4 = dArr2;
            C6825a aVar2 = this.f21103a;
            int length = aVar2.f21111c.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 3;
            iArr2[0] = length;
            double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            float[] fArr = aVar2.f21110b;
            aVar2.f21116h = new double[(fArr.length + 2)];
            aVar2.f21117i = new double[(fArr.length + 2)];
            if (aVar2.f21111c[0] > 0.0d) {
                aVar2.f21109a.mo23060a(0.0d, aVar2.f21112d[0]);
            }
            double[] dArr6 = aVar2.f21111c;
            int length2 = dArr6.length - 1;
            if (dArr6[length2] < 1.0d) {
                aVar2.f21109a.mo23060a(1.0d, aVar2.f21112d[length2]);
            }
            for (int i3 = 0; i3 < dArr5.length; i3++) {
                double[] dArr7 = dArr5[i3];
                dArr7[0] = (double) aVar2.f21113e[i3];
                dArr7[1] = (double) aVar2.f21114f[i3];
                dArr7[2] = (double) aVar2.f21110b[i3];
                aVar2.f21109a.mo23060a(aVar2.f21111c[i3], aVar2.f21112d[i3]);
            }
            C6829h hVar = aVar2.f21109a;
            double d = 0.0d;
            int i4 = 0;
            while (true) {
                float[] fArr2 = hVar.f21130a;
                if (i4 >= fArr2.length) {
                    break;
                }
                d += (double) fArr2[i4];
                i4++;
            }
            double d2 = 0.0d;
            int i5 = 1;
            while (true) {
                float[] fArr3 = hVar.f21130a;
                if (i5 >= fArr3.length) {
                    break;
                }
                int i6 = i5 - 1;
                float f5 = (fArr3[i6] + fArr3[i5]) / 2.0f;
                double[] dArr8 = hVar.f21131b;
                d2 = ((dArr8[i5] - dArr8[i6]) * ((double) f5)) + d2;
                i5++;
            }
            int i7 = 0;
            while (true) {
                float[] fArr4 = hVar.f21130a;
                if (i7 >= fArr4.length) {
                    break;
                }
                fArr4[i7] = (float) (((double) fArr4[i7]) * (d / d2));
                i7++;
            }
            hVar.f21132c[0] = 0.0d;
            int i8 = 1;
            while (true) {
                float[] fArr5 = hVar.f21130a;
                if (i8 >= fArr5.length) {
                    break;
                }
                int i9 = i8 - 1;
                double[] dArr9 = hVar.f21131b;
                double d3 = dArr9[i8] - dArr9[i9];
                double[] dArr10 = hVar.f21132c;
                dArr10[i8] = (d3 * ((double) ((fArr5[i9] + fArr5[i8]) / 2.0f))) + dArr10[i9];
                i8++;
            }
            double[] dArr11 = aVar2.f21111c;
            if (dArr11.length > 1) {
                i = 0;
                aVar2.f21115g = C6819b.m16093a(0, dArr11, dArr5);
            } else {
                i = 0;
                aVar2.f21115g = null;
            }
            C6819b.m16093a(i, dArr, dArr4);
        }
    }

    public final String toString() {
        String str = this.f21104b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C6826b> it = this.f21108f.iterator();
        while (it.hasNext()) {
            C6826b next = it.next();
            StringBuilder t = C0016g.m36t(str, "[");
            t.append(next.f21118a);
            t.append(" , ");
            t.append(decimalFormat.format((double) next.f21119b));
            t.append("] ");
            str = t.toString();
        }
        return str;
    }
}
