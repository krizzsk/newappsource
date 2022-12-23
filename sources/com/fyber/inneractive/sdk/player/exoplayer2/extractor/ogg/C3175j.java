package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j */
public final class C3175j extends C3171h {

    /* renamed from: n */
    public C3176a f11268n;

    /* renamed from: o */
    public int f11269o;

    /* renamed from: p */
    public boolean f11270p;

    /* renamed from: q */
    public C3177k.C3180c f11271q;

    /* renamed from: r */
    public C3177k.C3178a f11272r;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a */
    public static final class C3176a {

        /* renamed from: a */
        public final C3177k.C3180c f11273a;

        /* renamed from: b */
        public final byte[] f11274b;

        /* renamed from: c */
        public final C3177k.C3179b[] f11275c;

        /* renamed from: d */
        public final int f11276d;

        public C3176a(C3177k.C3180c cVar, C3177k.C3178a aVar, byte[] bArr, C3177k.C3179b[] bVarArr, int i) {
            this.f11273a = cVar;
            this.f11274b = bArr;
            this.f11275c = bVarArr;
            this.f11276d = i;
        }
    }

    /* renamed from: a */
    public void mo14230a(boolean z) {
        super.mo14230a(z);
        if (z) {
            this.f11268n = null;
            this.f11271q = null;
            this.f11272r = null;
        }
        this.f11269o = 0;
        this.f11270p = false;
    }

    /* renamed from: b */
    public void mo14238b(long j) {
        boolean z;
        this.f11255g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11270p = z;
        C3177k.C3180c cVar = this.f11271q;
        if (cVar != null) {
            i = cVar.f11281d;
        }
        this.f11269o = i;
    }

    /* renamed from: a */
    public long mo14229a(C3393k kVar) {
        int i;
        int i2 = 0;
        byte b = kVar.f12121a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        C3176a aVar = this.f11268n;
        if (!aVar.f11275c[(b >> 1) & (ValidationUtils.APPBOY_STRING_MAX_LENGTH >>> (8 - aVar.f11276d))].f11277a) {
            i = aVar.f11273a.f11281d;
        } else {
            i = aVar.f11273a.f11282e;
        }
        if (this.f11270p) {
            i2 = (this.f11269o + i) / 4;
        }
        long j = (long) i2;
        kVar.mo14547d(kVar.f12123c + 4);
        byte[] bArr = kVar.f12121a;
        int i3 = kVar.f12123c;
        bArr[i3 - 4] = (byte) ((int) (j & 255));
        bArr[i3 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i3 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i3 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f11270p = true;
        this.f11269o = i;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x03b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14231a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r20, long r21, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3171h.C3172a r23) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r2 = r0.f11268n
            r3 = 0
            if (r2 == 0) goto L_0x000a
            return r3
        L_0x000a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r2 = r0.f11271q
            r4 = 4
            r5 = 1
            if (r2 != 0) goto L_0x0069
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8004a(r5, r1, r3)
            long r7 = r20.mo14550f()
            int r9 = r20.mo14557l()
            long r10 = r20.mo14550f()
            int r12 = r20.mo14548e()
            int r13 = r20.mo14548e()
            int r14 = r20.mo14548e()
            int r2 = r20.mo14557l()
            r3 = r2 & 15
            double r5 = (double) r3
            r21 = r14
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r14, r5)
            int r3 = (int) r5
            r2 = r2 & 240(0xf0, float:3.36E-43)
            int r2 = r2 >> r4
            double r4 = (double) r2
            double r4 = java.lang.Math.pow(r14, r4)
            int r2 = (int) r4
            int r4 = r20.mo14557l()
            r4 = r4 & 1
            if (r4 <= 0) goto L_0x0050
            r4 = 1
            r17 = 1
            goto L_0x0053
        L_0x0050:
            r4 = 0
            r17 = 0
        L_0x0053:
            byte[] r4 = r1.f12121a
            int r1 = r1.f12123c
            byte[] r18 = java.util.Arrays.copyOf(r4, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c
            r6 = r1
            r14 = r21
            r15 = r3
            r16 = r2
            r6.<init>(r7, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            r0.f11271q = r1
            goto L_0x00b5
        L_0x0069:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a r2 = r0.f11272r
            r3 = 3
            if (r2 != 0) goto L_0x00c0
            r2 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8004a(r3, r1, r2)
            long r2 = r20.mo14550f()
            int r3 = (int) r2
            java.lang.String r2 = r1.mo14543b(r3)
            int r3 = r2.length()
            int r3 = r3 + 11
            long r5 = r20.mo14550f()
            int r7 = (int) r5
            java.lang.String[] r7 = new java.lang.String[r7]
            int r3 = r3 + r4
            r4 = 0
        L_0x008a:
            long r8 = (long) r4
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a4
            long r8 = r20.mo14550f()
            int r9 = (int) r8
            int r3 = r3 + 4
            java.lang.String r8 = r1.mo14543b(r9)
            r7[r4] = r8
            int r8 = r8.length()
            int r3 = r3 + r8
            int r4 = r4 + 1
            goto L_0x008a
        L_0x00a4:
            int r1 = r20.mo14557l()
            r1 = r1 & 1
            if (r1 == 0) goto L_0x00b8
            int r3 = r3 + 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a
            r1.<init>(r2, r7, r3)
            r0.f11272r = r1
        L_0x00b5:
            r1 = 0
            goto L_0x03b1
        L_0x00b8:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "framing bit expected to be set"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x00c0:
            int r2 = r1.f12123c
            byte[] r8 = new byte[r2]
            byte[] r3 = r1.f12121a
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r8, r5, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r2 = r0.f11271q
            int r2 = r2.f11278a
            r3 = 5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8004a(r3, r1, r5)
            int r6 = r20.mo14557l()
            int r6 = r6 + 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i
            byte[] r9 = r1.f12121a
            r7.<init>(r9)
            int r1 = r1.f12122b
            int r1 = r1 * 8
            r7.mo14241b(r1)
            r1 = 0
        L_0x00e7:
            r9 = 24
            r10 = 16
            if (r1 >= r6) goto L_0x01c3
            int r11 = r7.mo14239a(r9)
            r12 = 5653314(0x564342, float:7.92198E-39)
            if (r11 != r12) goto L_0x01a9
            int r10 = r7.mo14239a(r10)
            int r9 = r7.mo14239a(r9)
            long[] r11 = new long[r9]
            boolean r12 = r7.mo14240a()
            r13 = 0
            if (r12 != 0) goto L_0x0133
            boolean r12 = r7.mo14240a()
        L_0x010c:
            if (r5 >= r9) goto L_0x0157
            if (r12 == 0) goto L_0x0124
            boolean r15 = r7.mo14240a()
            if (r15 == 0) goto L_0x0120
            int r15 = r7.mo14239a(r3)
            int r15 = r15 + 1
            long r3 = (long) r15
            r11[r5] = r3
            goto L_0x0122
        L_0x0120:
            r11[r5] = r13
        L_0x0122:
            r3 = 5
            goto L_0x012d
        L_0x0124:
            int r4 = r7.mo14239a(r3)
            int r4 = r4 + 1
            long r13 = (long) r4
            r11[r5] = r13
        L_0x012d:
            int r5 = r5 + 1
            r4 = 4
            r13 = 0
            goto L_0x010c
        L_0x0133:
            int r4 = r7.mo14239a(r3)
            int r4 = r4 + 1
            r5 = 0
        L_0x013a:
            if (r5 >= r9) goto L_0x0156
            int r12 = r9 - r5
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8003a(r12)
            int r12 = r7.mo14239a(r12)
            r13 = 0
        L_0x0147:
            if (r13 >= r12) goto L_0x0153
            if (r5 >= r9) goto L_0x0153
            long r14 = (long) r4
            r11[r5] = r14
            int r5 = r5 + 1
            int r13 = r13 + 1
            goto L_0x0147
        L_0x0153:
            int r4 = r4 + 1
            goto L_0x013a
        L_0x0156:
            r4 = 4
        L_0x0157:
            int r5 = r7.mo14239a(r4)
            r4 = 2
            if (r5 > r4) goto L_0x019d
            r11 = 1
            if (r5 == r11) goto L_0x0163
            if (r5 != r4) goto L_0x0197
        L_0x0163:
            r4 = 32
            r7.mo14241b(r4)
            r7.mo14241b(r4)
            r4 = 4
            int r12 = r7.mo14239a(r4)
            int r12 = r12 + r11
            r7.mo14241b(r11)
            if (r5 != r11) goto L_0x018c
            if (r10 == 0) goto L_0x0189
            long r4 = (long) r9
            long r9 = (long) r10
            double r4 = (double) r4
            double r9 = (double) r9
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 / r9
            double r4 = java.lang.Math.pow(r4, r13)
            double r4 = java.lang.Math.floor(r4)
            long r4 = (long) r4
            goto L_0x018f
        L_0x0189:
            r13 = 0
            goto L_0x0190
        L_0x018c:
            int r9 = r9 * r10
            long r4 = (long) r9
        L_0x018f:
            r13 = r4
        L_0x0190:
            long r4 = (long) r12
            long r4 = r4 * r13
            int r5 = (int) r4
            r7.mo14241b(r5)
        L_0x0197:
            int r1 = r1 + 1
            r5 = 0
            r4 = 4
            goto L_0x00e7
        L_0x019d:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            java.lang.String r2 = p379.C16759e.m42349e(r2, r5)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01a9:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "expected code book to start with [0x56, 0x43, 0x42] at "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r7.f11266c
            int r3 = r3 * 8
            int r4 = r7.f11267d
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01c3:
            r1 = 6
            int r4 = r7.mo14239a(r1)
            int r4 = r4 + 1
            r5 = 0
        L_0x01cb:
            if (r5 >= r4) goto L_0x01de
            int r6 = r7.mo14239a(r10)
            if (r6 != 0) goto L_0x01d6
            int r5 = r5 + 1
            goto L_0x01cb
        L_0x01d6:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01de:
            int r4 = r7.mo14239a(r1)
            r5 = 1
            int r4 = r4 + r5
            r6 = 0
        L_0x01e5:
            if (r6 >= r4) goto L_0x028c
            int r1 = r7.mo14239a(r10)
            if (r1 == 0) goto L_0x025d
            if (r1 != r5) goto L_0x0251
            int r1 = r7.mo14239a(r3)
            int[] r3 = new int[r1]
            r5 = 0
            r9 = -1
        L_0x01f7:
            if (r5 >= r1) goto L_0x0206
            r10 = 4
            int r11 = r7.mo14239a(r10)
            r3[r5] = r11
            if (r11 <= r9) goto L_0x0203
            r9 = r11
        L_0x0203:
            int r5 = r5 + 1
            goto L_0x01f7
        L_0x0206:
            int r9 = r9 + 1
            int[] r5 = new int[r9]
            r10 = 0
        L_0x020b:
            if (r10 >= r9) goto L_0x0233
            r11 = 3
            int r11 = r7.mo14239a(r11)
            r12 = 1
            int r11 = r11 + 1
            r5[r10] = r11
            r11 = 2
            int r11 = r7.mo14239a(r11)
            r13 = 8
            if (r11 <= 0) goto L_0x0223
            r7.mo14241b(r13)
        L_0x0223:
            r14 = 0
        L_0x0224:
            int r12 = r12 << r11
            if (r14 >= r12) goto L_0x0230
            r7.mo14241b(r13)
            int r14 = r14 + 1
            r12 = 1
            r13 = 8
            goto L_0x0224
        L_0x0230:
            int r10 = r10 + 1
            goto L_0x020b
        L_0x0233:
            r9 = 2
            r7.mo14241b(r9)
            r9 = 4
            int r10 = r7.mo14239a(r9)
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x023f:
            if (r9 >= r1) goto L_0x0283
            r13 = r3[r9]
            r13 = r5[r13]
            int r11 = r11 + r13
        L_0x0246:
            if (r12 >= r11) goto L_0x024e
            r7.mo14241b(r10)
            int r12 = r12 + 1
            goto L_0x0246
        L_0x024e:
            int r9 = r9 + 1
            goto L_0x023f
        L_0x0251:
            com.fyber.inneractive.sdk.player.exoplayer2.l r2 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r3 = "floor type greater than 1 not decodable: "
            java.lang.String r1 = p379.C16759e.m42349e(r3, r1)
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x025d:
            r1 = 8
            r7.mo14241b(r1)
            r3 = 16
            r7.mo14241b(r3)
            r7.mo14241b(r3)
            r3 = 6
            r7.mo14241b(r3)
            r7.mo14241b(r1)
            r3 = 4
            int r5 = r7.mo14239a(r3)
            int r5 = r5 + 1
            r3 = 0
        L_0x0279:
            if (r3 >= r5) goto L_0x0283
            r7.mo14241b(r1)
            int r3 = r3 + 1
            r1 = 8
            goto L_0x0279
        L_0x0283:
            int r6 = r6 + 1
            r1 = 6
            r3 = 5
            r5 = 1
            r10 = 16
            goto L_0x01e5
        L_0x028c:
            int r3 = r7.mo14239a(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x0293:
            if (r5 >= r3) goto L_0x02f9
            r6 = 16
            int r6 = r7.mo14239a(r6)
            r9 = 2
            if (r6 > r9) goto L_0x02f1
            r6 = 24
            r7.mo14241b(r6)
            r7.mo14241b(r6)
            r7.mo14241b(r6)
            int r1 = r7.mo14239a(r1)
            int r1 = r1 + r4
            r4 = 8
            r7.mo14241b(r4)
            int[] r6 = new int[r1]
            r9 = 0
        L_0x02b6:
            if (r9 >= r1) goto L_0x02d2
            r10 = 3
            int r10 = r7.mo14239a(r10)
            boolean r11 = r7.mo14240a()
            if (r11 == 0) goto L_0x02c9
            r11 = 5
            int r11 = r7.mo14239a(r11)
            goto L_0x02ca
        L_0x02c9:
            r11 = 0
        L_0x02ca:
            int r11 = r11 * 8
            int r11 = r11 + r10
            r6[r9] = r11
            int r9 = r9 + 1
            goto L_0x02b6
        L_0x02d2:
            r9 = 0
        L_0x02d3:
            if (r9 >= r1) goto L_0x02ec
            r10 = 0
        L_0x02d6:
            if (r10 >= r4) goto L_0x02e7
            r11 = r6[r9]
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 & r12
            if (r11 == 0) goto L_0x02e2
            r7.mo14241b(r4)
        L_0x02e2:
            int r10 = r10 + 1
            r4 = 8
            goto L_0x02d6
        L_0x02e7:
            int r9 = r9 + 1
            r4 = 8
            goto L_0x02d3
        L_0x02ec:
            int r5 = r5 + 1
            r1 = 6
            r4 = 1
            goto L_0x0293
        L_0x02f1:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02f9:
            int r1 = r7.mo14239a(r1)
            int r1 = r1 + 1
            r3 = 0
        L_0x0300:
            if (r3 >= r1) goto L_0x0371
            r4 = 16
            int r4 = r7.mo14239a(r4)
            if (r4 == 0) goto L_0x030c
            r6 = 4
            goto L_0x0365
        L_0x030c:
            boolean r4 = r7.mo14240a()
            if (r4 == 0) goto L_0x031a
            r4 = 4
            int r5 = r7.mo14239a(r4)
            int r5 = r5 + 1
            goto L_0x031b
        L_0x031a:
            r5 = 1
        L_0x031b:
            boolean r4 = r7.mo14240a()
            if (r4 == 0) goto L_0x033f
            r4 = 8
            int r4 = r7.mo14239a(r4)
            int r4 = r4 + 1
            r6 = 0
        L_0x032a:
            if (r6 >= r4) goto L_0x033f
            int r9 = r2 + -1
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8003a(r9)
            r7.mo14241b(r10)
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8003a(r9)
            r7.mo14241b(r9)
            int r6 = r6 + 1
            goto L_0x032a
        L_0x033f:
            r4 = 2
            int r4 = r7.mo14239a(r4)
            if (r4 != 0) goto L_0x0368
            r4 = 1
            if (r5 <= r4) goto L_0x0353
            r4 = 0
        L_0x034a:
            if (r4 >= r2) goto L_0x0353
            r6 = 4
            r7.mo14241b(r6)
            int r4 = r4 + 1
            goto L_0x034a
        L_0x0353:
            r6 = 4
            r4 = 0
        L_0x0355:
            if (r4 >= r5) goto L_0x0365
            r9 = 8
            r7.mo14241b(r9)
            r7.mo14241b(r9)
            r7.mo14241b(r9)
            int r4 = r4 + 1
            goto L_0x0355
        L_0x0365:
            int r3 = r3 + 1
            goto L_0x0300
        L_0x0368:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0371:
            r1 = 6
            int r1 = r7.mo14239a(r1)
            int r1 = r1 + 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b[] r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.C3179b[r1]
            r2 = 0
        L_0x037b:
            if (r2 >= r1) goto L_0x039b
            boolean r3 = r7.mo14240a()
            r4 = 16
            int r5 = r7.mo14239a(r4)
            int r4 = r7.mo14239a(r4)
            r6 = 8
            int r6 = r7.mo14239a(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b
            r10.<init>(r3, r5, r4, r6)
            r9[r2] = r10
            int r2 = r2 + 1
            goto L_0x037b
        L_0x039b:
            boolean r2 = r7.mo14240a()
            if (r2 == 0) goto L_0x03ea
            int r1 = r1 + -1
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3177k.m8003a(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r6 = r0.f11271q
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a r7 = r0.f11272r
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x03b1:
            r0.f11268n = r1
            if (r1 != 0) goto L_0x03b7
            r1 = 1
            return r1
        L_0x03b7:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = r0.f11268n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r1 = r1.f11273a
            byte[] r1 = r1.f11283f
            r10.add(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = r0.f11268n
            byte[] r1 = r1.f11274b
            r10.add(r1)
            r2 = 0
            r4 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = r0.f11268n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r1 = r1.f11273a
            int r5 = r1.f11280c
            r6 = -1
            int r7 = r1.f11278a
            long r8 = r1.f11279b
            int r8 = (int) r8
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = -1
            java.lang.String r3 = "audio/vorbis"
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (java.util.List<byte[]>) r10, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r11, (int) r12, (java.lang.String) r13)
            r2 = r23
            r2.f11262a = r1
            r1 = 1
            return r1
        L_0x03ea:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3175j.mo14231a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, long, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$a):boolean");
    }
}
