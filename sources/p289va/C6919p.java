package p289va;

import com.google.android.exoplayer2.Format;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6802q;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.p */
public final class C6919p implements C6907j {

    /* renamed from: a */
    public final String f21510a;

    /* renamed from: b */
    public final C6803r f21511b;

    /* renamed from: c */
    public final C6802q f21512c;

    /* renamed from: d */
    public C5754v f21513d;

    /* renamed from: e */
    public String f21514e;

    /* renamed from: f */
    public Format f21515f;

    /* renamed from: g */
    public int f21516g;

    /* renamed from: h */
    public int f21517h;

    /* renamed from: i */
    public int f21518i;

    /* renamed from: j */
    public int f21519j;

    /* renamed from: k */
    public long f21520k;

    /* renamed from: l */
    public boolean f21521l;

    /* renamed from: m */
    public int f21522m;

    /* renamed from: n */
    public int f21523n;

    /* renamed from: o */
    public int f21524o;

    /* renamed from: p */
    public boolean f21525p;

    /* renamed from: q */
    public long f21526q;

    /* renamed from: r */
    public int f21527r;

    /* renamed from: s */
    public long f21528s;

    /* renamed from: t */
    public int f21529t;

    /* renamed from: u */
    public String f21530u;

    public C6919p(String str) {
        this.f21510a = str;
        C6803r rVar = new C6803r(1024);
        this.f21511b = rVar;
        byte[] bArr = rVar.f21038a;
        this.f21512c = new C6802q(bArr, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        if (r14.f21521l == false) goto L_0x01ed;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r15) throws com.google.android.exoplayer2.ParserException {
        /*
            r14 = this;
            ma.v r0 = r14.f21513d
            p583jk.C17875h.m44306q(r0)
        L_0x0005:
            int r0 = r15.f21040c
            int r1 = r15.f21039b
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0254
            int r1 = r14.f21516g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x024a
            r4 = 0
            r5 = 2
            if (r1 == r3) goto L_0x0234
            r2 = 3
            r6 = 8
            if (r1 == r5) goto L_0x020b
            if (r1 != r2) goto L_0x0205
            int r1 = r14.f21518i
            int r7 = r14.f21517h
            int r1 = r1 - r7
            int r0 = java.lang.Math.min(r0, r1)
            ub.q r1 = r14.f21512c
            byte[] r1 = r1.f21034a
            int r7 = r14.f21517h
            r15.mo22983b(r7, r0, r1)
            int r1 = r14.f21517h
            int r1 = r1 + r0
            r14.f21517h = r1
            int r0 = r14.f21518i
            if (r1 != r0) goto L_0x0005
            ub.q r0 = r14.f21512c
            r0.mo22977j(r4)
            ub.q r0 = r14.f21512c
            boolean r1 = r0.mo22972e()
            if (r1 != 0) goto L_0x018e
            r14.f21521l = r3
            int r1 = r0.mo22973f(r3)
            if (r1 != r3) goto L_0x0053
            int r7 = r0.mo22973f(r3)
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            r14.f21522m = r7
            if (r7 != 0) goto L_0x0188
            if (r1 != r3) goto L_0x0064
            int r7 = r0.mo22973f(r5)
            int r7 = r7 + r3
            int r7 = r7 * 8
            r0.mo22973f(r7)
        L_0x0064:
            boolean r7 = r0.mo22972e()
            if (r7 == 0) goto L_0x0182
            r7 = 6
            int r8 = r0.mo22973f(r7)
            r14.f21523n = r8
            r8 = 4
            int r9 = r0.mo22973f(r8)
            int r10 = r0.mo22973f(r2)
            if (r9 != 0) goto L_0x017c
            if (r10 != 0) goto L_0x017c
            if (r1 != 0) goto L_0x00ec
            int r9 = r0.f21035b
            int r9 = r9 * 8
            int r10 = r0.f21036c
            int r9 = r9 + r10
            int r10 = r0.mo22969b()
            ia.a$a r11 = p125ia.C5311a.m13352c(r0, r3)
            java.lang.String r12 = r11.f17500c
            r14.f21530u = r12
            int r12 = r11.f17498a
            r14.f21527r = r12
            int r11 = r11.f17499b
            r14.f21529t = r11
            int r11 = r0.mo22969b()
            int r10 = r10 - r11
            r0.mo22977j(r9)
            int r9 = r10 + 7
            int r9 = r9 / r6
            byte[] r9 = new byte[r9]
            r0.mo22974g(r10, r9)
            com.google.android.exoplayer2.Format$b r10 = new com.google.android.exoplayer2.Format$b
            r10.<init>()
            java.lang.String r11 = r14.f21514e
            r10.f13436a = r11
            java.lang.String r11 = "audio/mp4a-latm"
            r10.f13446k = r11
            java.lang.String r11 = r14.f21530u
            r10.f13443h = r11
            int r11 = r14.f21529t
            r10.f13459x = r11
            int r11 = r14.f21527r
            r10.f13460y = r11
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.f13448m = r9
            java.lang.String r9 = r14.f21510a
            r10.f13438c = r9
            com.google.android.exoplayer2.Format r9 = new com.google.android.exoplayer2.Format
            r9.<init>((com.google.android.exoplayer2.Format.C3872b) r10)
            com.google.android.exoplayer2.Format r10 = r14.f21515f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0116
            r14.f21515f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f13400A
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f21528s = r10
            ma.v r10 = r14.f21513d
            r10.mo20632c(r9)
            goto L_0x0116
        L_0x00ec:
            int r9 = r0.mo22973f(r5)
            int r9 = r9 + r3
            int r9 = r9 * 8
            int r9 = r0.mo22973f(r9)
            long r9 = (long) r9
            int r10 = (int) r9
            int r9 = r0.mo22969b()
            ia.a$a r11 = p125ia.C5311a.m13352c(r0, r3)
            java.lang.String r12 = r11.f17500c
            r14.f21530u = r12
            int r12 = r11.f17498a
            r14.f21527r = r12
            int r11 = r11.f17499b
            r14.f21529t = r11
            int r11 = r0.mo22969b()
            int r9 = r9 - r11
            int r10 = r10 - r9
            r0.mo22979l(r10)
        L_0x0116:
            int r9 = r0.mo22973f(r2)
            r14.f21524o = r9
            if (r9 == 0) goto L_0x0141
            if (r9 == r3) goto L_0x013b
            if (r9 == r2) goto L_0x0137
            if (r9 == r8) goto L_0x0137
            r2 = 5
            if (r9 == r2) goto L_0x0137
            if (r9 == r7) goto L_0x0133
            r2 = 7
            if (r9 != r2) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0133:
            r0.mo22979l(r3)
            goto L_0x0144
        L_0x0137:
            r0.mo22979l(r7)
            goto L_0x0144
        L_0x013b:
            r2 = 9
            r0.mo22979l(r2)
            goto L_0x0144
        L_0x0141:
            r0.mo22979l(r6)
        L_0x0144:
            boolean r2 = r0.mo22972e()
            r14.f21525p = r2
            r7 = 0
            r14.f21526q = r7
            if (r2 == 0) goto L_0x0172
            if (r1 != r3) goto L_0x0161
            int r1 = r0.mo22973f(r5)
            int r1 = r1 + r3
            int r1 = r1 * 8
            int r1 = r0.mo22973f(r1)
            long r1 = (long) r1
            r14.f21526q = r1
            goto L_0x0172
        L_0x0161:
            boolean r1 = r0.mo22972e()
            long r2 = r14.f21526q
            long r2 = r2 << r6
            int r5 = r0.mo22973f(r6)
            long r7 = (long) r5
            long r2 = r2 + r7
            r14.f21526q = r2
            if (r1 != 0) goto L_0x0161
        L_0x0172:
            boolean r1 = r0.mo22972e()
            if (r1 == 0) goto L_0x0193
            r0.mo22979l(r6)
            goto L_0x0193
        L_0x017c:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x0182:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x0188:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x018e:
            boolean r1 = r14.f21521l
            if (r1 != 0) goto L_0x0193
            goto L_0x01ed
        L_0x0193:
            int r1 = r14.f21522m
            if (r1 != 0) goto L_0x01ff
            int r1 = r14.f21523n
            if (r1 != 0) goto L_0x01f9
            int r1 = r14.f21524o
            if (r1 != 0) goto L_0x01f3
            r1 = 0
        L_0x01a0:
            int r2 = r0.mo22973f(r6)
            int r11 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01f1
            int r1 = r0.f21035b
            int r1 = r1 * 8
            int r2 = r0.f21036c
            int r1 = r1 + r2
            r2 = r1 & 7
            if (r2 != 0) goto L_0x01bd
            ub.r r2 = r14.f21511b
            int r1 = r1 >> 3
            r2.mo23007z(r1)
            goto L_0x01cb
        L_0x01bd:
            ub.r r1 = r14.f21511b
            byte[] r1 = r1.f21038a
            int r2 = r11 * 8
            r0.mo22974g(r2, r1)
            ub.r r1 = r14.f21511b
            r1.mo23007z(r4)
        L_0x01cb:
            ma.v r1 = r14.f21513d
            ub.r r2 = r14.f21511b
            r1.mo20631b(r11, r2)
            ma.v r7 = r14.f21513d
            long r8 = r14.f21520k
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo20633d(r8, r10, r11, r12, r13)
            long r1 = r14.f21520k
            long r5 = r14.f21528s
            long r1 = r1 + r5
            r14.f21520k = r1
            boolean r1 = r14.f21525p
            if (r1 == 0) goto L_0x01ed
            long r1 = r14.f21526q
            int r2 = (int) r1
            r0.mo22979l(r2)
        L_0x01ed:
            r14.f21516g = r4
            goto L_0x0005
        L_0x01f1:
            r1 = r11
            goto L_0x01a0
        L_0x01f3:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x01f9:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x01ff:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x0205:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x020b:
            int r0 = r14.f21519j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r6
            int r1 = r15.mo22997p()
            r0 = r0 | r1
            r14.f21518i = r0
            ub.r r1 = r14.f21511b
            byte[] r3 = r1.f21038a
            int r3 = r3.length
            if (r0 <= r3) goto L_0x022e
            r1.mo23004w(r0)
            ub.q r0 = r14.f21512c
            ub.r r1 = r14.f21511b
            byte[] r1 = r1.f21038a
            r0.getClass()
            int r3 = r1.length
            r0.mo22976i(r3, r1)
        L_0x022e:
            r14.f21517h = r4
            r14.f21516g = r2
            goto L_0x0005
        L_0x0234:
            int r0 = r15.mo22997p()
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r1 != r3) goto L_0x0244
            r14.f21519j = r0
            r14.f21516g = r5
            goto L_0x0005
        L_0x0244:
            if (r0 == r2) goto L_0x0005
            r14.f21516g = r4
            goto L_0x0005
        L_0x024a:
            int r0 = r15.mo22997p()
            if (r0 != r2) goto L_0x0005
            r14.f21516g = r3
            goto L_0x0005
        L_0x0254:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6919p.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21516g = 0;
        this.f21521l = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21520k = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21513d = jVar.mo20709p(dVar.f21326d, 1);
        dVar.mo23152b();
        this.f21514e = dVar.f21327e;
    }
}
