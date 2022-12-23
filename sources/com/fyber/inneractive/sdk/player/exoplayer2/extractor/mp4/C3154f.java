package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f */
public final class C3154f implements C3080f, C3124m {

    /* renamed from: p */
    public static final int f11154p = C3406u.m8589a("qt  ");

    /* renamed from: a */
    public final C3393k f11155a = new C3393k(C3389i.f12100a);

    /* renamed from: b */
    public final C3393k f11156b = new C3393k(4);

    /* renamed from: c */
    public final C3393k f11157c = new C3393k(16);

    /* renamed from: d */
    public final Stack<C3141a.C3142a> f11158d = new Stack<>();

    /* renamed from: e */
    public int f11159e;

    /* renamed from: f */
    public int f11160f;

    /* renamed from: g */
    public long f11161g;

    /* renamed from: h */
    public int f11162h;

    /* renamed from: i */
    public C3393k f11163i;

    /* renamed from: j */
    public int f11164j;

    /* renamed from: k */
    public int f11165k;

    /* renamed from: l */
    public C3088h f11166l;

    /* renamed from: m */
    public C3155a[] f11167m;

    /* renamed from: n */
    public long f11168n;

    /* renamed from: o */
    public boolean f11169o;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a */
    public static final class C3155a {

        /* renamed from: a */
        public final C3157h f11170a;

        /* renamed from: b */
        public final C3160k f11171b;

        /* renamed from: c */
        public final C3161n f11172c;

        /* renamed from: d */
        public int f11173d;

        public C3155a(C3157h hVar, C3160k kVar, C3161n nVar) {
            this.f11170a = hVar;
            this.f11171b = kVar;
            this.f11172c = nVar;
        }
    }

    /* renamed from: a */
    public boolean mo14079a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        return C3156g.m7948a(gVar, false);
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: c */
    public long mo14080c() {
        return this.f11168n;
    }

    /* renamed from: d */
    public final void mo14221d() {
        this.f11159e = 0;
        this.f11162h = 0;
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f11166l = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x07a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2 A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0084 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14220c(long r71) throws com.fyber.inneractive.sdk.player.exoplayer2.C3230l {
        /*
            r70 = this;
            r1 = r70
        L_0x0002:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11158d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x09b2
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11158d
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r0
            long r3 = r0.f11056P0
            int r0 = (r3 > r71 ? 1 : (r3 == r71 ? 0 : -1))
            if (r0 != 0) goto L_0x09b2
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11158d
            java.lang.Object r0 = r0.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r0
            int r3 = r0.f11055a
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10967C
            if (r3 != r4) goto L_0x0997
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
            r8.<init>()
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10964A0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r0.mo14211d(r9)
            r10 = 12
            r11 = 0
            r12 = 1
            r13 = 0
            if (r9 == 0) goto L_0x0230
            boolean r14 = r1.f11169o
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3144b.f11060a
            if (r14 == 0) goto L_0x0045
            goto L_0x0229
        L_0x0045:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r9.f11059P0
            r14 = 8
            r9.mo14549e(r14)
        L_0x004c:
            int r15 = r9.mo14537a()
            if (r15 < r14) goto L_0x0229
            int r15 = r9.f12122b
            int r16 = r9.mo14544c()
            int r3 = r9.mo14544c()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10966B0
            if (r3 != r4) goto L_0x0222
            r9.mo14549e(r15)
            int r15 = r15 + r16
            r9.mo14551f(r10)
        L_0x0068:
            int r3 = r9.f12122b
            if (r3 >= r15) goto L_0x0229
            int r4 = r9.mo14544c()
            int r6 = r9.mo14544c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10968C0
            if (r6 != r7) goto L_0x021b
            r9.mo14549e(r3)
            int r3 = r3 + r4
            r9.mo14551f(r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0084:
            int r6 = r9.f12122b
            if (r6 >= r3) goto L_0x020e
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11128a
            int r7 = r9.mo14544c()
            int r7 = r7 + r6
            int r6 = r9.mo14544c()
            int r14 = r6 >> 24
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 169(0xa9, float:2.37E-43)
            java.lang.String r2 = "TCON"
            if (r14 == r15) goto L_0x017b
            r15 = 65533(0xfffd, float:9.1831E-41)
            if (r14 != r15) goto L_0x00a4
            goto L_0x017b
        L_0x00a4:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11140m     // Catch:{ all -> 0x0209 }
            if (r6 != r14) goto L_0x00c5
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7936b(r9)     // Catch:{ all -> 0x0209 }
            if (r6 <= 0) goto L_0x00b8
            java.lang.String[] r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11127D     // Catch:{ all -> 0x0209 }
            int r15 = r14.length     // Catch:{ all -> 0x0209 }
            if (r6 > r15) goto L_0x00b8
            int r6 = r6 + -1
            r6 = r14[r6]     // Catch:{ all -> 0x0209 }
            goto L_0x00b9
        L_0x00b8:
            r6 = r11
        L_0x00b9:
            if (r6 == 0) goto L_0x00c2
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r14 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j     // Catch:{ all -> 0x0209 }
            r14.<init>(r2, r11, r6)     // Catch:{ all -> 0x0209 }
            goto L_0x01fe
        L_0x00c2:
            r2 = r11
            goto L_0x01ff
        L_0x00c5:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11142o     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x00d1
            java.lang.String r2 = "TPOS"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7935a(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x00d1:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11143p     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x00dd
            java.lang.String r2 = "TRCK"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7935a(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x00dd:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11144q     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x00e9
            java.lang.String r2 = "TBPM"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7933a(r6, r2, r9, r12, r13)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x00e9:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11145r     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x00f5
            java.lang.String r2 = "TCMP"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7933a(r6, r2, r9, r12, r12)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x00f5:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11139l     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0102
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7931a(r9)     // Catch:{ all -> 0x0209 }
            r9.mo14549e(r7)
            goto L_0x0202
        L_0x0102:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11146s     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x010e
            java.lang.String r2 = "TPE2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x010e:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11147t     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x011a
            java.lang.String r2 = "TSOT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x011a:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11148u     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0125
            java.lang.String r2 = "TSO2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x0125:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11149v     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0130
            java.lang.String r2 = "TSOA"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x0130:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11150w     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x013b
            java.lang.String r2 = "TSOP"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x013b:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11151x     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0146
            java.lang.String r2 = "TSOC"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x0146:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11152y     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0151
            java.lang.String r2 = "ITUNESADVISORY"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7933a(r6, r2, r9, r13, r13)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x0151:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11153z     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x015c
            java.lang.String r2 = "ITUNESGAPLESS"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7933a(r6, r2, r9, r13, r12)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x015c:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11124A     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0167
            java.lang.String r2 = "TVSHOWSORT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x0167:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11125B     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x0172
            java.lang.String r2 = "TVSHOW"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x0172:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11126C     // Catch:{ all -> 0x0209 }
            if (r6 != r2) goto L_0x01e8
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7934a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r9, (int) r7)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x017b:
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r14 = r14 & r6
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11130c     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x018a
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7932a((int) r6, (com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r9)     // Catch:{ all -> 0x0209 }
        L_0x0187:
            r14 = r2
            goto L_0x01fe
        L_0x018a:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11128a     // Catch:{ all -> 0x0209 }
            if (r14 == r15) goto L_0x01f7
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11129b     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x0194
            goto L_0x01f7
        L_0x0194:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11135h     // Catch:{ all -> 0x0209 }
            if (r14 == r15) goto L_0x01f0
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11136i     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x019d
            goto L_0x01f0
        L_0x019d:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11131d     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x01a8
            java.lang.String r2 = "TDRC"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01a8:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11132e     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x01b3
            java.lang.String r2 = "TPE1"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01b3:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11133f     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x01be
            java.lang.String r2 = "TSSE"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01be:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11134g     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x01c9
            java.lang.String r2 = "TALB"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01c9:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11137j     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x01d4
            java.lang.String r2 = "USLT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01d4:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11138k     // Catch:{ all -> 0x0209 }
            if (r14 != r15) goto L_0x01dd
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01dd:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.f11141n     // Catch:{ all -> 0x0209 }
            if (r14 != r2) goto L_0x01e8
            java.lang.String r2 = "TIT1"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01e8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.m7902a(r6)     // Catch:{ all -> 0x0209 }
            r9.mo14549e(r7)
            r2 = r11
            goto L_0x0202
        L_0x01f0:
            java.lang.String r2 = "TCOM"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01f7:
            java.lang.String r2 = "TIT2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3153e.m7937b(r6, r2, r9)     // Catch:{ all -> 0x0209 }
            goto L_0x0187
        L_0x01fe:
            r2 = r14
        L_0x01ff:
            r9.mo14549e(r7)
        L_0x0202:
            if (r2 == 0) goto L_0x0084
            r4.add(r2)
            goto L_0x0084
        L_0x0209:
            r0 = move-exception
            r9.mo14549e(r7)
            throw r0
        L_0x020e:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0215
            goto L_0x0229
        L_0x0215:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.a
            r2.<init>((java.util.List<? extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a.C3245b>) r4)
            goto L_0x022a
        L_0x021b:
            int r4 = r4 + -8
            r9.mo14551f(r4)
            goto L_0x0068
        L_0x0222:
            int r2 = r16 + -8
            r9.mo14551f(r2)
            goto L_0x004c
        L_0x0229:
            r2 = r11
        L_0x022a:
            if (r2 == 0) goto L_0x0231
            r8.mo14186a(r2)
            goto L_0x0231
        L_0x0230:
            r2 = r11
        L_0x0231:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x023c:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r14 = r0.f11058R0
            int r14 = r14.size()
            if (r9 >= r14) goto L_0x0971
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r14 = r0.f11058R0
            java.lang.Object r14 = r14.get(r9)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r14
            int r15 = r14.f11055a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10971E
            if (r15 == r11) goto L_0x0262
        L_0x0252:
            r18 = r0
            r53 = r2
            r51 = r3
            r20 = r5
            r49 = r6
            r55 = r8
            r54 = r9
            goto L_0x07c3
        L_0x0262:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10969D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r16 = r0.mo14211d(r11)
            boolean r11 = r1.f11169o
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r15 = r14
            r20 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3144b.m7909a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r15, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3143b) r16, (long) r17, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r19, (boolean) r20)
            if (r11 != 0) goto L_0x027b
            goto L_0x0252
        L_0x027b:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10973F
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r14 = r14.mo14210c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10975G
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r14 = r14.mo14210c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10977H
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r14 = r14.mo14210c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11036q0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r15 = r14.mo14211d(r15)
            if (r15 == 0) goto L_0x029b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c
            r12.<init>(r15)
            goto L_0x02a9
        L_0x029b:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11038r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r12 = r14.mo14211d(r12)
            if (r12 == 0) goto L_0x0969
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d r15 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d
            r15.<init>(r12)
            r12 = r15
        L_0x02a9:
            int r15 = r12.mo14212a()
            if (r15 != 0) goto L_0x02d9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            long[] r14 = new long[r13]
            int[] r15 = new int[r13]
            long[] r10 = new long[r13]
            r18 = r0
            int[] r0 = new int[r13]
            r24 = 0
            r21 = r12
            r22 = r14
            r23 = r15
            r25 = r10
            r26 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r53 = r2
            r51 = r3
            r20 = r5
            r49 = r6
            r55 = r8
            r54 = r9
            r2 = r11
            goto L_0x07bf
        L_0x02d9:
            r18 = r0
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11040s0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r14.mo14211d(r0)
            if (r0 != 0) goto L_0x02eb
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11042t0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r14.mo14211d(r0)
            r10 = 1
            goto L_0x02ec
        L_0x02eb:
            r10 = 0
        L_0x02ec:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f11059P0
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11034p0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r13 = r14.mo14211d(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r13 = r13.f11059P0
            r49 = r6
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11028m0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r6 = r14.mo14211d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r6.f11059P0
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11030n0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r7 = r14.mo14211d(r7)
            if (r7 == 0) goto L_0x030d
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r7.f11059P0
            r20 = r5
            goto L_0x0310
        L_0x030d:
            r20 = r5
            r7 = 0
        L_0x0310:
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11032o0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = r14.mo14211d(r5)
            if (r5 == 0) goto L_0x031b
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f11059P0
            goto L_0x031c
        L_0x031b:
            r5 = 0
        L_0x031c:
            r14 = 12
            r0.mo14549e(r14)
            r51 = r3
            int r3 = r0.mo14560o()
            r13.mo14549e(r14)
            int r4 = r13.mo14560o()
            int r14 = r13.mo14544c()
            r21 = r4
            r4 = 1
            if (r14 != r4) goto L_0x0339
            r14 = 1
            goto L_0x033a
        L_0x0339:
            r14 = 0
        L_0x033a:
            java.lang.String r4 = "first_chunk must be 1"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8508b(r14, r4)
            r4 = 12
            r6.mo14549e(r4)
            int r14 = r6.mo14560o()
            r16 = 1
            int r14 = r14 + -1
            int r17 = r6.mo14560o()
            r53 = r2
            int r2 = r6.mo14560o()
            if (r5 == 0) goto L_0x0360
            r5.mo14549e(r4)
            int r22 = r5.mo14560o()
            goto L_0x0362
        L_0x0360:
            r22 = 0
        L_0x0362:
            r23 = -1
            if (r7 == 0) goto L_0x037a
            r7.mo14549e(r4)
            int r24 = r7.mo14560o()
            if (r24 <= 0) goto L_0x0378
            int r25 = r7.mo14560o()
            r16 = 1
            int r25 = r25 + -1
            goto L_0x037e
        L_0x0378:
            r7 = 0
            goto L_0x037c
        L_0x037a:
            r24 = 0
        L_0x037c:
            r25 = -1
        L_0x037e:
            boolean r26 = r12.mo14214c()
            if (r26 == 0) goto L_0x039a
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r11.f11180f
            java.lang.String r4 = r4.f11633f
            r54 = r9
            java.lang.String r9 = "audio/raw"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x039c
            if (r14 != 0) goto L_0x039c
            if (r22 != 0) goto L_0x039c
            if (r24 != 0) goto L_0x039c
            r4 = 1
            goto L_0x039d
        L_0x039a:
            r54 = r9
        L_0x039c:
            r4 = 0
        L_0x039d:
            r26 = 0
            if (r4 != 0) goto L_0x04bd
            long[] r4 = new long[r15]
            int[] r9 = new int[r15]
            r29 = r14
            long[] r14 = new long[r15]
            int[] r1 = new int[r15]
            r34 = r6
            r55 = r8
            r56 = r11
            r32 = r22
            r33 = r24
            r6 = r25
            r35 = r26
            r37 = r35
            r39 = r37
            r8 = 0
            r11 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r30 = 0
            r31 = 0
            r41 = -1
        L_0x03cb:
            if (r8 >= r15) goto L_0x0491
            r69 = r31
            r31 = r15
            r15 = r69
        L_0x03d3:
            if (r25 != 0) goto L_0x0417
            r42 = r2
            int r2 = r41 + 1
            if (r2 != r3) goto L_0x03e0
            r25 = r21
            r21 = 0
            goto L_0x0409
        L_0x03e0:
            if (r10 == 0) goto L_0x03e7
            long r37 = r0.mo14561p()
            goto L_0x03eb
        L_0x03e7:
            long r37 = r0.mo14558m()
        L_0x03eb:
            if (r2 != r15) goto L_0x0403
            int r30 = r13.mo14560o()
            r15 = 4
            r13.mo14551f(r15)
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x0402
            int r15 = r13.mo14560o()
            r16 = 1
            int r15 = r15 + -1
            goto L_0x0403
        L_0x0402:
            r15 = -1
        L_0x0403:
            r25 = r21
            r39 = r37
            r21 = 1
        L_0x0409:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r21)
            r41 = r2
            r21 = r25
            r25 = r30
            r37 = r39
            r2 = r42
            goto L_0x03d3
        L_0x0417:
            r42 = r2
            if (r5 == 0) goto L_0x042c
        L_0x041b:
            if (r22 != 0) goto L_0x042a
            if (r32 <= 0) goto L_0x042a
            int r22 = r5.mo14560o()
            int r24 = r5.mo14544c()
            int r32 = r32 + -1
            goto L_0x041b
        L_0x042a:
            int r22 = r22 + -1
        L_0x042c:
            r2 = r24
            r4[r8] = r37
            r24 = r4
            int r4 = r12.mo14213b()
            r9[r8] = r4
            if (r4 <= r11) goto L_0x043d
            r43 = r4
            goto L_0x043f
        L_0x043d:
            r43 = r11
        L_0x043f:
            r4 = r12
            long r11 = (long) r2
            long r11 = r35 + r11
            r14[r8] = r11
            if (r7 != 0) goto L_0x0449
            r11 = 1
            goto L_0x044a
        L_0x0449:
            r11 = 0
        L_0x044a:
            r1[r8] = r11
            if (r8 != r6) goto L_0x045a
            r11 = 1
            r1[r8] = r11
            int r33 = r33 + -1
            if (r33 <= 0) goto L_0x045a
            int r6 = r7.mo14560o()
            int r6 = r6 - r11
        L_0x045a:
            r12 = r1
            r11 = r42
            r42 = r2
            long r1 = (long) r11
            long r35 = r35 + r1
            int r17 = r17 + -1
            if (r17 != 0) goto L_0x0475
            if (r29 <= 0) goto L_0x0475
            int r1 = r34.mo14560o()
            int r2 = r34.mo14560o()
            int r29 = r29 + -1
            r17 = r1
            goto L_0x0476
        L_0x0475:
            r2 = r11
        L_0x0476:
            r1 = r9[r8]
            r11 = r2
            long r1 = (long) r1
            long r37 = r37 + r1
            int r25 = r25 + -1
            int r8 = r8 + 1
            r2 = r11
            r1 = r12
            r11 = r43
            r12 = r4
            r4 = r24
            r24 = r42
            r69 = r31
            r31 = r15
            r15 = r69
            goto L_0x03cb
        L_0x0491:
            r12 = r1
            r24 = r4
            r31 = r15
            if (r22 != 0) goto L_0x049a
            r0 = 1
            goto L_0x049b
        L_0x049a:
            r0 = 0
        L_0x049b:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8505a((boolean) r0)
        L_0x049e:
            if (r32 <= 0) goto L_0x04b2
            int r0 = r5.mo14560o()
            if (r0 != 0) goto L_0x04a8
            r0 = 1
            goto L_0x04a9
        L_0x04a8:
            r0 = 0
        L_0x04a9:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8505a((boolean) r0)
            r5.mo14544c()
            int r32 = r32 + -1
            goto L_0x049e
        L_0x04b2:
            r8 = r12
            r4 = r24
            r0 = r35
            r2 = r56
            r35 = r11
            goto L_0x0560
        L_0x04bd:
            r55 = r8
            r56 = r11
            r4 = r12
            r31 = r15
            long[] r1 = new long[r3]
            int[] r5 = new int[r3]
            r11 = r26
            r6 = 0
            r7 = 0
            r8 = -1
        L_0x04cd:
            r9 = 1
            int r8 = r8 + r9
            if (r8 != r3) goto L_0x04d4
            r9 = 4
            r14 = 0
            goto L_0x04f8
        L_0x04d4:
            if (r10 == 0) goto L_0x04db
            long r11 = r0.mo14561p()
            goto L_0x04df
        L_0x04db:
            long r11 = r0.mo14558m()
        L_0x04df:
            if (r8 != r6) goto L_0x04f6
            int r7 = r13.mo14560o()
            r9 = 4
            r13.mo14551f(r9)
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x04f4
            int r6 = r13.mo14560o()
            r14 = 1
            int r6 = r6 - r14
            goto L_0x04f7
        L_0x04f4:
            r6 = -1
            goto L_0x04f7
        L_0x04f6:
            r9 = 4
        L_0x04f7:
            r14 = 1
        L_0x04f8:
            if (r14 == 0) goto L_0x04ff
            r1[r8] = r11
            r5[r8] = r7
            goto L_0x04cd
        L_0x04ff:
            int r0 = r4.mo14213b()
            long r6 = (long) r2
            r2 = 8192(0x2000, float:1.14794E-41)
            int r2 = r2 / r0
            r4 = 0
            r8 = 0
        L_0x0509:
            if (r4 >= r3) goto L_0x0515
            r9 = r5[r4]
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r9, (int) r2)
            int r8 = r8 + r9
            int r4 = r4 + 1
            goto L_0x0509
        L_0x0515:
            long[] r4 = new long[r8]
            int[] r9 = new int[r8]
            long[] r14 = new long[r8]
            int[] r8 = new int[r8]
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0521:
            if (r10 >= r3) goto L_0x055a
            r15 = r5[r10]
            r21 = r1[r10]
        L_0x0527:
            if (r15 <= 0) goto L_0x0553
            int r17 = java.lang.Math.min(r2, r15)
            r4[r13] = r21
            r23 = r1
            int r1 = r0 * r17
            r9[r13] = r1
            int r11 = java.lang.Math.max(r11, r1)
            r24 = r0
            long r0 = (long) r12
            long r0 = r0 * r6
            r14[r13] = r0
            r0 = 1
            r8[r13] = r0
            r0 = r9[r13]
            long r0 = (long) r0
            long r21 = r21 + r0
            int r12 = r12 + r17
            int r15 = r15 - r17
            int r13 = r13 + 1
            r1 = r23
            r0 = r24
            goto L_0x0527
        L_0x0553:
            r24 = r0
            r23 = r1
            int r10 = r10 + 1
            goto L_0x0521
        L_0x055a:
            r35 = r11
            r0 = r26
            r2 = r56
        L_0x0560:
            long[] r3 = r2.f11183i
            if (r3 == 0) goto L_0x07a4
            boolean r3 = r55.mo14185a()
            if (r3 == 0) goto L_0x056c
            goto L_0x07a4
        L_0x056c:
            long[] r3 = r2.f11183i
            int r7 = r3.length
            r10 = 1
            if (r7 != r10) goto L_0x0601
            int r7 = r2.f11176b
            if (r7 != r10) goto L_0x0601
            int r7 = r14.length
            r10 = 2
            if (r7 < r10) goto L_0x0601
            long[] r7 = r2.f11184j
            r10 = 0
            r11 = r7[r10]
            r36 = r3[r10]
            long r5 = r2.f11177c
            r23 = r11
            long r10 = r2.f11178d
            r38 = r5
            r40 = r10
            long r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r36, (long) r38, (long) r40)
            long r11 = r23 + r5
            r3 = 0
            r5 = r14[r3]
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 > 0) goto L_0x0601
            r3 = 1
            r15 = r14[r3]
            int r7 = (r23 > r15 ? 1 : (r23 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x0601
            int r7 = r14.length
            int r7 = r7 - r3
            r28 = r14[r7]
            int r3 = (r28 > r11 ? 1 : (r28 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0601
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0601
            long r36 = r0 - r11
            long r38 = r23 - r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r2.f11180f
            int r0 = r0.f11646s
            long r0 = (long) r0
            long r5 = r2.f11177c
            r40 = r0
            r42 = r5
            long r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r38, (long) r40, (long) r42)
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r2.f11180f
            int r3 = r3.f11646s
            long r5 = (long) r3
            long r10 = r2.f11177c
            r38 = r5
            r40 = r10
            long r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r36, (long) r38, (long) r40)
            int r3 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r3 != 0) goto L_0x05d5
            int r3 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r3 == 0) goto L_0x0601
        L_0x05d5:
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0601
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0601
            int r1 = (int) r0
            r0 = r55
            r0.f10806a = r1
            int r1 = (int) r5
            r0.f10807b = r1
            long r5 = r2.f11177c
            r10 = 1000000(0xf4240, double:4.940656E-318)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8595a((long[]) r14, (long) r10, (long) r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r12
            r33 = r4
            r34 = r9
            r36 = r14
            r37 = r8
            r32.<init>(r33, r34, r35, r36, r37)
            goto L_0x07bf
        L_0x0601:
            r0 = r55
            long[] r1 = r2.f11183i
            int r3 = r1.length
            r5 = 1
            if (r3 != r5) goto L_0x0642
            r19 = 0
            r5 = r1[r19]
            int r1 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x0642
            r1 = 0
        L_0x0612:
            int r3 = r14.length
            if (r1 >= r3) goto L_0x062f
            r5 = r14[r1]
            long[] r3 = r2.f11184j
            r10 = r3[r19]
            long r21 = r5 - r10
            long r5 = r2.f11177c
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r5
            long r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r21, (long) r23, (long) r25)
            r14[r1] = r5
            int r1 = r1 + 1
            r19 = 0
            goto L_0x0612
        L_0x062f:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r12
            r33 = r4
            r34 = r9
            r36 = r14
            r37 = r8
            r32.<init>(r33, r34, r35, r36, r37)
            r55 = r0
            goto L_0x07bf
        L_0x0642:
            int r1 = r2.f11176b
            r3 = 1
            if (r1 != r3) goto L_0x0649
            r1 = 1
            goto L_0x064a
        L_0x0649:
            r1 = 0
        L_0x064a:
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x064e:
            long[] r10 = r2.f11183i
            int r11 = r10.length
            r12 = -1
            if (r3 >= r11) goto L_0x068b
            long[] r11 = r2.f11184j
            r15 = r8
            r17 = r9
            r8 = r11[r3]
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x0685
            r36 = r10[r3]
            long r10 = r2.f11177c
            long r12 = r2.f11178d
            r38 = r10
            r40 = r12
            long r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r36, (long) r38, (long) r40)
            r12 = 1
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8590a(r14, r8, r12, r12)
            long r8 = r8 + r10
            r10 = 0
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8590a(r14, r8, r1, r10)
            int r9 = r8 - r13
            int r9 = r9 + r5
            if (r6 == r13) goto L_0x0680
            r5 = 1
            goto L_0x0681
        L_0x0680:
            r5 = 0
        L_0x0681:
            r5 = r5 | r7
            r7 = r5
            r6 = r8
            r5 = r9
        L_0x0685:
            int r3 = r3 + 1
            r8 = r15
            r9 = r17
            goto L_0x064e
        L_0x068b:
            r15 = r8
            r17 = r9
            r3 = r31
            if (r5 == r3) goto L_0x0694
            r3 = 1
            goto L_0x0695
        L_0x0694:
            r3 = 0
        L_0x0695:
            r3 = r3 | r7
            if (r3 == 0) goto L_0x069b
            long[] r6 = new long[r5]
            goto L_0x069c
        L_0x069b:
            r6 = r4
        L_0x069c:
            if (r3 == 0) goto L_0x06a1
            int[] r7 = new int[r5]
            goto L_0x06a3
        L_0x06a1:
            r7 = r17
        L_0x06a3:
            if (r3 == 0) goto L_0x06a7
            r35 = 0
        L_0x06a7:
            if (r3 == 0) goto L_0x06ac
            int[] r8 = new int[r5]
            goto L_0x06ad
        L_0x06ac:
            r8 = r15
        L_0x06ad:
            long[] r5 = new long[r5]
            r27 = r26
            r31 = r35
            r9 = 0
            r10 = 0
        L_0x06b5:
            long[] r11 = r2.f11183i
            int r12 = r11.length
            if (r10 >= r12) goto L_0x0772
            long[] r12 = r2.f11184j
            r13 = r7
            r33 = r8
            r7 = r12[r10]
            r34 = r11[r10]
            r11 = -1
            int r21 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r21 == 0) goto L_0x074d
            long r11 = r2.f11177c
            r36 = r4
            r32 = r5
            long r4 = r2.f11178d
            r21 = r34
            r23 = r11
            r25 = r4
            long r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r21, (long) r23, (long) r25)
            long r4 = r4 + r7
            r11 = 1
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8590a(r14, r7, r11, r11)
            r11 = 0
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8590a(r14, r4, r1, r11)
            if (r3 == 0) goto L_0x0701
            int r5 = r4 - r12
            r11 = r36
            java.lang.System.arraycopy(r11, r12, r6, r9, r5)
            r69 = r17
            r17 = r1
            r1 = r13
            r13 = r69
            java.lang.System.arraycopy(r13, r12, r1, r9, r5)
            r55 = r0
            r0 = r33
            java.lang.System.arraycopy(r15, r12, r0, r9, r5)
            goto L_0x070e
        L_0x0701:
            r55 = r0
            r0 = r33
            r11 = r36
            r69 = r17
            r17 = r1
            r1 = r13
            r13 = r69
        L_0x070e:
            r5 = r31
        L_0x0710:
            r33 = r10
            r36 = r11
            if (r12 >= r4) goto L_0x074a
            long r10 = r2.f11178d
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r27
            r25 = r10
            long r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r21, (long) r23, (long) r25)
            r21 = r14[r12]
            long r37 = r21 - r7
            r21 = r7
            long r7 = r2.f11177c
            r39 = 1000000(0xf4240, double:4.940656E-318)
            r41 = r7
            long r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r37, (long) r39, (long) r41)
            long r10 = r10 + r7
            r32[r9] = r10
            if (r3 == 0) goto L_0x073f
            r7 = r1[r9]
            if (r7 <= r5) goto L_0x073f
            r5 = r13[r12]
        L_0x073f:
            int r9 = r9 + 1
            int r12 = r12 + 1
            r7 = r21
            r10 = r33
            r11 = r36
            goto L_0x0710
        L_0x074a:
            r31 = r5
            goto L_0x075e
        L_0x074d:
            r55 = r0
            r36 = r4
            r32 = r5
            r0 = r33
            r33 = r10
            r69 = r17
            r17 = r1
            r1 = r13
            r13 = r69
        L_0x075e:
            long r27 = r27 + r34
            int r10 = r33 + 1
            r8 = r0
            r7 = r1
            r1 = r17
            r5 = r32
            r4 = r36
            r0 = r55
            r17 = r13
            r12 = -1
            goto L_0x06b5
        L_0x0772:
            r55 = r0
            r32 = r5
            r1 = r7
            r0 = r8
            r3 = 0
            r10 = 0
        L_0x077a:
            int r4 = r0.length
            if (r10 >= r4) goto L_0x078c
            if (r3 != 0) goto L_0x078c
            r4 = r0[r10]
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0787
            r4 = 1
            goto L_0x0788
        L_0x0787:
            r4 = 0
        L_0x0788:
            r3 = r3 | r4
            int r10 = r10 + 1
            goto L_0x077a
        L_0x078c:
            if (r3 == 0) goto L_0x079c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r28 = r12
            r29 = r6
            r30 = r1
            r33 = r0
            r28.<init>(r29, r30, r31, r32, r33)
            goto L_0x07bf
        L_0x079c:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x07a4:
            r36 = r4
            r15 = r8
            r13 = r9
            long r0 = r2.f11177c
            r3 = 1000000(0xf4240, double:4.940656E-318)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8595a((long[]) r14, (long) r3, (long) r0)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r12
            r33 = r36
            r34 = r13
            r36 = r14
            r37 = r15
            r32.<init>(r33, r34, r35, r36, r37)
        L_0x07bf:
            int r0 = r12.f11206a
            if (r0 != 0) goto L_0x07ce
        L_0x07c3:
            r4 = r20
            r6 = r49
            r0 = r51
            r5 = r55
            r3 = 0
            goto L_0x0957
        L_0x07ce:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a
            r1 = r70
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r3 = r1.f11166l
            int r4 = r2.f11176b
            r13 = r54
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r3 = r3.mo14122a(r13, r4)
            r0.<init>(r2, r12, r3)
            int r4 = r12.f11209d
            int r4 = r4 + 30
            r27 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r2.f11180f
            com.fyber.inneractive.sdk.player.exoplayer2.i r6 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r21 = r6
            java.lang.String r7 = r5.f11628a
            r22 = r7
            java.lang.String r8 = r5.f11632e
            r23 = r8
            java.lang.String r9 = r5.f11633f
            r24 = r9
            java.lang.String r10 = r5.f11630c
            r25 = r10
            int r11 = r5.f11629b
            r26 = r11
            int r14 = r5.f11637j
            r28 = r14
            int r15 = r5.f11638k
            r29 = r15
            float r1 = r5.f11639l
            r30 = r1
            int r13 = r5.f11640m
            r31 = r13
            r17 = r12
            float r12 = r5.f11641n
            r32 = r12
            r56 = r0
            byte[] r0 = r5.f11643p
            r33 = r0
            r57 = r3
            int r3 = r5.f11642o
            r34 = r3
            r58 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r3 = r5.f11644q
            r35 = r3
            r59 = r3
            int r3 = r5.f11645r
            r36 = r3
            r60 = r3
            int r3 = r5.f11646s
            r37 = r3
            r61 = r3
            int r3 = r5.f11647t
            r38 = r3
            r62 = r3
            int r3 = r5.f11648u
            r39 = r3
            int r3 = r5.f11649v
            r40 = r3
            int r3 = r5.f11651x
            r41 = r3
            r63 = r3
            java.lang.String r3 = r5.f11652y
            r42 = r3
            r64 = r3
            int r3 = r5.f11653z
            r43 = r3
            r66 = r12
            r65 = r13
            long r12 = r5.f11650w
            r44 = r12
            r67 = r12
            java.util.List<byte[]> r12 = r5.f11635h
            r46 = r12
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r12 = r5.f11636i
            r47 = r12
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r5 = r5.f11631d
            r48 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47, r48)
            int r5 = r2.f11176b
            r12 = 1
            if (r5 != r12) goto L_0x0933
            boolean r5 = r55.mo14185a()
            if (r5 == 0) goto L_0x08c0
            r5 = r55
            int r13 = r5.f10806a
            r39 = r13
            int r13 = r5.f10807b
            r40 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.i r13 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r21 = r13
            java.util.List<byte[]> r12 = r6.f11635h
            r46 = r12
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r12 = r6.f11636i
            r47 = r12
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r6 = r6.f11631d
            r48 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r4
            r28 = r14
            r29 = r15
            r30 = r1
            r31 = r65
            r32 = r66
            r33 = r0
            r34 = r58
            r35 = r59
            r36 = r60
            r37 = r61
            r38 = r62
            r41 = r63
            r42 = r64
            r43 = r3
            r44 = r67
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47, r48)
            r6 = r13
            goto L_0x08c2
        L_0x08c0:
            r5 = r55
        L_0x08c2:
            if (r53 == 0) goto L_0x0935
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r21 = r0
            java.lang.String r1 = r6.f11628a
            r22 = r1
            java.lang.String r1 = r6.f11632e
            r23 = r1
            java.lang.String r1 = r6.f11633f
            r24 = r1
            java.lang.String r1 = r6.f11630c
            r25 = r1
            int r1 = r6.f11629b
            r26 = r1
            int r1 = r6.f11634g
            r27 = r1
            int r1 = r6.f11637j
            r28 = r1
            int r1 = r6.f11638k
            r29 = r1
            float r1 = r6.f11639l
            r30 = r1
            int r1 = r6.f11640m
            r31 = r1
            float r1 = r6.f11641n
            r32 = r1
            byte[] r1 = r6.f11643p
            r33 = r1
            int r1 = r6.f11642o
            r34 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r1 = r6.f11644q
            r35 = r1
            int r1 = r6.f11645r
            r36 = r1
            int r1 = r6.f11646s
            r37 = r1
            int r1 = r6.f11647t
            r38 = r1
            int r1 = r6.f11648u
            r39 = r1
            int r1 = r6.f11649v
            r40 = r1
            int r1 = r6.f11651x
            r41 = r1
            java.lang.String r1 = r6.f11652y
            r42 = r1
            int r1 = r6.f11653z
            r43 = r1
            long r3 = r6.f11650w
            r44 = r3
            java.util.List<byte[]> r1 = r6.f11635h
            r46 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r1 = r6.f11636i
            r47 = r1
            r48 = r53
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47, r48)
            r6 = r0
            goto L_0x0935
        L_0x0933:
            r5 = r55
        L_0x0935:
            r0 = r57
            r0.mo14098a(r6)
            long r0 = r2.f11179e
            r2 = r51
            long r0 = java.lang.Math.max(r2, r0)
            r4 = r20
            r2 = r56
            r4.add(r2)
            r12 = r17
            long[] r2 = r12.f11207b
            r3 = 0
            r6 = r2[r3]
            int r2 = (r6 > r49 ? 1 : (r6 == r49 ? 0 : -1))
            if (r2 >= 0) goto L_0x0955
            goto L_0x0957
        L_0x0955:
            r6 = r49
        L_0x0957:
            int r9 = r54 + 1
            r10 = 12
            r11 = 0
            r12 = 1
            r13 = 0
            r8 = r5
            r2 = r53
            r5 = r4
            r3 = r0
            r0 = r18
            r1 = r70
            goto L_0x023c
        L_0x0969:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0971:
            r2 = r3
            r4 = r5
            r1.f11168n = r2
            int r0 = r4.size()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3154f.C3155a[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3154f.C3155a[]) r0
            r1.f11167m = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r1.f11166l
            r0.mo14124c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r1.f11166l
            r0.mo14123a(r1)
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11158d
            r0.clear()
            r0 = 2
            r1.f11159e = r0
            goto L_0x0002
        L_0x0997:
            r18 = r0
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11158d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0002
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f11158d
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r0.f11058R0
            r2 = r18
            r0.add(r2)
            goto L_0x0002
        L_0x09b2:
            int r0 = r1.f11159e
            r2 = 2
            if (r0 == r2) goto L_0x09ba
            r70.mo14221d()
        L_0x09ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3154f.mo14220c(long):void");
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f11158d.clear();
        this.f11162h = 0;
        this.f11164j = 0;
        this.f11165k = 0;
        if (j == 0) {
            mo14221d();
            return;
        }
        C3155a[] aVarArr = this.f11167m;
        if (aVarArr != null) {
            for (C3155a aVar : aVarArr) {
                C3160k kVar = aVar.f11171b;
                int a = kVar.mo14223a(j2);
                if (a == -1) {
                    a = kVar.mo14224b(j2);
                }
                aVar.f11173d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0190 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r24, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f11159e
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x0192
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0112
            if (r3 != r10) goto L_0x010c
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001d:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r14 = r0.f11167m
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003a
            r14 = r14[r3]
            int r15 = r14.f11173d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r14 = r14.f11171b
            int r11 = r14.f11206a
            if (r15 != r11) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            long[] r11 = r14.f11207b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            r5 = r3
            r12 = r14
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x003a:
            if (r5 != r4) goto L_0x003e
            goto L_0x010b
        L_0x003e:
            r3 = r14[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r3.f11172c
            int r5 = r3.f11173d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r11 = r3.f11171b
            long[] r12 = r11.f11207b
            r13 = r12[r5]
            int[] r11 = r11.f11208c
            r11 = r11[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r12 = r3.f11170a
            int r12 = r12.f11181g
            if (r12 != r6) goto L_0x005a
            r16 = 8
            long r13 = r13 + r16
            int r11 = r11 + -8
        L_0x005a:
            r12 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r12 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r12
            r16 = r11
            long r10 = r12.f10548c
            long r10 = r13 - r10
            int r15 = r0.f11164j
            long r6 = (long) r15
            long r10 = r10 + r6
            r6 = 0
            int r15 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x0108
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0073
            goto L_0x0108
        L_0x0073:
            int r2 = (int) r10
            r12.mo14088c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = r3.f11170a
            int r2 = r2.f11185k
            if (r2 == 0) goto L_0x00cc
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f11156b
            byte[] r6 = r6.f12121a
            r7 = 0
            r6[r7] = r7
            r8 = 1
            r6[r8] = r7
            r8 = 2
            r6[r8] = r7
            int r6 = 4 - r2
            r11 = r16
        L_0x008e:
            int r8 = r0.f11164j
            if (r8 >= r11) goto L_0x00e6
            int r8 = r0.f11165k
            if (r8 != 0) goto L_0x00bc
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11156b
            byte[] r8 = r8.f12121a
            r12.mo14087b(r8, r6, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11156b
            r8.mo14549e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11156b
            int r8 = r8.mo14560o()
            r0.f11165k = r8
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11155a
            r8.mo14549e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f11155a
            r9 = 4
            r4.mo14099a(r8, r9)
            int r8 = r0.f11164j
            int r8 = r8 + r9
            r0.f11164j = r8
            int r11 = r11 + r6
            goto L_0x008e
        L_0x00bc:
            int r8 = r4.mo14092a(r1, r8, r7)
            int r7 = r0.f11164j
            int r7 = r7 + r8
            r0.f11164j = r7
            int r7 = r0.f11165k
            int r7 = r7 - r8
            r0.f11165k = r7
            r7 = 0
            goto L_0x008e
        L_0x00cc:
            int r2 = r0.f11164j
            r11 = r16
            if (r2 >= r11) goto L_0x00e6
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.mo14092a(r1, r2, r6)
            int r6 = r0.f11164j
            int r6 = r6 + r2
            r0.f11164j = r6
            int r6 = r0.f11165k
            int r6 = r6 - r2
            r0.f11165k = r6
            r16 = r11
            goto L_0x00cc
        L_0x00e6:
            r20 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r1 = r3.f11171b
            long[] r2 = r1.f11210e
            r17 = r2[r5]
            int[] r1 = r1.f11211f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.mo14096a(r17, r19, r20, r21, r22)
            int r1 = r3.f11173d
            r2 = 1
            int r1 = r1 + r2
            r3.f11173d = r1
            r1 = 0
            r0.f11164j = r1
            r0.f11165k = r1
            r4 = 0
            goto L_0x010b
        L_0x0108:
            r2.f10822a = r13
            r4 = 1
        L_0x010b:
            return r4
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0112:
            long r3 = r0.f11161g
            int r6 = r0.f11162h
            long r10 = (long) r6
            long r3 = r3 - r10
            r7 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r7
            long r10 = r7.f10548c
            long r10 = r10 + r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r12 = r0.f11163i
            if (r12 == 0) goto L_0x0174
            byte[] r8 = r12.f12121a
            int r4 = (int) r3
            r3 = 0
            r7.mo14087b(r8, r6, r4, r3)
            int r3 = r0.f11160f
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11005b
            if (r3 != r4) goto L_0x0155
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11163i
            r3.mo14549e(r5)
            int r4 = r3.mo14544c()
            int r5 = f11154p
            if (r4 != r5) goto L_0x013d
            goto L_0x014f
        L_0x013d:
            r4 = 4
            r3.mo14551f(r4)
        L_0x0141:
            int r4 = r3.mo14537a()
            if (r4 <= 0) goto L_0x0151
            int r4 = r3.mo14544c()
            int r5 = f11154p
            if (r4 != r5) goto L_0x0141
        L_0x014f:
            r3 = 1
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            r0.f11169o = r3
            goto L_0x017c
        L_0x0155:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f11158d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x017c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f11158d
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.C3142a) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b
            int r5 = r0.f11160f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f11163i
            r4.<init>(r5, r6)
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r3.f11057Q0
            r3.add(r4)
            goto L_0x017c
        L_0x0174:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x017e
            int r4 = (int) r3
            r7.mo14088c(r4)
        L_0x017c:
            r3 = 0
            goto L_0x0181
        L_0x017e:
            r2.f10822a = r10
            r3 = 1
        L_0x0181:
            r0.mo14220c(r10)
            if (r3 == 0) goto L_0x018d
            int r3 = r0.f11159e
            r4 = 2
            if (r3 == r4) goto L_0x018d
            r7 = 1
            goto L_0x018e
        L_0x018d:
            r7 = 0
        L_0x018e:
            if (r7 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0192:
            r3 = 1
            int r6 = r0.f11162h
            if (r6 != 0) goto L_0x01bf
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f11157c
            byte[] r6 = r6.f12121a
            r7 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r7
            r8 = 0
            boolean r6 = r7.mo14087b(r6, r8, r5, r3)
            if (r6 != 0) goto L_0x01a8
            r6 = 0
            goto L_0x02a8
        L_0x01a8:
            r0.f11162h = r5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11157c
            r3.mo14549e(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11157c
            long r6 = r3.mo14558m()
            r0.f11161g = r6
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11157c
            int r3 = r3.mo14544c()
            r0.f11160f = r3
        L_0x01bf:
            long r6 = r0.f11161g
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01df
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11157c
            byte[] r3 = r3.f12121a
            r6 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r6
            r7 = 0
            r6.mo14087b(r3, r5, r5, r7)
            int r3 = r0.f11162h
            int r3 = r3 + r5
            r0.f11162h = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f11157c
            long r6 = r3.mo14561p()
            r0.f11161g = r6
        L_0x01df:
            int r3 = r0.f11160f
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10967C
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10971E
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10973F
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10975G
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10977H
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10994Q
            if (r3 != r6) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r7 = 0
            goto L_0x01fd
        L_0x01fc:
            r7 = 1
        L_0x01fd:
            if (r7 == 0) goto L_0x022a
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r3
            long r5 = r3.f10548c
            long r7 = r0.f11161g
            long r5 = r5 + r7
            int r3 = r0.f11162h
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f11158d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a
            int r8 = r0.f11160f
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.f11161g
            int r3 = r0.f11162h
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0224
            r0.mo14220c(r5)
            goto L_0x0227
        L_0x0224:
            r23.mo14221d()
        L_0x0227:
            r3 = 1
            goto L_0x02a7
        L_0x022a:
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10996S
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10969D
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10997T
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10998U
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11028m0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11030n0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11032o0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10995R
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11034p0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11036q0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11038r0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11040s0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11042t0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10993P
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f11005b
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3141a.f10964A0
            if (r3 != r6) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r7 = 0
            goto L_0x026e
        L_0x026d:
            r7 = 1
        L_0x026e:
            if (r7 == 0) goto L_0x02a1
            int r3 = r0.f11162h
            if (r3 != r5) goto L_0x0276
            r7 = 1
            goto L_0x0277
        L_0x0276:
            r7 = 0
        L_0x0277:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r7)
            long r6 = r0.f11161g
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0285
            r7 = 1
            goto L_0x0286
        L_0x0285:
            r7 = 0
        L_0x0286:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            long r6 = r0.f11161g
            int r7 = (int) r6
            r3.<init>((int) r7)
            r0.f11163i = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f11157c
            byte[] r6 = r6.f12121a
            byte[] r3 = r3.f12121a
            r7 = 0
            java.lang.System.arraycopy(r6, r7, r3, r7, r5)
            r3 = 1
            r0.f11159e = r3
            goto L_0x02a7
        L_0x02a1:
            r3 = 1
            r5 = 0
            r0.f11163i = r5
            r0.f11159e = r3
        L_0x02a7:
            r6 = 1
        L_0x02a8:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3154f.mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public long mo14078a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C3155a aVar : this.f11167m) {
            C3160k kVar = aVar.f11171b;
            int a = kVar.mo14223a(j);
            if (a == -1) {
                a = kVar.mo14224b(j);
            }
            long j3 = kVar.f11207b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
