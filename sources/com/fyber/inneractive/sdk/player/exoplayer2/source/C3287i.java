package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C3221h;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3228j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3295l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3297m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3299n;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3368t;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3370v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3384d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i */
public final class C3287i implements C3297m, C3088h, C3372x.C3373a<C3290c>, C3074d.C3078d {

    /* renamed from: A */
    public boolean f11802A;

    /* renamed from: B */
    public long f11803B;

    /* renamed from: C */
    public long f11804C;

    /* renamed from: D */
    public long f11805D;

    /* renamed from: E */
    public int f11806E;

    /* renamed from: F */
    public boolean f11807F;

    /* renamed from: G */
    public boolean f11808G;

    /* renamed from: a */
    public final Uri f11809a;

    /* renamed from: b */
    public final C3353g f11810b;

    /* renamed from: c */
    public final int f11811c;

    /* renamed from: d */
    public final Handler f11812d;

    /* renamed from: e */
    public final C3295l.C3296a f11813e;

    /* renamed from: f */
    public final C3299n.C3300a f11814f;

    /* renamed from: g */
    public final C3328b f11815g;

    /* renamed from: h */
    public final String f11816h;

    /* renamed from: i */
    public final C3372x f11817i = new C3372x("Loader:ExtractorMediaPeriod");

    /* renamed from: j */
    public final C3291d f11818j;

    /* renamed from: k */
    public final C3384d f11819k;

    /* renamed from: l */
    public final Runnable f11820l;

    /* renamed from: m */
    public final Runnable f11821m;

    /* renamed from: n */
    public final Handler f11822n;

    /* renamed from: o */
    public final SparseArray<C3074d> f11823o;

    /* renamed from: p */
    public C3297m.C3298a f11824p;

    /* renamed from: q */
    public C3124m f11825q;

    /* renamed from: r */
    public boolean f11826r;

    /* renamed from: s */
    public boolean f11827s;

    /* renamed from: t */
    public boolean f11828t;

    /* renamed from: u */
    public boolean f11829u;

    /* renamed from: v */
    public int f11830v;

    /* renamed from: w */
    public C3305s f11831w;

    /* renamed from: x */
    public long f11832x;

    /* renamed from: y */
    public boolean[] f11833y;

    /* renamed from: z */
    public boolean[] f11834z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$a */
    public class C3288a implements Runnable {
        public C3288a() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r5v0 ?, r5v3 ?, r5v5 ?]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
            */
        public void run() {
            /*
                r9 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.source.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.source.C3287i.this
                boolean r1 = r0.f11808G
                if (r1 != 0) goto L_0x00af
                boolean r1 = r0.f11827s
                if (r1 != 0) goto L_0x00af
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r1 = r0.f11825q
                if (r1 == 0) goto L_0x00af
                boolean r1 = r0.f11826r
                if (r1 != 0) goto L_0x0014
                goto L_0x00af
            L_0x0014:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r1 = r0.f11823o
                int r1 = r1.size()
                r2 = 0
                r3 = 0
            L_0x001c:
                if (r3 >= r1) goto L_0x0031
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r4 = r0.f11823o
                java.lang.Object r4 = r4.valueAt(r3)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d) r4
                com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r4.mo14105e()
                if (r4 != 0) goto L_0x002e
                goto L_0x00af
            L_0x002e:
                int r3 = r3 + 1
                goto L_0x001c
            L_0x0031:
                com.fyber.inneractive.sdk.player.exoplayer2.util.d r3 = r0.f11819k
                monitor-enter(r3)
                r3.f12093a = r2     // Catch:{ all -> 0x00ac }
                monitor-exit(r3)
                com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r3 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r[r1]
                boolean[] r4 = new boolean[r1]
                r0.f11834z = r4
                boolean[] r4 = new boolean[r1]
                r0.f11833y = r4
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r4 = r0.f11825q
                long r4 = r4.mo14080c()
                r0.f11832x = r4
                r4 = 0
            L_0x004a:
                r5 = 1
                if (r4 >= r1) goto L_0x0080
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r6 = r0.f11823o
                java.lang.Object r6 = r6.valueAt(r4)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d) r6
                com.fyber.inneractive.sdk.player.exoplayer2.i r6 = r6.mo14105e()
                com.fyber.inneractive.sdk.player.exoplayer2.source.r r7 = new com.fyber.inneractive.sdk.player.exoplayer2.source.r
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r8 = new com.fyber.inneractive.sdk.player.exoplayer2.C3226i[r5]
                r8[r2] = r6
                r7.<init>(r8)
                r3[r4] = r7
                java.lang.String r6 = r6.f11633f
                boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8522e(r6)
                if (r7 != 0) goto L_0x0074
                boolean r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8521d(r6)
                if (r6 == 0) goto L_0x0073
                goto L_0x0074
            L_0x0073:
                r5 = 0
            L_0x0074:
                boolean[] r6 = r0.f11834z
                r6[r4] = r5
                boolean r6 = r0.f11802A
                r5 = r5 | r6
                r0.f11802A = r5
                int r4 = r4 + 1
                goto L_0x004a
            L_0x0080:
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r1 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
                r1.<init>(r3)
                r0.f11831w = r1
                r0.f11827s = r5
                com.fyber.inneractive.sdk.player.exoplayer2.source.n$a r1 = r0.f11814f
                com.fyber.inneractive.sdk.player.exoplayer2.source.q r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.q
                long r3 = r0.f11832x
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r5 = r0.f11825q
                boolean r5 = r5.mo14079a()
                r2.<init>(r3, r5)
                r3 = 0
                r1.mo14291a(r2, r3)
                com.fyber.inneractive.sdk.player.exoplayer2.source.m$a r1 = r0.f11824p
                com.fyber.inneractive.sdk.player.exoplayer2.h r1 = (com.fyber.inneractive.sdk.player.exoplayer2.C3221h) r1
                android.os.Handler r1 = r1.f11576f
                r2 = 8
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                goto L_0x00af
            L_0x00ac:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.source.C3287i.C3288a.run():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$b */
    public class C3289b implements Runnable {
        public C3289b() {
        }

        public void run() {
            C3287i iVar = C3287i.this;
            if (!iVar.f11808G) {
                ((C3221h) iVar.f11824p).mo14294a((C3302p) iVar);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$c */
    public final class C3290c implements C3372x.C3375c {

        /* renamed from: a */
        public final Uri f11837a;

        /* renamed from: b */
        public final C3353g f11838b;

        /* renamed from: c */
        public final C3291d f11839c;

        /* renamed from: d */
        public final C3384d f11840d;

        /* renamed from: e */
        public final C3123l f11841e = new C3123l();

        /* renamed from: f */
        public volatile boolean f11842f;

        /* renamed from: g */
        public boolean f11843g = true;

        /* renamed from: h */
        public long f11844h;

        /* renamed from: i */
        public long f11845i = -1;

        public C3290c(Uri uri, C3353g gVar, C3291d dVar, C3384d dVar2) {
            this.f11837a = (Uri) C3380a.m8503a(uri);
            this.f11838b = (C3353g) C3380a.m8503a(gVar);
            this.f11839c = (C3291d) C3380a.m8503a(dVar);
            this.f11840d = dVar2;
        }

        /* renamed from: a */
        public boolean mo14134a() {
            return this.f11842f;
        }

        /* renamed from: b */
        public void mo14135b() {
            this.f11842f = true;
        }

        public void load() throws IOException, InterruptedException {
            C3072b bVar;
            int i = 0;
            while (i == 0 && !this.f11842f) {
                try {
                    long j = this.f11841e.f10822a;
                    C3353g gVar = this.f11838b;
                    long j2 = j;
                    C3357j jVar = r6;
                    C3357j jVar2 = new C3357j(this.f11837a, (byte[]) null, j, j, -1, C3287i.this.f11816h, 0);
                    long a = gVar.mo13780a(jVar);
                    this.f11845i = a;
                    if (a != -1) {
                        this.f11845i = a + j2;
                    }
                    C3353g gVar2 = this.f11838b;
                    C3072b bVar2 = new C3072b(gVar2, j2, this.f11845i);
                    C3080f a2 = this.f11839c.mo14427a(bVar2, gVar2.mo13781a());
                    if (this.f11843g) {
                        a2.mo14113a(j2, this.f11844h);
                        this.f11843g = false;
                    }
                    while (true) {
                        long j3 = j2;
                        while (i == 0 && !this.f11842f) {
                            C3384d dVar = this.f11840d;
                            synchronized (dVar) {
                                while (!dVar.f12093a) {
                                    dVar.wait();
                                }
                            }
                            i = a2.mo14112a((C3087g) bVar2, this.f11841e);
                            j2 = bVar2.f10548c;
                            if (j2 > 1048576 + j3) {
                                C3384d dVar2 = this.f11840d;
                                synchronized (dVar2) {
                                    try {
                                        dVar2.f12093a = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar = bVar2;
                                        if (!(i == 1 || bVar == null)) {
                                            this.f11841e.f10822a = bVar.f10548c;
                                        }
                                        C3406u.m8593a(this.f11838b);
                                        throw th;
                                    }
                                }
                                C3287i iVar = C3287i.this;
                                iVar.f11822n.post(iVar.f11821m);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f11841e.f10822a = bVar2.f10548c;
                    }
                    C3406u.m8593a(this.f11838b);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = null;
                    this.f11841e.f10822a = bVar.f10548c;
                    C3406u.m8593a(this.f11838b);
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$d */
    public static final class C3291d {

        /* renamed from: a */
        public final C3080f[] f11847a;

        /* renamed from: b */
        public final C3088h f11848b;

        /* renamed from: c */
        public C3080f f11849c;

        public C3291d(C3080f[] fVarArr, C3088h hVar) {
            this.f11847a = fVarArr;
            this.f11848b = hVar;
        }

        /* renamed from: a */
        public C3080f mo14427a(C3087g gVar, Uri uri) throws IOException, InterruptedException {
            C3080f fVar = this.f11849c;
            if (fVar != null) {
                return fVar;
            }
            C3080f[] fVarArr = this.f11847a;
            int length = fVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C3080f fVar2 = fVarArr[i];
                try {
                    if (fVar2.mo14115a(gVar)) {
                        this.f11849c = fVar2;
                        ((C3072b) gVar).f10550e = 0;
                        break;
                    }
                    ((C3072b) gVar).f10550e = 0;
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    ((C3072b) gVar).f10550e = 0;
                    throw th;
                }
            }
            C3080f fVar3 = this.f11849c;
            if (fVar3 == null) {
                StringBuilder k = C13555b.m33972k("None of the available extractors (");
                C3080f[] fVarArr2 = this.f11847a;
                int i2 = C3406u.f12148a;
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < fVarArr2.length; i3++) {
                    sb.append(fVarArr2[i3].getClass().getSimpleName());
                    if (i3 < fVarArr2.length - 1) {
                        sb.append(", ");
                    }
                }
                k.append(sb.toString());
                k.append(") could read the stream.");
                throw new C3306t(k.toString(), uri);
            }
            fVar3.mo14114a(this.f11848b);
            return this.f11849c;
        }
    }

    public C3287i(Uri uri, C3353g gVar, C3080f[] fVarArr, int i, Handler handler, C3295l.C3296a aVar, C3299n.C3300a aVar2, C3328b bVar, String str) {
        this.f11809a = uri;
        this.f11810b = gVar;
        this.f11811c = i;
        this.f11812d = handler;
        this.f11813e = aVar;
        this.f11814f = aVar2;
        this.f11815g = bVar;
        this.f11816h = str;
        this.f11818j = new C3291d(fVarArr, this);
        this.f11819k = new C3384d();
        this.f11820l = new C3288a();
        this.f11821m = new C3289b();
        this.f11822n = new Handler();
        this.f11805D = -9223372036854775807L;
        this.f11823o = new SparseArray<>();
        this.f11803B = -1;
    }

    /* renamed from: a */
    public void mo14166a(C3372x.C3375c cVar, long j, long j2, boolean z) {
        C3290c cVar2 = (C3290c) cVar;
        if (this.f11803B == -1) {
            this.f11803B = cVar2.f11845i;
        }
        if (!z && this.f11830v > 0) {
            int size = this.f11823o.size();
            for (int i = 0; i < size; i++) {
                this.f11823o.valueAt(i).mo14100a(this.f11833y[i]);
            }
            ((C3221h) this.f11824p).mo14294a((C3302p) this);
        }
    }

    /* renamed from: b */
    public C3305s mo14146b() {
        return this.f11831w;
    }

    /* renamed from: c */
    public void mo14124c() {
        this.f11826r = true;
        this.f11822n.post(this.f11820l);
    }

    /* renamed from: c */
    public void mo14148c(long j) {
    }

    /* renamed from: d */
    public long mo14149d() {
        long j;
        if (this.f11807F) {
            return Long.MIN_VALUE;
        }
        if (mo14423i()) {
            return this.f11805D;
        }
        if (this.f11802A) {
            j = Long.MAX_VALUE;
            int size = this.f11823o.size();
            for (int i = 0; i < size; i++) {
                if (this.f11834z[i]) {
                    j = Math.min(j, this.f11823o.valueAt(i).mo14104d());
                }
            }
        } else {
            j = mo14422h();
        }
        if (j == Long.MIN_VALUE) {
            return this.f11804C;
        }
        return j;
    }

    /* renamed from: e */
    public void mo14150e() throws IOException {
        this.f11817i.mo14517c();
    }

    /* renamed from: f */
    public long mo14151f() {
        if (!this.f11829u) {
            return -9223372036854775807L;
        }
        this.f11829u = false;
        return this.f11804C;
    }

    /* renamed from: g */
    public final int mo14421g() {
        int size = this.f11823o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3074d.C3077c cVar = this.f11823o.valueAt(i2).f10555c;
            i += cVar.f10580j + cVar.f10579i;
        }
        return i;
    }

    /* renamed from: h */
    public final long mo14422h() {
        int size = this.f11823o.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f11823o.valueAt(i).mo14104d());
        }
        return j;
    }

    /* renamed from: i */
    public final boolean mo14423i() {
        return this.f11805D != -9223372036854775807L;
    }

    /* renamed from: j */
    public final void mo14424j() {
        C3124m mVar;
        C3290c cVar = new C3290c(this.f11809a, this.f11810b, this.f11818j, this.f11819k);
        if (this.f11827s) {
            C3380a.m8507b(mo14423i());
            long j = this.f11832x;
            if (j == -9223372036854775807L || this.f11805D < j) {
                long a = this.f11825q.mo14078a(this.f11805D);
                long j2 = this.f11805D;
                cVar.f11841e.f10822a = a;
                cVar.f11844h = j2;
                cVar.f11843g = true;
                this.f11805D = -9223372036854775807L;
            } else {
                this.f11807F = true;
                this.f11805D = -9223372036854775807L;
                return;
            }
        }
        this.f11806E = mo14421g();
        int i = this.f11811c;
        if (i == -1) {
            if (this.f11827s && this.f11803B == -1 && ((mVar = this.f11825q) == null || mVar.mo14080c() == -9223372036854775807L)) {
                i = 6;
            } else {
                i = 3;
            }
        }
        this.f11817i.mo14514a(cVar, this, i);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$e */
    public final class C3292e implements C3301o {

        /* renamed from: a */
        public final int f11850a;

        public C3292e(int i) {
            this.f11850a = i;
        }

        /* renamed from: a */
        public void mo14159a() throws IOException {
            C3287i.this.f11817i.mo14517c();
        }

        public boolean isReady() {
            C3287i iVar = C3287i.this;
            int i = this.f11850a;
            if (iVar.f11807F || (!iVar.mo14423i() && !iVar.f11823o.valueAt(i).mo14106f())) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public int mo14158a(C3228j jVar, C3058b bVar, boolean z) {
            C3287i iVar = C3287i.this;
            int i = this.f11850a;
            if (iVar.f11829u || iVar.mo14423i()) {
                return -3;
            }
            return iVar.f11823o.valueAt(i).mo14093a(jVar, bVar, z, iVar.f11807F, iVar.f11804C);
        }

        /* renamed from: a */
        public void mo14160a(long j) {
            C3287i iVar = C3287i.this;
            C3074d valueAt = iVar.f11823o.valueAt(this.f11850a);
            if (!iVar.f11807F || j <= valueAt.mo14104d()) {
                valueAt.mo14101a(j, true);
            } else {
                valueAt.mo14107g();
            }
        }
    }

    /* renamed from: b */
    public long mo14145b(long j) {
        if (!this.f11825q.mo14079a()) {
            j = 0;
        }
        this.f11804C = j;
        int size = this.f11823o.size();
        boolean z = !mo14423i();
        int i = 0;
        while (z && i < size) {
            if (this.f11833y[i]) {
                z = this.f11823o.valueAt(i).mo14101a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f11805D = j;
            this.f11807F = false;
            if (this.f11817i.mo14516b()) {
                this.f11817i.mo14515a();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f11823o.valueAt(i2).mo14100a(this.f11833y[i2]);
                }
            }
        }
        this.f11829u = false;
        return j;
    }

    /* renamed from: a */
    public void mo14165a(C3372x.C3375c cVar, long j, long j2) {
        C3290c cVar2 = (C3290c) cVar;
        if (this.f11803B == -1) {
            this.f11803B = cVar2.f11845i;
        }
        this.f11807F = true;
        if (this.f11832x == -9223372036854775807L) {
            long h = mo14422h();
            this.f11832x = h == Long.MIN_VALUE ? 0 : h + 10000;
            this.f11814f.mo14291a(new C3303q(this.f11832x, this.f11825q.mo14079a()), (Object) null);
        }
        ((C3221h) this.f11824p).mo14294a((C3302p) this);
    }

    /* renamed from: a */
    public int mo14162a(C3372x.C3375c cVar, long j, long j2, IOException iOException) {
        C3124m mVar;
        C3290c cVar2 = (C3290c) cVar;
        if (this.f11803B == -1) {
            this.f11803B = cVar2.f11845i;
        }
        Handler handler = this.f11812d;
        if (!(handler == null || this.f11813e == null)) {
            handler.post(new C3294k(this, iOException));
        }
        if ((iOException instanceof C3306t) || (iOException instanceof C3370v) || ((iOException instanceof C3368t) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        int i = mo14421g() > this.f11806E ? 1 : 0;
        if (this.f11803B == -1 && ((mVar = this.f11825q) == null || mVar.mo14080c() == -9223372036854775807L)) {
            this.f11804C = 0;
            this.f11829u = this.f11827s;
            int size = this.f11823o.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f11823o.valueAt(i2).mo14100a(!this.f11827s || this.f11833y[i2]);
            }
            cVar2.f11841e.f10822a = 0;
            cVar2.f11844h = 0;
            cVar2.f11843g = true;
        }
        this.f11806E = mo14421g();
        return i;
    }

    /* renamed from: a */
    public void mo14142a(C3297m.C3298a aVar) {
        this.f11824p = aVar;
        C3384d dVar = this.f11819k;
        synchronized (dVar) {
            if (!dVar.f12093a) {
                dVar.f12093a = true;
                dVar.notifyAll();
            }
        }
        mo14424j();
    }

    /* renamed from: a */
    public long mo14139a(C3321e[] eVarArr, boolean[] zArr, C3301o[] oVarArr, boolean[] zArr2, long j) {
        C3321e eVar;
        C3380a.m8507b(this.f11827s);
        for (int i = 0; i < eVarArr.length; i++) {
            C3292e eVar2 = oVarArr[i];
            if (eVar2 != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = eVar2.f11850a;
                C3380a.m8507b(this.f11833y[i2]);
                this.f11830v--;
                this.f11833y[i2] = false;
                this.f11823o.valueAt(i2).mo14102b();
                oVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && (eVar = eVarArr[i3]) != null) {
                C3380a.m8507b(eVar.mo14447f() == 1);
                C3380a.m8507b(eVar.mo14441b(0) == 0);
                int a = this.f11831w.mo14434a(eVar.mo14442b());
                C3380a.m8507b(!this.f11833y[a]);
                this.f11830v++;
                this.f11833y[a] = true;
                oVarArr[i3] = new C3292e(a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f11828t) {
            int size = this.f11823o.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f11833y[i4]) {
                    this.f11823o.valueAt(i4).mo14102b();
                }
            }
        }
        if (this.f11830v == 0) {
            this.f11829u = false;
            if (this.f11817i.mo14516b()) {
                this.f11817i.mo14515a();
            }
        } else if (!this.f11828t ? j != 0 : z) {
            j = mo14145b(j);
            for (int i5 = 0; i5 < oVarArr.length; i5++) {
                if (oVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f11828t = true;
        return j;
    }

    /* renamed from: a */
    public boolean mo14144a(long j) {
        boolean z = false;
        if (this.f11807F || (this.f11827s && this.f11830v == 0)) {
            return false;
        }
        C3384d dVar = this.f11819k;
        synchronized (dVar) {
            if (!dVar.f12093a) {
                dVar.f12093a = true;
                dVar.notifyAll();
                z = true;
            }
        }
        if (this.f11817i.mo14516b()) {
            return z;
        }
        mo14424j();
        return true;
    }

    /* renamed from: a */
    public long mo14138a() {
        if (this.f11830v == 0) {
            return Long.MIN_VALUE;
        }
        return mo14149d();
    }

    /* renamed from: a */
    public C3161n mo14122a(int i, int i2) {
        C3074d dVar = this.f11823o.get(i);
        if (dVar != null) {
            return dVar;
        }
        C3074d dVar2 = new C3074d(this.f11815g);
        dVar2.f10566n = this;
        this.f11823o.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: a */
    public void mo14123a(C3124m mVar) {
        this.f11825q = mVar;
        this.f11822n.post(this.f11820l);
    }

    /* renamed from: a */
    public void mo14111a(C3226i iVar) {
        this.f11822n.post(this.f11820l);
    }
}
