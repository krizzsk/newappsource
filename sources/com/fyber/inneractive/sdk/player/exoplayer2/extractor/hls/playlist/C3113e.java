package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3090b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3095d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3096e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3099h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3108b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3303q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3278b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3377y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3405t;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C3418b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e */
public final class C3113e implements C3372x.C3373a<C3377y<C3110c>> {

    /* renamed from: a */
    public final Uri f10779a;

    /* renamed from: b */
    public final C3095d f10780b;

    /* renamed from: c */
    public final C3111d f10781c = new C3111d();

    /* renamed from: d */
    public final int f10782d;

    /* renamed from: e */
    public final IdentityHashMap<C3106a.C3107a, C3114a> f10783e = new IdentityHashMap<>();

    /* renamed from: f */
    public final Handler f10784f = new Handler();

    /* renamed from: g */
    public final C3118e f10785g;

    /* renamed from: h */
    public final List<C3115b> f10786h = new ArrayList();

    /* renamed from: i */
    public final C3372x f10787i = new C3372x("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: j */
    public final C3283f.C3284a f10788j;

    /* renamed from: k */
    public C3106a f10789k;

    /* renamed from: l */
    public C3106a.C3107a f10790l;

    /* renamed from: m */
    public C3108b f10791m;

    /* renamed from: n */
    public boolean f10792n;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$b */
    public interface C3115b {
        /* renamed from: a */
        void mo14141a(C3106a.C3107a aVar, long j);

        /* renamed from: c */
        void mo14147c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c */
    public static final class C3116c extends IOException {
        public C3116c(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d */
    public static final class C3117d extends IOException {
        public C3117d(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$e */
    public interface C3118e {
    }

    public C3113e(Uri uri, C3095d dVar, C3283f.C3284a aVar, int i, C3118e eVar) {
        this.f10779a = uri;
        this.f10780b = dVar;
        this.f10788j = aVar;
        this.f10782d = i;
        this.f10785g = eVar;
    }

    /* renamed from: a */
    public void mo14166a(C3372x.C3375c cVar, long j, long j2, boolean z) {
        C3377y yVar = (C3377y) cVar;
        this.f10788j.mo14418a(yVar.f12078a, 4, j, j2, yVar.f12083f);
    }

    /* renamed from: b */
    public boolean mo14180b(C3106a.C3107a aVar) {
        int i;
        C3114a aVar2 = this.f10783e.get(aVar);
        if (aVar2.f10796d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C3052b.m7658b(aVar2.f10796d.f10743o));
            C3108b bVar = aVar2.f10796d;
            if (bVar.f10738j || (i = bVar.f10730b) == 2 || i == 1 || aVar2.f10797e + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo14165a(C3372x.C3375c cVar, long j, long j2) {
        C3377y yVar;
        C3106a aVar;
        C3377y yVar2 = (C3377y) cVar;
        C3110c cVar2 = (C3110c) yVar2.f12081d;
        boolean z = cVar2 instanceof C3108b;
        if (z) {
            String str = cVar2.f10753a;
            yVar = yVar2;
            C3226i iVar = r5;
            C3226i iVar2 = new C3226i("0", "application/x-mpegURL", (String) null, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (C3059a) null, (C3243a) null);
            List singletonList = Collections.singletonList(new C3106a.C3107a(str, iVar));
            List emptyList = Collections.emptyList();
            aVar = new C3106a((String) null, singletonList, emptyList, emptyList, (C3226i) null, (List<C3226i>) null);
        } else {
            yVar = yVar2;
            aVar = (C3106a) cVar2;
        }
        this.f10789k = aVar;
        this.f10790l = aVar.f10723b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f10723b);
        arrayList.addAll(aVar.f10724c);
        arrayList.addAll(aVar.f10725d);
        int size = arrayList.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C3106a.C3107a aVar2 = (C3106a.C3107a) arrayList.get(i);
            this.f10783e.put(aVar2, new C3114a(aVar2, elapsedRealtime));
        }
        C3114a aVar3 = this.f10783e.get(this.f10790l);
        if (z) {
            aVar3.mo14182a((C3108b) cVar2);
        } else {
            aVar3.mo14183b();
        }
        C3377y yVar3 = yVar;
        this.f10788j.mo14420b(yVar3.f12078a, 4, j, j2, yVar3.f12083f);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a */
    public final class C3114a implements C3372x.C3373a<C3377y<C3110c>>, Runnable {

        /* renamed from: a */
        public final C3106a.C3107a f10793a;

        /* renamed from: b */
        public final C3372x f10794b = new C3372x("HlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        public final C3377y<C3110c> f10795c;

        /* renamed from: d */
        public C3108b f10796d;

        /* renamed from: e */
        public long f10797e;

        /* renamed from: f */
        public long f10798f;

        /* renamed from: g */
        public long f10799g;

        /* renamed from: h */
        public long f10800h;

        /* renamed from: i */
        public boolean f10801i;

        /* renamed from: j */
        public IOException f10802j;

        public C3114a(C3106a.C3107a aVar, long j) {
            this.f10793a = aVar;
            this.f10799g = j;
            this.f10795c = new C3377y<>(((C3090b) C3113e.this.f10780b).mo14125a(4), C3405t.m8584a(C3113e.this.f10789k.f10753a, aVar.f10728a), 4, C3113e.this.f10781c);
        }

        /* renamed from: a */
        public void mo14166a(C3372x.C3375c cVar, long j, long j2, boolean z) {
            C3377y yVar = (C3377y) cVar;
            C3113e.this.f10788j.mo14418a(yVar.f12078a, 4, j, j2, yVar.f12083f);
        }

        /* renamed from: b */
        public void mo14183b() {
            this.f10800h = 0;
            if (!this.f10801i && !this.f10794b.mo14516b()) {
                this.f10794b.mo14514a(this.f10795c, this, C3113e.this.f10782d);
            }
        }

        public void run() {
            this.f10801i = false;
            mo14183b();
        }

        /* renamed from: a */
        public void mo14165a(C3372x.C3375c cVar, long j, long j2) {
            C3377y yVar = (C3377y) cVar;
            C3110c cVar2 = (C3110c) yVar.f12081d;
            if (cVar2 instanceof C3108b) {
                mo14182a((C3108b) cVar2);
                C3113e.this.f10788j.mo14420b(yVar.f12078a, 4, j, j2, yVar.f12083f);
                return;
            }
            this.f10802j = new C3230l("Loaded playlist has unexpected type.");
        }

        /* renamed from: a */
        public int mo14162a(C3372x.C3375c cVar, long j, long j2, IOException iOException) {
            C3377y yVar = (C3377y) cVar;
            boolean z = iOException instanceof C3230l;
            C3113e.this.f10788j.mo14419a(yVar.f12078a, 4, j, j2, yVar.f12083f, iOException, z);
            if (z) {
                return 3;
            }
            boolean z2 = true;
            if (C3278b.m8284a(iOException)) {
                mo14181a();
                C3113e eVar = C3113e.this;
                if (eVar.f10790l != this.f10793a || C3113e.m7825a(eVar)) {
                    z2 = false;
                }
            }
            if (z2) {
                return 0;
            }
            return 2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
            r7 = r1.f10735g;
            r8 = r2.f10735g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r7 = r1.f10741m.size();
            r8 = r2.f10741m.size();
         */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x017c  */
        /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo14182a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3108b r28) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r2 = r0.f10796d
                long r3 = android.os.SystemClock.elapsedRealtime()
                r0.f10797e = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.this
                r5.getClass()
                r28.getClass()
                r6 = 0
                if (r2 == 0) goto L_0x003c
                int r7 = r1.f10735g
                int r8 = r2.f10735g
                if (r7 <= r8) goto L_0x001e
                goto L_0x003c
            L_0x001e:
                if (r7 >= r8) goto L_0x0021
                goto L_0x003a
            L_0x0021:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r7 = r1.f10741m
                int r7 = r7.size()
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r8 = r2.f10741m
                int r8 = r8.size()
                if (r7 > r8) goto L_0x003c
                if (r7 != r8) goto L_0x003a
                boolean r7 = r1.f10738j
                if (r7 == 0) goto L_0x003a
                boolean r7 = r2.f10738j
                if (r7 != 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r7 = 0
                goto L_0x003d
            L_0x003c:
                r7 = 1
            L_0x003d:
                if (r7 != 0) goto L_0x0083
                boolean r5 = r1.f10738j
                if (r5 == 0) goto L_0x007e
                boolean r5 = r2.f10738j
                if (r5 == 0) goto L_0x0048
                goto L_0x007e
            L_0x0048:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
                r6 = r5
                int r7 = r2.f10730b
                java.lang.String r8 = r2.f10753a
                long r9 = r2.f10731c
                long r11 = r2.f10732d
                boolean r13 = r2.f10733e
                int r14 = r2.f10734f
                int r15 = r2.f10735g
                r24 = r5
                int r5 = r2.f10736h
                r16 = r5
                r25 = r3
                long r3 = r2.f10737i
                r17 = r3
                boolean r3 = r2.f10739k
                r20 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r3 = r2.f10740l
                r21 = r3
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r2.f10741m
                r22 = r3
                java.util.List<java.lang.String> r3 = r2.f10742n
                r23 = r3
                r19 = 1
                r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23)
                r5 = r24
                goto L_0x010e
            L_0x007e:
                r25 = r3
                r5 = r2
                goto L_0x010e
            L_0x0083:
                r25 = r3
                boolean r3 = r1.f10739k
                if (r3 == 0) goto L_0x008d
                long r3 = r1.f10732d
            L_0x008b:
                r12 = r3
                goto L_0x00b7
            L_0x008d:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r3 = r5.f10791m
                if (r3 == 0) goto L_0x0094
                long r3 = r3.f10732d
                goto L_0x0096
            L_0x0094:
                r3 = 0
            L_0x0096:
                if (r2 != 0) goto L_0x0099
                goto L_0x008b
            L_0x0099:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r7 = r2.f10741m
                int r7 = r7.size()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.m7824a(r2, r1)
                if (r8 == 0) goto L_0x00ab
                long r3 = r2.f10732d
                long r7 = r8.f10747d
            L_0x00a9:
                long r3 = r3 + r7
                goto L_0x008b
            L_0x00ab:
                int r8 = r1.f10735g
                int r9 = r2.f10735g
                int r8 = r8 - r9
                if (r7 != r8) goto L_0x008b
                long r3 = r2.f10732d
                long r7 = r2.f10743o
                goto L_0x00a9
            L_0x00b7:
                boolean r3 = r1.f10733e
                if (r3 == 0) goto L_0x00bf
                int r3 = r1.f10734f
            L_0x00bd:
                r15 = r3
                goto L_0x00e1
            L_0x00bf:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r3 = r5.f10791m
                if (r3 == 0) goto L_0x00c6
                int r3 = r3.f10734f
                goto L_0x00c7
            L_0x00c6:
                r3 = 0
            L_0x00c7:
                if (r2 != 0) goto L_0x00ca
                goto L_0x00bd
            L_0x00ca:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.m7824a(r2, r1)
                if (r4 == 0) goto L_0x00bd
                int r3 = r2.f10734f
                int r4 = r4.f10746c
                int r3 = r3 + r4
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r4 = r1.f10741m
                java.lang.Object r4 = r4.get(r6)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3108b.C3109a) r4
                int r4 = r4.f10746c
                int r3 = r3 - r4
                goto L_0x00bd
            L_0x00e1:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
                r7 = r5
                int r8 = r1.f10730b
                java.lang.String r9 = r1.f10753a
                long r10 = r1.f10731c
                int r3 = r1.f10735g
                r16 = r3
                int r3 = r1.f10736h
                r17 = r3
                long r3 = r1.f10737i
                r18 = r3
                boolean r3 = r1.f10738j
                r20 = r3
                boolean r3 = r1.f10739k
                r21 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r3 = r1.f10740l
                r22 = r3
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r1.f10741m
                r23 = r3
                java.util.List<java.lang.String> r3 = r1.f10742n
                r24 = r3
                r14 = 1
                r7.<init>(r8, r9, r10, r12, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24)
            L_0x010e:
                r0.f10796d = r5
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 == r2) goto L_0x012d
                r1 = 0
                r0.f10802j = r1
                r6 = r25
                r0.f10798f = r6
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f10793a
                boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.m7826a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e) r1, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a.C3107a) r2, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3108b) r5)
                if (r1 == 0) goto L_0x0177
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f10796d
                long r1 = r1.f10737i
                goto L_0x0178
            L_0x012d:
                r6 = r25
                boolean r2 = r5.f10738j
                if (r2 != 0) goto L_0x0177
                long r8 = r0.f10798f
                long r6 = r6 - r8
                double r6 = (double) r6
                long r8 = r5.f10737i
                long r8 = com.fyber.inneractive.sdk.player.exoplayer2.C3052b.m7658b(r8)
                double r8 = (double) r8
                r10 = 4615063718147915776(0x400c000000000000, double:3.5)
                double r8 = r8 * r10
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 <= 0) goto L_0x0155
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f10793a
                java.lang.String r2 = r2.f10728a
                r1.<init>(r2)
                r0.f10802j = r1
                r27.mo14181a()
                goto L_0x016f
            L_0x0155:
                int r2 = r1.f10735g
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r1 = r1.f10741m
                int r1 = r1.size()
                int r1 = r1 + r2
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r2 = r0.f10796d
                int r2 = r2.f10735g
                if (r1 >= r2) goto L_0x016f
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f10793a
                java.lang.String r2 = r2.f10728a
                r1.<init>(r2)
                r0.f10802j = r1
            L_0x016f:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f10796d
                long r1 = r1.f10737i
                r5 = 2
                long r1 = r1 / r5
                goto L_0x0178
            L_0x0177:
                r1 = r3
            L_0x0178:
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x018a
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.this
                android.os.Handler r3 = r3.f10784f
                long r1 = com.fyber.inneractive.sdk.player.exoplayer2.C3052b.m7658b(r1)
                boolean r1 = r3.postDelayed(r0, r1)
                r0.f10801i = r1
            L_0x018a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.C3114a.mo14182a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b):void");
        }

        /* renamed from: a */
        public final void mo14181a() {
            this.f10800h = SystemClock.elapsedRealtime() + 60000;
            C3113e eVar = C3113e.this;
            C3106a.C3107a aVar = this.f10793a;
            int size = eVar.f10786h.size();
            for (int i = 0; i < size; i++) {
                eVar.f10786h.get(i).mo14141a(aVar, 60000);
            }
        }
    }

    /* renamed from: a */
    public int mo14162a(C3372x.C3375c cVar, long j, long j2, IOException iOException) {
        C3377y yVar = (C3377y) cVar;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof C3230l;
        this.f10788j.mo14419a(yVar.f12078a, 4, j, j2, yVar.f12083f, iOException2, z);
        return z ? 3 : 0;
    }

    /* renamed from: a */
    public C3108b mo14179a(C3106a.C3107a aVar) {
        C3108b bVar;
        C3114a aVar2 = this.f10783e.get(aVar);
        aVar2.getClass();
        aVar2.f10799g = SystemClock.elapsedRealtime();
        C3108b bVar2 = aVar2.f10796d;
        if (bVar2 != null && this.f10789k.f10723b.contains(aVar) && (((bVar = this.f10791m) == null || !bVar.f10738j) && this.f10783e.get(this.f10790l).f10799g - SystemClock.elapsedRealtime() > 15000)) {
            this.f10790l = aVar;
            this.f10783e.get(aVar).mo14183b();
        }
        return bVar2;
    }

    /* renamed from: a */
    public static boolean m7825a(C3113e eVar) {
        List<C3106a.C3107a> list = eVar.f10789k.f10723b;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C3114a aVar = eVar.f10783e.get(list.get(i));
            if (elapsedRealtime > aVar.f10800h) {
                eVar.f10790l = aVar.f10793a;
                aVar.mo14183b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7826a(C3113e eVar, C3106a.C3107a aVar, C3108b bVar) {
        C3303q qVar;
        long j;
        C3113e eVar2 = eVar;
        C3106a.C3107a aVar2 = aVar;
        C3108b bVar2 = bVar;
        if (aVar2 == eVar2.f10790l) {
            if (eVar2.f10791m == null) {
                eVar2.f10792n = !bVar2.f10738j;
            }
            eVar2.f10791m = bVar2;
            C3099h hVar = (C3099h) eVar2.f10785g;
            hVar.getClass();
            long j2 = bVar2.f10731c;
            if (hVar.f10684d.f10792n) {
                long j3 = bVar2.f10738j ? bVar2.f10732d + bVar2.f10743o : -9223372036854775807L;
                List<C3108b.C3109a> list = bVar2.f10741m;
                if (j2 == -9223372036854775807L) {
                    if (list.isEmpty()) {
                        j = 0;
                        qVar = new C3303q(j3, bVar2.f10743o, bVar2.f10732d, j, true, !bVar2.f10738j);
                    } else {
                        j2 = list.get(Math.max(0, list.size() - 3)).f10747d;
                    }
                }
                j = j2;
                qVar = new C3303q(j3, bVar2.f10743o, bVar2.f10732d, j, true, !bVar2.f10738j);
            } else {
                long j4 = j2 == -9223372036854775807L ? 0 : j2;
                long j5 = bVar2.f10732d;
                long j6 = bVar2.f10743o;
                qVar = new C3303q(j5 + j6, j6, j5, j4, true, false);
            }
            hVar.f10685e.mo14291a(qVar, new C3096e(hVar.f10684d.f10789k, bVar2));
        }
        int size = eVar2.f10786h.size();
        for (int i = 0; i < size; i++) {
            eVar2.f10786h.get(i).mo14147c();
        }
        if (aVar2 != eVar2.f10790l || bVar2.f10738j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C3108b.C3109a m7824a(C3108b bVar, C3108b bVar2) {
        int i = bVar2.f10735g - bVar.f10735g;
        List<C3108b.C3109a> list = bVar.f10741m;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
