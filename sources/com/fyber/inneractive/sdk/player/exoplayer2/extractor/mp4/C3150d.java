package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d */
public final class C3150d implements C3080f {

    /* renamed from: D */
    public static final int f11084D = C3406u.m8589a("seig");

    /* renamed from: E */
    public static final byte[] f11085E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    public C3161n f11086A;

    /* renamed from: B */
    public C3161n[] f11087B;

    /* renamed from: C */
    public boolean f11088C;

    /* renamed from: a */
    public final int f11089a;

    /* renamed from: b */
    public final SparseArray<C3152b> f11090b;

    /* renamed from: c */
    public final C3393k f11091c;

    /* renamed from: d */
    public final C3393k f11092d;

    /* renamed from: e */
    public final C3393k f11093e;

    /* renamed from: f */
    public final C3393k f11094f;

    /* renamed from: g */
    public final C3403r f11095g;

    /* renamed from: h */
    public final C3393k f11096h;

    /* renamed from: i */
    public final byte[] f11097i;

    /* renamed from: j */
    public final Stack<C3141a.C3142a> f11098j;

    /* renamed from: k */
    public final LinkedList<C3151a> f11099k;

    /* renamed from: l */
    public int f11100l;

    /* renamed from: m */
    public int f11101m;

    /* renamed from: n */
    public long f11102n;

    /* renamed from: o */
    public int f11103o;

    /* renamed from: p */
    public C3393k f11104p;

    /* renamed from: q */
    public long f11105q;

    /* renamed from: r */
    public int f11106r;

    /* renamed from: s */
    public long f11107s;

    /* renamed from: t */
    public long f11108t;

    /* renamed from: u */
    public C3152b f11109u;

    /* renamed from: v */
    public int f11110v;

    /* renamed from: w */
    public int f11111w;

    /* renamed from: x */
    public int f11112x;

    /* renamed from: y */
    public boolean f11113y;

    /* renamed from: z */
    public C3088h f11114z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a */
    public static final class C3151a {

        /* renamed from: a */
        public final long f11115a;

        /* renamed from: b */
        public final int f11116b;

        public C3151a(long j, int i) {
            this.f11115a = j;
            this.f11116b = i;
        }
    }

    public C3150d(int i, C3403r rVar) {
        this(i, (C3403r) null, (C3157h) null);
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        return C3156g.m7948a(gVar, true);
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: c */
    public final void mo14217c() {
        if ((this.f11089a & 4) != 0 && this.f11086A == null) {
            C3161n a = this.f11114z.mo14122a(this.f11090b.size(), 4);
            this.f11086A = a;
            a.mo14098a(C3226i.m8174a((String) null, "application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f11089a & 8) != 0 && this.f11087B == null) {
            C3161n a2 = this.f11114z.mo14122a(this.f11090b.size() + 1, 3);
            a2.mo14098a(C3226i.m8180a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (C3059a) null));
            this.f11087B = new C3161n[]{a2};
        }
    }

    public C3150d(int i, C3403r rVar, C3157h hVar) {
        this.f11089a = i | 0;
        this.f11095g = rVar;
        this.f11096h = new C3393k(16);
        this.f11091c = new C3393k(C3389i.f12100a);
        this.f11092d = new C3393k(5);
        this.f11093e = new C3393k();
        this.f11094f = new C3393k(1);
        this.f11097i = new byte[16];
        this.f11098j = new Stack<>();
        this.f11099k = new LinkedList<>();
        this.f11090b = new SparseArray<>();
        this.f11107s = -9223372036854775807L;
        this.f11108t = -9223372036854775807L;
        mo14215a();
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f11114z = hVar;
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        int size = this.f11090b.size();
        for (int i = 0; i < size; i++) {
            this.f11090b.valueAt(i).mo14218a();
        }
        this.f11099k.clear();
        this.f11106r = 0;
        this.f11098j.clear();
        mo14215a();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b */
    public static final class C3152b {

        /* renamed from: a */
        public final C3159j f11117a = new C3159j();

        /* renamed from: b */
        public final C3161n f11118b;

        /* renamed from: c */
        public C3157h f11119c;

        /* renamed from: d */
        public C3149c f11120d;

        /* renamed from: e */
        public int f11121e;

        /* renamed from: f */
        public int f11122f;

        /* renamed from: g */
        public int f11123g;

        public C3152b(C3161n nVar) {
            this.f11118b = nVar;
        }

        /* renamed from: a */
        public void mo14219a(C3157h hVar, C3149c cVar) {
            hVar.getClass();
            this.f11119c = hVar;
            cVar.getClass();
            this.f11120d = cVar;
            this.f11118b.mo14098a(hVar.f11180f);
            mo14218a();
        }

        /* renamed from: a */
        public void mo14218a() {
            C3159j jVar = this.f11117a;
            jVar.f11191d = 0;
            jVar.f11205r = 0;
            jVar.f11199l = false;
            jVar.f11204q = false;
            jVar.f11201n = null;
            this.f11121e = 0;
            this.f11123g = 0;
            this.f11122f = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:260:0x0287 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r26, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
        L_0x0004:
            int r2 = r0.f11100l
            r3 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x043e
            if (r2 == r6) goto L_0x02e1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x0288
            r12 = 6
            if (r2 != r11) goto L_0x00f6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f11109u
            if (r2 != 0) goto L_0x007a
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f11090b
            int r13 = r2.size()
            r14 = 0
            r15 = 0
        L_0x0024:
            if (r14 >= r13) goto L_0x0045
            java.lang.Object r16 = r2.valueAt(r14)
            r11 = r16
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r11 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r11
            int r4 = r11.f11123g
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r8 = r11.f11117a
            int r5 = r8.f11191d
            if (r4 != r5) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            long[] r5 = r8.f11193f
            r4 = r5[r4]
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0041
            r9 = r4
            r15 = r11
        L_0x0041:
            int r14 = r14 + 1
            r11 = 3
            goto L_0x0024
        L_0x0045:
            if (r15 != 0) goto L_0x0063
            long r2 = r0.f11105q
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r4
            long r5 = r4.f10548c
            long r2 = r2 - r5
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005b
            r4.mo14088c(r3)
            r25.mo14215a()
            r6 = 0
            goto L_0x0285
        L_0x005b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0063:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r2 = r15.f11117a
            long[] r2 = r2.f11193f
            int r4 = r15.f11123g
            r4 = r2[r4]
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            long r8 = r2.f10548c
            long r4 = r4 - r8
            int r5 = (int) r4
            if (r5 >= 0) goto L_0x0075
            r5 = 0
        L_0x0075:
            r2.mo14088c(r5)
            r0.f11109u = r15
        L_0x007a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f11109u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r4 = r2.f11117a
            int[] r5 = r4.f11195h
            int r8 = r2.f11121e
            r5 = r5[r8]
            r0.f11110v = r5
            boolean r5 = r4.f11199l
            if (r5 == 0) goto L_0x00da
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r4.f11203p
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r9 = r4.f11188a
            int r9 = r9.f11080a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r10 = r4.f11201n
            if (r10 == 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r10 = r2.f11119c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r10 = r10.f11182h
            r10 = r10[r9]
        L_0x009b:
            int r9 = r10.f11186a
            boolean[] r4 = r4.f11200m
            boolean r4 = r4[r8]
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11094f
            byte[] r10 = r8.f12121a
            if (r4 == 0) goto L_0x00aa
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00ab
        L_0x00aa:
            r11 = 0
        L_0x00ab:
            r11 = r11 | r9
            byte r11 = (byte) r11
            r10[r7] = r11
            r8.mo14549e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r2.f11118b
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11094f
            r2.mo14099a(r8, r6)
            r2.mo14099a(r5, r9)
            if (r4 != 0) goto L_0x00c1
            int r9 = r9 + 1
            goto L_0x00d2
        L_0x00c1:
            int r4 = r5.mo14562q()
            r8 = -2
            r5.mo14551f(r8)
            int r4 = r4 * 6
            int r4 = r4 + r3
            r2.mo14099a(r5, r4)
            int r9 = r9 + 1
            int r9 = r9 + r4
        L_0x00d2:
            r0.f11111w = r9
            int r2 = r0.f11110v
            int r2 = r2 + r9
            r0.f11110v = r2
            goto L_0x00dc
        L_0x00da:
            r0.f11111w = r7
        L_0x00dc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f11109u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = r2.f11119c
            int r2 = r2.f11181g
            if (r2 != r6) goto L_0x00f1
            int r2 = r0.f11110v
            r4 = 8
            int r2 = r2 - r4
            r0.f11110v = r2
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            r2.mo14088c(r4)
        L_0x00f1:
            r2 = 4
            r0.f11100l = r2
            r0.f11112x = r7
        L_0x00f6:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f11109u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r4 = r2.f11117a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r5 = r2.f11119c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r8 = r2.f11118b
            int r2 = r2.f11121e
            int r9 = r5.f11185k
            if (r9 == 0) goto L_0x01e0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r13 = r0.f11092d
            byte[] r13 = r13.f12121a
            r13[r7] = r7
            r13[r6] = r7
            r13[r3] = r7
            int r3 = r9 + 1
            int r9 = 4 - r9
        L_0x0112:
            int r14 = r0.f11111w
            int r15 = r0.f11110v
            if (r14 >= r15) goto L_0x01f1
            int r14 = r0.f11112x
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x017f
            r14 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r14
            r14.mo14087b(r13, r9, r3, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f11092d
            r14.mo14549e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f11092d
            int r14 = r14.mo14560o()
            int r14 = r14 - r6
            r0.f11112x = r14
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f11091c
            r14.mo14549e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f11091c
            r10 = 4
            r8.mo14099a(r14, r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f11092d
            r8.mo14099a(r11, r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r11 = r0.f11087B
            if (r11 == 0) goto L_0x0170
            com.fyber.inneractive.sdk.player.exoplayer2.i r11 = r5.f11180f
            java.lang.String r11 = r11.f11633f
            byte r14 = r13[r10]
            byte[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.f12100a
            java.lang.String r10 = "video/avc"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x015c
            r10 = r14 & 31
            if (r10 == r12) goto L_0x0169
        L_0x015c:
            boolean r10 = r15.equals(r11)
            if (r10 == 0) goto L_0x016b
            r10 = r14 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r6
            r11 = 39
            if (r10 != r11) goto L_0x016b
        L_0x0169:
            r10 = 1
            goto L_0x016c
        L_0x016b:
            r10 = 0
        L_0x016c:
            if (r10 == 0) goto L_0x0170
            r10 = 1
            goto L_0x0171
        L_0x0170:
            r10 = 0
        L_0x0171:
            r0.f11113y = r10
            int r10 = r0.f11111w
            int r10 = r10 + 5
            r0.f11111w = r10
            int r10 = r0.f11110v
            int r10 = r10 + r9
            r0.f11110v = r10
            goto L_0x0112
        L_0x017f:
            boolean r10 = r0.f11113y
            if (r10 == 0) goto L_0x01cf
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f11093e
            r10.mo14545c(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f11093e
            byte[] r10 = r10.f12121a
            int r11 = r0.f11112x
            r14 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r14
            r14.mo14087b(r10, r7, r11, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f11093e
            int r11 = r0.f11112x
            r8.mo14099a(r10, r11)
            int r10 = r0.f11112x
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f11093e
            byte[] r14 = r11.f12121a
            int r11 = r11.f12123c
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8523a(r14, r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f11093e
            com.fyber.inneractive.sdk.player.exoplayer2.i r12 = r5.f11180f
            java.lang.String r12 = r12.f11633f
            boolean r12 = r15.equals(r12)
            r14.mo14549e(r12)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r12 = r0.f11093e
            r12.mo14547d(r11)
            long[] r11 = r4.f11197j
            r14 = r11[r2]
            int[] r11 = r4.f11196i
            r11 = r11[r2]
            long r11 = (long) r11
            long r14 = r14 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f11093e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r12 = r0.f11087B
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C3308a.m8356a(r14, r11, r12)
            goto L_0x01d3
        L_0x01cf:
            int r10 = r8.mo14092a(r1, r14, r7)
        L_0x01d3:
            int r11 = r0.f11111w
            int r11 = r11 + r10
            r0.f11111w = r11
            int r11 = r0.f11112x
            int r11 = r11 - r10
            r0.f11112x = r11
            r12 = 6
            goto L_0x0112
        L_0x01e0:
            int r3 = r0.f11111w
            int r9 = r0.f11110v
            if (r3 >= r9) goto L_0x01f1
            int r9 = r9 - r3
            int r3 = r8.mo14092a(r1, r9, r7)
            int r9 = r0.f11111w
            int r9 = r9 + r3
            r0.f11111w = r9
            goto L_0x01e0
        L_0x01f1:
            long[] r3 = r4.f11197j
            r9 = r3[r2]
            int[] r3 = r4.f11196i
            r3 = r3[r2]
            long r11 = (long) r3
            long r9 = r9 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            boolean r3 = r4.f11199l
            if (r3 == 0) goto L_0x0206
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0207
        L_0x0206:
            r11 = 0
        L_0x0207:
            boolean[] r12 = r4.f11198k
            boolean r2 = r12[r2]
            r21 = r11 | r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r2 = r4.f11188a
            int r2 = r2.f11080a
            if (r3 == 0) goto L_0x0223
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r3 = r4.f11201n
            if (r3 == 0) goto L_0x021a
            byte[] r2 = r3.f11187b
            goto L_0x0220
        L_0x021a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r3 = r5.f11182h
            r2 = r3[r2]
            byte[] r2 = r2.f11187b
        L_0x0220:
            r24 = r2
            goto L_0x0225
        L_0x0223:
            r24 = 0
        L_0x0225:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r2 = r0.f11095g
            if (r2 == 0) goto L_0x022d
            long r9 = r2.mo14583a(r9)
        L_0x022d:
            int r2 = r0.f11110v
            r23 = 0
            r18 = r8
            r19 = r9
            r22 = r2
            r18.mo14096a(r19, r21, r22, r23, r24)
        L_0x023a:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f11099k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0265
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f11099k
            java.lang.Object r2 = r2.removeFirst()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3151a) r2
            int r3 = r0.f11106r
            int r5 = r2.f11116b
            int r3 = r3 - r5
            r0.f11106r = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r8 = r0.f11086A
            long r11 = r2.f11115a
            long r18 = r9 + r11
            r20 = 1
            r23 = 0
            r17 = r8
            r21 = r5
            r22 = r3
            r17.mo14096a(r18, r20, r21, r22, r23)
            goto L_0x023a
        L_0x0265:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f11109u
            int r3 = r2.f11121e
            int r3 = r3 + r6
            r2.f11121e = r3
            int r3 = r2.f11122f
            int r3 = r3 + r6
            r2.f11122f = r3
            int[] r4 = r4.f11194g
            int r5 = r2.f11123g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x0282
            int r5 = r5 + 1
            r2.f11123g = r5
            r2.f11122f = r7
            r2 = 0
            r0.f11109u = r2
        L_0x0282:
            r2 = 3
            r0.f11100l = r2
        L_0x0285:
            if (r6 == 0) goto L_0x0004
            return r7
        L_0x0288:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f11090b
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x0290:
            if (r3 >= r2) goto L_0x02b2
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f11090b
            java.lang.Object r5 = r5.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r5 = r5.f11117a
            boolean r6 = r5.f11204q
            if (r6 == 0) goto L_0x02af
            long r5 = r5.f11190c
            int r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02af
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r4 = r0.f11090b
            java.lang.Object r4 = r4.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r4
            r9 = r5
        L_0x02af:
            int r3 = r3 + 1
            goto L_0x0290
        L_0x02b2:
            if (r4 != 0) goto L_0x02b9
            r2 = 3
            r0.f11100l = r2
            goto L_0x0004
        L_0x02b9:
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            long r5 = r2.f10548c
            long r9 = r9 - r5
            int r3 = (int) r9
            if (r3 < 0) goto L_0x02d9
            r2.mo14088c(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r3 = r4.f11117a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r3.f11203p
            byte[] r4 = r4.f12121a
            int r5 = r3.f11202o
            r2.mo14087b(r4, r7, r5, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r3.f11203p
            r2.mo14549e(r7)
            r3.f11204q = r7
            goto L_0x0004
        L_0x02d9:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02e1:
            long r4 = r0.f11102n
            int r2 = (int) r4
            int r4 = r0.f11103o
            int r2 = r2 - r4
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f11104p
            if (r4 == 0) goto L_0x042e
            byte[] r4 = r4.f12121a
            r5 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r5
            r8 = 8
            r5.mo14087b(r4, r8, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b
            int r4 = r0.f11101m
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11104p
            r2.<init>(r4, r8)
            long r9 = r5.f10548c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r5 = r0.f11098j
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0317
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f11098j
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r3
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r3.f11057Q0
            r3.add(r2)
            goto L_0x0434
        L_0x0317:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10965B
            if (r4 != r2) goto L_0x03d9
            r2 = 8
            r8.mo14549e(r2)
            int r2 = r8.mo14544c()
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r2)
            r4 = 4
            r8.mo14551f(r4)
            long r4 = r8.mo14558m()
            if (r2 != 0) goto L_0x033b
            long r11 = r8.mo14558m()
            long r13 = r8.mo14558m()
            goto L_0x0343
        L_0x033b:
            long r11 = r8.mo14561p()
            long r13 = r8.mo14561p()
        L_0x0343:
            long r13 = r13 + r9
            r9 = r11
            r18 = r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r9
            r15 = r4
            long r20 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r11, (long) r13, (long) r15)
            r8.mo14551f(r3)
            int r2 = r8.mo14562q()
            int[] r3 = new int[r2]
            long[] r15 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r11 = r20
        L_0x0361:
            if (r7 >= r2) goto L_0x03b2
            int r16 = r8.mo14544c()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r16 & r22
            if (r22 != 0) goto L_0x03aa
            long r22 = r8.mo14558m()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r24
            r3[r7] = r16
            r15[r7] = r18
            r14[r7] = r11
            long r9 = r9 + r22
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r9
            r24 = r2
            r6 = r13
            r2 = r14
            r13 = r22
            r22 = r9
            r9 = r15
            r15 = r4
            long r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r11, (long) r13, (long) r15)
            r13 = r2[r7]
            long r13 = r11 - r13
            r6[r7] = r13
            r10 = 4
            r8.mo14551f(r10)
            r13 = r3[r7]
            long r13 = (long) r13
            long r18 = r18 + r13
            int r7 = r7 + 1
            r14 = r2
            r13 = r6
            r15 = r9
            r9 = r22
            r2 = r24
            r6 = 1
            goto L_0x0361
        L_0x03aa:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03b2:
            r6 = r13
            r2 = r14
            r9 = r15
            java.lang.Long r4 = java.lang.Long.valueOf(r20)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a
            r5.<init>(r3, r9, r6, r2)
            android.util.Pair r2 = android.util.Pair.create(r4, r5)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.f11108t = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r3 = r0.f11114z
            java.lang.Object r2 = r2.second
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m) r2
            r3.mo14123a(r2)
            r2 = 1
            r0.f11088C = r2
            goto L_0x0434
        L_0x03d9:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10976G0
            if (r4 != r2) goto L_0x0434
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r0.f11086A
            if (r2 != 0) goto L_0x03e2
            goto L_0x0434
        L_0x03e2:
            r2 = 12
            r8.mo14549e(r2)
            r8.mo14555j()
            r8.mo14555j()
            long r13 = r8.mo14558m()
            long r9 = r8.mo14558m()
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r9, (long) r11, (long) r13)
            r8.mo14549e(r2)
            int r13 = r8.mo14537a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r0.f11086A
            r2.mo14099a(r8, r13)
            long r5 = r0.f11108t
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x041e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f11086A
            long r10 = r5 + r3
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo14096a(r10, r12, r13, r14, r15)
            goto L_0x0434
        L_0x041e:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f11099k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a
            r5.<init>(r3, r13)
            r2.addLast(r5)
            int r2 = r0.f11106r
            int r2 = r2 + r13
            r0.f11106r = r2
            goto L_0x0434
        L_0x042e:
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r3
            r3.mo14088c(r2)
        L_0x0434:
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            long r2 = r2.f10548c
            r0.mo14216a((long) r2)
            goto L_0x0004
        L_0x043e:
            int r2 = r0.f11103o
            if (r2 != 0) goto L_0x046c
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11096h
            byte[] r2 = r2.f12121a
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r4
            r5 = 8
            r6 = 1
            boolean r2 = r4.mo14087b(r2, r7, r5, r6)
            if (r2 != 0) goto L_0x0455
            r6 = 0
            goto L_0x05ce
        L_0x0455:
            r0.f11103o = r5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11096h
            r2.mo14549e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11096h
            long r4 = r2.mo14558m()
            r0.f11102n = r4
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11096h
            int r2 = r2.mo14544c()
            r0.f11101m = r2
        L_0x046c:
            long r4 = r0.f11102n
            r8 = 1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x048d
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11096h
            byte[] r2 = r2.f12121a
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r4
            r5 = 8
            r4.mo14087b(r2, r5, r5, r7)
            int r2 = r0.f11103o
            int r2 = r2 + r5
            r0.f11103o = r2
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f11096h
            long r4 = r2.mo14561p()
            r0.f11102n = r4
        L_0x048d:
            long r4 = r0.f11102n
            int r2 = r0.f11103o
            long r8 = (long) r2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x05da
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            long r4 = r2.f10548c
            long r4 = r4 - r8
            int r6 = r0.f11101m
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10985L
            if (r6 != r8) goto L_0x04bf
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r6 = r0.f11090b
            int r6 = r6.size()
            r8 = 0
        L_0x04a9:
            if (r8 >= r6) goto L_0x04bf
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r9 = r0.f11090b
            java.lang.Object r9 = r9.valueAt(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r9 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r9 = r9.f11117a
            r9.getClass()
            r9.f11190c = r4
            r9.f11189b = r4
            int r8 = r8 + 1
            goto L_0x04a9
        L_0x04bf:
            int r6 = r0.f11101m
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11019i
            if (r6 != r8) goto L_0x04e5
            r8 = 0
            r0.f11109u = r8
            long r6 = r0.f11102n
            long r4 = r4 + r6
            r0.f11105q = r4
            boolean r2 = r0.f11088C
            if (r2 != 0) goto L_0x04e0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r0.f11114z
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a
            long r5 = r0.f11107s
            r4.<init>(r5)
            r2.mo14123a(r4)
            r2 = 1
            r0.f11088C = r2
        L_0x04e0:
            r0.f11100l = r3
        L_0x04e2:
            r6 = 1
            goto L_0x05ce
        L_0x04e5:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10967C
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10971E
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10973F
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10975G
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10977H
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10985L
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10987M
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10989N
            if (r6 == r3) goto L_0x050c
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10994Q
            if (r6 != r3) goto L_0x050a
            goto L_0x050c
        L_0x050a:
            r3 = 0
            goto L_0x050d
        L_0x050c:
            r3 = 1
        L_0x050d:
            if (r3 == 0) goto L_0x0535
            long r2 = r2.f10548c
            long r4 = r0.f11102n
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r4 = r0.f11098j
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a
            int r6 = r0.f11101m
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.f11102n
            int r6 = r0.f11103o
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0530
            r0.mo14216a((long) r2)
            goto L_0x0533
        L_0x0530:
            r25.mo14215a()
        L_0x0533:
            r2 = 1
            goto L_0x04e2
        L_0x0535:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10997T
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10996S
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10969D
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10965B
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10998U
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11049x
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11051y
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10993P
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11053z
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10963A
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10999V
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11010d0
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11012e0
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11020i0
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11018h0
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11014f0
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11016g0
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10995R
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10991O
            if (r6 == r2) goto L_0x0588
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10976G0
            if (r6 != r2) goto L_0x0586
            goto L_0x0588
        L_0x0586:
            r2 = 0
            goto L_0x0589
        L_0x0588:
            r2 = 1
        L_0x0589:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x05c0
            int r2 = r0.f11103o
            r5 = 8
            if (r2 != r5) goto L_0x05b8
            long r8 = r0.f11102n
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x05b0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            int r3 = (int) r8
            r2.<init>((int) r3)
            r0.f11104p = r2
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11096h
            byte[] r3 = r3.f12121a
            byte[] r2 = r2.f12121a
            java.lang.System.arraycopy(r3, r7, r2, r7, r5)
            r2 = 1
            r0.f11100l = r2
            goto L_0x04e2
        L_0x05b0:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05b8:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05c0:
            long r5 = r0.f11102n
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x05d2
            r2 = 0
            r0.f11104p = r2
            r2 = 1
            r0.f11100l = r2
            goto L_0x04e2
        L_0x05ce:
            if (r6 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x05d2:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05da:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo14215a() {
        this.f11100l = 0;
        this.f11103o = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x037d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14216a(long r52) throws com.fyber.inneractive.sdk.player.exoplayer2.C3230l {
        /*
            r51 = this;
        L_0x0000:
            r0 = r51
            r1 = r0
        L_0x0003:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f11098j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x06e2
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f11098j
            java.lang.Object r2 = r2.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r2
            long r2 = r2.f11056P0
            int r4 = (r2 > r52 ? 1 : (r2 == r52 ? 0 : -1))
            if (r4 != 0) goto L_0x06e2
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f11098j
            java.lang.Object r2 = r2.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r2
            int r3 = r2.f11055a
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10967C
            r5 = 12
            r6 = 8
            r7 = 1
            if (r3 != r4) goto L_0x0160
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r2.f11057Q0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = m7919a((java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b>) r3)
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10989N
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = r2.mo14210c(r4)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r10 = r4.f11057Q0
            int r10 = r10.size()
            r11 = 0
            r15 = r8
        L_0x004a:
            if (r11 >= r10) goto L_0x00b2
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r8 = r4.f11057Q0
            java.lang.Object r8 = r8.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r8 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r8
            int r9 = r8.f11055a
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11053z
            if (r9 != r12) goto L_0x008f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r8.f11059P0
            r8.mo14549e(r5)
            int r5 = r8.mo14544c()
            int r9 = r8.mo14560o()
            int r9 = r9 - r7
            int r12 = r8.mo14560o()
            int r13 = r8.mo14560o()
            int r8 = r8.mo14544c()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
            r7.<init>(r9, r12, r13, r8)
            android.util.Pair r5 = android.util.Pair.create(r5, r7)
            java.lang.Object r7 = r5.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r5 = r5.second
            r14.put(r7, r5)
            goto L_0x00ac
        L_0x008f:
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10991O
            if (r9 != r5) goto L_0x00ac
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r8.f11059P0
            r5.mo14549e(r6)
            int r7 = r5.mo14544c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r7)
            if (r7 != 0) goto L_0x00a7
            long r7 = r5.mo14558m()
            goto L_0x00ab
        L_0x00a7:
            long r7 = r5.mo14561p()
        L_0x00ab:
            r15 = r7
        L_0x00ac:
            int r11 = r11 + 1
            r5 = 12
            r7 = 1
            goto L_0x004a
        L_0x00b2:
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r5 = r2.f11058R0
            int r5 = r5.size()
            r6 = 0
        L_0x00be:
            if (r6 >= r5) goto L_0x00e6
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r7 = r2.f11058R0
            java.lang.Object r7 = r7.get(r6)
            r8 = r7
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r8 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r8
            int r7 = r8.f11055a
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10971E
            if (r7 != r9) goto L_0x00e3
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10969D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r2.mo14211d(r7)
            r13 = 0
            r10 = r15
            r12 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3144b.m7909a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r8, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r9, (long) r10, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r12, (boolean) r13)
            if (r7 == 0) goto L_0x00e3
            int r8 = r7.f11175a
            r4.put(r8, r7)
        L_0x00e3:
            int r6 = r6 + 1
            goto L_0x00be
        L_0x00e6:
            int r2 = r4.size()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r3 = r1.f11090b
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0131
            r3 = 0
        L_0x00f3:
            if (r3 >= r2) goto L_0x0127
            java.lang.Object r5 = r4.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3157h) r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r6 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r7 = r1.f11114z
            int r8 = r5.f11176b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r7 = r7.mo14122a(r3, r8)
            r6.<init>(r7)
            int r7 = r5.f11175a
            java.lang.Object r7 = r14.get(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3149c) r7
            r6.mo14219a(r5, r7)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r7 = r1.f11090b
            int r8 = r5.f11175a
            r7.put(r8, r6)
            long r6 = r1.f11107s
            long r8 = r5.f11179e
            long r5 = java.lang.Math.max(r6, r8)
            r1.f11107s = r5
            int r3 = r3 + 1
            goto L_0x00f3
        L_0x0127:
            r51.mo14217c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r1.f11114z
            r2.mo14124c()
            goto L_0x0003
        L_0x0131:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r3 = r1.f11090b
            int r3 = r3.size()
            if (r3 != r2) goto L_0x013b
            r7 = 1
            goto L_0x013c
        L_0x013b:
            r7 = 0
        L_0x013c:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r7)
            r3 = 0
        L_0x0140:
            if (r3 >= r2) goto L_0x0003
            java.lang.Object r5 = r4.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3157h) r5
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r6 = r1.f11090b
            int r7 = r5.f11175a
            java.lang.Object r6 = r6.get(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r6
            int r7 = r5.f11175a
            java.lang.Object r7 = r14.get(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3149c) r7
            r6.mo14219a(r5, r7)
            int r3 = r3 + 1
            goto L_0x0140
        L_0x0160:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10985L
            if (r3 != r4) goto L_0x06c9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r3 = r1.f11090b
            int r4 = r1.f11089a
            byte[] r1 = r1.f11097i
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r5 = r2.f11058R0
            int r5 = r5.size()
            r7 = 0
            r17 = 1
        L_0x0173:
            if (r7 >= r5) goto L_0x0627
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r8 = r2.f11058R0
            java.lang.Object r8 = r8.get(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r8 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r8
            int r9 = r8.f11055a
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10987M
            if (r9 != r10) goto L_0x0609
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11051y
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r8.mo14211d(r9)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r9.f11059P0
            r9.mo14549e(r6)
            int r10 = r9.mo14544c()
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r11 = r9.mo14544c()
            r12 = r4 & 16
            if (r12 != 0) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            r11 = 0
        L_0x01a0:
            java.lang.Object r11 = r3.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r11 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r11
            if (r11 != 0) goto L_0x01aa
            r11 = 0
            goto L_0x01f1
        L_0x01aa:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01b8
            long r12 = r9.mo14561p()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r14 = r11.f11117a
            r14.f11189b = r12
            r14.f11190c = r12
        L_0x01b8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r12 = r11.f11120d
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01c5
            int r13 = r9.mo14560o()
            int r13 = r13 - r17
            goto L_0x01c7
        L_0x01c5:
            int r13 = r12.f11080a
        L_0x01c7:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01d0
            int r14 = r9.mo14560o()
            goto L_0x01d2
        L_0x01d0:
            int r14 = r12.f11081b
        L_0x01d2:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01db
            int r15 = r9.mo14560o()
            goto L_0x01dd
        L_0x01db:
            int r15 = r12.f11082c
        L_0x01dd:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01e6
            int r9 = r9.mo14560o()
            goto L_0x01e8
        L_0x01e6:
            int r9 = r12.f11083d
        L_0x01e8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r10 = r11.f11117a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
            r12.<init>(r13, r14, r15, r9)
            r10.f11188a = r12
        L_0x01f1:
            if (r11 != 0) goto L_0x01f5
            goto L_0x0609
        L_0x01f5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r9 = r11.f11117a
            long r12 = r9.f11205r
            r11.mo14218a()
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11049x
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r14 = r8.mo14211d(r10)
            if (r14 == 0) goto L_0x0225
            r14 = r4 & 2
            if (r14 != 0) goto L_0x0225
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = r8.mo14211d(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f11059P0
            r10.mo14549e(r6)
            int r6 = r10.mo14544c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r6)
            r12 = 1
            if (r6 != r12) goto L_0x0221
            long r12 = r10.mo14561p()
            goto L_0x0225
        L_0x0221:
            long r12 = r10.mo14558m()
        L_0x0225:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r6 = r8.f11057Q0
            int r10 = r6.size()
            r14 = 0
            r15 = 0
            r16 = 0
            r16 = r3
            r3 = 0
        L_0x0232:
            if (r3 >= r10) goto L_0x025d
            java.lang.Object r17 = r6.get(r3)
            r18 = r5
            r5 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r5
            r19 = r12
            int r12 = r5.f11055a
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10963A
            if (r12 != r13) goto L_0x0256
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f11059P0
            r12 = 12
            r5.mo14549e(r12)
            int r5 = r5.mo14560o()
            if (r5 <= 0) goto L_0x0256
            int r14 = r14 + r5
            int r15 = r15 + 1
        L_0x0256:
            int r3 = r3 + 1
            r5 = r18
            r12 = r19
            goto L_0x0232
        L_0x025d:
            r18 = r5
            r19 = r12
            r3 = 0
            r11.f11123g = r3
            r11.f11122f = r3
            r11.f11121e = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r3 = r11.f11117a
            r3.f11191d = r15
            r3.f11192e = r14
            int[] r5 = r3.f11194g
            if (r5 == 0) goto L_0x0275
            int r5 = r5.length
            if (r5 >= r15) goto L_0x027d
        L_0x0275:
            long[] r5 = new long[r15]
            r3.f11193f = r5
            int[] r5 = new int[r15]
            r3.f11194g = r5
        L_0x027d:
            int[] r5 = r3.f11195h
            if (r5 == 0) goto L_0x0284
            int r5 = r5.length
            if (r5 >= r14) goto L_0x029c
        L_0x0284:
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r5 = new int[r14]
            r3.f11195h = r5
            int[] r5 = new int[r14]
            r3.f11196i = r5
            long[] r5 = new long[r14]
            r3.f11197j = r5
            boolean[] r5 = new boolean[r14]
            r3.f11198k = r5
            boolean[] r5 = new boolean[r14]
            r3.f11200m = r5
        L_0x029c:
            r3 = 0
            r5 = 0
            r12 = 0
        L_0x029f:
            if (r3 >= r10) goto L_0x0433
            java.lang.Object r15 = r6.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r15 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r15
            int r13 = r15.f11055a
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10963A
            if (r13 != r14) goto L_0x0407
            int r13 = r5 + 1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r15.f11059P0
            r15 = 8
            r14.mo14549e(r15)
            int r15 = r14.mo14544c()
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r17
            r17 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r6 = r11.f11119c
            r23 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r10 = r11.f11117a
            r24 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r13 = r10.f11188a
            int[] r0 = r10.f11194g
            int r25 = r14.mo14560o()
            r0[r5] = r25
            long[] r0 = r10.f11193f
            r26 = r1
            r25 = r2
            long r1 = r10.f11189b
            r0[r5] = r1
            r27 = r15 & 1
            if (r27 == 0) goto L_0x02ee
            r27 = r7
            int r7 = r14.mo14544c()
            r28 = r8
            long r7 = (long) r7
            long r1 = r1 + r7
            r0[r5] = r1
            goto L_0x02f2
        L_0x02ee:
            r27 = r7
            r28 = r8
        L_0x02f2:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x02f8
            r0 = 1
            goto L_0x02f9
        L_0x02f8:
            r0 = 0
        L_0x02f9:
            int r1 = r13.f11083d
            if (r0 == 0) goto L_0x0301
            int r1 = r14.mo14560o()
        L_0x0301:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0307
            r2 = 1
            goto L_0x0308
        L_0x0307:
            r2 = 0
        L_0x0308:
            r7 = r15 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x030e
            r7 = 1
            goto L_0x030f
        L_0x030e:
            r7 = 0
        L_0x030f:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0315
            r8 = 1
            goto L_0x0316
        L_0x0315:
            r8 = 0
        L_0x0316:
            r15 = r15 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x031c
            r15 = 1
            goto L_0x031d
        L_0x031c:
            r15 = 0
        L_0x031d:
            r29 = r1
            long[] r1 = r6.f11183i
            if (r1 == 0) goto L_0x0348
            r30 = r9
            int r9 = r1.length
            r31 = r11
            r11 = 1
            if (r9 != r11) goto L_0x0346
            r9 = 0
            r32 = r1[r9]
            r21 = 0
            int r1 = (r32 > r21 ? 1 : (r32 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x0346
            long[] r1 = r6.f11184j
            r32 = r1[r9]
            r1 = r8
            long r8 = r6.f11177c
            r34 = 1000(0x3e8, double:4.94E-321)
            r36 = r8
            long r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r32, (long) r34, (long) r36)
            r21 = r8
            goto L_0x034f
        L_0x0346:
            r1 = r8
            goto L_0x034d
        L_0x0348:
            r1 = r8
            r30 = r9
            r31 = r11
        L_0x034d:
            r21 = 0
        L_0x034f:
            int[] r8 = r10.f11195h
            int[] r9 = r10.f11196i
            long[] r11 = r10.f11197j
            r32 = r3
            boolean[] r3 = r10.f11198k
            r33 = r3
            int r3 = r6.f11176b
            r34 = r8
            r8 = 2
            if (r3 != r8) goto L_0x0368
            r3 = r4 & 1
            if (r3 == 0) goto L_0x0368
            r3 = 1
            goto L_0x0369
        L_0x0368:
            r3 = 0
        L_0x0369:
            int[] r8 = r10.f11194g
            r8 = r8[r5]
            int r8 = r8 + r12
            r42 = r3
            r41 = r4
            long r3 = r6.f11177c
            if (r5 <= 0) goto L_0x0379
            long r5 = r10.f11205r
            goto L_0x037b
        L_0x0379:
            r5 = r19
        L_0x037b:
            if (r12 >= r8) goto L_0x0401
            if (r2 == 0) goto L_0x0388
            int r35 = r14.mo14560o()
            r43 = r2
            r2 = r35
            goto L_0x038c
        L_0x0388:
            r43 = r2
            int r2 = r13.f11081b
        L_0x038c:
            if (r7 == 0) goto L_0x0397
            int r35 = r14.mo14560o()
            r44 = r7
            r7 = r35
            goto L_0x039b
        L_0x0397:
            r44 = r7
            int r7 = r13.f11082c
        L_0x039b:
            if (r12 != 0) goto L_0x03a4
            if (r0 == 0) goto L_0x03a4
            r45 = r0
            r0 = r29
            goto L_0x03b3
        L_0x03a4:
            if (r1 == 0) goto L_0x03af
            int r35 = r14.mo14544c()
            r45 = r0
            r0 = r35
            goto L_0x03b3
        L_0x03af:
            r45 = r0
            int r0 = r13.f11083d
        L_0x03b3:
            if (r15 == 0) goto L_0x03c7
            r46 = r1
            int r1 = r14.mo14544c()
            int r1 = r1 * 1000
            r48 = r13
            r47 = r14
            long r13 = (long) r1
            long r13 = r13 / r3
            int r1 = (int) r13
            r9[r12] = r1
            goto L_0x03d0
        L_0x03c7:
            r46 = r1
            r48 = r13
            r47 = r14
            r1 = 0
            r9[r12] = r1
        L_0x03d0:
            r37 = 1000(0x3e8, double:4.94E-321)
            r35 = r5
            r39 = r3
            long r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r35, (long) r37, (long) r39)
            long r13 = r13 - r21
            r11[r12] = r13
            r34[r12] = r7
            int r0 = r0 >> 16
            r0 = r0 & 1
            if (r0 != 0) goto L_0x03ec
            if (r42 == 0) goto L_0x03ea
            if (r12 != 0) goto L_0x03ec
        L_0x03ea:
            r0 = 1
            goto L_0x03ed
        L_0x03ec:
            r0 = 0
        L_0x03ed:
            r33[r12] = r0
            long r0 = (long) r2
            long r5 = r5 + r0
            int r12 = r12 + 1
            r2 = r43
            r7 = r44
            r0 = r45
            r1 = r46
            r14 = r47
            r13 = r48
            goto L_0x037b
        L_0x0401:
            r10.f11205r = r5
            r12 = r8
            r5 = r24
            goto L_0x041b
        L_0x0407:
            r26 = r1
            r25 = r2
            r32 = r3
            r41 = r4
            r17 = r6
            r27 = r7
            r28 = r8
            r30 = r9
            r23 = r10
            r31 = r11
        L_0x041b:
            int r3 = r32 + 1
            r0 = r51
            r6 = r17
            r10 = r23
            r2 = r25
            r1 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            r11 = r31
            r4 = r41
            goto L_0x029f
        L_0x0433:
            r26 = r1
            r25 = r2
            r41 = r4
            r27 = r7
            r28 = r8
            r30 = r9
            r31 = r11
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11010d0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r8.mo14211d(r0)
            if (r0 == 0) goto L_0x04bc
            r11 = r31
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r1 = r11.f11119c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r1 = r1.f11182h
            r2 = r30
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r3 = r2.f11188a
            int r3 = r3.f11080a
            r1 = r1[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f11059P0
            int r1 = r1.f11186a
            r3 = 8
            r0.mo14549e(r3)
            int r4 = r0.mo14544c()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r5
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x046f
            r0.mo14551f(r3)
        L_0x046f:
            int r3 = r0.mo14557l()
            int r4 = r0.mo14560o()
            int r5 = r2.f11192e
            if (r4 != r5) goto L_0x04a5
            if (r3 != 0) goto L_0x0492
            boolean[] r3 = r2.f11200m
            r5 = 0
            r6 = 0
        L_0x0481:
            if (r5 >= r4) goto L_0x04a1
            int r7 = r0.mo14557l()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x048c
            r7 = 1
            goto L_0x048d
        L_0x048c:
            r7 = 0
        L_0x048d:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x0481
        L_0x0492:
            if (r3 <= r1) goto L_0x0496
            r0 = 1
            goto L_0x0497
        L_0x0496:
            r0 = 0
        L_0x0497:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.f11200m
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x04a1:
            r2.mo14222a(r6)
            goto L_0x04be
        L_0x04a5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Length mismatch: "
            java.lang.String r3 = ", "
            java.lang.StringBuilder r1 = p379.C25541a.m63887r(r1, r4, r3)
            int r2 = r2.f11192e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04bc:
            r2 = r30
        L_0x04be:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11012e0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r8.mo14211d(r0)
            if (r0 == 0) goto L_0x0503
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f11059P0
            r1 = 8
            r0.mo14549e(r1)
            int r3 = r0.mo14544c()
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04dc
            r0.mo14551f(r1)
        L_0x04dc:
            int r1 = r0.mo14560o()
            if (r1 != r5) goto L_0x04f7
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r3)
            long r3 = r2.f11190c
            if (r1 != 0) goto L_0x04ef
            long r0 = r0.mo14558m()
            goto L_0x04f3
        L_0x04ef:
            long r0 = r0.mo14561p()
        L_0x04f3:
            long r3 = r3 + r0
            r2.f11190c = r3
            goto L_0x0503
        L_0x04f7:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unexpected saio entry count: "
            java.lang.String r1 = p379.C16759e.m42349e(r2, r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0503:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11020i0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r8.mo14211d(r0)
            if (r0 == 0) goto L_0x0511
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f11059P0
            r1 = 0
            m7920a(r0, r1, r2)
        L_0x0511:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11014f0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r8.mo14211d(r0)
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11016g0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r1 = r8.mo14211d(r1)
            if (r0 == 0) goto L_0x05c3
            if (r1 == 0) goto L_0x05c3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f11059P0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r1.f11059P0
            r3 = 8
            r0.mo14549e(r3)
            int r3 = r0.mo14544c()
            int r4 = r0.mo14544c()
            int r5 = f11084D
            if (r4 == r5) goto L_0x0538
            goto L_0x05c3
        L_0x0538:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0543
            r0.mo14551f(r4)
        L_0x0543:
            int r0 = r0.mo14544c()
            if (r0 != r6) goto L_0x05bb
            r0 = 8
            r1.mo14549e(r0)
            int r0 = r1.mo14544c()
            int r3 = r1.mo14544c()
            if (r3 == r5) goto L_0x0559
            goto L_0x05c3
        L_0x0559:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r0)
            if (r0 != r6) goto L_0x0572
            long r3 = r1.mo14558m()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x056a
            goto L_0x0578
        L_0x056a:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0572:
            r3 = 2
            if (r0 < r3) goto L_0x0578
            r1.mo14551f(r4)
        L_0x0578:
            r0 = 2
            long r3 = r1.mo14558m()
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x05b3
            r1.mo14551f(r0)
            int r0 = r1.mo14557l()
            r3 = 1
            if (r0 != r3) goto L_0x058f
            r0 = 1
            goto L_0x0590
        L_0x058f:
            r0 = 0
        L_0x0590:
            if (r0 != 0) goto L_0x0593
            goto L_0x05c3
        L_0x0593:
            int r3 = r1.mo14557l()
            r4 = 16
            byte[] r5 = new byte[r4]
            byte[] r6 = r1.f12121a
            int r7 = r1.f12122b
            r9 = 0
            java.lang.System.arraycopy(r6, r7, r5, r9, r4)
            int r6 = r1.f12122b
            int r6 = r6 + r4
            r1.f12122b = r6
            r1 = 1
            r2.f11199l = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i
            r1.<init>(r0, r3, r5)
            r2.f11201n = r1
            goto L_0x05c3
        L_0x05b3:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05bb:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05c3:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r0 = r8.f11057Q0
            int r0 = r0.size()
            r1 = 0
        L_0x05ca:
            if (r1 >= r0) goto L_0x0606
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r8.f11057Q0
            java.lang.Object r3 = r3.get(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r3
            int r4 = r3.f11055a
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11018h0
            if (r4 != r5) goto L_0x05ff
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r3.f11059P0
            r4 = 8
            r3.mo14549e(r4)
            byte[] r4 = r3.f12121a
            int r5 = r3.f12122b
            r6 = 16
            r7 = 0
            r9 = r26
            java.lang.System.arraycopy(r4, r5, r9, r7, r6)
            int r4 = r3.f12122b
            int r4 = r4 + r6
            r3.f12122b = r4
            byte[] r4 = f11085E
            boolean r4 = java.util.Arrays.equals(r9, r4)
            if (r4 != 0) goto L_0x05fb
            goto L_0x0601
        L_0x05fb:
            m7920a(r3, r6, r2)
            goto L_0x0601
        L_0x05ff:
            r9 = r26
        L_0x0601:
            int r1 = r1 + 1
            r26 = r9
            goto L_0x05ca
        L_0x0606:
            r9 = r26
            goto L_0x0614
        L_0x0609:
            r9 = r1
            r25 = r2
            r16 = r3
            r41 = r4
            r18 = r5
            r27 = r7
        L_0x0614:
            int r7 = r27 + 1
            r6 = 8
            r17 = 1
            r0 = r51
            r1 = r9
            r3 = r16
            r5 = r18
            r2 = r25
            r4 = r41
            goto L_0x0173
        L_0x0627:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r0 = r2.f11057Q0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r0 = m7919a((java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b>) r0)
            if (r0 == 0) goto L_0x0000
            r15 = r51
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r1 = r15.f11090b
            int r14 = r1.size()
            r1 = 0
            r13 = 0
        L_0x0639:
            if (r13 >= r14) goto L_0x06c6
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r1 = r15.f11090b
            java.lang.Object r1 = r1.valueAt(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.C3152b) r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r12 = r1.f11118b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r1 = r1.f11119c
            com.fyber.inneractive.sdk.player.exoplayer2.i r11 = r1.f11180f
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r1 = r10
            java.lang.String r2 = r11.f11628a
            java.lang.String r3 = r11.f11632e
            java.lang.String r4 = r11.f11633f
            java.lang.String r5 = r11.f11630c
            int r6 = r11.f11629b
            int r7 = r11.f11634g
            int r8 = r11.f11637j
            int r9 = r11.f11638k
            r16 = r10
            float r10 = r11.f11639l
            r49 = r16
            r16 = r12
            int r12 = r11.f11640m
            r29 = r1
            r1 = r11
            r11 = r12
            float r12 = r1.f11641n
            r50 = r16
            r16 = r13
            byte[] r13 = r1.f11643p
            r30 = r16
            r16 = r14
            int r14 = r1.f11642o
            r31 = r16
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r15 = r1.f11644q
            r32 = r2
            int r2 = r1.f11645r
            r16 = r2
            int r2 = r1.f11646s
            r17 = r2
            int r2 = r1.f11647t
            r18 = r2
            int r2 = r1.f11648u
            r19 = r2
            int r2 = r1.f11649v
            r20 = r2
            int r2 = r1.f11651x
            r21 = r2
            java.lang.String r2 = r1.f11652y
            r22 = r2
            int r2 = r1.f11653z
            r23 = r2
            r33 = r3
            long r2 = r1.f11650w
            r24 = r2
            java.util.List<byte[]> r2 = r1.f11635h
            r26 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r1 = r1.f11631d
            r28 = r1
            r27 = r0
            r1 = r29
            r2 = r32
            r3 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            r2 = r49
            r1 = r50
            r1.mo14098a(r2)
            int r13 = r30 + 1
            r15 = r51
            r14 = r31
            goto L_0x0639
        L_0x06c6:
            r1 = r51
            goto L_0x06de
        L_0x06c9:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11098j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06de
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11098j
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r0.f11058R0
            r0.add(r2)
        L_0x06de:
            r0 = r51
            goto L_0x0003
        L_0x06e2:
            r51.mo14215a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.mo14216a(long):void");
    }

    /* renamed from: a */
    public static void m7920a(C3393k kVar, int i, C3159j jVar) throws C3230l {
        kVar.mo14549e(i + 8);
        int c = kVar.mo14544c();
        int i2 = C3141a.f11005b;
        int i3 = c & 16777215;
        if ((i3 & 1) == 0) {
            boolean z = (i3 & 2) != 0;
            int o = kVar.mo14560o();
            if (o == jVar.f11192e) {
                Arrays.fill(jVar.f11200m, 0, o, z);
                jVar.mo14222a(kVar.mo14537a());
                kVar.mo14541a(jVar.f11203p.f12121a, 0, jVar.f11202o);
                jVar.f11203p.mo14549e(0);
                jVar.f11204q = false;
                return;
            }
            StringBuilder r = C25541a.m63887r("Length mismatch: ", o, ", ");
            r.append(jVar.f11192e);
            throw new C3230l(r.toString());
        }
        throw new C3230l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a m7919a(java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00a0
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r5
            int r6 = r5.f11055a
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10999V
            if (r6 != r7) goto L_0x009c
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f11059P0
            byte[] r5 = r5.f12121a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r6.<init>((byte[]) r5)
            int r8 = r6.f12123c
            r9 = 32
            if (r8 >= r9) goto L_0x002d
            goto L_0x0072
        L_0x002d:
            r6.mo14549e(r1)
            int r8 = r6.mo14544c()
            int r9 = r6.mo14537a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x003d
            goto L_0x0072
        L_0x003d:
            int r8 = r6.mo14544c()
            if (r8 == r7) goto L_0x0044
            goto L_0x0072
        L_0x0044:
            int r7 = r6.mo14544c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7903b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x0050
            goto L_0x0072
        L_0x0050:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo14554i()
            long r12 = r6.mo14554i()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0068
            int r7 = r6.mo14560o()
            int r7 = r7 * 16
            r6.mo14551f(r7)
        L_0x0068:
            int r7 = r6.mo14560o()
            int r8 = r6.mo14537a()
            if (r7 == r8) goto L_0x0074
        L_0x0072:
            r6 = r2
            goto L_0x0086
        L_0x0074:
            byte[] r8 = new byte[r7]
            byte[] r10 = r6.f12121a
            int r11 = r6.f12122b
            java.lang.System.arraycopy(r10, r11, r8, r1, r7)
            int r10 = r6.f12122b
            int r10 = r10 + r7
            r6.f12122b = r10
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0086:
            if (r6 != 0) goto L_0x008a
            r6 = r2
            goto L_0x008e
        L_0x008a:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x008e:
            if (r6 != 0) goto L_0x0091
            goto L_0x009c
        L_0x0091:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00a0:
            if (r4 != 0) goto L_0x00a3
            goto L_0x00b4
        L_0x00a3:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            int r14 = r4.size()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a.C3061b[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a.C3061b[]) r14
            r2.<init>(r1, r14)
        L_0x00b4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d.m7919a(java.util.List):com.fyber.inneractive.sdk.player.exoplayer2.drm.a");
    }
}
