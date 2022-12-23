package p289va;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6795o;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.k */
public final class C6908k implements C6907j {

    /* renamed from: q */
    public static final double[] f21380q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f21381a;

    /* renamed from: b */
    public C5754v f21382b;

    /* renamed from: c */
    public final C6902e0 f21383c;

    /* renamed from: d */
    public final C6803r f21384d;

    /* renamed from: e */
    public final C6921r f21385e;

    /* renamed from: f */
    public final boolean[] f21386f = new boolean[4];

    /* renamed from: g */
    public final C6909a f21387g = new C6909a();

    /* renamed from: h */
    public long f21388h;

    /* renamed from: i */
    public boolean f21389i;

    /* renamed from: j */
    public boolean f21390j;

    /* renamed from: k */
    public long f21391k;

    /* renamed from: l */
    public long f21392l;

    /* renamed from: m */
    public long f21393m;

    /* renamed from: n */
    public long f21394n;

    /* renamed from: o */
    public boolean f21395o;

    /* renamed from: p */
    public boolean f21396p;

    /* renamed from: va.k$a */
    public static final class C6909a {

        /* renamed from: e */
        public static final byte[] f21397e = {0, 0, 1};

        /* renamed from: a */
        public boolean f21398a;

        /* renamed from: b */
        public int f21399b;

        /* renamed from: c */
        public int f21400c;

        /* renamed from: d */
        public byte[] f21401d = new byte[RecyclerView.C1119a0.FLAG_IGNORE];

        /* renamed from: a */
        public final void mo23158a(int i, int i2, byte[] bArr) {
            if (this.f21398a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f21401d;
                int length = bArr2.length;
                int i4 = this.f21399b;
                if (length < i4 + i3) {
                    this.f21401d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f21401d, this.f21399b, i3);
                this.f21399b += i3;
            }
        }
    }

    public C6908k(C6902e0 e0Var) {
        this.f21383c = e0Var;
        if (e0Var != null) {
            this.f21385e = new C6921r(178);
            this.f21384d = new C6803r();
            return;
        }
        this.f21385e = null;
        this.f21384d = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            ma.v r2 = r0.f21382b
            p583jk.C17875h.m44306q(r2)
            int r2 = r1.f21039b
            int r3 = r1.f21040c
            byte[] r4 = r1.f21038a
            long r5 = r0.f21388h
            int r7 = r3 - r2
            long r8 = (long) r7
            long r5 = r5 + r8
            r0.f21388h = r5
            ma.v r5 = r0.f21382b
            r5.mo20631b(r7, r1)
        L_0x001c:
            boolean[] r5 = r0.f21386f
            int r5 = p277ub.C6795o.m15999b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0035
            boolean r1 = r0.f21390j
            if (r1 != 0) goto L_0x002d
            va.k$a r1 = r0.f21387g
            r1.mo23158a(r2, r3, r4)
        L_0x002d:
            va.r r1 = r0.f21385e
            if (r1 == 0) goto L_0x0034
            r1.mo23163a(r2, r3, r4)
        L_0x0034:
            return
        L_0x0035:
            byte[] r6 = r1.f21038a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f21390j
            r12 = 179(0xb3, float:2.51E-43)
            r13 = 0
            r14 = 1
            if (r9 != 0) goto L_0x0145
            if (r8 <= 0) goto L_0x004e
            va.k$a r9 = r0.f21387g
            r9.mo23158a(r2, r5, r4)
        L_0x004e:
            if (r8 >= 0) goto L_0x0052
            int r9 = -r8
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            va.k$a r15 = r0.f21387g
            boolean r10 = r15.f21398a
            r11 = 3
            if (r10 == 0) goto L_0x006e
            int r10 = r15.f21399b
            int r10 = r10 - r9
            r15.f21399b = r10
            int r9 = r15.f21400c
            if (r9 != 0) goto L_0x006a
            r9 = 181(0xb5, float:2.54E-43)
            if (r6 != r9) goto L_0x006a
            r15.f21400c = r10
            goto L_0x0072
        L_0x006a:
            r15.f21398a = r13
            r9 = 1
            goto L_0x0078
        L_0x006e:
            if (r6 != r12) goto L_0x0072
            r15.f21398a = r14
        L_0x0072:
            byte[] r9 = p289va.C6908k.C6909a.f21397e
            r15.mo23158a(r13, r11, r9)
            r9 = 0
        L_0x0078:
            if (r9 == 0) goto L_0x0145
            va.k$a r9 = r0.f21387g
            java.lang.String r10 = r0.f21381a
            r10.getClass()
            byte[] r15 = r9.f21401d
            int r13 = r9.f21399b
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r15 = 4
            byte r12 = r13[r15]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r14 = r13[r16]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r17 = 6
            byte r11 = r13[r17]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r15
            int r17 = r14 >> 4
            r12 = r12 | r17
            r14 = r14 & 15
            r15 = 8
            int r14 = r14 << r15
            r11 = r11 | r14
            r14 = 7
            byte r15 = r13[r14]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            r14 = 4
            int r15 = r15 >> r14
            r14 = 2
            if (r15 == r14) goto L_0x00c4
            r14 = 3
            if (r15 == r14) goto L_0x00be
            r14 = 4
            if (r15 == r14) goto L_0x00b8
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cb
        L_0x00b8:
            int r14 = r11 * 121
            float r14 = (float) r14
            int r15 = r12 * 100
            goto L_0x00c9
        L_0x00be:
            int r14 = r11 * 16
            float r14 = (float) r14
            int r15 = r12 * 9
            goto L_0x00c9
        L_0x00c4:
            int r14 = r11 * 4
            float r14 = (float) r14
            int r15 = r12 * 3
        L_0x00c9:
            float r15 = (float) r15
            float r14 = r14 / r15
        L_0x00cb:
            com.google.android.exoplayer2.Format$b r15 = new com.google.android.exoplayer2.Format$b
            r15.<init>()
            r15.f13436a = r10
            java.lang.String r10 = "video/mpeg2"
            r15.f13446k = r10
            r15.f13451p = r12
            r15.f13452q = r11
            r15.f13455t = r14
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r15.f13448m = r10
            com.google.android.exoplayer2.Format r10 = new com.google.android.exoplayer2.Format
            r10.<init>((com.google.android.exoplayer2.Format.C3872b) r15)
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x0121
            double[] r12 = f21380q
            r14 = 8
            if (r11 >= r14) goto L_0x0121
            r11 = r12[r11]
            int r9 = r9.f21400c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x0116
            double r13 = (double) r13
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r17
            int r9 = r9 + 1
            r16 = r6
            r15 = r7
            double r6 = (double) r9
            double r13 = r13 / r6
            double r11 = r11 * r13
            goto L_0x0119
        L_0x0116:
            r16 = r6
            r15 = r7
        L_0x0119:
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 / r11
            long r6 = (long) r6
            goto L_0x0126
        L_0x0121:
            r16 = r6
            r15 = r7
            r6 = 0
        L_0x0126:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            android.util.Pair r6 = android.util.Pair.create(r10, r6)
            ma.v r7 = r0.f21382b
            java.lang.Object r9 = r6.first
            com.google.android.exoplayer2.Format r9 = (com.google.android.exoplayer2.Format) r9
            r7.mo20632c(r9)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r0.f21391k = r6
            r6 = 1
            r0.f21390j = r6
            goto L_0x0148
        L_0x0145:
            r16 = r6
            r15 = r7
        L_0x0148:
            va.r r6 = r0.f21385e
            if (r6 == 0) goto L_0x018f
            if (r8 <= 0) goto L_0x0153
            r6.mo23163a(r2, r5, r4)
            r2 = 0
            goto L_0x0154
        L_0x0153:
            int r2 = -r8
        L_0x0154:
            va.r r6 = r0.f21385e
            boolean r2 = r6.mo23164b(r2)
            if (r2 == 0) goto L_0x017a
            va.r r2 = r0.f21385e
            byte[] r6 = r2.f21546d
            int r2 = r2.f21547e
            int r2 = p277ub.C6795o.m16002e(r2, r6)
            ub.r r6 = r0.f21384d
            int r7 = p277ub.C6774a0.f20959a
            va.r r7 = r0.f21385e
            byte[] r7 = r7.f21546d
            r6.mo23005x(r2, r7)
            va.e0 r2 = r0.f21383c
            long r6 = r0.f21394n
            ub.r r8 = r0.f21384d
            r2.mo23153a(r6, r8)
        L_0x017a:
            r2 = 178(0xb2, float:2.5E-43)
            r6 = r16
            if (r6 != r2) goto L_0x0191
            byte[] r2 = r1.f21038a
            int r7 = r5 + 2
            byte r2 = r2[r7]
            r7 = 1
            if (r2 != r7) goto L_0x0191
            va.r r2 = r0.f21385e
            r2.mo23166d(r6)
            goto L_0x0191
        L_0x018f:
            r6 = r16
        L_0x0191:
            if (r6 == 0) goto L_0x01a0
            r2 = 179(0xb3, float:2.51E-43)
            if (r6 != r2) goto L_0x0198
            goto L_0x01a0
        L_0x0198:
            r2 = 184(0xb8, float:2.58E-43)
            if (r6 != r2) goto L_0x01fa
            r2 = 1
            r0.f21395o = r2
            goto L_0x01fa
        L_0x01a0:
            int r2 = r3 - r5
            boolean r5 = r0.f21389i
            if (r5 == 0) goto L_0x01c1
            boolean r5 = r0.f21396p
            if (r5 == 0) goto L_0x01c1
            boolean r5 = r0.f21390j
            if (r5 == 0) goto L_0x01c1
            boolean r10 = r0.f21395o
            long r7 = r0.f21388h
            long r11 = r0.f21393m
            long r7 = r7 - r11
            int r5 = (int) r7
            int r11 = r5 - r2
            ma.v r7 = r0.f21382b
            long r8 = r0.f21394n
            r13 = 0
            r12 = r2
            r7.mo20633d(r8, r10, r11, r12, r13)
        L_0x01c1:
            boolean r5 = r0.f21389i
            if (r5 == 0) goto L_0x01cd
            boolean r7 = r0.f21396p
            if (r7 == 0) goto L_0x01ca
            goto L_0x01cd
        L_0x01ca:
            r2 = 0
            r5 = 1
            goto L_0x01f3
        L_0x01cd:
            long r7 = r0.f21388h
            long r9 = (long) r2
            long r7 = r7 - r9
            r0.f21393m = r7
            long r7 = r0.f21392l
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01df
            goto L_0x01e9
        L_0x01df:
            if (r5 == 0) goto L_0x01e7
            long r7 = r0.f21394n
            long r11 = r0.f21391k
            long r7 = r7 + r11
            goto L_0x01e9
        L_0x01e7:
            r7 = 0
        L_0x01e9:
            r0.f21394n = r7
            r2 = 0
            r0.f21395o = r2
            r0.f21392l = r9
            r5 = 1
            r0.f21389i = r5
        L_0x01f3:
            if (r6 != 0) goto L_0x01f7
            r13 = 1
            goto L_0x01f8
        L_0x01f7:
            r13 = 0
        L_0x01f8:
            r0.f21396p = r13
        L_0x01fa:
            r2 = r15
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6908k.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        C6795o.m15998a(this.f21386f);
        C6909a aVar = this.f21387g;
        aVar.f21398a = false;
        aVar.f21399b = 0;
        aVar.f21400c = 0;
        C6921r rVar = this.f21385e;
        if (rVar != null) {
            rVar.mo23165c();
        }
        this.f21388h = 0;
        this.f21389i = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21392l = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21381a = dVar.f21327e;
        dVar.mo23152b();
        this.f21382b = jVar.mo20709p(dVar.f21326d, 2);
        C6902e0 e0Var = this.f21383c;
        if (e0Var != null) {
            e0Var.mo23154b(jVar, dVar);
        }
    }
}
