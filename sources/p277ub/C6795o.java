package p277ub;

import java.util.Arrays;
import p583jk.C17875h;

/* renamed from: ub.o */
public final class C6795o {

    /* renamed from: a */
    public static final byte[] f21007a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f21008b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f21009c = new Object();

    /* renamed from: d */
    public static int[] f21010d = new int[10];

    /* renamed from: ub.o$a */
    public static final class C6796a {

        /* renamed from: a */
        public final int f21011a;

        /* renamed from: b */
        public final int f21012b;

        /* renamed from: c */
        public final boolean f21013c;

        public C6796a(int i, int i2, boolean z) {
            this.f21011a = i;
            this.f21012b = i2;
            this.f21013c = z;
        }
    }

    /* renamed from: ub.o$b */
    public static final class C6797b {

        /* renamed from: a */
        public final int f21014a;

        /* renamed from: b */
        public final int f21015b;

        /* renamed from: c */
        public final int f21016c;

        /* renamed from: d */
        public final int f21017d;

        /* renamed from: e */
        public final int f21018e;

        /* renamed from: f */
        public final int f21019f;

        /* renamed from: g */
        public final float f21020g;

        /* renamed from: h */
        public final boolean f21021h;

        /* renamed from: i */
        public final boolean f21022i;

        /* renamed from: j */
        public final int f21023j;

        /* renamed from: k */
        public final int f21024k;

        /* renamed from: l */
        public final int f21025l;

        /* renamed from: m */
        public final boolean f21026m;

        public C6797b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f21014a = i;
            this.f21015b = i2;
            this.f21016c = i3;
            this.f21017d = i4;
            this.f21018e = i5;
            this.f21019f = i6;
            this.f21020g = f;
            this.f21021h = z;
            this.f21022i = z2;
            this.f21023j = i7;
            this.f21024k = i8;
            this.f21025l = i9;
            this.f21026m = z3;
        }
    }

    /* renamed from: a */
    public static void m15998a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m15999b(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m15998a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m15998a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m15998a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !zArr[2] || bArr[i4] != 0 : !(bArr[i2 - 2] == 0 && bArr[i4] == 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        } else {
            m15998a(zArr);
            return i - 1;
        }
    }

    /* renamed from: c */
    public static C6796a m16000c(int i, byte[] bArr) {
        C6804s sVar = new C6804s(bArr, 3, i);
        sVar.mo23017j(8);
        int f = sVar.mo23013f();
        int f2 = sVar.mo23013f();
        sVar.mo23016i();
        return new C6796a(f, f2, sVar.mo23011d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0162  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p277ub.C6795o.C6797b m16001d(int r21, int r22, byte[] r23) {
        /*
            ub.s r0 = new ub.s
            r2 = r21
            r3 = r22
            r1 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo23017j(r1)
            int r3 = r0.mo23012e(r1)
            int r4 = r0.mo23012e(r1)
            int r5 = r0.mo23012e(r1)
            int r6 = r0.mo23013f()
            r2 = 100
            r7 = 3
            r10 = 1
            if (r3 == r2) goto L_0x004e
            r2 = 110(0x6e, float:1.54E-43)
            if (r3 == r2) goto L_0x004e
            r2 = 122(0x7a, float:1.71E-43)
            if (r3 == r2) goto L_0x004e
            r2 = 244(0xf4, float:3.42E-43)
            if (r3 == r2) goto L_0x004e
            r2 = 44
            if (r3 == r2) goto L_0x004e
            r2 = 83
            if (r3 == r2) goto L_0x004e
            r2 = 86
            if (r3 == r2) goto L_0x004e
            r2 = 118(0x76, float:1.65E-43)
            if (r3 == r2) goto L_0x004e
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == r2) goto L_0x004e
            r2 = 138(0x8a, float:1.93E-43)
            if (r3 != r2) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r2 = 1
            r11 = 0
            goto L_0x00a1
        L_0x004e:
            int r2 = r0.mo23013f()
            if (r2 != r7) goto L_0x0059
            boolean r11 = r0.mo23011d()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.mo23013f()
            r0.mo23013f()
            r0.mo23016i()
            boolean r12 = r0.mo23011d()
            if (r12 == 0) goto L_0x00a1
            if (r2 == r7) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x00a1
            boolean r14 = r0.mo23011d()
            if (r14 == 0) goto L_0x009e
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x0086:
            if (r15 >= r14) goto L_0x009e
            if (r16 == 0) goto L_0x0096
            int r16 = r0.mo23014g()
            int r9 = r16 + r17
            int r9 = r9 + 256
            int r9 = r9 % 256
            r16 = r9
        L_0x0096:
            if (r16 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r17 = r16
        L_0x009b:
            int r15 = r15 + 1
            goto L_0x0086
        L_0x009e:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x00a1:
            int r9 = r0.mo23013f()
            int r12 = r9 + 4
            int r13 = r0.mo23013f()
            if (r13 != 0) goto L_0x00b5
            int r9 = r0.mo23013f()
            int r9 = r9 + 4
            r14 = r9
            goto L_0x00d6
        L_0x00b5:
            if (r13 != r10) goto L_0x00d5
            boolean r9 = r0.mo23011d()
            r0.mo23014g()
            r0.mo23014g()
            int r14 = r0.mo23013f()
            long r14 = (long) r14
            r1 = 0
        L_0x00c7:
            long r7 = (long) r1
            int r17 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x00d2
            r0.mo23013f()
            int r1 = r1 + 1
            goto L_0x00c7
        L_0x00d2:
            r15 = r9
            r14 = 0
            goto L_0x00d7
        L_0x00d5:
            r14 = 0
        L_0x00d6:
            r15 = 0
        L_0x00d7:
            r0.mo23013f()
            r0.mo23016i()
            int r1 = r0.mo23013f()
            int r1 = r1 + r10
            int r7 = r0.mo23013f()
            int r7 = r7 + r10
            boolean r17 = r0.mo23011d()
            int r8 = 2 - r17
            int r8 = r8 * r7
            if (r17 != 0) goto L_0x00f4
            r0.mo23016i()
        L_0x00f4:
            r0.mo23016i()
            r7 = 16
            int r1 = r1 * 16
            int r8 = r8 * 16
            boolean r7 = r0.mo23011d()
            if (r7 == 0) goto L_0x0136
            int r7 = r0.mo23013f()
            int r9 = r0.mo23013f()
            int r18 = r0.mo23013f()
            int r19 = r0.mo23013f()
            if (r2 != 0) goto L_0x0118
            int r2 = 2 - r17
            goto L_0x012c
        L_0x0118:
            r20 = 2
            r10 = 3
            if (r2 != r10) goto L_0x0120
            r21 = 1
            goto L_0x0122
        L_0x0120:
            r21 = 2
        L_0x0122:
            r10 = 1
            if (r2 != r10) goto L_0x0126
            r10 = 2
        L_0x0126:
            int r2 = 2 - r17
            int r2 = r2 * r10
            r10 = r21
        L_0x012c:
            int r7 = r7 + r9
            int r7 = r7 * r10
            int r1 = r1 - r7
            int r18 = r18 + r19
            int r18 = r18 * r2
            int r8 = r8 - r18
        L_0x0136:
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo23011d()
            if (r2 == 0) goto L_0x016c
            boolean r2 = r0.mo23011d()
            if (r2 == 0) goto L_0x016c
            r2 = 8
            int r2 = r0.mo23012e(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0162
            r9 = 16
            int r2 = r0.mo23012e(r9)
            int r0 = r0.mo23012e(r9)
            if (r2 == 0) goto L_0x0160
            if (r0 == 0) goto L_0x0160
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0160:
            r9 = r1
            goto L_0x016e
        L_0x0162:
            float[] r0 = f21008b
            r9 = 17
            if (r2 >= r9) goto L_0x016c
            r0 = r0[r2]
            r9 = r0
            goto L_0x016e
        L_0x016c:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x016e:
            ub.o$b r0 = new ub.o$b
            r2 = r0
            r10 = r11
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p277ub.C6795o.m16001d(int, int, byte[]):ub.o$b");
    }

    /* renamed from: e */
    public static int m16002e(int i, byte[] bArr) {
        int i2;
        synchronized (f21009c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f21010d;
                    if (iArr.length <= i4) {
                        f21010d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f21010d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f21010d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i11 = i9 + 1;
                bArr[i9] = 0;
                i5 = i11 + 1;
                bArr[i11] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
