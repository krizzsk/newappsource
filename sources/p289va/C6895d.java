package p289va;

import com.google.android.exoplayer2.Format;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6802q;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.d */
public final class C6895d implements C6907j {

    /* renamed from: a */
    public final C6802q f21305a;

    /* renamed from: b */
    public final C6803r f21306b;

    /* renamed from: c */
    public final String f21307c;

    /* renamed from: d */
    public String f21308d;

    /* renamed from: e */
    public C5754v f21309e;

    /* renamed from: f */
    public int f21310f = 0;

    /* renamed from: g */
    public int f21311g = 0;

    /* renamed from: h */
    public boolean f21312h = false;

    /* renamed from: i */
    public boolean f21313i = false;

    /* renamed from: j */
    public long f21314j;

    /* renamed from: k */
    public Format f21315k;

    /* renamed from: l */
    public int f21316l;

    /* renamed from: m */
    public long f21317m;

    public C6895d(String str) {
        C6802q qVar = new C6802q(new byte[16], 16);
        this.f21305a = qVar;
        this.f21306b = new C6803r(qVar.f21034a);
        this.f21307c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r13) {
        /*
            r12 = this;
            ma.v r0 = r12.f21309e
            p583jk.C17875h.m44306q(r0)
        L_0x0005:
            int r0 = r13.f21040c
            int r1 = r13.f21039b
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0119
            int r1 = r12.f21310f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00c9
            if (r1 == r3) goto L_0x0043
            if (r1 == r2) goto L_0x0018
            goto L_0x0005
        L_0x0018:
            int r1 = r12.f21316l
            int r2 = r12.f21311g
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            ma.v r1 = r12.f21309e
            r1.mo20631b(r0, r13)
            int r1 = r12.f21311g
            int r1 = r1 + r0
            r12.f21311g = r1
            int r9 = r12.f21316l
            if (r1 != r9) goto L_0x0005
            ma.v r5 = r12.f21309e
            long r6 = r12.f21317m
            r8 = 1
            r10 = 0
            r11 = 0
            r5.mo20633d(r6, r8, r9, r10, r11)
            long r0 = r12.f21317m
            long r2 = r12.f21314j
            long r0 = r0 + r2
            r12.f21317m = r0
            r12.f21310f = r4
            goto L_0x0005
        L_0x0043:
            ub.r r1 = r12.f21306b
            byte[] r1 = r1.f21038a
            int r5 = r12.f21311g
            r6 = 16
            int r5 = 16 - r5
            int r0 = java.lang.Math.min(r0, r5)
            int r5 = r12.f21311g
            r13.mo22983b(r5, r0, r1)
            int r1 = r12.f21311g
            int r1 = r1 + r0
            r12.f21311g = r1
            if (r1 != r6) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 == 0) goto L_0x0005
            ub.q r0 = r12.f21305a
            r0.mo22977j(r4)
            ub.q r0 = r12.f21305a
            ia.c$a r0 = p125ia.C5314c.m13355b(r0)
            com.google.android.exoplayer2.Format r1 = r12.f21315k
            java.lang.String r3 = "audio/ac4"
            if (r1 == 0) goto L_0x0084
            int r5 = r1.f13431z
            if (r2 != r5) goto L_0x0084
            int r5 = r0.f17508a
            int r7 = r1.f13400A
            if (r5 != r7) goto L_0x0084
            java.lang.String r1 = r1.f13418m
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00a5
        L_0x0084:
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            java.lang.String r5 = r12.f21308d
            r1.f13436a = r5
            r1.f13446k = r3
            r1.f13459x = r2
            int r3 = r0.f17508a
            r1.f13460y = r3
            java.lang.String r3 = r12.f21307c
            r1.f13438c = r3
            com.google.android.exoplayer2.Format r3 = new com.google.android.exoplayer2.Format
            r3.<init>((com.google.android.exoplayer2.Format.C3872b) r1)
            r12.f21315k = r3
            ma.v r1 = r12.f21309e
            r1.mo20632c(r3)
        L_0x00a5:
            int r1 = r0.f17509b
            r12.f21316l = r1
            r7 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r0.f17510c
            long r0 = (long) r0
            long r0 = r0 * r7
            com.google.android.exoplayer2.Format r3 = r12.f21315k
            int r3 = r3.f13400A
            long r7 = (long) r3
            long r0 = r0 / r7
            r12.f21314j = r0
            ub.r r0 = r12.f21306b
            r0.mo23007z(r4)
            ma.v r0 = r12.f21309e
            ub.r r1 = r12.f21306b
            r0.mo20631b(r6, r1)
            r12.f21310f = r2
            goto L_0x0005
        L_0x00c9:
            int r0 = r13.f21040c
            int r1 = r13.f21039b
            int r0 = r0 - r1
            r1 = 65
            r5 = 64
            if (r0 <= 0) goto L_0x00fe
            boolean r0 = r12.f21312h
            r6 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00e6
            int r0 = r13.mo22997p()
            if (r0 != r6) goto L_0x00e2
            r0 = 1
            goto L_0x00e3
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            r12.f21312h = r0
            goto L_0x00c9
        L_0x00e6:
            int r0 = r13.mo22997p()
            if (r0 != r6) goto L_0x00ee
            r6 = 1
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            r12.f21312h = r6
            if (r0 == r5) goto L_0x00f5
            if (r0 != r1) goto L_0x00c9
        L_0x00f5:
            if (r0 != r1) goto L_0x00f9
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r12.f21313i = r0
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            if (r0 == 0) goto L_0x0005
            r12.f21310f = r3
            ub.r r0 = r12.f21306b
            byte[] r0 = r0.f21038a
            r6 = -84
            r0[r4] = r6
            boolean r4 = r12.f21313i
            if (r4 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r1 = 64
        L_0x0112:
            byte r1 = (byte) r1
            r0[r3] = r1
            r12.f21311g = r2
            goto L_0x0005
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6895d.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21310f = 0;
        this.f21311g = 0;
        this.f21312h = false;
        this.f21313i = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21317m = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21308d = dVar.f21327e;
        dVar.mo23152b();
        this.f21309e = jVar.mo20709p(dVar.f21326d, 1);
    }
}
