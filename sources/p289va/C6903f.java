package p289va;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p173ma.C5734g;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6802q;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.f */
public final class C6903f implements C6907j {

    /* renamed from: v */
    public static final byte[] f21339v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f21340a;

    /* renamed from: b */
    public final C6802q f21341b = new C6802q(new byte[7], 7);

    /* renamed from: c */
    public final C6803r f21342c = new C6803r(Arrays.copyOf(f21339v, 10));

    /* renamed from: d */
    public final String f21343d;

    /* renamed from: e */
    public String f21344e;

    /* renamed from: f */
    public C5754v f21345f;

    /* renamed from: g */
    public C5754v f21346g;

    /* renamed from: h */
    public int f21347h = 0;

    /* renamed from: i */
    public int f21348i = 0;

    /* renamed from: j */
    public int f21349j = 256;

    /* renamed from: k */
    public boolean f21350k;

    /* renamed from: l */
    public boolean f21351l;

    /* renamed from: m */
    public int f21352m = -1;

    /* renamed from: n */
    public int f21353n = -1;

    /* renamed from: o */
    public int f21354o;

    /* renamed from: p */
    public boolean f21355p;

    /* renamed from: q */
    public long f21356q = -9223372036854775807L;

    /* renamed from: r */
    public int f21357r;

    /* renamed from: s */
    public long f21358s;

    /* renamed from: t */
    public C5754v f21359t;

    /* renamed from: u */
    public long f21360u;

    public C6903f(boolean z, String str) {
        this.f21340a = z;
        this.f21343d = str;
    }

    /* renamed from: a */
    public final boolean mo23155a(int i, C6803r rVar, byte[] bArr) {
        int min = Math.min(rVar.f21040c - rVar.f21039b, i - this.f21348i);
        rVar.mo22983b(this.f21348i, min, bArr);
        int i2 = this.f21348i + min;
        this.f21348i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0274, code lost:
        if (r11[r15] != 51) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0257, code lost:
        if (((r6 & 8) >> 3) == r8) goto L_0x0276;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x027b A[EDGE_INSN: B:156:0x027b->B:108:0x027b ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r23) throws com.google.android.exoplayer2.ParserException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            ma.v r2 = r0.f21345f
            r2.getClass()
            int r2 = p277ub.C6774a0.f20959a
        L_0x000b:
            int r2 = r1.f21040c
            int r3 = r1.f21039b
            int r4 = r2 - r3
            if (r4 <= 0) goto L_0x02f5
            int r5 = r0.f21347h
            r6 = -1
            r7 = 13
            r8 = 256(0x100, float:3.59E-43)
            r9 = 3
            r10 = 4
            r11 = 7
            r12 = 2
            r13 = 1
            r14 = 0
            if (r5 == 0) goto L_0x0182
            if (r5 == r13) goto L_0x0149
            r2 = 10
            if (r5 == r12) goto L_0x011b
            if (r5 == r9) goto L_0x0068
            if (r5 != r10) goto L_0x0062
            int r2 = r0.f21357r
            int r3 = r0.f21348i
            int r2 = r2 - r3
            int r2 = java.lang.Math.min(r4, r2)
            ma.v r3 = r0.f21359t
            r3.mo20631b(r2, r1)
            int r3 = r0.f21348i
            int r3 = r3 + r2
            r0.f21348i = r3
            int r2 = r0.f21357r
            if (r3 != r2) goto L_0x000b
            ma.v r15 = r0.f21359t
            long r3 = r0.f21358s
            r18 = 1
            r20 = 0
            r21 = 0
            r16 = r3
            r19 = r2
            r15.mo20633d(r16, r18, r19, r20, r21)
            long r2 = r0.f21358s
            long r4 = r0.f21360u
            long r2 = r2 + r4
            r0.f21358s = r2
            r0.f21347h = r14
            r0.f21348i = r14
            r0.f21349j = r8
            goto L_0x000b
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0068:
            boolean r3 = r0.f21350k
            r4 = 5
            if (r3 == 0) goto L_0x006f
            r3 = 7
            goto L_0x0070
        L_0x006f:
            r3 = 5
        L_0x0070:
            ub.q r5 = r0.f21341b
            byte[] r5 = r5.f21034a
            boolean r3 = r0.mo23155a(r3, r1, r5)
            if (r3 == 0) goto L_0x000b
            ub.q r3 = r0.f21341b
            r3.mo22977j(r14)
            boolean r3 = r0.f21355p
            if (r3 != 0) goto L_0x00f3
            ub.q r2 = r0.f21341b
            int r2 = r2.mo22973f(r12)
            int r2 = r2 + r13
            if (r2 == r12) goto L_0x008d
            r2 = 2
        L_0x008d:
            ub.q r3 = r0.f21341b
            r3.mo22979l(r4)
            ub.q r3 = r0.f21341b
            int r3 = r3.mo22973f(r9)
            int r5 = r0.f21353n
            byte[] r6 = new byte[r12]
            int r2 = r2 << r9
            r2 = r2 & 248(0xf8, float:3.48E-43)
            int r8 = r5 >> 1
            r8 = r8 & r11
            r2 = r2 | r8
            byte r2 = (byte) r2
            r6[r14] = r2
            int r2 = r5 << 7
            r2 = r2 & 128(0x80, float:1.794E-43)
            int r3 = r3 << r9
            r3 = r3 & 120(0x78, float:1.68E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            r6[r13] = r2
            ub.q r2 = new ub.q
            r2.<init>(r6, r12)
            ia.a$a r2 = p125ia.C5311a.m13352c(r2, r14)
            com.google.android.exoplayer2.Format$b r3 = new com.google.android.exoplayer2.Format$b
            r3.<init>()
            java.lang.String r5 = r0.f21344e
            r3.f13436a = r5
            java.lang.String r5 = "audio/mp4a-latm"
            r3.f13446k = r5
            java.lang.String r5 = r2.f17500c
            r3.f13443h = r5
            int r5 = r2.f17499b
            r3.f13459x = r5
            int r2 = r2.f17498a
            r3.f13460y = r2
            java.util.List r2 = java.util.Collections.singletonList(r6)
            r3.f13448m = r2
            java.lang.String r2 = r0.f21343d
            r3.f13438c = r2
            com.google.android.exoplayer2.Format r2 = new com.google.android.exoplayer2.Format
            r2.<init>((com.google.android.exoplayer2.Format.C3872b) r3)
            r5 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r3 = r2.f13400A
            long r8 = (long) r3
            long r5 = r5 / r8
            r0.f21356q = r5
            ma.v r3 = r0.f21345f
            r3.mo20632c(r2)
            r0.f21355p = r13
            goto L_0x00f8
        L_0x00f3:
            ub.q r3 = r0.f21341b
            r3.mo22979l(r2)
        L_0x00f8:
            ub.q r2 = r0.f21341b
            r2.mo22979l(r10)
            ub.q r2 = r0.f21341b
            int r2 = r2.mo22973f(r7)
            int r2 = r2 - r12
            int r2 = r2 - r4
            boolean r3 = r0.f21350k
            if (r3 == 0) goto L_0x010b
            int r2 = r2 + -2
        L_0x010b:
            ma.v r3 = r0.f21345f
            long r4 = r0.f21356q
            r0.f21347h = r10
            r0.f21348i = r14
            r0.f21359t = r3
            r0.f21360u = r4
            r0.f21357r = r2
            goto L_0x000b
        L_0x011b:
            ub.r r3 = r0.f21342c
            byte[] r3 = r3.f21038a
            boolean r3 = r0.mo23155a(r2, r1, r3)
            if (r3 == 0) goto L_0x000b
            ma.v r3 = r0.f21346g
            ub.r r4 = r0.f21342c
            r3.mo20631b(r2, r4)
            ub.r r3 = r0.f21342c
            r4 = 6
            r3.mo23007z(r4)
            ma.v r3 = r0.f21346g
            ub.r r4 = r0.f21342c
            int r4 = r4.mo22996o()
            int r4 = r4 + r2
            r5 = 0
            r0.f21347h = r10
            r0.f21348i = r2
            r0.f21359t = r3
            r0.f21360u = r5
            r0.f21357r = r4
            goto L_0x000b
        L_0x0149:
            if (r4 != 0) goto L_0x014d
            goto L_0x000b
        L_0x014d:
            ub.q r2 = r0.f21341b
            byte[] r4 = r2.f21034a
            byte[] r5 = r1.f21038a
            byte r3 = r5[r3]
            r4[r14] = r3
            r2.mo22977j(r12)
            ub.q r2 = r0.f21341b
            int r2 = r2.mo22973f(r10)
            int r3 = r0.f21353n
            if (r3 == r6) goto L_0x0170
            if (r2 == r3) goto L_0x0170
            r0.f21351l = r14
            r0.f21347h = r14
            r0.f21348i = r14
            r0.f21349j = r8
            goto L_0x000b
        L_0x0170:
            boolean r3 = r0.f21351l
            if (r3 != 0) goto L_0x017c
            r0.f21351l = r13
            int r3 = r0.f21354o
            r0.f21352m = r3
            r0.f21353n = r2
        L_0x017c:
            r0.f21347h = r9
            r0.f21348i = r14
            goto L_0x000b
        L_0x0182:
            byte[] r4 = r1.f21038a
        L_0x0184:
            if (r3 >= r2) goto L_0x02f0
            int r5 = r3 + 1
            byte r3 = r4[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r0.f21349j
            r8 = 512(0x200, float:7.175E-43)
            if (r15 != r8) goto L_0x029d
            byte r15 = (byte) r3
            r15 = r15 & 255(0xff, float:3.57E-43)
            r17 = 65280(0xff00, float:9.1477E-41)
            r15 = r15 | r17
            r18 = 65526(0xfff6, float:9.1821E-41)
            r15 = r15 & r18
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r15 != r8) goto L_0x01a6
            r15 = 1
            goto L_0x01a7
        L_0x01a6:
            r15 = 0
        L_0x01a7:
            if (r15 == 0) goto L_0x029d
            boolean r15 = r0.f21351l
            if (r15 != 0) goto L_0x027b
            int r15 = r5 + -2
            int r9 = r15 + 1
            r1.mo23007z(r9)
            ub.q r9 = r0.f21341b
            byte[] r9 = r9.f21034a
            int r8 = r1.f21040c
            int r11 = r1.f21039b
            int r8 = r8 - r11
            if (r8 >= r13) goto L_0x01c1
            r8 = 0
            goto L_0x01c5
        L_0x01c1:
            r1.mo22983b(r14, r13, r9)
            r8 = 1
        L_0x01c5:
            if (r8 != 0) goto L_0x01ca
        L_0x01c7:
            r9 = -1
            goto L_0x0278
        L_0x01ca:
            ub.q r8 = r0.f21341b
            r8.mo22977j(r10)
            ub.q r8 = r0.f21341b
            int r8 = r8.mo22973f(r13)
            int r9 = r0.f21352m
            if (r9 == r6) goto L_0x01dc
            if (r8 == r9) goto L_0x01dc
            goto L_0x01c7
        L_0x01dc:
            int r9 = r0.f21353n
            if (r9 == r6) goto L_0x0209
            ub.q r9 = r0.f21341b
            byte[] r9 = r9.f21034a
            int r11 = r1.f21040c
            int r6 = r1.f21039b
            int r11 = r11 - r6
            if (r11 >= r13) goto L_0x01ed
            r6 = 0
            goto L_0x01f1
        L_0x01ed:
            r1.mo22983b(r14, r13, r9)
            r6 = 1
        L_0x01f1:
            if (r6 != 0) goto L_0x01f4
            goto L_0x021c
        L_0x01f4:
            ub.q r6 = r0.f21341b
            r6.mo22977j(r12)
            ub.q r6 = r0.f21341b
            int r6 = r6.mo22973f(r10)
            int r9 = r0.f21353n
            if (r6 == r9) goto L_0x0204
            goto L_0x01c7
        L_0x0204:
            int r6 = r15 + 2
            r1.mo23007z(r6)
        L_0x0209:
            ub.q r6 = r0.f21341b
            byte[] r6 = r6.f21034a
            int r9 = r1.f21040c
            int r11 = r1.f21039b
            int r9 = r9 - r11
            if (r9 >= r10) goto L_0x0216
            r6 = 0
            goto L_0x021a
        L_0x0216:
            r1.mo22983b(r14, r10, r6)
            r6 = 1
        L_0x021a:
            if (r6 != 0) goto L_0x021e
        L_0x021c:
            r9 = -1
            goto L_0x0276
        L_0x021e:
            ub.q r6 = r0.f21341b
            r9 = 14
            r6.mo22977j(r9)
            ub.q r6 = r0.f21341b
            int r6 = r6.mo22973f(r7)
            r9 = 7
            if (r6 >= r9) goto L_0x022f
            goto L_0x01c7
        L_0x022f:
            byte[] r11 = r1.f21038a
            int r7 = r1.f21040c
            int r15 = r15 + r6
            if (r15 < r7) goto L_0x0237
            goto L_0x021c
        L_0x0237:
            byte r6 = r11[r15]
            r9 = -1
            if (r6 != r9) goto L_0x025a
            int r15 = r15 + 1
            if (r15 != r7) goto L_0x0241
            goto L_0x0276
        L_0x0241:
            byte r6 = r11[r15]
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r7 | r17
            r7 = r7 & r18
            r11 = 65520(0xfff0, float:9.1813E-41)
            if (r7 != r11) goto L_0x0250
            r7 = 1
            goto L_0x0251
        L_0x0250:
            r7 = 0
        L_0x0251:
            if (r7 == 0) goto L_0x0278
            r6 = r6 & 8
            r7 = 3
            int r6 = r6 >> r7
            if (r6 != r8) goto L_0x0278
            goto L_0x0276
        L_0x025a:
            r8 = 73
            if (r6 == r8) goto L_0x025f
            goto L_0x0278
        L_0x025f:
            int r6 = r15 + 1
            if (r6 != r7) goto L_0x0264
            goto L_0x0276
        L_0x0264:
            byte r6 = r11[r6]
            r8 = 68
            if (r6 == r8) goto L_0x026b
            goto L_0x0278
        L_0x026b:
            int r15 = r15 + 2
            if (r15 != r7) goto L_0x0270
            goto L_0x0276
        L_0x0270:
            byte r6 = r11[r15]
            r7 = 51
            if (r6 != r7) goto L_0x0278
        L_0x0276:
            r6 = 1
            goto L_0x0279
        L_0x0278:
            r6 = 0
        L_0x0279:
            if (r6 == 0) goto L_0x029e
        L_0x027b:
            r2 = r3 & 8
            r4 = 3
            int r2 = r2 >> r4
            r0.f21354o = r2
            r2 = r3 & 1
            if (r2 != 0) goto L_0x0287
            r2 = 1
            goto L_0x0288
        L_0x0287:
            r2 = 0
        L_0x0288:
            r0.f21350k = r2
            boolean r2 = r0.f21351l
            if (r2 != 0) goto L_0x0293
            r0.f21347h = r13
            r0.f21348i = r14
            goto L_0x0298
        L_0x0293:
            r2 = 3
            r0.f21347h = r2
            r0.f21348i = r14
        L_0x0298:
            r1.mo23007z(r5)
            goto L_0x000b
        L_0x029d:
            r9 = -1
        L_0x029e:
            int r6 = r0.f21349j
            r3 = r3 | r6
            r7 = 329(0x149, float:4.61E-43)
            if (r3 == r7) goto L_0x02df
            r7 = 511(0x1ff, float:7.16E-43)
            if (r3 == r7) goto L_0x02d7
            r7 = 836(0x344, float:1.171E-42)
            if (r3 == r7) goto L_0x02cf
            r7 = 1075(0x433, float:1.506E-42)
            if (r3 == r7) goto L_0x02be
            r7 = 256(0x100, float:3.59E-43)
            if (r6 == r7) goto L_0x02bc
            r0.f21349j = r7
            int r5 = r5 + -1
            r3 = r5
            r6 = 3
            goto L_0x02e7
        L_0x02bc:
            r6 = 3
            goto L_0x02e6
        L_0x02be:
            r0.f21347h = r12
            r6 = 3
            r0.f21348i = r6
            r0.f21357r = r14
            ub.r r2 = r0.f21342c
            r2.mo23007z(r14)
            r1.mo23007z(r5)
            goto L_0x000b
        L_0x02cf:
            r6 = 3
            r7 = 256(0x100, float:3.59E-43)
            r3 = 1024(0x400, float:1.435E-42)
            r0.f21349j = r3
            goto L_0x02e6
        L_0x02d7:
            r3 = 512(0x200, float:7.175E-43)
            r6 = 3
            r7 = 256(0x100, float:3.59E-43)
            r0.f21349j = r3
            goto L_0x02e6
        L_0x02df:
            r6 = 3
            r7 = 256(0x100, float:3.59E-43)
            r3 = 768(0x300, float:1.076E-42)
            r0.f21349j = r3
        L_0x02e6:
            r3 = r5
        L_0x02e7:
            r6 = -1
            r7 = 13
            r8 = 256(0x100, float:3.59E-43)
            r9 = 3
            r11 = 7
            goto L_0x0184
        L_0x02f0:
            r1.mo23007z(r3)
            goto L_0x000b
        L_0x02f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6903f.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21351l = false;
        this.f21347h = 0;
        this.f21348i = 0;
        this.f21349j = 256;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21358s = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21344e = dVar.f21327e;
        dVar.mo23152b();
        C5754v p = jVar.mo20709p(dVar.f21326d, 1);
        this.f21345f = p;
        this.f21359t = p;
        if (this.f21340a) {
            dVar.mo23151a();
            dVar.mo23152b();
            C5754v p2 = jVar.mo20709p(dVar.f21326d, 5);
            this.f21346g = p2;
            Format.C3872b bVar = new Format.C3872b();
            dVar.mo23152b();
            bVar.f13436a = dVar.f21327e;
            bVar.f13446k = "application/id3";
            p2.mo20632c(new Format(bVar));
            return;
        }
        this.f21346g = new C5734g();
    }
}
