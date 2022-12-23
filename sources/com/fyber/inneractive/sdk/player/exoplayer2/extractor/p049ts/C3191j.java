package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3394l;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j */
public final class C3191j implements C3188h {

    /* renamed from: a */
    public final C3205s f11361a;

    /* renamed from: b */
    public final boolean f11362b;

    /* renamed from: c */
    public final boolean f11363c;

    /* renamed from: d */
    public final C3199n f11364d = new C3199n(7, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: e */
    public final C3199n f11365e = new C3199n(8, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: f */
    public final C3199n f11366f = new C3199n(6, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: g */
    public long f11367g;

    /* renamed from: h */
    public final boolean[] f11368h = new boolean[3];

    /* renamed from: i */
    public String f11369i;

    /* renamed from: j */
    public C3161n f11370j;

    /* renamed from: k */
    public C3193b f11371k;

    /* renamed from: l */
    public boolean f11372l;

    /* renamed from: m */
    public long f11373m;

    /* renamed from: n */
    public final C3393k f11374n = new C3393k();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b */
    public static final class C3193b {

        /* renamed from: a */
        public final C3161n f11375a;

        /* renamed from: b */
        public final boolean f11376b;

        /* renamed from: c */
        public final boolean f11377c;

        /* renamed from: d */
        public final SparseArray<C3389i.C3391b> f11378d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C3389i.C3390a> f11379e = new SparseArray<>();

        /* renamed from: f */
        public final C3394l f11380f;

        /* renamed from: g */
        public byte[] f11381g;

        /* renamed from: h */
        public int f11382h;

        /* renamed from: i */
        public int f11383i;

        /* renamed from: j */
        public long f11384j;

        /* renamed from: k */
        public boolean f11385k;

        /* renamed from: l */
        public long f11386l;

        /* renamed from: m */
        public C3194a f11387m = new C3194a();

        /* renamed from: n */
        public C3194a f11388n = new C3194a();

        /* renamed from: o */
        public boolean f11389o;

        /* renamed from: p */
        public long f11390p;

        /* renamed from: q */
        public long f11391q;

        /* renamed from: r */
        public boolean f11392r;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a */
        public static final class C3194a {

            /* renamed from: a */
            public boolean f11393a;

            /* renamed from: b */
            public boolean f11394b;

            /* renamed from: c */
            public C3389i.C3391b f11395c;

            /* renamed from: d */
            public int f11396d;

            /* renamed from: e */
            public int f11397e;

            /* renamed from: f */
            public int f11398f;

            /* renamed from: g */
            public int f11399g;

            /* renamed from: h */
            public boolean f11400h;

            /* renamed from: i */
            public boolean f11401i;

            /* renamed from: j */
            public boolean f11402j;

            /* renamed from: k */
            public boolean f11403k;

            /* renamed from: l */
            public int f11404l;

            /* renamed from: m */
            public int f11405m;

            /* renamed from: n */
            public int f11406n;

            /* renamed from: o */
            public int f11407o;

            /* renamed from: p */
            public int f11408p;

            public C3194a() {
            }

            /* renamed from: a */
            public static boolean m8060a(C3194a aVar, C3194a aVar2) {
                boolean z;
                boolean z2;
                if (aVar.f11393a) {
                    if (!aVar2.f11393a || aVar.f11398f != aVar2.f11398f || aVar.f11399g != aVar2.f11399g || aVar.f11400h != aVar2.f11400h) {
                        return true;
                    }
                    if (aVar.f11401i && aVar2.f11401i && aVar.f11402j != aVar2.f11402j) {
                        return true;
                    }
                    int i = aVar.f11396d;
                    int i2 = aVar2.f11396d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = aVar.f11395c.f12114h;
                    if (i3 == 0 && aVar2.f11395c.f12114h == 0 && (aVar.f11405m != aVar2.f11405m || aVar.f11406n != aVar2.f11406n)) {
                        return true;
                    }
                    if ((i3 != 1 || aVar2.f11395c.f12114h != 1 || (aVar.f11407o == aVar2.f11407o && aVar.f11408p == aVar2.f11408p)) && (z = aVar.f11403k) == (z2 = aVar2.f11403k)) {
                        return z && z2 && aVar.f11404l != aVar2.f11404l;
                    }
                    return true;
                }
            }
        }

        public C3193b(C3161n nVar, boolean z, boolean z2) {
            this.f11375a = nVar;
            this.f11376b = z;
            this.f11377c = z2;
            byte[] bArr = new byte[RecyclerView.C1119a0.FLAG_IGNORE];
            this.f11381g = bArr;
            this.f11380f = new C3394l(bArr, 0, 0);
            mo14256a();
        }

        /* renamed from: a */
        public void mo14256a() {
            this.f11385k = false;
            this.f11389o = false;
            C3194a aVar = this.f11388n;
            aVar.f11394b = false;
            aVar.f11393a = false;
        }
    }

    public C3191j(C3205s sVar, boolean z, boolean z2) {
        this.f11361a = sVar;
        this.f11362b = z;
        this.f11363c = z2;
    }

    /* renamed from: a */
    public void mo14242a() {
        C3389i.m8526a(this.f11368h);
        this.f11364d.mo14258a();
        this.f11365e.mo14258a();
        this.f11366f.mo14258a();
        C3193b bVar = this.f11371k;
        bVar.f11385k = false;
        bVar.f11389o = false;
        C3193b.C3194a aVar = bVar.f11388n;
        aVar.f11394b = false;
        aVar.f11393a = false;
        this.f11367g = 0;
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11369i = dVar.mo14272b();
        C3161n a = hVar.mo14122a(dVar.mo14273c(), 2);
        this.f11370j = a;
        this.f11371k = new C3193b(a, this.f11362b, this.f11363c);
        this.f11361a.mo14269a(hVar, dVar);
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        this.f11373m = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ba, code lost:
        if ((r1.f11394b && ((r1 = r1.f11397e) == 7 || r1 == 2)) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01eb, code lost:
        if (r6 != 1) goto L_0x01ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14245a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = r1.f12122b
            int r3 = r1.f12123c
            byte[] r4 = r1.f12121a
            long r5 = r0.f11367g
            int r7 = r31.mo14537a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f11367g = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f11370j
            int r6 = r31.mo14537a()
            r5.mo14099a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.f11368h
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8524a(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0029
            r0.mo14255a(r4, r2, r3)
            return
        L_0x0029:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x0036
            r0.mo14255a(r4, r2, r1)
        L_0x0036:
            int r1 = r3 - r1
            long r8 = r0.f11367g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x0040
            int r7 = -r7
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            long r10 = r0.f11373m
            boolean r12 = r0.f11372l
            if (r12 == 0) goto L_0x0056
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r12 = r0.f11371k
            boolean r12 = r12.f11377c
            if (r12 == 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            r27 = r3
            r28 = r4
            r29 = r5
            goto L_0x0131
        L_0x0056:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f11364d
            r12.mo14260a(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f11365e
            r12.mo14260a(r7)
            boolean r12 = r0.f11372l
            r14 = 3
            if (r12 != 0) goto L_0x00f2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f11364d
            boolean r12 = r12.f11456c
            if (r12 == 0) goto L_0x004e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f11365e
            boolean r12 = r12.f11456c
            if (r12 == 0) goto L_0x004e
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r15 = r0.f11364d
            byte[] r2 = r15.f11457d
            int r15 = r15.f11458e
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11365e
            byte[] r15 = r2.f11457d
            int r2 = r2.f11458e
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11364d
            byte[] r15 = r2.f11457d
            int r2 = r2.f11458e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8527b(r15, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r15 = r0.f11365e
            byte[] r13 = r15.f11457d
            int r15 = r15.f11458e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8525a(r13, r14, r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r14 = r0.f11370j
            java.lang.String r15 = r0.f11369i
            r27 = r3
            int r3 = r2.f12108b
            r28 = r4
            int r4 = r2.f12109c
            r29 = r5
            float r5 = r2.f12110d
            r17 = 0
            r18 = -1
            r19 = -1
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r26 = 0
            java.lang.String r16 = "video/avc"
            r20 = r3
            r21 = r4
            r23 = r12
            r25 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8175a((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (int) r19, (int) r20, (int) r21, (float) r22, (java.util.List<byte[]>) r23, (int) r24, (float) r25, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r26)
            r14.mo14098a(r3)
            r3 = 1
            r0.f11372l = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f11371k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r3 = r3.f11378d
            int r4 = r2.f12107a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r2 = r0.f11371k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r2 = r2.f11379e
            int r3 = r13.f12104a
            r2.append(r3, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11364d
            r2.mo14258a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11365e
            r2.mo14258a()
            goto L_0x0131
        L_0x00f2:
            r27 = r3
            r28 = r4
            r29 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11364d
            boolean r3 = r2.f11456c
            if (r3 == 0) goto L_0x0115
            byte[] r3 = r2.f11457d
            int r2 = r2.f11458e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8527b(r3, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f11371k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r3 = r3.f11378d
            int r4 = r2.f12107a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11364d
            r2.mo14258a()
            goto L_0x0131
        L_0x0115:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11365e
            boolean r3 = r2.f11456c
            if (r3 == 0) goto L_0x0131
            byte[] r3 = r2.f11457d
            int r2 = r2.f11458e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8525a(r3, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f11371k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r3 = r3.f11379e
            int r4 = r2.f12104a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11365e
            r2.mo14258a()
        L_0x0131:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11366f
            boolean r2 = r2.mo14260a(r7)
            if (r2 == 0) goto L_0x015b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11366f
            byte[] r3 = r2.f11457d
            int r2 = r2.f11458e
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8523a(r3, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11374n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f11366f
            byte[] r4 = r4.f11457d
            r3.mo14540a((byte[]) r4, (int) r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11374n
            r3 = 4
            r2.mo14549e(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r2 = r0.f11361a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11374n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r2 = r2.f11492b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C3308a.m8356a(r10, r3, r2)
        L_0x015b:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r2 = r0.f11371k
            int r3 = r2.f11383i
            r4 = 9
            if (r3 == r4) goto L_0x0174
            boolean r3 = r2.f11377c
            if (r3 == 0) goto L_0x0172
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r3 = r2.f11388n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r4 = r2.f11387m
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3191j.C3193b.C3194a.m8060a(r3, r4)
            if (r3 == 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r1 = 1
            goto L_0x019c
        L_0x0174:
            boolean r3 = r2.f11389o
            if (r3 == 0) goto L_0x018e
            long r3 = r2.f11384j
            long r10 = r8 - r3
            int r5 = (int) r10
            int r15 = r1 + r5
            boolean r13 = r2.f11392r
            long r10 = r2.f11390p
            long r3 = r3 - r10
            int r14 = (int) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r10 = r2.f11375a
            long r11 = r2.f11391q
            r16 = 0
            r10.mo14096a(r11, r13, r14, r15, r16)
        L_0x018e:
            long r3 = r2.f11384j
            r2.f11390p = r3
            long r3 = r2.f11386l
            r2.f11391q = r3
            r1 = 0
            r2.f11392r = r1
            r1 = 1
            r2.f11389o = r1
        L_0x019c:
            boolean r3 = r2.f11392r
            int r4 = r2.f11383i
            r5 = 2
            r7 = 5
            if (r4 == r7) goto L_0x01bf
            boolean r10 = r2.f11376b
            if (r10 == 0) goto L_0x01bd
            if (r4 != r1) goto L_0x01bd
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r2.f11388n
            boolean r4 = r1.f11394b
            if (r4 == 0) goto L_0x01b9
            int r1 = r1.f11397e
            r4 = 7
            if (r1 == r4) goto L_0x01b7
            if (r1 != r5) goto L_0x01b9
        L_0x01b7:
            r1 = 1
            goto L_0x01ba
        L_0x01b9:
            r1 = 0
        L_0x01ba:
            if (r1 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r1 = 0
            goto L_0x01c0
        L_0x01bf:
            r1 = 1
        L_0x01c0:
            r1 = r1 | r3
            r2.f11392r = r1
            long r1 = r0.f11373m
            boolean r3 = r0.f11372l
            if (r3 == 0) goto L_0x01cf
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f11371k
            boolean r3 = r3.f11377c
            if (r3 == 0) goto L_0x01d9
        L_0x01cf:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f11364d
            r3.mo14261b(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f11365e
            r3.mo14261b(r6)
        L_0x01d9:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f11366f
            r3.mo14261b(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f11371k
            r3.f11383i = r6
            r3.f11386l = r1
            r3.f11384j = r8
            boolean r1 = r3.f11376b
            if (r1 == 0) goto L_0x01ee
            r1 = 1
            if (r6 == r1) goto L_0x01f9
            goto L_0x01ef
        L_0x01ee:
            r1 = 1
        L_0x01ef:
            boolean r2 = r3.f11377c
            if (r2 == 0) goto L_0x020b
            if (r6 == r7) goto L_0x01f9
            if (r6 == r1) goto L_0x01f9
            if (r6 != r5) goto L_0x020b
        L_0x01f9:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r3.f11387m
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r2 = r3.f11388n
            r3.f11387m = r2
            r3.f11388n = r1
            r2 = 0
            r1.f11394b = r2
            r1.f11393a = r2
            r3.f11382h = r2
            r1 = 1
            r3.f11385k = r1
        L_0x020b:
            r3 = r27
            r4 = r28
            r2 = r29
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3191j.mo14245a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14255a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f11372l
            if (r4 == 0) goto L_0x0012
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r4 = r0.f11371k
            boolean r4 = r4.f11377c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f11364d
            r4.mo14259a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f11365e
            r4.mo14259a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f11366f
            r4.mo14259a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r4 = r0.f11371k
            boolean r5 = r4.f11385k
            if (r5 != 0) goto L_0x0029
            goto L_0x01cc
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f11381g
            int r6 = r5.length
            int r7 = r4.f11382h
            int r7 = r7 + r3
            r8 = 2
            if (r6 >= r7) goto L_0x003b
            int r7 = r7 * 2
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f11381g = r5
        L_0x003b:
            byte[] r5 = r4.f11381g
            int r6 = r4.f11382h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f11382h
            int r1 = r1 + r3
            r4.f11382h = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f11380f
            byte[] r3 = r4.f11381g
            r2.f12124a = r3
            r3 = 0
            r2.f12126c = r3
            r2.f12125b = r1
            r2.f12127d = r3
            r2.mo14564a()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f11380f
            r2 = 8
            boolean r1 = r1.mo14566a(r2)
            if (r1 != 0) goto L_0x0063
            goto L_0x01cc
        L_0x0063:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f11380f
            r1.mo14574f()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f11380f
            int r1 = r1.mo14567b(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f11380f
            r5 = 5
            r2.mo14572d(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f11380f
            boolean r2 = r2.mo14568b()
            if (r2 != 0) goto L_0x007e
            goto L_0x01cc
        L_0x007e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f11380f
            r2.mo14571d()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f11380f
            boolean r2 = r2.mo14568b()
            if (r2 != 0) goto L_0x008d
            goto L_0x01cc
        L_0x008d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f11380f
            int r2 = r2.mo14571d()
            boolean r6 = r4.f11377c
            r7 = 1
            if (r6 != 0) goto L_0x00a2
            r4.f11385k = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r4.f11388n
            r1.f11397e = r2
            r1.f11394b = r7
            goto L_0x01cc
        L_0x00a2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r6 = r4.f11380f
            boolean r6 = r6.mo14568b()
            if (r6 != 0) goto L_0x00ac
            goto L_0x01cc
        L_0x00ac:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r6 = r4.f11380f
            int r6 = r6.mo14571d()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r9 = r4.f11379e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00be
            r4.f11385k = r3
            goto L_0x01cc
        L_0x00be:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r9 = r4.f11379e
            java.lang.Object r9 = r9.get(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r9 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.C3390a) r9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r10 = r4.f11378d
            int r11 = r9.f12105b
            java.lang.Object r10 = r10.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.C3391b) r10
            boolean r11 = r10.f12111e
            if (r11 == 0) goto L_0x00e3
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f11380f
            boolean r11 = r11.mo14566a(r8)
            if (r11 != 0) goto L_0x00de
            goto L_0x01cc
        L_0x00de:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f11380f
            r11.mo14572d(r8)
        L_0x00e3:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r8 = r4.f11380f
            int r11 = r10.f12113g
            boolean r8 = r8.mo14566a(r11)
            if (r8 != 0) goto L_0x00ef
            goto L_0x01cc
        L_0x00ef:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r8 = r4.f11380f
            int r11 = r10.f12113g
            int r8 = r8.mo14567b(r11)
            boolean r11 = r10.f12112f
            if (r11 != 0) goto L_0x011f
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f11380f
            boolean r11 = r11.mo14566a(r7)
            if (r11 != 0) goto L_0x0105
            goto L_0x01cc
        L_0x0105:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f11380f
            boolean r11 = r11.mo14569c()
            if (r11 == 0) goto L_0x0120
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r12 = r4.f11380f
            boolean r12 = r12.mo14566a(r7)
            if (r12 != 0) goto L_0x0117
            goto L_0x01cc
        L_0x0117:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r12 = r4.f11380f
            boolean r12 = r12.mo14569c()
            r13 = 1
            goto L_0x0122
        L_0x011f:
            r11 = 0
        L_0x0120:
            r12 = 0
            r13 = 0
        L_0x0122:
            int r14 = r4.f11383i
            if (r14 != r5) goto L_0x0128
            r5 = 1
            goto L_0x0129
        L_0x0128:
            r5 = 0
        L_0x0129:
            if (r5 == 0) goto L_0x013c
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r14 = r4.f11380f
            boolean r14 = r14.mo14568b()
            if (r14 != 0) goto L_0x0135
            goto L_0x01cc
        L_0x0135:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r14 = r4.f11380f
            int r14 = r14.mo14571d()
            goto L_0x013d
        L_0x013c:
            r14 = 0
        L_0x013d:
            int r15 = r10.f12114h
            if (r15 != 0) goto L_0x016f
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r15 = r4.f11380f
            int r3 = r10.f12115i
            boolean r3 = r15.mo14566a(r3)
            if (r3 != 0) goto L_0x014d
            goto L_0x01cc
        L_0x014d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f11380f
            int r15 = r10.f12115i
            int r3 = r3.mo14567b(r15)
            boolean r9 = r9.f12106c
            if (r9 == 0) goto L_0x01a3
            if (r11 != 0) goto L_0x01a3
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f11380f
            boolean r9 = r9.mo14568b()
            if (r9 != 0) goto L_0x0165
            goto L_0x01cc
        L_0x0165:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f11380f
            int r9 = r9.mo14573e()
            r15 = r9
            r7 = 0
            r9 = 0
            goto L_0x01a6
        L_0x016f:
            if (r15 != r7) goto L_0x01a2
            boolean r3 = r10.f12116j
            if (r3 != 0) goto L_0x01a2
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f11380f
            boolean r3 = r3.mo14568b()
            if (r3 != 0) goto L_0x017e
            goto L_0x01cc
        L_0x017e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f11380f
            int r3 = r3.mo14573e()
            boolean r9 = r9.f12106c
            if (r9 == 0) goto L_0x019e
            if (r11 != 0) goto L_0x019e
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f11380f
            boolean r9 = r9.mo14568b()
            if (r9 != 0) goto L_0x0193
            goto L_0x01cc
        L_0x0193:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f11380f
            int r9 = r9.mo14573e()
            r7 = r9
            r15 = 0
            r9 = r3
            r3 = 0
            goto L_0x01a6
        L_0x019e:
            r9 = r3
            r3 = 0
            r7 = 0
            goto L_0x01a5
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            r7 = 0
            r9 = 0
        L_0x01a5:
            r15 = 0
        L_0x01a6:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r0 = r4.f11388n
            r0.f11395c = r10
            r0.f11396d = r1
            r0.f11397e = r2
            r0.f11398f = r8
            r0.f11399g = r6
            r0.f11400h = r11
            r0.f11401i = r13
            r0.f11402j = r12
            r0.f11403k = r5
            r0.f11404l = r14
            r0.f11405m = r3
            r0.f11406n = r15
            r0.f11407o = r9
            r0.f11408p = r7
            r1 = 1
            r0.f11393a = r1
            r0.f11394b = r1
            r0 = 0
            r4.f11385k = r0
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3191j.mo14255a(byte[], int, int):void");
    }
}
