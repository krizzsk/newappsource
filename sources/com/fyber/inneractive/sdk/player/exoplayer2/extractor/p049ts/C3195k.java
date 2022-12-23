package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k */
public final class C3195k implements C3188h {

    /* renamed from: a */
    public final C3205s f11409a;

    /* renamed from: b */
    public String f11410b;

    /* renamed from: c */
    public C3161n f11411c;

    /* renamed from: d */
    public C3196a f11412d;

    /* renamed from: e */
    public boolean f11413e;

    /* renamed from: f */
    public final boolean[] f11414f = new boolean[3];

    /* renamed from: g */
    public final C3199n f11415g = new C3199n(32, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: h */
    public final C3199n f11416h = new C3199n(33, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: i */
    public final C3199n f11417i = new C3199n(34, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: j */
    public final C3199n f11418j = new C3199n(39, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: k */
    public final C3199n f11419k = new C3199n(40, RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: l */
    public long f11420l;

    /* renamed from: m */
    public long f11421m;

    /* renamed from: n */
    public final C3393k f11422n = new C3393k();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k$a */
    public static final class C3196a {

        /* renamed from: a */
        public final C3161n f11423a;

        /* renamed from: b */
        public long f11424b;

        /* renamed from: c */
        public boolean f11425c;

        /* renamed from: d */
        public int f11426d;

        /* renamed from: e */
        public long f11427e;

        /* renamed from: f */
        public boolean f11428f;

        /* renamed from: g */
        public boolean f11429g;

        /* renamed from: h */
        public boolean f11430h;

        /* renamed from: i */
        public boolean f11431i;

        /* renamed from: j */
        public boolean f11432j;

        /* renamed from: k */
        public long f11433k;

        /* renamed from: l */
        public long f11434l;

        /* renamed from: m */
        public boolean f11435m;

        public C3196a(C3161n nVar) {
            this.f11423a = nVar;
        }
    }

    public C3195k(C3205s sVar) {
        this.f11409a = sVar;
    }

    /* renamed from: a */
    public void mo14242a() {
        C3389i.m8526a(this.f11414f);
        this.f11415g.mo14258a();
        this.f11416h.mo14258a();
        this.f11417i.mo14258a();
        this.f11418j.mo14258a();
        this.f11419k.mo14258a();
        C3196a aVar = this.f11412d;
        aVar.f11428f = false;
        aVar.f11429g = false;
        aVar.f11430h = false;
        aVar.f11431i = false;
        aVar.f11432j = false;
        this.f11420l = 0;
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11410b = dVar.mo14272b();
        C3161n a = hVar.mo14122a(dVar.mo14273c(), 2);
        this.f11411c = a;
        this.f11412d = new C3196a(a);
        this.f11409a.mo14269a(hVar, dVar);
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        this.f11421m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14245a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r39) {
        /*
            r38 = this;
            r0 = r38
        L_0x0002:
            r1 = r39
            int r2 = r39.mo14537a()
            if (r2 <= 0) goto L_0x03d8
            int r2 = r1.f12122b
            int r3 = r1.f12123c
            byte[] r4 = r1.f12121a
            long r5 = r0.f11420l
            int r7 = r39.mo14537a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f11420l = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f11411c
            int r6 = r39.mo14537a()
            r5.mo14099a(r1, r6)
        L_0x0023:
            if (r2 >= r3) goto L_0x0002
            boolean[] r5 = r0.f11414f
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8524a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0031
            r0.mo14257a(r4, r2, r3)
            return
        L_0x0031:
            int r6 = r5 + 3
            byte r7 = r4[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r5 - r2
            if (r9 <= 0) goto L_0x0040
            r0.mo14257a(r4, r2, r5)
        L_0x0040:
            int r15 = r3 - r5
            long r10 = r0.f11420l
            long r12 = (long) r15
            long r10 = r10 - r12
            r2 = 0
            if (r9 >= 0) goto L_0x004b
            int r5 = -r9
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            long r12 = r0.f11421m
            boolean r9 = r0.f11413e
            if (r9 == 0) goto L_0x00b5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k$a r9 = r0.f11412d
            boolean r14 = r9.f11432j
            if (r14 == 0) goto L_0x0063
            boolean r14 = r9.f11429g
            if (r14 == 0) goto L_0x0063
            boolean r14 = r9.f11425c
            r9.f11435m = r14
            r9.f11432j = r2
            goto L_0x006c
        L_0x0063:
            boolean r14 = r9.f11430h
            if (r14 != 0) goto L_0x0078
            boolean r14 = r9.f11429g
            if (r14 == 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            r17 = r3
            r18 = r4
            r19 = r6
            r20 = r7
            r25 = r15
            goto L_0x02fa
        L_0x0078:
            boolean r14 = r9.f11431i
            r17 = r3
            if (r14 == 0) goto L_0x00a1
            long r2 = r9.f11424b
            r14 = r9
            long r8 = r10 - r2
            int r9 = (int) r8
            int r23 = r15 + r9
            r8 = r14
            boolean r9 = r8.f11435m
            r25 = r15
            long r14 = r8.f11433k
            long r2 = r2 - r14
            int r3 = (int) r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r8.f11423a
            long r14 = r8.f11434l
            r24 = 0
            r18 = r2
            r19 = r14
            r21 = r9
            r22 = r3
            r18.mo14096a(r19, r21, r22, r23, r24)
            goto L_0x00a4
        L_0x00a1:
            r8 = r9
            r25 = r15
        L_0x00a4:
            long r2 = r8.f11424b
            r8.f11433k = r2
            long r2 = r8.f11427e
            r8.f11434l = r2
            r2 = 1
            r8.f11431i = r2
            boolean r2 = r8.f11425c
            r8.f11435m = r2
            goto L_0x02f4
        L_0x00b5:
            r17 = r3
            r25 = r15
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11415g
            r2.mo14260a(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11416h
            r2.mo14260a(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11417i
            r2.mo14260a(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f11415g
            boolean r3 = r2.f11456c
            if (r3 == 0) goto L_0x02f4
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f11416h
            boolean r8 = r3.f11456c
            if (r8 == 0) goto L_0x02f4
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r8 = r0.f11417i
            boolean r9 = r8.f11456c
            if (r9 == 0) goto L_0x02f4
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f11411c
            java.lang.String r14 = r0.f11410b
            int r15 = r2.f11458e
            int r1 = r3.f11458e
            int r1 = r1 + r15
            r18 = r4
            int r4 = r8.f11458e
            int r1 = r1 + r4
            byte[] r1 = new byte[r1]
            byte[] r4 = r2.f11457d
            r19 = r6
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r1, r6, r15)
            byte[] r4 = r3.f11457d
            int r15 = r2.f11458e
            r20 = r7
            int r7 = r3.f11458e
            java.lang.System.arraycopy(r4, r6, r1, r15, r7)
            byte[] r4 = r8.f11457d
            int r2 = r2.f11458e
            int r7 = r3.f11458e
            int r2 = r2 + r7
            int r7 = r8.f11458e
            java.lang.System.arraycopy(r4, r6, r1, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.l
            byte[] r4 = r3.f11457d
            int r3 = r3.f11458e
            r2.<init>(r4, r6, r3)
            r3 = 44
            r2.mo14572d(r3)
            r3 = 3
            int r4 = r2.mo14567b(r3)
            r2.mo14574f()
            r6 = 88
            r2.mo14572d(r6)
            r6 = 8
            r2.mo14572d(r6)
            r7 = 0
            r8 = 0
        L_0x012b:
            if (r7 >= r4) goto L_0x0140
            boolean r15 = r2.mo14569c()
            if (r15 == 0) goto L_0x0135
            int r8 = r8 + 89
        L_0x0135:
            boolean r15 = r2.mo14569c()
            if (r15 == 0) goto L_0x013d
            int r8 = r8 + 8
        L_0x013d:
            int r7 = r7 + 1
            goto L_0x012b
        L_0x0140:
            r2.mo14572d(r8)
            r7 = 2
            if (r4 <= 0) goto L_0x014d
            int r8 = 8 - r4
            int r8 = r8 * 2
            r2.mo14572d(r8)
        L_0x014d:
            r2.mo14571d()
            int r8 = r2.mo14571d()
            if (r8 != r3) goto L_0x0159
            r2.mo14574f()
        L_0x0159:
            int r15 = r2.mo14571d()
            int r21 = r2.mo14571d()
            boolean r22 = r2.mo14569c()
            if (r22 == 0) goto L_0x0193
            int r22 = r2.mo14571d()
            int r23 = r2.mo14571d()
            int r24 = r2.mo14571d()
            int r26 = r2.mo14571d()
            r6 = 1
            if (r8 == r6) goto L_0x0180
            if (r8 != r7) goto L_0x017d
            goto L_0x0180
        L_0x017d:
            r28 = 1
            goto L_0x0182
        L_0x0180:
            r28 = 2
        L_0x0182:
            if (r8 != r6) goto L_0x0186
            r6 = 2
            goto L_0x0187
        L_0x0186:
            r6 = 1
        L_0x0187:
            int r22 = r22 + r23
            int r22 = r22 * r28
            int r15 = r15 - r22
            int r24 = r24 + r26
            int r24 = r24 * r6
            int r21 = r21 - r24
        L_0x0193:
            r31 = r15
            r32 = r21
            r2.mo14571d()
            r2.mo14571d()
            int r6 = r2.mo14571d()
            boolean r8 = r2.mo14569c()
            if (r8 == 0) goto L_0x01a9
            r8 = 0
            goto L_0x01aa
        L_0x01a9:
            r8 = r4
        L_0x01aa:
            if (r8 > r4) goto L_0x01b8
            r2.mo14571d()
            r2.mo14571d()
            r2.mo14571d()
            int r8 = r8 + 1
            goto L_0x01aa
        L_0x01b8:
            r2.mo14571d()
            r2.mo14571d()
            r2.mo14571d()
            r2.mo14571d()
            r2.mo14571d()
            r2.mo14571d()
            boolean r4 = r2.mo14569c()
            r8 = 4
            if (r4 == 0) goto L_0x0210
            boolean r4 = r2.mo14569c()
            if (r4 == 0) goto L_0x0210
            r4 = 0
        L_0x01d8:
            if (r4 >= r8) goto L_0x0210
            r15 = 0
        L_0x01db:
            r7 = 6
            if (r15 >= r7) goto L_0x020b
            boolean r7 = r2.mo14569c()
            if (r7 != 0) goto L_0x01e8
            r2.mo14571d()
            goto L_0x0203
        L_0x01e8:
            int r7 = r4 << 1
            int r7 = r7 + r8
            r8 = 1
            int r7 = r8 << r7
            r3 = 64
            int r3 = java.lang.Math.min(r3, r7)
            if (r4 <= r8) goto L_0x01f9
            r2.mo14573e()
        L_0x01f9:
            r7 = 0
        L_0x01fa:
            if (r7 >= r3) goto L_0x0202
            r2.mo14573e()
            int r7 = r7 + 1
            goto L_0x01fa
        L_0x0202:
            r3 = 3
        L_0x0203:
            if (r4 != r3) goto L_0x0207
            r7 = 3
            goto L_0x0208
        L_0x0207:
            r7 = 1
        L_0x0208:
            int r15 = r15 + r7
            r8 = 4
            goto L_0x01db
        L_0x020b:
            int r4 = r4 + 1
            r7 = 2
            r8 = 4
            goto L_0x01d8
        L_0x0210:
            r3 = 2
            r2.mo14572d(r3)
            boolean r3 = r2.mo14569c()
            if (r3 == 0) goto L_0x0228
            r3 = 8
            r2.mo14572d(r3)
            r2.mo14571d()
            r2.mo14571d()
            r2.mo14574f()
        L_0x0228:
            int r3 = r2.mo14571d()
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x022f:
            if (r4 >= r3) goto L_0x027c
            if (r4 == 0) goto L_0x0237
            boolean r7 = r2.mo14569c()
        L_0x0237:
            if (r7 == 0) goto L_0x0251
            r2.mo14574f()
            r2.mo14571d()
            r15 = 0
        L_0x0240:
            if (r15 > r8) goto L_0x024e
            boolean r23 = r2.mo14569c()
            if (r23 == 0) goto L_0x024b
            r2.mo14574f()
        L_0x024b:
            int r15 = r15 + 1
            goto L_0x0240
        L_0x024e:
            r24 = r3
            goto L_0x0277
        L_0x0251:
            int r8 = r2.mo14571d()
            int r15 = r2.mo14571d()
            int r23 = r8 + r15
            r24 = r3
            r3 = 0
        L_0x025e:
            if (r3 >= r8) goto L_0x0269
            r2.mo14571d()
            r2.mo14574f()
            int r3 = r3 + 1
            goto L_0x025e
        L_0x0269:
            r3 = 0
        L_0x026a:
            if (r3 >= r15) goto L_0x0275
            r2.mo14571d()
            r2.mo14574f()
            int r3 = r3 + 1
            goto L_0x026a
        L_0x0275:
            r8 = r23
        L_0x0277:
            int r4 = r4 + 1
            r3 = r24
            goto L_0x022f
        L_0x027c:
            boolean r3 = r2.mo14569c()
            if (r3 == 0) goto L_0x0294
            r3 = 0
        L_0x0283:
            int r4 = r2.mo14571d()
            if (r3 >= r4) goto L_0x0294
            r4 = 4
            int r8 = r6 + 4
            r7 = 1
            int r8 = r8 + r7
            r2.mo14572d(r8)
            int r3 = r3 + 1
            goto L_0x0283
        L_0x0294:
            r3 = 2
            r2.mo14572d(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            boolean r4 = r2.mo14569c()
            if (r4 == 0) goto L_0x02d0
            boolean r4 = r2.mo14569c()
            if (r4 == 0) goto L_0x02d0
            r4 = 8
            int r4 = r2.mo14567b(r4)
            r6 = 255(0xff, float:3.57E-43)
            if (r4 != r6) goto L_0x02c4
            r6 = 16
            int r4 = r2.mo14567b(r6)
            int r2 = r2.mo14567b(r6)
            if (r4 == 0) goto L_0x02d2
            if (r2 == 0) goto L_0x02d2
            float r3 = (float) r4
            float r2 = (float) r2
            float r3 = r3 / r2
            r36 = r3
            goto L_0x02d4
        L_0x02c4:
            r6 = 16
            float[] r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.f12101b
            int r7 = r2.length
            if (r4 >= r7) goto L_0x02d2
            r2 = r2[r4]
            r36 = r2
            goto L_0x02d4
        L_0x02d0:
            r6 = 16
        L_0x02d2:
            r36 = 1065353216(0x3f800000, float:1.0)
        L_0x02d4:
            java.util.List r34 = java.util.Collections.singletonList(r1)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r35 = -1
            r37 = 0
            java.lang.String r27 = "video/hevc"
            r26 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8175a((java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29, (int) r30, (int) r31, (int) r32, (float) r33, (java.util.List<byte[]>) r34, (int) r35, (float) r36, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r37)
            r9.mo14098a(r1)
            r1 = 1
            r0.f11413e = r1
            goto L_0x02fc
        L_0x02f4:
            r18 = r4
            r19 = r6
            r20 = r7
        L_0x02fa:
            r6 = 16
        L_0x02fc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11418j
            boolean r1 = r1.mo14260a(r5)
            r2 = 5
            if (r1 == 0) goto L_0x0326
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11418j
            byte[] r3 = r1.f11457d
            int r1 = r1.f11458e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8523a(r3, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11422n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f11418j
            byte[] r4 = r4.f11457d
            r3.mo14540a((byte[]) r4, (int) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f11422n
            r1.mo14551f(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r1 = r0.f11409a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11422n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r1 = r1.f11492b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C3308a.m8356a(r12, r3, r1)
        L_0x0326:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11419k
            boolean r1 = r1.mo14260a(r5)
            if (r1 == 0) goto L_0x034f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11419k
            byte[] r3 = r1.f11457d
            int r1 = r1.f11458e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8523a(r3, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11422n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f11419k
            byte[] r4 = r4.f11457d
            r3.mo14540a((byte[]) r4, (int) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f11422n
            r1.mo14551f(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r1 = r0.f11409a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11422n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r1 = r1.f11492b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C3308a.m8356a(r12, r2, r1)
        L_0x034f:
            long r1 = r0.f11421m
            boolean r3 = r0.f11413e
            if (r3 == 0) goto L_0x03b3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k$a r3 = r0.f11412d
            r4 = 0
            r3.f11429g = r4
            r3.f11430h = r4
            r3.f11427e = r1
            r3.f11426d = r4
            r3.f11424b = r10
            r1 = 32
            r2 = r20
            if (r2 < r1) goto L_0x0397
            boolean r1 = r3.f11432j
            if (r1 != 0) goto L_0x0387
            boolean r1 = r3.f11431i
            if (r1 == 0) goto L_0x0387
            boolean r13 = r3.f11435m
            long r4 = r3.f11433k
            long r10 = r10 - r4
            int r14 = (int) r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r10 = r3.f11423a
            long r11 = r3.f11434l
            r16 = 0
            r1 = 16
            r15 = r25
            r10.mo14096a(r11, r13, r14, r15, r16)
            r4 = 0
            r3.f11431i = r4
            goto L_0x038a
        L_0x0387:
            r1 = 16
            r4 = 0
        L_0x038a:
            r5 = 34
            if (r2 > r5) goto L_0x039a
            boolean r5 = r3.f11432j
            r6 = 1
            r5 = r5 ^ r6
            r3.f11430h = r5
            r3.f11432j = r6
            goto L_0x039b
        L_0x0397:
            r1 = 16
            r4 = 0
        L_0x039a:
            r6 = 1
        L_0x039b:
            if (r2 < r1) goto L_0x03a3
            r1 = 21
            if (r2 > r1) goto L_0x03a3
            r1 = 1
            goto L_0x03a4
        L_0x03a3:
            r1 = 0
        L_0x03a4:
            r3.f11425c = r1
            if (r1 != 0) goto L_0x03af
            r1 = 9
            if (r2 > r1) goto L_0x03ad
            goto L_0x03af
        L_0x03ad:
            r8 = 0
            goto L_0x03b0
        L_0x03af:
            r8 = 1
        L_0x03b0:
            r3.f11428f = r8
            goto L_0x03c4
        L_0x03b3:
            r2 = r20
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11415g
            r1.mo14261b(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11416h
            r1.mo14261b(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11417i
            r1.mo14261b(r2)
        L_0x03c4:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11418j
            r1.mo14261b(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f11419k
            r1.mo14261b(r2)
            r1 = r39
            r3 = r17
            r4 = r18
            r2 = r19
            goto L_0x0023
        L_0x03d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3195k.mo14245a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* renamed from: a */
    public final void mo14257a(byte[] bArr, int i, int i2) {
        if (this.f11413e) {
            C3196a aVar = this.f11412d;
            if (aVar.f11428f) {
                int i3 = aVar.f11426d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    aVar.f11429g = (bArr[i4] & 128) != 0;
                    aVar.f11428f = false;
                } else {
                    aVar.f11426d = (i2 - i) + i3;
                }
            }
        } else {
            this.f11415g.mo14259a(bArr, i, i2);
            this.f11416h.mo14259a(bArr, i, i2);
            this.f11417i.mo14259a(bArr, i, i2);
        }
        this.f11418j.mo14259a(bArr, i, i2);
        this.f11419k.mo14259a(bArr, i, i2);
    }
}
