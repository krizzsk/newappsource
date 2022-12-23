package p212pa;

import com.google.android.exoplayer2.extractor.flv.C3928a;
import com.google.android.exoplayer2.extractor.flv.C3929b;
import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p277ub.C6803r;

/* renamed from: pa.a */
public final class C6107a implements C5735h {

    /* renamed from: a */
    public final C6803r f19381a = new C6803r(4);

    /* renamed from: b */
    public final C6803r f19382b = new C6803r(9);

    /* renamed from: c */
    public final C6803r f19383c = new C6803r(11);

    /* renamed from: d */
    public final C6803r f19384d = new C6803r();

    /* renamed from: e */
    public final C6108b f19385e = new C6108b();

    /* renamed from: f */
    public C5737j f19386f;

    /* renamed from: g */
    public int f19387g = 1;

    /* renamed from: h */
    public boolean f19388h;

    /* renamed from: i */
    public long f19389i;

    /* renamed from: j */
    public int f19390j;

    /* renamed from: k */
    public int f19391k;

    /* renamed from: l */
    public int f19392l;

    /* renamed from: m */
    public long f19393m;

    /* renamed from: n */
    public boolean f19394n;

    /* renamed from: o */
    public C3928a f19395o;

    /* renamed from: p */
    public C3929b f19396p;

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        if (j == 0) {
            this.f19387g = 1;
            this.f19388h = false;
        } else {
            this.f19387g = 3;
        }
        this.f19390j = 0;
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        C5732e eVar = (C5732e) iVar;
        eVar.mo21583j(0, 3, this.f19381a.f21038a, false);
        this.f19381a.mo23007z(0);
        if (this.f19381a.mo22999r() != 4607062) {
            return false;
        }
        eVar.mo21583j(0, 2, this.f19381a.f21038a, false);
        this.f19381a.mo23007z(0);
        if ((this.f19381a.mo23002u() & 250) != 0) {
            return false;
        }
        eVar.mo21583j(0, 4, this.f19381a.f21038a, false);
        this.f19381a.mo23007z(0);
        int c = this.f19381a.mo22984c();
        eVar.f18593f = 0;
        eVar.mo21584k(c, false);
        eVar.mo21583j(0, 4, this.f19381a.f21038a, false);
        this.f19381a.mo23007z(0);
        if (this.f19381a.mo22984c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C6803r mo22069c(C5732e eVar) throws IOException {
        int i = this.f19392l;
        C6803r rVar = this.f19384d;
        byte[] bArr = rVar.f21038a;
        if (i > bArr.length) {
            rVar.mo23005x(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            rVar.mo23007z(0);
        }
        this.f19384d.mo23006y(this.f19392l);
        eVar.mo21581h(0, this.f19392l, this.f19384d.f21038a, false);
        return this.f19384d;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f19386f = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r3.mo16023b(r1, r4) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (r3.mo16025b(r1, r4) != false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0006 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r16, p173ma.C5749s r17) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            ma.j r1 = r0.f19386f
            p583jk.C17875h.m44306q(r1)
        L_0x0006:
            int r1 = r0.f19387g
            r2 = -1
            r3 = 8
            r4 = 9
            r5 = 2
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L_0x014c
            r9 = 3
            if (r1 == r5) goto L_0x013d
            if (r1 == r9) goto L_0x00f1
            if (r1 != r6) goto L_0x00eb
            boolean r1 = r0.f19388h
            r9 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x002b
            long r1 = r0.f19389i
            long r13 = r0.f19393m
            long r1 = r1 + r13
            goto L_0x0037
        L_0x002b:
            pa.b r1 = r0.f19385e
            long r1 = r1.f19397b
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0035
            r1 = r9
            goto L_0x0037
        L_0x0035:
            long r1 = r0.f19393m
        L_0x0037:
            int r13 = r0.f19391k
            if (r13 != r3) goto L_0x0064
            com.google.android.exoplayer2.extractor.flv.a r3 = r0.f19395o
            if (r3 == 0) goto L_0x0064
            boolean r3 = r0.f19394n
            if (r3 != 0) goto L_0x004f
            ma.j r3 = r0.f19386f
            ma.t$b r4 = new ma.t$b
            r4.<init>(r11)
            r3.mo20707k(r4)
            r0.f19394n = r8
        L_0x004f:
            com.google.android.exoplayer2.extractor.flv.a r3 = r0.f19395o
            r4 = r16
            ma.e r4 = (p173ma.C5732e) r4
            ub.r r4 = r15.mo22069c(r4)
            r3.mo16022a(r4)
            boolean r1 = r3.mo16023b(r1, r4)
            if (r1 == 0) goto L_0x00c1
        L_0x0062:
            r1 = 1
            goto L_0x00c2
        L_0x0064:
            if (r13 != r4) goto L_0x0091
            com.google.android.exoplayer2.extractor.flv.b r3 = r0.f19396p
            if (r3 == 0) goto L_0x0091
            boolean r3 = r0.f19394n
            if (r3 != 0) goto L_0x007a
            ma.j r3 = r0.f19386f
            ma.t$b r4 = new ma.t$b
            r4.<init>(r11)
            r3.mo20707k(r4)
            r0.f19394n = r8
        L_0x007a:
            com.google.android.exoplayer2.extractor.flv.b r3 = r0.f19396p
            r4 = r16
            ma.e r4 = (p173ma.C5732e) r4
            ub.r r4 = r15.mo22069c(r4)
            boolean r13 = r3.mo16024a(r4)
            if (r13 == 0) goto L_0x00c1
            boolean r1 = r3.mo16025b(r1, r4)
            if (r1 == 0) goto L_0x00c1
            goto L_0x0062
        L_0x0091:
            r3 = 18
            if (r13 != r3) goto L_0x00c4
            boolean r3 = r0.f19394n
            if (r3 != 0) goto L_0x00c4
            pa.b r3 = r0.f19385e
            r4 = r16
            ma.e r4 = (p173ma.C5732e) r4
            ub.r r4 = r15.mo22069c(r4)
            r3.getClass()
            r3.mo22070a(r1, r4)
            pa.b r1 = r0.f19385e
            long r2 = r1.f19397b
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x00c1
            ma.j r4 = r0.f19386f
            ma.r r13 = new ma.r
            long[] r14 = r1.f19399d
            long[] r1 = r1.f19398c
            r13.<init>(r14, r1, r2)
            r4.mo20707k(r13)
            r0.f19394n = r8
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            r2 = 1
            goto L_0x00cf
        L_0x00c4:
            int r1 = r0.f19392l
            r2 = r16
            ma.e r2 = (p173ma.C5732e) r2
            r2.mo21582i(r1)
            r1 = 0
            r2 = 0
        L_0x00cf:
            boolean r3 = r0.f19388h
            if (r3 != 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            r0.f19388h = r8
            pa.b r1 = r0.f19385e
            long r3 = r1.f19397b
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x00e2
            long r3 = r0.f19393m
            long r9 = -r3
        L_0x00e2:
            r0.f19389i = r9
        L_0x00e4:
            r0.f19390j = r6
            r0.f19387g = r5
            if (r2 == 0) goto L_0x0006
            return r7
        L_0x00eb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00f1:
            ub.r r1 = r0.f19383c
            byte[] r1 = r1.f21038a
            r3 = 11
            r4 = r16
            ma.e r4 = (p173ma.C5732e) r4
            boolean r1 = r4.mo21581h(r7, r3, r1, r8)
            if (r1 != 0) goto L_0x0102
            goto L_0x013a
        L_0x0102:
            ub.r r1 = r0.f19383c
            r1.mo23007z(r7)
            ub.r r1 = r0.f19383c
            int r1 = r1.mo22997p()
            r0.f19391k = r1
            ub.r r1 = r0.f19383c
            int r1 = r1.mo22999r()
            r0.f19392l = r1
            ub.r r1 = r0.f19383c
            int r1 = r1.mo22999r()
            long r3 = (long) r1
            r0.f19393m = r3
            ub.r r1 = r0.f19383c
            int r1 = r1.mo22997p()
            int r1 = r1 << 24
            long r3 = (long) r1
            long r10 = r0.f19393m
            long r3 = r3 | r10
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            r0.f19393m = r3
            ub.r r1 = r0.f19383c
            r1.mo22981A(r9)
            r0.f19387g = r6
            r7 = 1
        L_0x013a:
            if (r7 != 0) goto L_0x0006
            return r2
        L_0x013d:
            int r1 = r0.f19390j
            r2 = r16
            ma.e r2 = (p173ma.C5732e) r2
            r2.mo21582i(r1)
            r0.f19390j = r7
            r0.f19387g = r9
            goto L_0x0006
        L_0x014c:
            ub.r r1 = r0.f19382b
            byte[] r1 = r1.f21038a
            r9 = r16
            ma.e r9 = (p173ma.C5732e) r9
            boolean r1 = r9.mo21581h(r7, r4, r1, r8)
            if (r1 != 0) goto L_0x015b
            goto L_0x01af
        L_0x015b:
            ub.r r1 = r0.f19382b
            r1.mo23007z(r7)
            ub.r r1 = r0.f19382b
            r1.mo22981A(r6)
            ub.r r1 = r0.f19382b
            int r1 = r1.mo22997p()
            r9 = r1 & 4
            if (r9 == 0) goto L_0x0171
            r9 = 1
            goto L_0x0172
        L_0x0171:
            r9 = 0
        L_0x0172:
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0177
            r7 = 1
        L_0x0177:
            if (r9 == 0) goto L_0x018a
            com.google.android.exoplayer2.extractor.flv.a r1 = r0.f19395o
            if (r1 != 0) goto L_0x018a
            com.google.android.exoplayer2.extractor.flv.a r1 = new com.google.android.exoplayer2.extractor.flv.a
            ma.j r9 = r0.f19386f
            ma.v r3 = r9.mo20709p(r3, r8)
            r1.<init>(r3)
            r0.f19395o = r1
        L_0x018a:
            if (r7 == 0) goto L_0x019d
            com.google.android.exoplayer2.extractor.flv.b r1 = r0.f19396p
            if (r1 != 0) goto L_0x019d
            com.google.android.exoplayer2.extractor.flv.b r1 = new com.google.android.exoplayer2.extractor.flv.b
            ma.j r3 = r0.f19386f
            ma.v r3 = r3.mo20709p(r4, r5)
            r1.<init>(r3)
            r0.f19396p = r1
        L_0x019d:
            ma.j r1 = r0.f19386f
            r1.mo20708n()
            ub.r r1 = r0.f19382b
            int r1 = r1.mo22984c()
            int r1 = r1 - r4
            int r1 = r1 + r6
            r0.f19390j = r1
            r0.f19387g = r5
            r7 = 1
        L_0x01af:
            if (r7 != 0) goto L_0x0006
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p212pa.C6107a.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
    }
}
