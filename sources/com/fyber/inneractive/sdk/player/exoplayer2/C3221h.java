package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.C3270p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3297m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3299n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3301o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3302p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3323f;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3324g;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3325h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3358k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3387g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3402q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h */
public final class C3221h implements Handler.Callback, C3297m.C3298a, C3299n.C3300a {

    /* renamed from: A */
    public C3224c f11565A;

    /* renamed from: B */
    public long f11566B;

    /* renamed from: C */
    public C3222a f11567C;

    /* renamed from: D */
    public C3222a f11568D;

    /* renamed from: E */
    public C3222a f11569E;

    /* renamed from: F */
    public C3270p f11570F;

    /* renamed from: a */
    public final C3268n[] f11571a;

    /* renamed from: b */
    public final C3026a[] f11572b;

    /* renamed from: c */
    public final C3324g f11573c;

    /* renamed from: d */
    public final C3053c f11574d;

    /* renamed from: e */
    public final C3402q f11575e;

    /* renamed from: f */
    public final Handler f11576f;

    /* renamed from: g */
    public final HandlerThread f11577g;

    /* renamed from: h */
    public final Handler f11578h;

    /* renamed from: i */
    public final C3067e f11579i;

    /* renamed from: j */
    public final C3270p.C3273c f11580j;

    /* renamed from: k */
    public final C3270p.C3272b f11581k;

    /* renamed from: l */
    public C3223b f11582l;

    /* renamed from: m */
    public C3231m f11583m;

    /* renamed from: n */
    public C3268n f11584n;

    /* renamed from: o */
    public C3387g f11585o;

    /* renamed from: p */
    public C3299n f11586p;

    /* renamed from: q */
    public C3268n[] f11587q;

    /* renamed from: r */
    public boolean f11588r;

    /* renamed from: s */
    public boolean f11589s;

    /* renamed from: t */
    public boolean f11590t;

    /* renamed from: u */
    public boolean f11591u;

    /* renamed from: v */
    public int f11592v = 1;

    /* renamed from: w */
    public int f11593w;

    /* renamed from: x */
    public int f11594x;

    /* renamed from: y */
    public long f11595y;

    /* renamed from: z */
    public int f11596z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$a */
    public static final class C3222a {

        /* renamed from: a */
        public final C3297m f11597a;

        /* renamed from: b */
        public final Object f11598b;

        /* renamed from: c */
        public final C3301o[] f11599c;

        /* renamed from: d */
        public final boolean[] f11600d;

        /* renamed from: e */
        public final long f11601e;

        /* renamed from: f */
        public int f11602f;

        /* renamed from: g */
        public long f11603g;

        /* renamed from: h */
        public boolean f11604h;

        /* renamed from: i */
        public boolean f11605i;

        /* renamed from: j */
        public boolean f11606j;

        /* renamed from: k */
        public C3222a f11607k;

        /* renamed from: l */
        public boolean f11608l;

        /* renamed from: m */
        public C3325h f11609m;

        /* renamed from: n */
        public final C3268n[] f11610n;

        /* renamed from: o */
        public final C3026a[] f11611o;

        /* renamed from: p */
        public final C3324g f11612p;

        /* renamed from: q */
        public final C3053c f11613q;

        /* renamed from: r */
        public final C3299n f11614r;

        /* renamed from: s */
        public C3325h f11615s;

        public C3222a(C3268n[] nVarArr, C3026a[] aVarArr, long j, C3324g gVar, C3053c cVar, C3299n nVar, Object obj, int i, boolean z, long j2) {
            this.f11610n = nVarArr;
            this.f11611o = aVarArr;
            this.f11601e = j;
            this.f11612p = gVar;
            this.f11613q = cVar;
            this.f11614r = nVar;
            this.f11598b = C3380a.m8503a(obj);
            this.f11602f = i;
            this.f11604h = z;
            this.f11603g = j2;
            this.f11599c = new C3301o[nVarArr.length];
            this.f11600d = new boolean[nVarArr.length];
            this.f11597a = nVar.mo14153a(i, cVar.mo14050a(), j2);
        }

        /* renamed from: a */
        public long mo14317a() {
            return this.f11601e - this.f11603g;
        }

        /* renamed from: b */
        public boolean mo14319b() {
            if (!this.f11605i || (this.f11606j && this.f11597a.mo14149d() != Long.MIN_VALUE)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public void mo14320c() {
            try {
                this.f11614r.mo14156a(this.f11597a);
            } catch (RuntimeException unused) {
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo14321d() throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r0 = r6.f11612p
                com.fyber.inneractive.sdk.player.exoplayer2.a[] r1 = r6.f11611o
                com.fyber.inneractive.sdk.player.exoplayer2.source.m r2 = r6.f11597a
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r2 = r2.mo14146b()
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.mo14454a(r1, r2)
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r1 = r6.f11615s
                r0.getClass()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0018
                goto L_0x0025
            L_0x0018:
                r4 = 0
            L_0x0019:
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f11913b
                int r5 = r5.f11909a
                if (r4 >= r5) goto L_0x002a
                boolean r5 = r0.mo14459a(r1, r4)
                if (r5 != 0) goto L_0x0027
            L_0x0025:
                r1 = 0
                goto L_0x002b
            L_0x0027:
                int r4 = r4 + 1
                goto L_0x0019
            L_0x002a:
                r1 = 1
            L_0x002b:
                if (r1 == 0) goto L_0x002e
                return r3
            L_0x002e:
                r6.f11609m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C3221h.C3222a.mo14321d():boolean");
        }

        /* renamed from: a */
        public long mo14318a(long j, boolean z, boolean[] zArr) {
            int i;
            C3323f fVar = this.f11609m.f11913b;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 >= fVar.f11909a) {
                    break;
                }
                boolean[] zArr2 = this.f11600d;
                if (z || !this.f11609m.mo14459a(this.f11615s, i2)) {
                    z3 = false;
                }
                zArr2[i2] = z3;
                i2++;
            }
            long a = this.f11597a.mo14139a((C3321e[]) fVar.f11910b.clone(), this.f11600d, this.f11599c, zArr, j);
            this.f11615s = this.f11609m;
            this.f11606j = false;
            int i3 = 0;
            while (true) {
                C3301o[] oVarArr = this.f11599c;
                if (i3 >= oVarArr.length) {
                    break;
                }
                if (oVarArr[i3] != null) {
                    C3380a.m8507b(fVar.f11910b[i3] != null);
                    this.f11606j = true;
                } else {
                    C3380a.m8507b(fVar.f11910b[i3] == null);
                }
                i3++;
            }
            C3053c cVar = this.f11613q;
            C3268n[] nVarArr = this.f11610n;
            C3305s sVar = this.f11609m.f11912a;
            cVar.f10514f = 0;
            for (int i4 = 0; i4 < nVarArr.length; i4++) {
                if (fVar.f11910b[i4] != null) {
                    int i5 = cVar.f10514f;
                    int k = nVarArr[i4].mo13971k();
                    int i6 = C3406u.f12148a;
                    if (k == 0) {
                        i = 16777216;
                    } else if (k == 1) {
                        i = 3538944;
                    } else if (k == 2) {
                        i = 13107200;
                    } else if (k == 3 || k == 4) {
                        i = SQLiteDatabase.OPEN_SHAREDCACHE;
                    } else {
                        throw new IllegalStateException();
                    }
                    cVar.f10514f = i5 + i;
                }
            }
            C3358k kVar = cVar.f10509a;
            int i7 = cVar.f10514f;
            synchronized (kVar) {
                if (i7 < kVar.f12015e) {
                    z2 = true;
                }
                kVar.f12015e = i7;
                if (z2) {
                    kVar.mo14506b();
                }
            }
            return a;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$b */
    public static final class C3223b {

        /* renamed from: a */
        public final int f11616a;

        /* renamed from: b */
        public final long f11617b;

        /* renamed from: c */
        public volatile long f11618c;

        /* renamed from: d */
        public volatile long f11619d;

        public C3223b(int i, long j) {
            this.f11616a = i;
            this.f11617b = j;
            this.f11618c = j;
            this.f11619d = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$c */
    public static final class C3224c {

        /* renamed from: a */
        public final C3270p f11620a;

        /* renamed from: b */
        public final int f11621b;

        /* renamed from: c */
        public final long f11622c;

        public C3224c(C3270p pVar, int i, long j) {
            this.f11620a = pVar;
            this.f11621b = i;
            this.f11622c = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$d */
    public static final class C3225d {

        /* renamed from: a */
        public final C3270p f11623a;

        /* renamed from: b */
        public final Object f11624b;

        /* renamed from: c */
        public final C3223b f11625c;

        /* renamed from: d */
        public final int f11626d;

        public C3225d(C3270p pVar, Object obj, C3223b bVar, int i) {
            this.f11623a = pVar;
            this.f11624b = obj;
            this.f11625c = bVar;
            this.f11626d = i;
        }
    }

    public C3221h(C3268n[] nVarArr, C3324g gVar, C3053c cVar, boolean z, Handler handler, C3223b bVar, C3067e eVar) {
        this.f11571a = nVarArr;
        this.f11573c = gVar;
        this.f11574d = cVar;
        this.f11589s = z;
        this.f11578h = handler;
        this.f11582l = bVar;
        this.f11579i = eVar;
        this.f11572b = new C3026a[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            nVarArr[i].mo13957a(i);
            this.f11572b[i] = nVarArr[i].mo13973m();
        }
        this.f11575e = new C3402q();
        this.f11587q = new C3268n[0];
        this.f11580j = new C3270p.C3273c();
        this.f11581k = new C3270p.C3272b();
        this.f11583m = C3231m.f11655d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f11577g = handlerThread;
        handlerThread.start();
        this.f11576f = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public void mo14294a(C3302p pVar) {
        this.f11576f.obtainMessage(9, (C3297m) pVar).sendToTarget();
    }

    /* renamed from: b */
    public final void mo14304b(C3224c cVar) throws C3054d {
        int i = 1;
        if (this.f11570F == null) {
            this.f11596z++;
            this.f11565A = cVar;
            return;
        }
        Pair<Integer, Long> a = mo14282a(cVar);
        if (a == null) {
            C3223b bVar = new C3223b(0, 0);
            this.f11582l = bVar;
            this.f11578h.obtainMessage(4, 1, 0, bVar).sendToTarget();
            this.f11582l = new C3223b(0, -9223372036854775807L);
            mo14285a(4);
            mo14306b(false);
            return;
        }
        int i2 = cVar.f11622c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) a.first).intValue();
        long longValue = ((Long) a.second).longValue();
        try {
            C3223b bVar2 = this.f11582l;
            if (intValue != bVar2.f11616a || longValue / 1000 != bVar2.f11618c / 1000) {
                long b = mo14300b(intValue, longValue);
                if (longValue == b) {
                    i = 0;
                }
                C3223b bVar3 = new C3223b(intValue, b);
                this.f11582l = bVar3;
                this.f11578h.obtainMessage(4, i2 | i, 0, bVar3).sendToTarget();
            }
        } finally {
            C3223b bVar4 = new C3223b(intValue, longValue);
            this.f11582l = bVar4;
            this.f11578h.obtainMessage(4, i2, 0, bVar4).sendToTarget();
        }
    }

    /* renamed from: c */
    public final void mo14308c(boolean z) {
        if (this.f11591u != z) {
            this.f11591u = z;
            this.f11578h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: d */
    public final void mo14310d(boolean z) throws C3054d {
        this.f11590t = false;
        this.f11589s = z;
        if (!z) {
            mo14314h();
            mo14316i();
            mo14306b(false);
            return;
        }
        int i = this.f11592v;
        if (i == 3) {
            mo14312f();
            this.f11576f.sendEmptyMessage(2);
        } else if (i == 2) {
            this.f11576f.sendEmptyMessage(2);
        }
    }

    /* renamed from: e */
    public final void mo14311e() throws C3054d {
        boolean z;
        boolean z2;
        C3222a aVar = this.f11569E;
        if (aVar != null) {
            boolean z3 = true;
            while (aVar != null && aVar.f11605i) {
                if (aVar.mo14321d()) {
                    if (z3) {
                        C3222a aVar2 = this.f11568D;
                        C3222a aVar3 = this.f11569E;
                        if (aVar2 != aVar3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mo14288a(aVar3.f11607k);
                        C3222a aVar4 = this.f11569E;
                        aVar4.f11607k = null;
                        this.f11567C = aVar4;
                        this.f11568D = aVar4;
                        boolean[] zArr = new boolean[this.f11571a.length];
                        long a = aVar4.mo14318a(this.f11582l.f11618c, z, zArr);
                        if (a != this.f11582l.f11618c) {
                            this.f11582l.f11618c = a;
                            mo14302b(a);
                        }
                        boolean[] zArr2 = new boolean[this.f11571a.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C3268n[] nVarArr = this.f11571a;
                            if (i >= nVarArr.length) {
                                break;
                            }
                            C3268n nVar = nVarArr[i];
                            if (nVar.mo13955a() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i] = z2;
                            C3301o oVar = this.f11569E.f11599c[i];
                            if (oVar != null) {
                                i2++;
                            }
                            if (z2) {
                                if (oVar != nVar.mo13974n()) {
                                    if (nVar == this.f11584n) {
                                        if (oVar == null) {
                                            this.f11575e.mo14581a(this.f11585o);
                                        }
                                        this.f11585o = null;
                                        this.f11584n = null;
                                    }
                                    mo14290a(nVar);
                                    nVar.mo13972l();
                                } else if (zArr[i]) {
                                    nVar.mo13958a(this.f11566B);
                                }
                            }
                            i++;
                        }
                        this.f11578h.obtainMessage(3, aVar.f11609m).sendToTarget();
                        mo14297a(zArr2, i2);
                    } else {
                        this.f11567C = aVar;
                        for (C3222a aVar5 = aVar.f11607k; aVar5 != null; aVar5 = aVar5.f11607k) {
                            aVar5.mo14320c();
                        }
                        C3222a aVar6 = this.f11567C;
                        aVar6.f11607k = null;
                        if (aVar6.f11605i) {
                            long max = Math.max(aVar6.f11603g, this.f11566B - aVar6.mo14317a());
                            C3222a aVar7 = this.f11567C;
                            aVar7.mo14318a(max, false, new boolean[aVar7.f11610n.length]);
                        }
                    }
                    mo14301b();
                    mo14316i();
                    this.f11576f.sendEmptyMessage(2);
                    return;
                }
                if (aVar == this.f11568D) {
                    z3 = false;
                }
                aVar = aVar.f11607k;
            }
        }
    }

    /* renamed from: f */
    public final void mo14312f() throws C3054d {
        this.f11590t = false;
        C3402q qVar = this.f11575e;
        if (!qVar.f12141a) {
            qVar.f12143c = SystemClock.elapsedRealtime();
            qVar.f12141a = true;
        }
        for (C3268n f : this.f11587q) {
            f.mo13967f();
        }
    }

    /* renamed from: g */
    public final void mo14313g() {
        mo14306b(true);
        this.f11574d.mo14051a(true);
        mo14285a(1);
    }

    /* renamed from: h */
    public final void mo14314h() throws C3054d {
        C3402q qVar = this.f11575e;
        if (qVar.f12141a) {
            qVar.mo14580a(qVar.mo14008o());
            qVar.f12141a = false;
        }
        for (C3268n a : this.f11587q) {
            mo14290a(a);
        }
    }

    public boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        try {
            switch (message.what) {
                case 0:
                    C3299n nVar = (C3299n) message.obj;
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mo14293a(nVar, z);
                    return true;
                case 1:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mo14310d(z2);
                    return true;
                case 2:
                    mo14284a();
                    return true;
                case 3:
                    mo14304b((C3224c) message.obj);
                    return true;
                case 4:
                    mo14289a((C3231m) message.obj);
                    return true;
                case 5:
                    mo14313g();
                    return true;
                case 6:
                    mo14309d();
                    return true;
                case 7:
                    mo14287a((Pair<C3270p, Object>) (Pair) message.obj);
                    return true;
                case 8:
                    mo14292a((C3297m) message.obj);
                    return true;
                case 9:
                    C3297m mVar = (C3297m) message.obj;
                    C3222a aVar = this.f11567C;
                    if (aVar != null) {
                        if (aVar.f11597a == mVar) {
                            mo14301b();
                        }
                    }
                    return true;
                case 10:
                    mo14311e();
                    return true;
                case 11:
                    mo14296a((C3067e.C3070c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (C3054d e) {
            this.f11578h.obtainMessage(8, e).sendToTarget();
            mo14313g();
            return true;
        } catch (IOException e2) {
            this.f11578h.obtainMessage(8, new C3054d(0, (String) null, e2, -1)).sendToTarget();
            mo14313g();
            return true;
        } catch (RuntimeException e3) {
            this.f11578h.obtainMessage(8, new C3054d(2, (String) null, e3, -1)).sendToTarget();
            mo14313g();
            return true;
        }
    }

    /* renamed from: i */
    public final void mo14316i() throws C3054d {
        long j;
        C3222a aVar = this.f11569E;
        if (aVar != null) {
            long f = aVar.f11597a.mo14151f();
            if (f != -9223372036854775807L) {
                mo14302b(f);
            } else {
                C3268n nVar = this.f11584n;
                if (nVar == null || nVar.mo14005b()) {
                    this.f11566B = this.f11575e.mo14008o();
                } else {
                    long o = this.f11585o.mo14008o();
                    this.f11566B = o;
                    this.f11575e.mo14580a(o);
                }
                f = this.f11566B - this.f11569E.mo14317a();
            }
            this.f11582l.f11618c = f;
            this.f11595y = SystemClock.elapsedRealtime() * 1000;
            if (this.f11587q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f11569E.f11597a.mo14149d();
            }
            C3223b bVar = this.f11582l;
            if (j == Long.MIN_VALUE) {
                j = this.f11570F.mo14408a(this.f11569E.f11602f, this.f11581k, false).f11757d;
            }
            bVar.f11619d = j;
        }
    }

    /* renamed from: a */
    public void mo14291a(C3270p pVar, Object obj) {
        this.f11576f.obtainMessage(7, Pair.create(pVar, obj)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo14285a(int i) {
        if (this.f11592v != i) {
            this.f11592v = i;
            this.f11578h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: c */
    public final void mo14307c() throws IOException {
        C3222a aVar = this.f11567C;
        if (aVar != null && !aVar.f11605i) {
            C3222a aVar2 = this.f11568D;
            if (aVar2 == null || aVar2.f11607k == aVar) {
                C3268n[] nVarArr = this.f11587q;
                int length = nVarArr.length;
                int i = 0;
                while (i < length) {
                    if (nVarArr[i].mo13968g()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f11567C.f11597a.mo14150e();
            }
        }
    }

    /* renamed from: a */
    public final void mo14293a(C3299n nVar, boolean z) {
        this.f11578h.sendEmptyMessage(0);
        mo14306b(true);
        this.f11574d.mo14051a(false);
        if (z) {
            this.f11582l = new C3223b(0, -9223372036854775807L);
        }
        this.f11586p = nVar;
        nVar.mo14155a(this.f11579i, true, (C3299n.C3300a) this);
        mo14285a(2);
        this.f11576f.sendEmptyMessage(2);
    }

    /* renamed from: d */
    public final void mo14309d() {
        mo14306b(true);
        this.f11574d.mo14051a(true);
        mo14285a(1);
        synchronized (this) {
            this.f11588r = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015a A[LOOP:0: B:55:0x015a->B:59:0x016a, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14284a() throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d, java.io.IOException {
        /*
            r27 = this;
            r7 = r27
            long r8 = android.os.SystemClock.elapsedRealtime()
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f11570F
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 1
            if (r0 != 0) goto L_0x0018
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r0 = r7.f11586p
            r0.mo14154a()
            goto L_0x0253
        L_0x0018:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11567C
            if (r0 != 0) goto L_0x0021
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = r7.f11582l
            int r0 = r0.f11616a
            goto L_0x004f
        L_0x0021:
            int r1 = r0.f11602f
            boolean r2 = r0.f11604h
            if (r2 != 0) goto L_0x013a
            boolean r0 = r0.mo14319b()
            if (r0 == 0) goto L_0x013a
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f11581k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r0.mo14408a(r1, r2, r12)
            long r2 = r0.f11757d
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            goto L_0x013a
        L_0x003d:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11569E
            if (r0 == 0) goto L_0x004a
            int r0 = r0.f11602f
            int r1 = r1 - r0
            r0 = 100
            if (r1 != r0) goto L_0x004a
            goto L_0x013a
        L_0x004a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11567C
            int r0 = r0.f11602f
            int r0 = r0 + r13
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f11570F
            int r1 = r1.mo14406a()
            if (r0 < r1) goto L_0x005e
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r0 = r7.f11586p
            r0.mo14154a()
            goto L_0x013a
        L_0x005e:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f11567C
            r2 = 0
            if (r1 != 0) goto L_0x006b
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r7.f11582l
            long r2 = r1.f11618c
        L_0x0068:
            r25 = r2
            goto L_0x00c6
        L_0x006b:
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r4 = r7.f11581k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r1 = r1.mo14408a(r0, r4, r12)
            int r4 = r1.f11756c
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r5 = r7.f11580j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r1 = r1.mo14409a(r4, r5)
            int r1 = r1.f11761c
            if (r0 == r1) goto L_0x0082
            goto L_0x0068
        L_0x0082:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11567C
            long r0 = r0.mo14317a()
            com.fyber.inneractive.sdk.player.exoplayer2.p r5 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r6 = r7.f11567C
            int r6 = r6.f11602f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r14 = r7.f11581k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r5.mo14408a(r6, r14, r12)
            long r5 = r5.f11757d
            long r0 = r0 + r5
            long r5 = r7.f11566B
            long r0 = r0 - r5
            com.fyber.inneractive.sdk.player.exoplayer2.p r5 = r7.f11570F
            long r14 = java.lang.Math.max(r2, r0)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r27
            r1 = r5
            r2 = r4
            r3 = r16
            r5 = r14
            android.util.Pair r0 = r0.mo14283a(r1, r2, r3, r5)
            if (r0 != 0) goto L_0x00b4
            goto L_0x013a
        L_0x00b4:
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r0 = r1
            goto L_0x0068
        L_0x00c6:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f11567C
            if (r1 != 0) goto L_0x00d0
            r1 = 60000000(0x3938700, double:2.96439388E-316)
            long r1 = r25 + r1
            goto L_0x00e3
        L_0x00d0:
            long r1 = r1.mo14317a()
            com.fyber.inneractive.sdk.player.exoplayer2.p r3 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r7.f11567C
            int r4 = r4.f11602f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r7.f11581k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r3.mo14408a(r4, r5, r12)
            long r3 = r3.f11757d
            long r1 = r1 + r3
        L_0x00e3:
            r17 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f11581k
            r1.mo14408a(r0, r2, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f11570F
            int r1 = r1.mo14406a()
            int r1 = r1 - r13
            if (r0 != r1) goto L_0x0108
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f11581k
            int r2 = r2.f11756c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r3 = r7.f11580j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r1 = r1.mo14409a(r2, r3)
            boolean r1 = r1.f11760b
            if (r1 != 0) goto L_0x0108
            r24 = 1
            goto L_0x010a
        L_0x0108:
            r24 = 0
        L_0x010a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.h$a
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r15 = r7.f11571a
            com.fyber.inneractive.sdk.player.exoplayer2.a[] r2 = r7.f11572b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r3 = r7.f11573c
            com.fyber.inneractive.sdk.player.exoplayer2.c r4 = r7.f11574d
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r5 = r7.f11586p
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r6 = r7.f11581k
            java.lang.Object r6 = r6.f11755b
            r14 = r1
            r16 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r0
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11567C
            if (r0 == 0) goto L_0x0130
            r0.f11607k = r1
        L_0x0130:
            r7.f11567C = r1
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r0 = r1.f11597a
            r0.mo14142a((com.fyber.inneractive.sdk.player.exoplayer2.source.C3297m.C3298a) r7)
            r7.mo14308c(r13)
        L_0x013a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11567C
            if (r0 == 0) goto L_0x0151
            boolean r0 = r0.mo14319b()
            if (r0 == 0) goto L_0x0145
            goto L_0x0151
        L_0x0145:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11567C
            if (r0 == 0) goto L_0x0154
            boolean r0 = r0.f11608l
            if (r0 == 0) goto L_0x0154
            r27.mo14301b()
            goto L_0x0154
        L_0x0151:
            r7.mo14308c(r12)
        L_0x0154:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11569E
            if (r0 != 0) goto L_0x015a
            goto L_0x0253
        L_0x015a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11569E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f11568D
            if (r0 == r1) goto L_0x0191
            long r2 = r7.f11566B
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r0.f11607k
            long r4 = r4.f11601e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0191
            r0.mo14320c()
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11569E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r0.f11607k
            r7.mo14303b((com.fyber.inneractive.sdk.player.exoplayer2.C3221h.C3222a) r0)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f11569E
            int r2 = r1.f11602f
            long r3 = r1.f11603g
            r0.<init>(r2, r3)
            r7.f11582l = r0
            r27.mo14316i()
            android.os.Handler r0 = r7.f11578h
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r7.f11582l
            r2 = 5
            android.os.Message r0 = r0.obtainMessage(r2, r1)
            r0.sendToTarget()
            goto L_0x015a
        L_0x0191:
            boolean r0 = r1.f11604h
            if (r0 == 0) goto L_0x01b7
            r0 = 0
        L_0x0196:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r1 = r7.f11571a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0253
            r1 = r1[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r2 = r7.f11568D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r2 = r2.f11599c
            r2 = r2[r0]
            if (r2 == 0) goto L_0x01b4
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r3 = r1.mo13974n()
            if (r3 != r2) goto L_0x01b4
            boolean r2 = r1.mo13968g()
            if (r2 == 0) goto L_0x01b4
            r1.mo13964c()
        L_0x01b4:
            int r0 = r0 + 1
            goto L_0x0196
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r1 = r7.f11571a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x01d8
            r1 = r1[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r2 = r7.f11568D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r2 = r2.f11599c
            r2 = r2[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r3 = r1.mo13974n()
            if (r3 != r2) goto L_0x0253
            if (r2 == 0) goto L_0x01d5
            boolean r1 = r1.mo13968g()
            if (r1 != 0) goto L_0x01d5
            goto L_0x0253
        L_0x01d5:
            int r0 = r0 + 1
            goto L_0x01b8
        L_0x01d8:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11568D
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r0.f11607k
            if (r1 == 0) goto L_0x0253
            boolean r2 = r1.f11605i
            if (r2 == 0) goto L_0x0253
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.f11609m
            r7.f11568D = r1
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r2 = r1.f11609m
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r1 = r1.f11597a
            long r3 = r1.mo14151f()
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            r3 = 0
        L_0x01f6:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f11571a
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0253
            r4 = r4[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f11913b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = r5.f11910b
            r5 = r5[r3]
            if (r5 != 0) goto L_0x0206
            goto L_0x024b
        L_0x0206:
            if (r1 == 0) goto L_0x020c
            r4.mo13964c()
            goto L_0x024b
        L_0x020c:
            boolean r5 = r4.mo13969h()
            if (r5 != 0) goto L_0x024b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r2.f11913b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = r5.f11910b
            r5 = r5[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r6 = r0.f11915d
            r6 = r6[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r14 = r2.f11915d
            r14 = r14[r3]
            if (r5 == 0) goto L_0x0248
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x0248
            int r6 = r5.mo14447f()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.C3226i[r6]
            r15 = 0
        L_0x022f:
            if (r15 >= r6) goto L_0x023a
            com.fyber.inneractive.sdk.player.exoplayer2.i r16 = r5.mo14439a((int) r15)
            r14[r15] = r16
            int r15 = r15 + 1
            goto L_0x022f
        L_0x023a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r5 = r7.f11568D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r6 = r5.f11599c
            r6 = r6[r3]
            long r10 = r5.mo14317a()
            r4.mo13963a(r14, r6, r10)
            goto L_0x024b
        L_0x0248:
            r4.mo13964c()
        L_0x024b:
            int r3 = r3 + 1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01f6
        L_0x0253:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11569E
            r1 = 10
            if (r0 != 0) goto L_0x0260
            r27.mo14307c()
            r7.mo14286a((long) r8, (long) r1)
            return
        L_0x0260:
            java.lang.String r0 = "doSomeWork"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r0)
            r27.mo14316i()
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f11569E
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r0 = r0.f11597a
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = r7.f11582l
            long r3 = r3.f11618c
            r0.mo14148c(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f11587q
            int r3 = r0.length
            r4 = 0
            r5 = 1
            r6 = 1
        L_0x0279:
            if (r4 >= r3) goto L_0x02b1
            r10 = r0[r4]
            long r13 = r7.f11566B
            long r1 = r7.f11595y
            r10.mo14336a(r13, r1)
            if (r6 == 0) goto L_0x028e
            boolean r1 = r10.mo14005b()
            if (r1 == 0) goto L_0x028e
            r6 = 1
            goto L_0x028f
        L_0x028e:
            r6 = 0
        L_0x028f:
            boolean r1 = r10.isReady()
            if (r1 != 0) goto L_0x029e
            boolean r1 = r10.mo14005b()
            if (r1 == 0) goto L_0x029c
            goto L_0x029e
        L_0x029c:
            r1 = 0
            goto L_0x029f
        L_0x029e:
            r1 = 1
        L_0x029f:
            if (r1 != 0) goto L_0x02a4
            r10.mo13966e()
        L_0x02a4:
            if (r5 == 0) goto L_0x02aa
            if (r1 == 0) goto L_0x02aa
            r5 = 1
            goto L_0x02ab
        L_0x02aa:
            r5 = 0
        L_0x02ab:
            int r4 = r4 + 1
            r1 = 10
            r13 = 1
            goto L_0x0279
        L_0x02b1:
            if (r5 != 0) goto L_0x02b6
            r27.mo14307c()
        L_0x02b6:
            com.fyber.inneractive.sdk.player.exoplayer2.util.g r0 = r7.f11585o
            if (r0 == 0) goto L_0x02d9
            com.fyber.inneractive.sdk.player.exoplayer2.m r0 = r0.mo14006i()
            com.fyber.inneractive.sdk.player.exoplayer2.m r1 = r7.f11583m
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x02d9
            r7.f11583m = r0
            com.fyber.inneractive.sdk.player.exoplayer2.util.q r1 = r7.f11575e
            com.fyber.inneractive.sdk.player.exoplayer2.util.g r2 = r7.f11585o
            r1.mo14581a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3387g) r2)
            android.os.Handler r1 = r7.f11578h
            r2 = 7
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
        L_0x02d9:
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f11569E
            int r1 = r1.f11602f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f11581k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r0.mo14408a(r1, r2, r12)
            long r0 = r0.f11757d
            r2 = 3
            r3 = 2
            if (r6 == 0) goto L_0x030a
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x02fc
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r4 = r7.f11582l
            long r13 = r4.f11618c
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x030a
        L_0x02fc:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r7.f11569E
            boolean r4 = r4.f11604h
            if (r4 == 0) goto L_0x030a
            r0 = 4
            r7.mo14285a((int) r0)
            r27.mo14314h()
            goto L_0x034a
        L_0x030a:
            int r4 = r7.f11592v
            if (r4 != r3) goto L_0x0332
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f11587q
            int r4 = r4.length
            if (r4 <= 0) goto L_0x0321
            if (r5 == 0) goto L_0x031f
            boolean r0 = r7.f11590t
            boolean r0 = r7.mo14299a((boolean) r0)
            if (r0 == 0) goto L_0x031f
            r13 = 1
            goto L_0x0325
        L_0x031f:
            r13 = 0
            goto L_0x0325
        L_0x0321:
            boolean r13 = r7.mo14298a((long) r0)
        L_0x0325:
            if (r13 == 0) goto L_0x034a
            r7.mo14285a((int) r2)
            boolean r0 = r7.f11589s
            if (r0 == 0) goto L_0x034a
            r27.mo14312f()
            goto L_0x034a
        L_0x0332:
            if (r4 != r2) goto L_0x034a
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f11587q
            int r4 = r4.length
            if (r4 <= 0) goto L_0x033a
            goto L_0x033e
        L_0x033a:
            boolean r5 = r7.mo14298a((long) r0)
        L_0x033e:
            if (r5 != 0) goto L_0x034a
            boolean r0 = r7.f11589s
            r7.f11590t = r0
            r7.mo14285a((int) r3)
            r27.mo14314h()
        L_0x034a:
            int r0 = r7.f11592v
            if (r0 != r3) goto L_0x035b
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f11587q
            int r1 = r0.length
        L_0x0351:
            if (r12 >= r1) goto L_0x035b
            r4 = r0[r12]
            r4.mo13966e()
            int r12 = r12 + 1
            goto L_0x0351
        L_0x035b:
            boolean r0 = r7.f11589s
            if (r0 == 0) goto L_0x0363
            int r0 = r7.f11592v
            if (r0 == r2) goto L_0x0367
        L_0x0363:
            int r0 = r7.f11592v
            if (r0 != r3) goto L_0x036d
        L_0x0367:
            r0 = 10
            r7.mo14286a((long) r8, (long) r0)
            goto L_0x037d
        L_0x036d:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f11587q
            int r0 = r0.length
            if (r0 == 0) goto L_0x0378
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.mo14286a((long) r8, (long) r0)
            goto L_0x037d
        L_0x0378:
            android.os.Handler r0 = r7.f11576f
            r0.removeMessages(r3)
        L_0x037d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C3221h.mo14284a():void");
    }

    /* renamed from: b */
    public final long mo14300b(int i, long j) throws C3054d {
        C3222a aVar;
        mo14314h();
        this.f11590t = false;
        mo14285a(2);
        C3222a aVar2 = this.f11569E;
        if (aVar2 == null) {
            C3222a aVar3 = this.f11567C;
            if (aVar3 != null) {
                aVar3.mo14320c();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f11602f != i || !aVar2.f11605i) {
                    aVar2.mo14320c();
                } else {
                    aVar = aVar2;
                }
                aVar2 = aVar2.f11607k;
            }
        }
        C3222a aVar4 = this.f11569E;
        if (!(aVar4 == aVar && aVar4 == this.f11568D)) {
            for (C3268n l : this.f11587q) {
                l.mo13972l();
            }
            this.f11587q = new C3268n[0];
            this.f11585o = null;
            this.f11584n = null;
            this.f11569E = null;
        }
        if (aVar != null) {
            aVar.f11607k = null;
            this.f11567C = aVar;
            this.f11568D = aVar;
            mo14303b(aVar);
            C3222a aVar5 = this.f11569E;
            if (aVar5.f11606j) {
                j = aVar5.f11597a.mo14145b(j);
            }
            mo14302b(j);
            mo14301b();
        } else {
            this.f11567C = null;
            this.f11568D = null;
            this.f11569E = null;
            mo14302b(j);
        }
        this.f11576f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: b */
    public final void mo14302b(long j) throws C3054d {
        long j2;
        C3222a aVar = this.f11569E;
        if (aVar == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + aVar.mo14317a();
        }
        this.f11566B = j2;
        this.f11575e.mo14580a(j2);
        for (C3268n a : this.f11587q) {
            a.mo13958a(this.f11566B);
        }
    }

    /* renamed from: b */
    public final void mo14306b(boolean z) {
        this.f11576f.removeMessages(2);
        this.f11590t = false;
        C3402q qVar = this.f11575e;
        if (qVar.f12141a) {
            qVar.mo14580a(qVar.mo14008o());
            qVar.f12141a = false;
        }
        this.f11585o = null;
        this.f11584n = null;
        this.f11566B = 60000000;
        for (C3268n nVar : this.f11587q) {
            try {
                mo14290a(nVar);
                nVar.mo13972l();
            } catch (C3054d | RuntimeException unused) {
            }
        }
        this.f11587q = new C3268n[0];
        C3222a aVar = this.f11569E;
        if (aVar == null) {
            aVar = this.f11567C;
        }
        mo14288a(aVar);
        this.f11567C = null;
        this.f11568D = null;
        this.f11569E = null;
        mo14308c(false);
        if (z) {
            C3299n nVar2 = this.f11586p;
            if (nVar2 != null) {
                nVar2.mo14157b();
                this.f11586p = null;
            }
            this.f11570F = null;
        }
    }

    /* renamed from: b */
    public final void mo14305b(Object obj, int i) {
        this.f11578h.obtainMessage(6, new C3225d(this.f11570F, obj, this.f11582l, i)).sendToTarget();
    }

    /* renamed from: b */
    public final void mo14301b() {
        long j;
        C3222a aVar = this.f11567C;
        if (!aVar.f11605i) {
            j = 0;
        } else {
            j = aVar.f11597a.mo14138a();
        }
        if (j == Long.MIN_VALUE) {
            mo14308c(false);
            return;
        }
        long a = this.f11566B - this.f11567C.mo14317a();
        boolean a2 = this.f11574d.mo14052a(j - a);
        mo14308c(a2);
        if (a2) {
            C3222a aVar2 = this.f11567C;
            aVar2.f11608l = false;
            aVar2.f11597a.mo14144a(a);
            return;
        }
        this.f11567C.f11608l = true;
    }

    /* renamed from: b */
    public final void mo14303b(C3222a aVar) throws C3054d {
        if (this.f11569E != aVar) {
            boolean[] zArr = new boolean[this.f11571a.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C3268n[] nVarArr = this.f11571a;
                if (i < nVarArr.length) {
                    C3268n nVar = nVarArr[i];
                    boolean z = nVar.mo13955a() != 0;
                    zArr[i] = z;
                    C3321e eVar = aVar.f11609m.f11913b.f11910b[i];
                    if (eVar != null) {
                        i2++;
                    }
                    if (z && (eVar == null || (nVar.mo13969h() && nVar.mo13974n() == this.f11569E.f11599c[i]))) {
                        if (nVar == this.f11584n) {
                            this.f11575e.mo14581a(this.f11585o);
                            this.f11585o = null;
                            this.f11584n = null;
                        }
                        mo14290a(nVar);
                        nVar.mo13972l();
                    }
                    i++;
                } else {
                    this.f11569E = aVar;
                    this.f11578h.obtainMessage(3, aVar.f11609m).sendToTarget();
                    mo14297a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14286a(long j, long j2) {
        this.f11576f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f11576f.sendEmptyMessage(2);
        } else {
            this.f11576f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    public final void mo14289a(C3231m mVar) {
        C3387g gVar = this.f11585o;
        if (gVar != null) {
            mVar = gVar.mo13997a(mVar);
        } else {
            C3402q qVar = this.f11575e;
            if (qVar.f12141a) {
                qVar.mo14580a(qVar.mo14008o());
            }
            qVar.f12144d = mVar;
        }
        this.f11583m = mVar;
        this.f11578h.obtainMessage(7, mVar).sendToTarget();
    }

    /* renamed from: a */
    public final void mo14296a(C3067e.C3070c[] cVarArr) throws C3054d {
        try {
            for (C3067e.C3070c cVar : cVarArr) {
                cVar.f10539a.mo13999a(cVar.f10540b, cVar.f10541c);
            }
            if (this.f11586p != null) {
                this.f11576f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f11594x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f11594x++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo14290a(C3268n nVar) throws C3054d {
        if (nVar.mo13955a() == 2) {
            nVar.mo13965d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r4 = r3.f11569E.f11607k;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14298a(long r4) {
        /*
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = r3.f11582l
            long r0 = r0.f11618c
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r3.f11569E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r4.f11607k
            if (r4 == 0) goto L_0x001c
            boolean r4 = r4.f11605i
            if (r4 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r4 = 0
            goto L_0x001f
        L_0x001e:
            r4 = 1
        L_0x001f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C3221h.mo14298a(long):boolean");
    }

    /* renamed from: a */
    public final boolean mo14299a(boolean z) {
        long j;
        C3222a aVar = this.f11567C;
        if (!aVar.f11605i) {
            j = aVar.f11603g;
        } else {
            j = aVar.f11597a.mo14149d();
        }
        if (j == Long.MIN_VALUE) {
            C3222a aVar2 = this.f11567C;
            if (aVar2.f11604h) {
                return true;
            }
            j = this.f11570F.mo14408a(aVar2.f11602f, this.f11581k, false).f11757d;
        }
        C3053c cVar = this.f11574d;
        long a = j - (this.f11566B - this.f11567C.mo14317a());
        long j2 = z ? cVar.f10513e : cVar.f10512d;
        if (j2 <= 0 || a >= j2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14287a(android.util.Pair<com.fyber.inneractive.sdk.player.exoplayer2.C3270p, java.lang.Object> r13) throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
        /*
            r12 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f11570F
            java.lang.Object r1 = r13.first
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = (com.fyber.inneractive.sdk.player.exoplayer2.C3270p) r1
            r12.f11570F = r1
            java.lang.Object r13 = r13.second
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            if (r0 != 0) goto L_0x006e
            int r6 = r12.f11596z
            if (r6 <= 0) goto L_0x0041
            com.fyber.inneractive.sdk.player.exoplayer2.h$c r1 = r12.f11565A
            android.util.Pair r1 = r12.mo14282a((com.fyber.inneractive.sdk.player.exoplayer2.C3221h.C3224c) r1)
            int r6 = r12.f11596z
            r12.f11596z = r5
            r12.f11565A = r2
            if (r1 != 0) goto L_0x0029
            r12.mo14295a((java.lang.Object) r13, (int) r6)
            return
        L_0x0029:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r9 = r1.longValue()
            r7.<init>(r8, r9)
            r12.f11582l = r7
            goto L_0x006f
        L_0x0041:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r6 = r12.f11582l
            long r6 = r6.f11617b
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x006e
            boolean r1 = r1.mo14412c()
            if (r1 == 0) goto L_0x0053
            r12.mo14295a((java.lang.Object) r13, (int) r5)
            return
        L_0x0053:
            android.util.Pair r1 = r12.mo14281a((int) r5, (long) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r6 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            java.lang.Object r7 = r1.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r8 = r1.longValue()
            r6.<init>(r7, r8)
            r12.f11582l = r6
        L_0x006e:
            r6 = 0
        L_0x006f:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f11569E
            if (r1 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f11567C
        L_0x0076:
            if (r1 != 0) goto L_0x007c
            r12.mo14305b((java.lang.Object) r13, (int) r6)
            return
        L_0x007c:
            com.fyber.inneractive.sdk.player.exoplayer2.p r7 = r12.f11570F
            java.lang.Object r8 = r1.f11598b
            int r7 = r7.mo14407a(r8)
            r8 = -1
            r9 = 1
            if (r7 != r8) goto L_0x00e2
            int r2 = r1.f11602f
            com.fyber.inneractive.sdk.player.exoplayer2.p r7 = r12.f11570F
            int r0 = r12.mo14280a(r2, r0, r7)
            if (r0 != r8) goto L_0x0096
            r12.mo14295a((java.lang.Object) r13, (int) r6)
            return
        L_0x0096:
            com.fyber.inneractive.sdk.player.exoplayer2.p r2 = r12.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r7 = r12.f11581k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r2.mo14408a(r0, r7, r5)
            int r0 = r0.f11756c
            android.util.Pair r0 = r12.mo14281a((int) r0, (long) r3)
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r12.f11581k
            r0.mo14408a(r2, r5, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r12.f11581k
            java.lang.Object r0 = r0.f11755b
            r1.f11602f = r8
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r1.f11607k
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r5 = r1.f11598b
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00cf
            r5 = r2
            goto L_0x00d0
        L_0x00cf:
            r5 = -1
        L_0x00d0:
            r1.f11602f = r5
            goto L_0x00c1
        L_0x00d3:
            long r0 = r12.mo14300b((int) r2, (long) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            r3.<init>(r2, r0)
            r12.f11582l = r3
            r12.mo14305b((java.lang.Object) r13, (int) r6)
            return
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r12.f11581k
            r0.mo14408a(r7, r3, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f11570F
            int r0 = r0.mo14406a()
            int r0 = r0 - r9
            if (r7 != r0) goto L_0x0104
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r12.f11581k
            int r3 = r3.f11756c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r4 = r12.f11580j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r0 = r0.mo14409a(r3, r4)
            boolean r0 = r0.f11760b
            if (r0 != 0) goto L_0x0104
            r0 = 1
            goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r1.f11602f = r7
            r1.f11604h = r0
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r12.f11568D
            if (r1 != r0) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = r12.f11582l
            int r4 = r3.f11616a
            if (r7 == r4) goto L_0x0127
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            long r10 = r3.f11617b
            r4.<init>(r7, r10)
            long r10 = r3.f11618c
            r4.f11618c = r10
            long r10 = r3.f11619d
            r4.f11619d = r10
            r12.f11582l = r4
        L_0x0127:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r1.f11607k
            if (r3 == 0) goto L_0x0186
            int r7 = r7 + r9
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r8 = r12.f11581k
            r4.mo14408a(r7, r8, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f11570F
            int r4 = r4.mo14406a()
            int r4 = r4 - r9
            if (r7 != r4) goto L_0x014e
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f11570F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r8 = r12.f11581k
            int r8 = r8.f11756c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r10 = r12.f11580j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r4 = r4.mo14409a(r8, r10)
            boolean r4 = r4.f11760b
            if (r4 != 0) goto L_0x014e
            r4 = 1
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            java.lang.Object r8 = r3.f11598b
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r10 = r12.f11581k
            java.lang.Object r10 = r10.f11755b
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0169
            r3.f11602f = r7
            r3.f11604h = r4
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f11568D
            if (r3 != r1) goto L_0x0165
            r1 = 1
            goto L_0x0166
        L_0x0165:
            r1 = 0
        L_0x0166:
            r0 = r0 | r1
            r1 = r3
            goto L_0x0127
        L_0x0169:
            if (r0 != 0) goto L_0x017f
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r12.f11569E
            int r0 = r0.f11602f
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r12.f11582l
            long r1 = r1.f11618c
            long r1 = r12.mo14300b((int) r0, (long) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            r3.<init>(r0, r1)
            r12.f11582l = r3
            goto L_0x0186
        L_0x017f:
            r12.f11567C = r1
            r1.f11607k = r2
            r12.mo14288a((com.fyber.inneractive.sdk.player.exoplayer2.C3221h.C3222a) r3)
        L_0x0186:
            r12.mo14305b((java.lang.Object) r13, (int) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C3221h.mo14287a(android.util.Pair):void");
    }

    /* renamed from: a */
    public final void mo14295a(Object obj, int i) {
        this.f11582l = new C3223b(0, 0);
        mo14305b(obj, i);
        this.f11582l = new C3223b(0, -9223372036854775807L);
        mo14285a(4);
        mo14306b(false);
    }

    /* renamed from: a */
    public final int mo14280a(int i, C3270p pVar, C3270p pVar2) {
        int i2 = -1;
        while (i2 == -1 && i < pVar.mo14406a() - 1) {
            i++;
            i2 = pVar2.mo14407a(pVar.mo14408a(i, this.f11581k, true).f11755b);
        }
        return i2;
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo14282a(C3224c cVar) {
        C3270p pVar = cVar.f11620a;
        if (pVar.mo14412c()) {
            pVar = this.f11570F;
        }
        try {
            Pair<Integer, Long> a = mo14283a(pVar, cVar.f11621b, cVar.f11622c, 0);
            C3270p pVar2 = this.f11570F;
            if (pVar2 == pVar) {
                return a;
            }
            int a2 = pVar2.mo14407a(pVar.mo14408a(((Integer) a.first).intValue(), this.f11581k, true).f11755b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), a.second);
            }
            int a3 = mo14280a(((Integer) a.first).intValue(), pVar, this.f11570F);
            if (a3 != -1) {
                return mo14281a(this.f11570F.mo14408a(a3, this.f11581k, false).f11756c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new C3229k(this.f11570F, cVar.f11621b, cVar.f11622c);
        }
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo14281a(int i, long j) {
        return mo14283a(this.f11570F, i, j, 0);
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo14283a(C3270p pVar, int i, long j, long j2) {
        C3380a.m8502a(i, 0, pVar.mo14411b());
        pVar.mo14410a(i, this.f11580j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f11580j.f11763e;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        C3270p.C3273c cVar = this.f11580j;
        int i2 = cVar.f11761c;
        long j3 = cVar.f11765g + j;
        long j4 = pVar.mo14408a(i2, this.f11581k, false).f11757d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f11580j.f11762d) {
            j3 -= j4;
            i2++;
            j4 = pVar.mo14408a(i2, this.f11581k, false).f11757d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* renamed from: a */
    public final void mo14292a(C3297m mVar) throws C3054d {
        C3222a aVar = this.f11567C;
        if (aVar != null && aVar.f11597a == mVar) {
            aVar.f11605i = true;
            aVar.mo14321d();
            aVar.f11603g = aVar.mo14318a(aVar.f11603g, false, new boolean[aVar.f11610n.length]);
            if (this.f11569E == null) {
                C3222a aVar2 = this.f11567C;
                this.f11568D = aVar2;
                mo14302b(aVar2.f11603g);
                mo14303b(this.f11568D);
            }
            mo14301b();
        }
    }

    /* renamed from: a */
    public final void mo14288a(C3222a aVar) {
        while (aVar != null) {
            aVar.mo14320c();
            aVar = aVar.f11607k;
        }
    }

    /* renamed from: a */
    public final void mo14297a(boolean[] zArr, int i) throws C3054d {
        this.f11587q = new C3268n[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C3268n[] nVarArr = this.f11571a;
            if (i2 < nVarArr.length) {
                C3268n nVar = nVarArr[i2];
                C3321e eVar = this.f11569E.f11609m.f11913b.f11910b[i2];
                if (eVar != null) {
                    int i4 = i3 + 1;
                    this.f11587q[i3] = nVar;
                    if (nVar.mo13955a() == 0) {
                        C3269o oVar = this.f11569E.f11609m.f11915d[i2];
                        boolean z = this.f11589s && this.f11592v == 3;
                        boolean z2 = !zArr[i2] && z;
                        int f = eVar.mo14447f();
                        C3226i[] iVarArr = new C3226i[f];
                        for (int i5 = 0; i5 < f; i5++) {
                            iVarArr[i5] = eVar.mo14439a(i5);
                        }
                        C3222a aVar = this.f11569E;
                        nVar.mo13960a(oVar, iVarArr, aVar.f11599c[i2], this.f11566B, z2, aVar.mo14317a());
                        C3387g j = nVar.mo13970j();
                        if (j != null) {
                            if (this.f11585o == null) {
                                this.f11585o = j;
                                this.f11584n = nVar;
                                j.mo13997a(this.f11583m);
                            } else {
                                throw new C3054d(2, (String) null, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                            }
                        }
                        if (z) {
                            nVar.mo13967f();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
