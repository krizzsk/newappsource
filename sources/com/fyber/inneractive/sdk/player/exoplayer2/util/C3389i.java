package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i */
public final class C3389i {

    /* renamed from: a */
    public static final byte[] f12100a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f12101b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f12102c = new Object();

    /* renamed from: d */
    public static int[] f12103d = new int[10];

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i$a */
    public static final class C3390a {

        /* renamed from: a */
        public final int f12104a;

        /* renamed from: b */
        public final int f12105b;

        /* renamed from: c */
        public final boolean f12106c;

        public C3390a(int i, int i2, boolean z) {
            this.f12104a = i;
            this.f12105b = i2;
            this.f12106c = z;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i$b */
    public static final class C3391b {

        /* renamed from: a */
        public final int f12107a;

        /* renamed from: b */
        public final int f12108b;

        /* renamed from: c */
        public final int f12109c;

        /* renamed from: d */
        public final float f12110d;

        /* renamed from: e */
        public final boolean f12111e;

        /* renamed from: f */
        public final boolean f12112f;

        /* renamed from: g */
        public final int f12113g;

        /* renamed from: h */
        public final int f12114h;

        /* renamed from: i */
        public final int f12115i;

        /* renamed from: j */
        public final boolean f12116j;

        public C3391b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f12107a = i;
            this.f12108b = i2;
            this.f12109c = i3;
            this.f12110d = f;
            this.f12111e = z;
            this.f12112f = z2;
            this.f12113g = i4;
            this.f12114h = i5;
            this.f12115i = i6;
            this.f12116j = z3;
        }
    }

    /* renamed from: a */
    public static int m8523a(byte[] bArr, int i) {
        int i2;
        synchronized (f12102c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f12103d;
                    if (iArr.length <= i4) {
                        f12103d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f12103d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f12103d[i7] - i6;
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

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0158  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.C3391b m8527b(byte[] r19, int r20, int r21) {
        /*
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.l
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo14572d(r1)
            int r2 = r0.mo14567b(r1)
            r3 = 16
            r0.mo14572d(r3)
            int r5 = r0.mo14571d()
            r4 = 3
            r6 = 0
            r7 = 1
            r8 = 100
            if (r2 == r8) goto L_0x004c
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 122(0x7a, float:1.71E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 244(0xf4, float:3.42E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 44
            if (r2 == r8) goto L_0x004c
            r8 = 83
            if (r2 == r8) goto L_0x004c
            r8 = 86
            if (r2 == r8) goto L_0x004c
            r8 = 118(0x76, float:1.65E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 128(0x80, float:1.794E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 138(0x8a, float:1.93E-43)
            if (r2 != r8) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x009c
        L_0x004c:
            int r2 = r0.mo14571d()
            if (r2 != r4) goto L_0x0057
            boolean r8 = r0.mo14569c()
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            r0.mo14571d()
            r0.mo14571d()
            r0.mo14574f()
            boolean r9 = r0.mo14569c()
            if (r9 == 0) goto L_0x009b
            if (r2 == r4) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x009b
            boolean r11 = r0.mo14569c()
            if (r11 == 0) goto L_0x0098
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            r12 = 0
            r13 = 8
            r14 = 8
        L_0x0084:
            if (r12 >= r11) goto L_0x0098
            if (r13 == 0) goto L_0x0091
            int r13 = r0.mo14573e()
            int r13 = r13 + r14
            int r13 = r13 + 256
            int r13 = r13 % 256
        L_0x0091:
            if (r13 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r14 = r13
        L_0x0095:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x009b:
            r9 = r8
        L_0x009c:
            int r8 = r0.mo14571d()
            int r11 = r8 + 4
            int r12 = r0.mo14571d()
            if (r12 != 0) goto L_0x00b2
            int r8 = r0.mo14571d()
            int r8 = r8 + 4
            r19 = r5
            r13 = r8
            goto L_0x00d7
        L_0x00b2:
            if (r12 != r7) goto L_0x00d4
            boolean r8 = r0.mo14569c()
            r0.mo14573e()
            r0.mo14573e()
            int r10 = r0.mo14571d()
            long r13 = (long) r10
            r19 = r5
            r10 = 0
        L_0x00c6:
            long r4 = (long) r10
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00d1
            r0.mo14571d()
            int r10 = r10 + 1
            goto L_0x00c6
        L_0x00d1:
            r14 = r8
            r13 = 0
            goto L_0x00d8
        L_0x00d4:
            r19 = r5
            r13 = 0
        L_0x00d7:
            r14 = 0
        L_0x00d8:
            r0.mo14571d()
            r0.mo14574f()
            int r4 = r0.mo14571d()
            int r4 = r4 + r7
            int r5 = r0.mo14571d()
            int r5 = r5 + r7
            boolean r10 = r0.mo14569c()
            int r6 = 2 - r10
            int r5 = r5 * r6
            if (r10 != 0) goto L_0x00f5
            r0.mo14574f()
        L_0x00f5:
            r0.mo14574f()
            int r4 = r4 * 16
            int r5 = r5 * 16
            boolean r8 = r0.mo14569c()
            if (r8 == 0) goto L_0x012d
            int r8 = r0.mo14571d()
            int r15 = r0.mo14571d()
            int r16 = r0.mo14571d()
            int r17 = r0.mo14571d()
            if (r2 != 0) goto L_0x0115
            goto L_0x0123
        L_0x0115:
            r18 = 2
            r3 = 3
            if (r2 != r3) goto L_0x011c
            r3 = 1
            goto L_0x011d
        L_0x011c:
            r3 = 2
        L_0x011d:
            if (r2 != r7) goto L_0x0120
            r7 = 2
        L_0x0120:
            int r6 = r6 * r7
            r7 = r3
        L_0x0123:
            int r8 = r8 + r15
            int r8 = r8 * r7
            int r4 = r4 - r8
            int r16 = r16 + r17
            int r16 = r16 * r6
            int r5 = r5 - r16
        L_0x012d:
            r6 = r4
            r7 = r5
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.mo14569c()
            if (r3 == 0) goto L_0x0161
            boolean r3 = r0.mo14569c()
            if (r3 == 0) goto L_0x0161
            int r1 = r0.mo14567b(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0158
            r3 = 16
            int r1 = r0.mo14567b(r3)
            int r0 = r0.mo14567b(r3)
            if (r1 == 0) goto L_0x0161
            if (r0 == 0) goto L_0x0161
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r8 = r1
            goto L_0x0163
        L_0x0158:
            float[] r0 = f12101b
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0161
            r0 = r0[r1]
            r8 = r0
            goto L_0x0163
        L_0x0161:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0163:
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.i$b
            r4 = r0
            r5 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8527b(byte[], int, int):com.fyber.inneractive.sdk.player.exoplayer2.util.i$b");
    }

    /* renamed from: a */
    public static C3390a m8525a(byte[] bArr, int i, int i2) {
        C3394l lVar = new C3394l(bArr, i, i2);
        lVar.mo14572d(8);
        int d = lVar.mo14571d();
        int d2 = lVar.mo14571d();
        lVar.mo14574f();
        return new C3390a(d, d2, lVar.mo14569c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8524a(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r3)
            if (r0 != 0) goto L_0x000f
            return r10
        L_0x000f:
            r3 = 2
            if (r11 == 0) goto L_0x0040
            boolean r4 = r11[r1]
            if (r4 == 0) goto L_0x001c
            m8526a(r11)
            int r9 = r9 + -3
            return r9
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r11[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r8[r9]
            if (r4 != r2) goto L_0x002b
            m8526a(r11)
            int r9 = r9 - r3
            return r9
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r11[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r8[r9]
            if (r4 != 0) goto L_0x0040
            int r4 = r9 + 1
            byte r4 = r8[r4]
            if (r4 != r2) goto L_0x0040
            m8526a(r11)
            int r9 = r9 - r2
            return r9
        L_0x0040:
            int r4 = r10 + -1
            int r9 = r9 + r3
        L_0x0043:
            if (r9 >= r4) goto L_0x0065
            byte r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            int r6 = r9 + -2
            byte r7 = r8[r6]
            if (r7 != 0) goto L_0x0060
            int r7 = r9 + -1
            byte r7 = r8[r7]
            if (r7 != 0) goto L_0x0060
            if (r5 != r2) goto L_0x0060
            if (r11 == 0) goto L_0x005f
            m8526a(r11)
        L_0x005f:
            return r6
        L_0x0060:
            int r9 = r9 + -2
        L_0x0062:
            int r9 = r9 + 3
            goto L_0x0043
        L_0x0065:
            if (r11 == 0) goto L_0x00b9
            if (r0 <= r3) goto L_0x007a
            int r9 = r10 + -3
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x0095
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x0095
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x0095
            goto L_0x0093
        L_0x007a:
            if (r0 != r3) goto L_0x008b
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x0095
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x0095
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x0095
            goto L_0x0093
        L_0x008b:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L_0x0095
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x0095
        L_0x0093:
            r9 = 1
            goto L_0x0096
        L_0x0095:
            r9 = 0
        L_0x0096:
            r11[r1] = r9
            if (r0 <= r2) goto L_0x00a5
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x00af
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00af
            goto L_0x00ad
        L_0x00a5:
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x00af
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00af
        L_0x00ad:
            r9 = 1
            goto L_0x00b0
        L_0x00af:
            r9 = 0
        L_0x00b0:
            r11[r2] = r9
            byte r8 = r8[r4]
            if (r8 != 0) goto L_0x00b7
            r1 = 1
        L_0x00b7:
            r11[r3] = r1
        L_0x00b9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8524a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: a */
    public static void m8526a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
