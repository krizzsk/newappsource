package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C3137b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3181a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3183c;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3262i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3280d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f */
public final class C3097f extends C3280d {

    /* renamed from: G */
    public static final AtomicInteger f10641G = new AtomicInteger();

    /* renamed from: A */
    public int f10642A;

    /* renamed from: B */
    public int f10643B;

    /* renamed from: C */
    public boolean f10644C;

    /* renamed from: D */
    public C3101j f10645D;

    /* renamed from: E */
    public volatile boolean f10646E;

    /* renamed from: F */
    public volatile boolean f10647F;

    /* renamed from: j */
    public final int f10648j;

    /* renamed from: k */
    public final int f10649k;

    /* renamed from: l */
    public final C3106a.C3107a f10650l;

    /* renamed from: m */
    public final C3353g f10651m;

    /* renamed from: n */
    public final C3357j f10652n;

    /* renamed from: o */
    public final boolean f10653o = (this.f11785h instanceof C3089a);

    /* renamed from: p */
    public final boolean f10654p;

    /* renamed from: q */
    public final C3403r f10655q;

    /* renamed from: r */
    public final String f10656r;

    /* renamed from: s */
    public final C3080f f10657s;

    /* renamed from: t */
    public final boolean f10658t;

    /* renamed from: u */
    public final boolean f10659u;

    /* renamed from: v */
    public final List<C3226i> f10660v;

    /* renamed from: w */
    public final boolean f10661w;

    /* renamed from: x */
    public final C3258g f10662x;

    /* renamed from: y */
    public final C3393k f10663y;

    /* renamed from: z */
    public C3080f f10664z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3097f(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g r17, com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j r18, com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j r19, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a.C3107a r20, java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.C3226i> r21, int r22, java.lang.Object r23, long r24, long r26, int r28, int r29, boolean r30, com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r r31, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f r32, byte[] r33, byte[] r34) {
        /*
            r16 = this;
            r11 = r16
            r12 = r17
            r13 = r20
            r14 = r29
            r15 = r32
            r0 = r33
            r1 = r34
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r1 = m7760a(r12, r0, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r13.f10729b
            r0 = r16
            r2 = r18
            r4 = r22
            r5 = r23
            r6 = r24
            r8 = r26
            r10 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r11.f10649k = r14
            r0 = r19
            r11.f10652n = r0
            r11.f10650l = r13
            r0 = r21
            r11.f10660v = r0
            r0 = r30
            r11.f10654p = r0
            r0 = r31
            r11.f10655q = r0
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r0 = r11.f11785h
            boolean r0 = r0 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3089a
            r11.f10653o = r0
            r0 = r18
            android.net.Uri r0 = r0.f12004a
            java.lang.String r0 = r0.getLastPathSegment()
            r11.f10656r = r0
            java.lang.String r1 = ".aac"
            boolean r1 = r0.endsWith(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ".ac3"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ".ec3"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ".mp3"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r0 = 0
            goto L_0x006f
        L_0x006e:
            r0 = 1
        L_0x006f:
            r11.f10661w = r0
            if (r15 == 0) goto L_0x0092
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g r0 = r15.f10662x
            r11.f10662x = r0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r15.f10663y
            r11.f10663y = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r15.f10664z
            r11.f10657s = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r0 = r15.f10650l
            if (r0 == r13) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            r11.f10658t = r0
            int r1 = r15.f10649k
            if (r1 != r14) goto L_0x008e
            if (r0 == 0) goto L_0x008f
        L_0x008e:
            r2 = 1
        L_0x008f:
            r11.f10659u = r2
            goto L_0x00b1
        L_0x0092:
            r1 = 0
            if (r0 == 0) goto L_0x009b
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g r4 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g
            r4.<init>()
            goto L_0x009c
        L_0x009b:
            r4 = r1
        L_0x009c:
            r11.f10662x = r4
            if (r0 == 0) goto L_0x00a8
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r4 = 10
            r0.<init>((int) r4)
            goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            r11.f10663y = r0
            r11.f10657s = r1
            r11.f10658t = r2
            r11.f10659u = r3
        L_0x00b1:
            r11.f10651m = r12
            java.util.concurrent.atomic.AtomicInteger r0 = f10641G
            int r0 = r0.getAndIncrement()
            r11.f10648j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f.<init>(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a, java.util.List, int, java.lang.Object, long, long, int, int, boolean, com.fyber.inneractive.sdk.player.exoplayer2.util.r, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f, byte[], byte[]):void");
    }

    /* renamed from: a */
    public boolean mo14134a() {
        return this.f10646E;
    }

    /* renamed from: b */
    public void mo14135b() {
        this.f10646E = true;
    }

    /* renamed from: c */
    public long mo14136c() {
        return (long) this.f10643B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ac A[Catch:{ all -> 0x01d7, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c5 A[Catch:{ all -> 0x01d7, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cc A[SYNTHETIC, Splitter:B:126:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load() throws java.io.IOException, java.lang.InterruptedException {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f10664z
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r14.f10661w
            if (r0 != 0) goto L_0x00ed
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r0 = r14.f10650l
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f10729b
            java.lang.String r0 = r0.f11633f
            java.lang.String r4 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = r14.f10656r
            java.lang.String r4 = ".webvtt"
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = r14.f10656r
            java.lang.String r4 = ".vtt"
            boolean r0 = r0.endsWith(r4)
            if (r0 == 0) goto L_0x0030
            goto L_0x00d8
        L_0x0030:
            boolean r0 = r14.f10659u
            if (r0 != 0) goto L_0x0039
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f10657s
            r4 = 0
            goto L_0x00e4
        L_0x0039:
            java.lang.String r0 = r14.f10656r
            java.lang.String r4 = ".mp4"
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = r14.f10656r
            int r4 = r0.length()
            int r4 = r4 + -4
            java.lang.String r5 = ".m4"
            boolean r0 = r0.startsWith(r5, r4)
            if (r0 == 0) goto L_0x0055
            goto L_0x00d0
        L_0x0055:
            r0 = 16
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.i> r4 = r14.f10660v
            if (r4 == 0) goto L_0x005e
            r0 = 48
            goto L_0x0062
        L_0x005e:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0062:
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r14.f11780c
            java.lang.String r5 = r5.f11630c
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00c1
            java.lang.String r6 = "audio/mp4a-latm"
            if (r5 != 0) goto L_0x0071
            goto L_0x008d
        L_0x0071:
            java.lang.String r7 = ","
            java.lang.String[] r7 = r5.split(r7)
            int r8 = r7.length
            r9 = 0
        L_0x0079:
            if (r9 >= r8) goto L_0x008d
            r10 = r7[r9]
            java.lang.String r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8518a(r10)
            if (r10 == 0) goto L_0x008a
            boolean r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8521d(r10)
            if (r11 == 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            int r9 = r9 + 1
            goto L_0x0079
        L_0x008d:
            r10 = r1
        L_0x008e:
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0096
            r0 = r0 | 2
        L_0x0096:
            java.lang.String r6 = "video/avc"
            if (r5 != 0) goto L_0x009c
            goto L_0x00b8
        L_0x009c:
            java.lang.String r7 = ","
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            r8 = 0
        L_0x00a4:
            if (r8 >= r7) goto L_0x00b8
            r9 = r5[r8]
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8518a(r9)
            if (r9 == 0) goto L_0x00b5
            boolean r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8522e(r9)
            if (r10 == 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x00b8:
            r9 = r1
        L_0x00b9:
            boolean r5 = r6.equals(r9)
            if (r5 != 0) goto L_0x00c1
            r0 = r0 | 4
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = r14.f10655q
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e
            r7.<init>(r0, r4)
            r0 = 2
            r5.<init>(r0, r6, r7)
            r0 = r5
            goto L_0x00e3
        L_0x00d0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r4 = r14.f10655q
            r0.<init>(r3, r4, r1)
            goto L_0x00e3
        L_0x00d8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r14.f11780c
            java.lang.String r4 = r4.f11652y
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r5 = r14.f10655q
            r0.<init>(r4, r5)
        L_0x00e3:
            r4 = 1
        L_0x00e4:
            if (r4 == 0) goto L_0x00eb
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j r4 = r14.f10645D
            r0.mo14114a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h) r4)
        L_0x00eb:
            r14.f10664z = r0
        L_0x00ed:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f10657s
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r4 = r14.f10664z
            if (r0 == r4) goto L_0x0143
            boolean r0 = r14.f10644C
            if (r0 != 0) goto L_0x0143
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f10652n
            if (r0 != 0) goto L_0x00fc
            goto L_0x0143
        L_0x00fc:
            int r4 = r14.f10642A
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8592a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j) r0, (int) r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b     // Catch:{ all -> 0x013c }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r5 = r14.f10651m     // Catch:{ all -> 0x013c }
            long r6 = r0.f12006c     // Catch:{ all -> 0x013c }
            long r8 = r5.mo13780a(r0)     // Catch:{ all -> 0x013c }
            r4 = r10
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x013c }
            r0 = 0
        L_0x0111:
            if (r0 != 0) goto L_0x012a
            boolean r0 = r14.f10646E     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x012a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f10664z     // Catch:{ all -> 0x011e }
            int r0 = r0.mo14112a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g) r10, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l) r1)     // Catch:{ all -> 0x011e }
            goto L_0x0111
        L_0x011e:
            r0 = move-exception
            long r1 = r10.f10548c     // Catch:{ all -> 0x013c }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r3 = r14.f10652n     // Catch:{ all -> 0x013c }
            long r3 = r3.f12006c     // Catch:{ all -> 0x013c }
            long r1 = r1 - r3
            int r2 = (int) r1     // Catch:{ all -> 0x013c }
            r14.f10642A = r2     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x012a:
            long r4 = r10.f10548c     // Catch:{ all -> 0x013c }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f10652n     // Catch:{ all -> 0x013c }
            long r6 = r0.f12006c     // Catch:{ all -> 0x013c }
            long r4 = r4 - r6
            int r0 = (int) r4     // Catch:{ all -> 0x013c }
            r14.f10642A = r0     // Catch:{ all -> 0x013c }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r0 = r14.f11785h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8593a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g) r0)
            r14.f10644C = r2
            goto L_0x0143
        L_0x013c:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r1 = r14.f11785h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8593a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g) r1)
            throw r0
        L_0x0143:
            boolean r0 = r14.f10646E
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r14.f10653o
            if (r0 == 0) goto L_0x0153
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f11778a
            int r4 = r14.f10643B
            if (r4 == 0) goto L_0x015b
            r4 = 1
            goto L_0x015c
        L_0x0153:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f11778a
            int r4 = r14.f10643B
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8592a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j) r0, (int) r4)
        L_0x015b:
            r4 = 0
        L_0x015c:
            boolean r5 = r14.f10654p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L_0x0177
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r5 = r14.f10655q
            monitor-enter(r5)
        L_0x0168:
            long r8 = r5.f12147c     // Catch:{ all -> 0x0174 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0172
            r5.wait()     // Catch:{ all -> 0x0174 }
            goto L_0x0168
        L_0x0172:
            monitor-exit(r5)
            goto L_0x019a
        L_0x0174:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0177:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r5 = r14.f10655q
            long r8 = r5.f12145a
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x019a
            long r8 = r14.f11783f
            monitor-enter(r5)
            long r10 = r5.f12147c     // Catch:{ all -> 0x0197 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x018f
            r10 = 1
            goto L_0x0190
        L_0x018f:
            r10 = 0
        L_0x0190:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r10)     // Catch:{ all -> 0x0197 }
            r5.f12145a = r8     // Catch:{ all -> 0x0197 }
            monitor-exit(r5)
            goto L_0x019a
        L_0x0197:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x019a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b     // Catch:{ all -> 0x01f5 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r9 = r14.f11785h     // Catch:{ all -> 0x01f5 }
            long r10 = r0.f12006c     // Catch:{ all -> 0x01f5 }
            long r12 = r9.mo13780a(r0)     // Catch:{ all -> 0x01f5 }
            r8 = r5
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x01f5 }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f10664z     // Catch:{ all -> 0x01f5 }
            if (r0 != 0) goto L_0x01c3
            long r8 = r14.mo14132a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g) r5)     // Catch:{ all -> 0x01f5 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01bb
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r0 = r14.f10655q     // Catch:{ all -> 0x01f5 }
            long r6 = r0.mo14584b(r8)     // Catch:{ all -> 0x01f5 }
            goto L_0x01bd
        L_0x01bb:
            long r6 = r14.f11783f     // Catch:{ all -> 0x01f5 }
        L_0x01bd:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.mo14133a((long) r6)     // Catch:{ all -> 0x01f5 }
            r14.f10664z = r0     // Catch:{ all -> 0x01f5 }
        L_0x01c3:
            if (r4 == 0) goto L_0x01ca
            int r0 = r14.f10643B     // Catch:{ all -> 0x01f5 }
            r5.mo14088c(r0)     // Catch:{ all -> 0x01f5 }
        L_0x01ca:
            if (r3 != 0) goto L_0x01e3
            boolean r0 = r14.f10646E     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x01e3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f10664z     // Catch:{ all -> 0x01d7 }
            int r3 = r0.mo14112a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g) r5, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l) r1)     // Catch:{ all -> 0x01d7 }
            goto L_0x01ca
        L_0x01d7:
            r0 = move-exception
            long r1 = r5.f10548c     // Catch:{ all -> 0x01f5 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r3 = r14.f11778a     // Catch:{ all -> 0x01f5 }
            long r3 = r3.f12006c     // Catch:{ all -> 0x01f5 }
            long r1 = r1 - r3
            int r2 = (int) r1     // Catch:{ all -> 0x01f5 }
            r14.f10643B = r2     // Catch:{ all -> 0x01f5 }
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01e3:
            long r0 = r5.f10548c     // Catch:{ all -> 0x01f5 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r3 = r14.f11778a     // Catch:{ all -> 0x01f5 }
            long r3 = r3.f12006c     // Catch:{ all -> 0x01f5 }
            long r0 = r0 - r3
            int r1 = (int) r0     // Catch:{ all -> 0x01f5 }
            r14.f10643B = r1     // Catch:{ all -> 0x01f5 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r0 = r14.f11785h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8593a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g) r0)
            r14.f10647F = r2
            goto L_0x01fc
        L_0x01f5:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r1 = r14.f11785h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8593a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g) r1)
            throw r0
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f.load():void");
    }

    /* renamed from: a */
    public final long mo14132a(C3087g gVar) throws IOException, InterruptedException {
        C3243a a;
        C3072b bVar = (C3072b) gVar;
        bVar.f10550e = 0;
        if (!bVar.mo14085a(this.f10663y.f12121a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f10663y.mo14545c(10);
        if (this.f10663y.mo14559n() != C3258g.f11739b) {
            return -9223372036854775807L;
        }
        this.f10663y.mo14551f(3);
        int k = this.f10663y.mo14556k();
        int i = k + 10;
        if (i > this.f10663y.mo14542b()) {
            C3393k kVar = this.f10663y;
            byte[] bArr = kVar.f12121a;
            kVar.mo14545c(i);
            System.arraycopy(bArr, 0, this.f10663y.f12121a, 0, 10);
        }
        if (!bVar.mo14085a(this.f10663y.f12121a, 10, k, true) || (a = this.f10662x.mo14388a(this.f10663y.f12121a, k)) == null) {
            return -9223372036854775807L;
        }
        for (C3243a.C3245b bVar2 : a.f11715a) {
            if (bVar2 instanceof C3262i) {
                C3262i iVar = (C3262i) bVar2;
                if ("com.apple.streaming.transportStreamTimestamp".equals(iVar.f11745b)) {
                    System.arraycopy(iVar.f11746c, 0, this.f10663y.f12121a, 0, 8);
                    this.f10663y.mo14545c(8);
                    return this.f10663y.mo14554i();
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public static C3353g m7760a(C3353g gVar, byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null) ? gVar : new C3089a(gVar, bArr, bArr2);
    }

    /* renamed from: a */
    public final C3080f mo14133a(long j) {
        C3080f fVar;
        if (this.f10656r.endsWith(".aac")) {
            fVar = new C3183c(j);
        } else if (this.f10656r.endsWith(".ac3") || this.f10656r.endsWith(".ec3")) {
            fVar = new C3181a(j);
        } else if (this.f10656r.endsWith(".mp3")) {
            fVar = new C3137b(0, j);
        } else {
            StringBuilder k = C13555b.m33972k("Unkown extension for audio file: ");
            k.append(this.f10656r);
            throw new IllegalArgumentException(k.toString());
        }
        fVar.mo14114a((C3088h) this.f10645D);
        return fVar;
    }
}
