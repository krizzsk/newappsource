package p289va;

import com.google.android.exoplayer2.Format;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.h */
public final class C6905h implements C6907j {

    /* renamed from: a */
    public final C6803r f21363a = new C6803r(new byte[18]);

    /* renamed from: b */
    public final String f21364b;

    /* renamed from: c */
    public String f21365c;

    /* renamed from: d */
    public C5754v f21366d;

    /* renamed from: e */
    public int f21367e = 0;

    /* renamed from: f */
    public int f21368f;

    /* renamed from: g */
    public int f21369g;

    /* renamed from: h */
    public long f21370h;

    /* renamed from: i */
    public Format f21371i;

    /* renamed from: j */
    public int f21372j;

    /* renamed from: k */
    public long f21373k;

    public C6905h(String str) {
        this.f21364b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0234  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            ma.v r2 = r0.f21366d
            p583jk.C17875h.m44306q(r2)
        L_0x0009:
            int r2 = r1.f21040c
            int r3 = r1.f21039b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x02c6
            int r3 = r0.f21367e
            r5 = 8
            r6 = 1
            r7 = 2
            r9 = 0
            if (r3 == 0) goto L_0x0266
            if (r3 == r6) goto L_0x004f
            if (r3 != r7) goto L_0x0049
            int r3 = r0.f21372j
            int r4 = r0.f21368f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            ma.v r3 = r0.f21366d
            r3.mo20631b(r2, r1)
            int r3 = r0.f21368f
            int r3 = r3 + r2
            r0.f21368f = r3
            int r14 = r0.f21372j
            if (r3 != r14) goto L_0x0009
            ma.v r10 = r0.f21366d
            long r11 = r0.f21373k
            r13 = 1
            r15 = 0
            r16 = 0
            r10.mo20633d(r11, r13, r14, r15, r16)
            long r2 = r0.f21373k
            long r4 = r0.f21370h
            long r2 = r2 + r4
            r0.f21373k = r2
            r0.f21367e = r9
            goto L_0x0009
        L_0x0049:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x004f:
            ub.r r3 = r0.f21363a
            byte[] r3 = r3.f21038a
            int r10 = r0.f21368f
            r11 = 18
            int r10 = 18 - r10
            int r2 = java.lang.Math.min(r2, r10)
            int r10 = r0.f21368f
            r1.mo22983b(r10, r2, r3)
            int r3 = r0.f21368f
            int r3 = r3 + r2
            r0.f21368f = r3
            if (r3 != r11) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x0009
            ub.r r2 = r0.f21363a
            byte[] r2 = r2.f21038a
            com.google.android.exoplayer2.Format r3 = r0.f21371i
            r10 = 14
            r13 = 31
            r14 = -2
            r11 = -1
            if (r3 != 0) goto L_0x019b
            java.lang.String r3 = r0.f21365c
            java.lang.String r15 = r0.f21364b
            byte r8 = r2[r9]
            r4 = 127(0x7f, float:1.78E-43)
            if (r8 != r4) goto L_0x008e
            ub.q r4 = new ub.q
            int r8 = r2.length
            r4.<init>(r2, r8)
            goto L_0x013f
        L_0x008e:
            int r4 = r2.length
            byte[] r4 = java.util.Arrays.copyOf(r2, r4)
            byte r8 = r4[r9]
            if (r8 == r14) goto L_0x009c
            if (r8 != r11) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r8 = 0
            goto L_0x009d
        L_0x009c:
            r8 = 1
        L_0x009d:
            if (r8 == 0) goto L_0x00b1
            r8 = 0
        L_0x00a0:
            int r14 = r4.length
            int r14 = r14 - r6
            if (r8 >= r14) goto L_0x00b1
            byte r14 = r4[r8]
            int r17 = r8 + 1
            byte r18 = r4[r17]
            r4[r8] = r18
            r4[r17] = r14
            int r8 = r8 + 2
            goto L_0x00a0
        L_0x00b1:
            ub.q r8 = new ub.q
            int r14 = r4.length
            r8.<init>(r4, r14)
            byte r14 = r4[r9]
            if (r14 != r13) goto L_0x013a
            ub.q r14 = new ub.q
            int r13 = r4.length
            r14.<init>(r4, r13)
        L_0x00c1:
            int r13 = r14.mo22969b()
            r9 = 16
            if (r13 < r9) goto L_0x013a
            r14.mo22979l(r7)
            int r9 = r14.mo22973f(r10)
            r9 = r9 & 16383(0x3fff, float:2.2957E-41)
            int r13 = r8.f21036c
            int r13 = 8 - r13
            int r13 = java.lang.Math.min(r13, r10)
            int r7 = r8.f21036c
            int r19 = 8 - r7
            int r19 = r19 - r13
            r20 = 65280(0xff00, float:9.1477E-41)
            int r7 = r20 >> r7
            int r20 = r6 << r19
            int r20 = r20 + -1
            r7 = r7 | r20
            byte[] r12 = r8.f21034a
            int r11 = r8.f21035b
            byte r22 = r12[r11]
            r7 = r7 & r22
            byte r7 = (byte) r7
            r12[r11] = r7
            int r13 = 14 - r13
            int r22 = r9 >>> r13
            int r19 = r22 << r19
            r7 = r7 | r19
            byte r7 = (byte) r7
            r12[r11] = r7
            int r11 = r11 + r6
        L_0x0102:
            if (r13 <= r5) goto L_0x0113
            byte[] r7 = r8.f21034a
            int r12 = r11 + 1
            int r13 = r13 + -8
            int r5 = r9 >>> r13
            byte r5 = (byte) r5
            r7[r11] = r5
            r11 = r12
            r5 = 8
            goto L_0x0102
        L_0x0113:
            int r5 = 8 - r13
            byte[] r7 = r8.f21034a
            byte r12 = r7[r11]
            int r22 = r6 << r5
            r21 = -1
            int r22 = r22 + -1
            r12 = r12 & r22
            byte r12 = (byte) r12
            r7[r11] = r12
            int r13 = r6 << r13
            int r13 = r13 - r6
            r9 = r9 & r13
            int r5 = r9 << r5
            r5 = r5 | r12
            byte r5 = (byte) r5
            r7[r11] = r5
            r8.mo22979l(r10)
            r8.mo22968a()
            r5 = 8
            r7 = 2
            r9 = 0
            r11 = -1
            goto L_0x00c1
        L_0x013a:
            int r5 = r4.length
            r8.mo22976i(r5, r4)
            r4 = r8
        L_0x013f:
            r5 = 60
            r4.mo22979l(r5)
            r5 = 6
            int r7 = r4.mo22973f(r5)
            int[] r5 = p125ia.C5328n.f17549a
            r5 = r5[r7]
            r7 = 4
            int r8 = r4.mo22973f(r7)
            int[] r7 = p125ia.C5328n.f17550b
            r7 = r7[r8]
            r8 = 5
            int r9 = r4.mo22973f(r8)
            int[] r8 = p125ia.C5328n.f17551c
            r11 = 29
            if (r9 < r11) goto L_0x0164
            r8 = -1
            r9 = 2
            goto L_0x016a
        L_0x0164:
            r8 = r8[r9]
            int r8 = r8 * 1000
            r9 = 2
            int r8 = r8 / r9
        L_0x016a:
            r11 = 10
            r4.mo22979l(r11)
            int r4 = r4.mo22973f(r9)
            if (r4 <= 0) goto L_0x0177
            r4 = 1
            goto L_0x0178
        L_0x0177:
            r4 = 0
        L_0x0178:
            int r5 = r5 + r4
            com.google.android.exoplayer2.Format$b r4 = new com.google.android.exoplayer2.Format$b
            r4.<init>()
            r4.f13436a = r3
            java.lang.String r3 = "audio/vnd.dts"
            r4.f13446k = r3
            r4.f13441f = r8
            r4.f13459x = r5
            r4.f13460y = r7
            r3 = 0
            r4.f13449n = r3
            r4.f13438c = r15
            com.google.android.exoplayer2.Format r3 = new com.google.android.exoplayer2.Format
            r3.<init>((com.google.android.exoplayer2.Format.C3872b) r4)
            r0.f21371i = r3
            ma.v r4 = r0.f21366d
            r4.mo20632c(r3)
        L_0x019b:
            r3 = 0
            byte r4 = r2[r3]
            r3 = 7
            r5 = -2
            if (r4 == r5) goto L_0x01e9
            r5 = -1
            if (r4 == r5) goto L_0x01ce
            r5 = 31
            if (r4 == r5) goto L_0x01bb
            r5 = 5
            byte r7 = r2[r5]
            r5 = 3
            r5 = r5 & r7
            int r5 = r5 << 12
            r7 = 6
            byte r8 = r2[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 4
            int r8 = r8 << r9
            r5 = r5 | r8
            byte r8 = r2[r3]
            goto L_0x01f9
        L_0x01bb:
            r5 = 3
            r7 = 6
            r9 = 4
            byte r8 = r2[r7]
            r5 = r5 & r8
            int r5 = r5 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = 8
            byte r7 = r2[r7]
            goto L_0x01e0
        L_0x01ce:
            r5 = 3
            r9 = 4
            byte r7 = r2[r3]
            r5 = r5 & r7
            int r5 = r5 << 12
            r7 = 6
            byte r8 = r2[r7]
            r7 = r8 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = 9
            byte r7 = r2[r7]
        L_0x01e0:
            r8 = 60
            r7 = r7 & r8
            r8 = 2
            int r7 = r7 >> r8
            r5 = r5 | r7
            int r5 = r5 + r6
            r7 = 1
            goto L_0x01ff
        L_0x01e9:
            r9 = 4
            byte r5 = r2[r9]
            r7 = 3
            r5 = r5 & r7
            int r5 = r5 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = 6
            byte r8 = r2[r7]
        L_0x01f9:
            r7 = r8 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r9
            r5 = r5 | r7
            int r5 = r5 + r6
            r7 = 0
        L_0x01ff:
            if (r7 == 0) goto L_0x0204
            int r5 = r5 * 16
            int r5 = r5 / r10
        L_0x0204:
            r0.f21372j = r5
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r5 = -2
            if (r4 == r5) goto L_0x0234
            r5 = -1
            if (r4 == r5) goto L_0x0227
            r5 = 31
            if (r4 == r5) goto L_0x021d
            r4 = 4
            byte r3 = r2[r4]
            r3 = r3 & r6
            r5 = 6
            int r3 = r3 << r5
            r9 = 5
            byte r2 = r2[r9]
            goto L_0x023d
        L_0x021d:
            r4 = 4
            r5 = 6
            r9 = 5
            byte r9 = r2[r9]
            r3 = r3 & r9
            int r3 = r3 << r4
            byte r2 = r2[r5]
            goto L_0x0230
        L_0x0227:
            r4 = 4
            byte r5 = r2[r4]
            r5 = r5 & r3
            int r4 = r5 << 4
            byte r2 = r2[r3]
            r3 = r4
        L_0x0230:
            r4 = 60
            r2 = r2 & r4
            goto L_0x023f
        L_0x0234:
            r3 = 5
            r4 = 4
            r5 = 6
            byte r3 = r2[r3]
            r3 = r3 & r6
            int r3 = r3 << r5
            byte r2 = r2[r4]
        L_0x023d:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x023f:
            r4 = 2
            int r2 = r2 >> r4
            r2 = r2 | r3
            int r2 = r2 + r6
            int r2 = r2 * 32
            long r2 = (long) r2
            long r2 = r2 * r7
            com.google.android.exoplayer2.Format r4 = r0.f21371i
            int r4 = r4.f13400A
            long r4 = (long) r4
            long r2 = r2 / r4
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f21370h = r2
            ub.r r2 = r0.f21363a
            r3 = 0
            r2.mo23007z(r3)
            ma.v r2 = r0.f21366d
            ub.r r3 = r0.f21363a
            r4 = 18
            r2.mo20631b(r4, r3)
            r2 = 2
            r0.f21367e = r2
            goto L_0x0009
        L_0x0266:
            int r2 = r1.f21040c
            int r3 = r1.f21039b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x02be
            int r2 = r0.f21369g
            r3 = 8
            int r2 = r2 << r3
            r0.f21369g = r2
            int r4 = r24.mo22997p()
            r2 = r2 | r4
            r0.f21369g = r2
            r4 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r4) goto L_0x0292
            r4 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r4) goto L_0x0292
            r4 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r4) goto L_0x0292
            r4 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r4) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            r4 = 0
            goto L_0x0293
        L_0x0292:
            r4 = 1
        L_0x0293:
            if (r4 == 0) goto L_0x0266
            ub.r r3 = r0.f21363a
            byte[] r3 = r3.f21038a
            int r4 = r2 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 0
            r3[r5] = r4
            int r4 = r2 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r6] = r4
            int r4 = r2 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 2
            r3[r5] = r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r4 = 3
            r3[r4] = r2
            r2 = 4
            r0.f21368f = r2
            r7 = 0
            r0.f21369g = r7
            r9 = 1
            goto L_0x02c0
        L_0x02be:
            r7 = 0
            r9 = 0
        L_0x02c0:
            if (r9 == 0) goto L_0x0009
            r0.f21367e = r6
            goto L_0x0009
        L_0x02c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6905h.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21367e = 0;
        this.f21368f = 0;
        this.f21369g = 0;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21373k = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21365c = dVar.f21327e;
        dVar.mo23152b();
        this.f21366d = jVar.mo20709p(dVar.f21326d, 1);
    }
}
