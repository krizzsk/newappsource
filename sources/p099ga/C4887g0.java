package p099ga;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3997b;
import com.google.common.collect.ImmutableList;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p099ga.C4879e1;
import p099ga.C4901j0;
import p099ga.C4908k;
import p099ga.C4924q0;
import p099ga.C4943v0;
import p100gb.C4961b0;
import p100gb.C4964c0;
import p100gb.C4967d0;
import p100gb.C4984m;
import p100gb.C4987o;
import p112ha.C5196m0;
import p126ib.C5343j;
import p252sb.C6506f;
import p252sb.C6508g;
import p265tb.C6647c;
import p265tb.C6658j;
import p265tb.C6660l;
import p277ub.C6773a;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6782g;
import p277ub.C6791m;
import p277ub.C6807u;
import p277ub.C6808v;
import p277ub.C6809w;
import p304x.C7038d0;
import p304x.C7097r;
import p316y.C7219n;
import p583jk.C17875h;

/* renamed from: ga.g0 */
public final class C4887g0 implements Handler.Callback, C4984m.C4985a, C6506f.C6507a, C4924q0.C4928d, C4908k.C4909a, C4943v0.C4944a {

    /* renamed from: A */
    public boolean f16447A = false;

    /* renamed from: B */
    public boolean f16448B;

    /* renamed from: C */
    public boolean f16449C;

    /* renamed from: D */
    public boolean f16450D;

    /* renamed from: E */
    public int f16451E;

    /* renamed from: F */
    public boolean f16452F;

    /* renamed from: G */
    public boolean f16453G;

    /* renamed from: H */
    public boolean f16454H;

    /* renamed from: I */
    public boolean f16455I;

    /* renamed from: J */
    public int f16456J;

    /* renamed from: K */
    public C4894g f16457K;

    /* renamed from: L */
    public long f16458L;

    /* renamed from: M */
    public int f16459M;

    /* renamed from: N */
    public boolean f16460N;

    /* renamed from: O */
    public ExoPlaybackException f16461O;

    /* renamed from: b */
    public final C4949x0[] f16462b;

    /* renamed from: c */
    public final C4952y0[] f16463c;

    /* renamed from: d */
    public final C6506f f16464d;

    /* renamed from: e */
    public final C6508g f16465e;

    /* renamed from: f */
    public final C4900j f16466f;

    /* renamed from: g */
    public final C6647c f16467g;

    /* renamed from: h */
    public final C6782g f16468h;

    /* renamed from: i */
    public final HandlerThread f16469i;

    /* renamed from: j */
    public final Looper f16470j;

    /* renamed from: k */
    public final C4879e1.C4882c f16471k;

    /* renamed from: l */
    public final C4879e1.C4881b f16472l;

    /* renamed from: m */
    public final long f16473m;

    /* renamed from: n */
    public final boolean f16474n;

    /* renamed from: o */
    public final C4908k f16475o;

    /* renamed from: p */
    public final ArrayList<C4890c> f16476p;

    /* renamed from: q */
    public final C6773a f16477q;

    /* renamed from: r */
    public final C4892e f16478r;

    /* renamed from: s */
    public final C4918n0 f16479s;

    /* renamed from: t */
    public final C4924q0 f16480t;

    /* renamed from: u */
    public final C4899i0 f16481u;

    /* renamed from: v */
    public final long f16482v;

    /* renamed from: w */
    public C4862b1 f16483w;

    /* renamed from: x */
    public C4930r0 f16484x;

    /* renamed from: y */
    public C4891d f16485y;

    /* renamed from: z */
    public boolean f16486z;

    /* renamed from: ga.g0$a */
    public static final class C4888a {

        /* renamed from: a */
        public final List<C4924q0.C4927c> f16487a;

        /* renamed from: b */
        public final C4967d0 f16488b;

        /* renamed from: c */
        public final int f16489c;

        /* renamed from: d */
        public final long f16490d;

        public C4888a(ArrayList arrayList, C4967d0 d0Var, int i, long j) {
            this.f16487a = arrayList;
            this.f16488b = d0Var;
            this.f16489c = i;
            this.f16490d = j;
        }
    }

    /* renamed from: ga.g0$b */
    public static class C4889b {
    }

    /* renamed from: ga.g0$c */
    public static final class C4890c implements Comparable<C4890c> {
        public C4890c() {
            throw null;
        }

        public final int compareTo(Object obj) {
            ((C4890c) obj).getClass();
            return 0;
        }
    }

    /* renamed from: ga.g0$d */
    public static final class C4891d {

        /* renamed from: a */
        public boolean f16491a;

        /* renamed from: b */
        public C4930r0 f16492b;

        /* renamed from: c */
        public int f16493c;

        /* renamed from: d */
        public boolean f16494d;

        /* renamed from: e */
        public int f16495e;

        /* renamed from: f */
        public boolean f16496f;

        /* renamed from: g */
        public int f16497g;

        public C4891d(C4930r0 r0Var) {
            this.f16492b = r0Var;
        }

        /* renamed from: a */
        public final void mo20532a(int i) {
            boolean z;
            boolean z2 = this.f16491a;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f16491a = z2 | z;
            this.f16493c += i;
        }
    }

    /* renamed from: ga.g0$e */
    public interface C4892e {
    }

    /* renamed from: ga.g0$f */
    public static final class C4893f {

        /* renamed from: a */
        public final C4987o.C4988a f16498a;

        /* renamed from: b */
        public final long f16499b;

        /* renamed from: c */
        public final long f16500c;

        /* renamed from: d */
        public final boolean f16501d;

        /* renamed from: e */
        public final boolean f16502e;

        /* renamed from: f */
        public final boolean f16503f;

        public C4893f(C4987o.C4988a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f16498a = aVar;
            this.f16499b = j;
            this.f16500c = j2;
            this.f16501d = z;
            this.f16502e = z2;
            this.f16503f = z3;
        }
    }

    /* renamed from: ga.g0$g */
    public static final class C4894g {

        /* renamed from: a */
        public final C4879e1 f16504a;

        /* renamed from: b */
        public final int f16505b;

        /* renamed from: c */
        public final long f16506c;

        public C4894g(C4879e1 e1Var, int i, long j) {
            this.f16504a = e1Var;
            this.f16505b = i;
            this.f16506c = j;
        }
    }

    public C4887g0(C4949x0[] x0VarArr, C6506f fVar, C6508g gVar, C4900j jVar, C6647c cVar, int i, boolean z, C5196m0 m0Var, C4862b1 b1Var, C4898i iVar, long j, Looper looper, C6808v vVar, C7038d0 d0Var) {
        this.f16478r = d0Var;
        this.f16462b = x0VarArr;
        this.f16464d = fVar;
        this.f16465e = gVar;
        this.f16466f = jVar;
        this.f16467g = cVar;
        this.f16451E = i;
        this.f16452F = z;
        this.f16483w = b1Var;
        this.f16481u = iVar;
        this.f16482v = j;
        this.f16477q = vVar;
        this.f16473m = jVar.f16533g;
        this.f16474n = false;
        C4930r0 i2 = C4930r0.m12507i(gVar);
        this.f16484x = i2;
        this.f16485y = new C4891d(i2);
        this.f16463c = new C4952y0[x0VarArr.length];
        for (int i3 = 0; i3 < x0VarArr.length; i3++) {
            x0VarArr[i3].setIndex(i3);
            this.f16463c[i3] = x0VarArr[i3].mo15814f();
        }
        this.f16475o = new C4908k(this, vVar);
        this.f16476p = new ArrayList<>();
        this.f16471k = new C4879e1.C4882c();
        this.f16472l = new C4879e1.C4881b();
        fVar.f20297a = this;
        fVar.f20298b = cVar;
        this.f16460N = true;
        Handler handler = new Handler(looper);
        this.f16479s = new C4918n0(m0Var, handler);
        this.f16480t = new C4924q0(this, m0Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f16469i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f16470j = looper2;
        this.f16468h = vVar.mo22943b(looper2, this);
    }

    /* renamed from: D */
    public static Pair<Object, Long> m12380D(C4879e1 e1Var, C4894g gVar, boolean z, int i, boolean z2, C4879e1.C4882c cVar, C4879e1.C4881b bVar) {
        C4879e1 e1Var2;
        Object E;
        C4879e1 e1Var3 = e1Var;
        C4894g gVar2 = gVar;
        C4879e1.C4881b bVar2 = bVar;
        C4879e1 e1Var4 = gVar2.f16504a;
        if (e1Var.mo20464p()) {
            return null;
        }
        if (e1Var4.mo20464p()) {
            e1Var2 = e1Var3;
        } else {
            e1Var2 = e1Var4;
        }
        try {
            Pair<Object, Long> i2 = e1Var2.mo20460i(cVar, bVar, gVar2.f16505b, gVar2.f16506c);
            if (e1Var.equals(e1Var2)) {
                return i2;
            }
            if (e1Var.mo20342b(i2.first) == -1) {
                C4879e1.C4882c cVar2 = cVar;
                if (z && (E = m12381E(cVar, bVar, i, z2, i2.first, e1Var2, e1Var)) != null) {
                    return e1Var.mo20460i(cVar, bVar, e1Var.mo20346g(E, bVar2).f16417c, -9223372036854775807L);
                }
                return null;
            } else if (!e1Var2.mo20346g(i2.first, bVar2).f16420f || e1Var2.mo20462m(bVar2.f16417c, cVar).f16438o != e1Var2.mo20342b(i2.first)) {
                return i2;
            } else {
                return e1Var.mo20460i(cVar, bVar, e1Var.mo20346g(i2.first, bVar2).f16417c, gVar2.f16506c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: E */
    public static Object m12381E(C4879e1.C4882c cVar, C4879e1.C4881b bVar, int i, boolean z, Object obj, C4879e1 e1Var, C4879e1 e1Var2) {
        int b = e1Var.mo20342b(obj);
        int h = e1Var.mo20458h();
        int i2 = b;
        int i3 = -1;
        for (int i4 = 0; i4 < h && i3 == -1; i4++) {
            i2 = e1Var.mo20456d(i2, bVar, cVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = e1Var2.mo20342b(e1Var.mo20348l(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return e1Var2.mo20348l(i3);
    }

    /* renamed from: L */
    public static void m12382L(C4949x0 x0Var, long j) {
        x0Var.mo15818i();
        if (x0Var instanceof C5343j) {
            C5343j jVar = (C5343j) x0Var;
            C17875h.m44304o(jVar.f13471k);
            jVar.f17628A = j;
        }
    }

    /* renamed from: Y */
    public static boolean m12383Y(C4930r0 r0Var, C4879e1.C4881b bVar) {
        C4987o.C4988a aVar = r0Var.f16676b;
        C4879e1 e1Var = r0Var.f16675a;
        if (aVar.mo20688a() || e1Var.mo20464p() || e1Var.mo20346g(aVar.f16857a, bVar).f16420f) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m12384q(C4949x0 x0Var) {
        return x0Var.getState() != 0;
    }

    /* renamed from: A */
    public final void mo20476A() {
        boolean z;
        C4913l0 l0Var = this.f16479s.f16639h;
        if (l0Var == null || !l0Var.f16613f.f16629g || !this.f16447A) {
            z = false;
        } else {
            z = true;
        }
        this.f16448B = z;
    }

    /* renamed from: B */
    public final void mo20477B(long j) throws ExoPlaybackException {
        C4913l0 l0Var = this.f16479s.f16639h;
        if (l0Var != null) {
            j += l0Var.f16622o;
        }
        this.f16458L = j;
        this.f16475o.f16568b.mo23020c(j);
        for (C4949x0 x0Var : this.f16462b) {
            if (m12384q(x0Var)) {
                x0Var.mo15831t(this.f16458L);
            }
        }
        for (C4913l0 l0Var2 = this.f16479s.f16639h; l0Var2 != null; l0Var2 = l0Var2.f16619l) {
            for (C3997b bVar : l0Var2.f16621n.f20301c) {
                if (bVar != null) {
                    bVar.mo16338h();
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo20478C(C4879e1 e1Var, C4879e1 e1Var2) {
        if (!e1Var.mo20464p() || !e1Var2.mo20464p()) {
            int size = this.f16476p.size() - 1;
            if (size < 0) {
                Collections.sort(this.f16476p);
            } else {
                this.f16476p.get(size).getClass();
                throw null;
            }
        }
    }

    /* renamed from: F */
    public final void mo20479F(long j, long j2) {
        ((C6809w) this.f16468h).f21063a.removeMessages(2);
        ((C6809w) this.f16468h).f21063a.sendEmptyMessageAtTime(2, j + j2);
    }

    /* renamed from: G */
    public final void mo20480G(boolean z) throws ExoPlaybackException {
        C4987o.C4988a aVar = this.f16479s.f16639h.f16613f.f16623a;
        long I = mo20482I(aVar, this.f16484x.f16693s, true, false);
        if (I != this.f16484x.f16693s) {
            C4930r0 r0Var = this.f16484x;
            this.f16484x = mo20520o(aVar, I, r0Var.f16677c, r0Var.f16678d, z, 5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7 A[Catch:{ all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa A[Catch:{ all -> 0x0144 }] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20481H(p099ga.C4887g0.C4894g r20) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            ga.g0$d r1 = r11.f16485y
            r8 = 1
            r1.mo20532a(r8)
            ga.r0 r1 = r11.f16484x
            ga.e1 r1 = r1.f16675a
            int r4 = r11.f16451E
            boolean r5 = r11.f16452F
            ga.e1$c r6 = r11.f16471k
            ga.e1$b r7 = r11.f16472l
            r3 = 1
            r2 = r20
            android.util.Pair r1 = m12380D(r1, r2, r3, r4, r5, r6, r7)
            r7 = 0
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0045
            ga.r0 r6 = r11.f16484x
            ga.e1 r6 = r6.f16675a
            android.util.Pair r6 = r11.mo20514i(r6)
            java.lang.Object r9 = r6.first
            gb.o$a r9 = (p100gb.C4987o.C4988a) r9
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r12 = r6.longValue()
            ga.r0 r6 = r11.f16484x
            ga.e1 r6 = r6.f16675a
            boolean r6 = r6.mo20464p()
            r6 = r6 ^ r8
            goto L_0x009b
        L_0x0045:
            java.lang.Object r6 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f16506c
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x0057
            r9 = r4
            goto L_0x0058
        L_0x0057:
            r9 = r12
        L_0x0058:
            ga.n0 r14 = r11.f16479s
            ga.r0 r15 = r11.f16484x
            ga.e1 r15 = r15.f16675a
            gb.o$a r6 = r14.mo20575l(r15, r6, r12)
            boolean r14 = r6.mo20688a()
            if (r14 == 0) goto L_0x008c
            ga.r0 r4 = r11.f16484x
            ga.e1 r4 = r4.f16675a
            java.lang.Object r5 = r6.f16857a
            ga.e1$b r12 = r11.f16472l
            r4.mo20346g(r5, r12)
            ga.e1$b r4 = r11.f16472l
            int r5 = r6.f16858b
            int r4 = r4.mo20467c(r5)
            int r5 = r6.f16859c
            if (r4 != r5) goto L_0x0086
            ga.e1$b r4 = r11.f16472l
            hb.a r4 = r4.f16421g
            long r4 = r4.f17306e
            goto L_0x0087
        L_0x0086:
            r4 = r2
        L_0x0087:
            r12 = r4
            r14 = r9
            r10 = 1
            r9 = r6
            goto L_0x009d
        L_0x008c:
            long r14 = r0.f16506c
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x0094
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            r18 = r6
            r6 = r4
            r4 = r9
            r9 = r18
        L_0x009b:
            r14 = r4
            r10 = r6
        L_0x009d:
            ga.r0 r4 = r11.f16484x     // Catch:{ all -> 0x0144 }
            ga.e1 r4 = r4.f16675a     // Catch:{ all -> 0x0144 }
            boolean r4 = r4.mo20464p()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00aa
            r11.f16457K = r0     // Catch:{ all -> 0x0144 }
            goto L_0x00b9
        L_0x00aa:
            r0 = 4
            if (r1 != 0) goto L_0x00bb
            ga.r0 r1 = r11.f16484x     // Catch:{ all -> 0x0144 }
            int r1 = r1.f16679e     // Catch:{ all -> 0x0144 }
            if (r1 == r8) goto L_0x00b6
            r11.mo20494V(r0)     // Catch:{ all -> 0x0144 }
        L_0x00b6:
            r11.mo20530z(r7, r8, r7, r8)     // Catch:{ all -> 0x0144 }
        L_0x00b9:
            r7 = r12
            goto L_0x00f9
        L_0x00bb:
            ga.r0 r1 = r11.f16484x     // Catch:{ all -> 0x0144 }
            gb.o$a r1 = r1.f16676b     // Catch:{ all -> 0x0144 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x010a
            ga.n0 r1 = r11.f16479s     // Catch:{ all -> 0x0144 }
            ga.l0 r1 = r1.f16639h     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x00dc
            boolean r4 = r1.f16611d     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00dc
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00dc
            gb.m r1 = r1.f16608a     // Catch:{ all -> 0x0144 }
            ga.b1 r2 = r11.f16483w     // Catch:{ all -> 0x0144 }
            long r1 = r1.mo20656g(r12, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x00dd
        L_0x00dc:
            r1 = r12
        L_0x00dd:
            long r3 = p099ga.C4883f.m12377b(r1)     // Catch:{ all -> 0x0144 }
            ga.r0 r5 = r11.f16484x     // Catch:{ all -> 0x0144 }
            long r5 = r5.f16693s     // Catch:{ all -> 0x0144 }
            long r5 = p099ga.C4883f.m12377b(r5)     // Catch:{ all -> 0x0144 }
            int r16 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x0108
            ga.r0 r3 = r11.f16484x     // Catch:{ all -> 0x0144 }
            int r4 = r3.f16679e     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == r5) goto L_0x00f7
            r5 = 3
            if (r4 != r5) goto L_0x0108
        L_0x00f7:
            long r7 = r3.f16693s     // Catch:{ all -> 0x0144 }
        L_0x00f9:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r14
            r9 = r10
            r10 = r0
            ga.r0 r0 = r1.mo20520o(r2, r3, r5, r7, r9, r10)
            r11.f16484x = r0
            return
        L_0x0108:
            r3 = r1
            goto L_0x010b
        L_0x010a:
            r3 = r12
        L_0x010b:
            ga.r0 r1 = r11.f16484x     // Catch:{ all -> 0x0144 }
            int r1 = r1.f16679e     // Catch:{ all -> 0x0144 }
            if (r1 != r0) goto L_0x0113
            r6 = 1
            goto L_0x0114
        L_0x0113:
            r6 = 0
        L_0x0114:
            ga.n0 r0 = r11.f16479s     // Catch:{ all -> 0x0144 }
            ga.l0 r1 = r0.f16639h     // Catch:{ all -> 0x0144 }
            ga.l0 r0 = r0.f16640i     // Catch:{ all -> 0x0144 }
            if (r1 == r0) goto L_0x011e
            r5 = 1
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            r1 = r19
            r2 = r9
            long r16 = r1.mo20482I(r2, r3, r5, r6)     // Catch:{ all -> 0x0144 }
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r8 = 0
        L_0x012c:
            r8 = r8 | r10
            ga.r0 r0 = r11.f16484x     // Catch:{ all -> 0x013f }
            ga.e1 r4 = r0.f16675a     // Catch:{ all -> 0x013f }
            gb.o$a r5 = r0.f16676b     // Catch:{ all -> 0x013f }
            r1 = r19
            r2 = r4
            r3 = r9
            r6 = r14
            r1.mo20505d0(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x013f }
            r10 = r8
            r7 = r16
            goto L_0x00f9
        L_0x013f:
            r0 = move-exception
            r10 = r8
            r7 = r16
            goto L_0x0146
        L_0x0144:
            r0 = move-exception
            r7 = r12
        L_0x0146:
            r12 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r14
            r9 = r10
            r10 = r12
            ga.r0 r1 = r1.mo20520o(r2, r3, r5, r7, r9, r10)
            r11.f16484x = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4887g0.mo20481H(ga.g0$g):void");
    }

    /* renamed from: I */
    public final long mo20482I(C4987o.C4988a aVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        C4918n0 n0Var;
        mo20501b0();
        this.f16449C = false;
        if (z2 || this.f16484x.f16679e == 3) {
            mo20494V(2);
        }
        C4913l0 l0Var = this.f16479s.f16639h;
        C4913l0 l0Var2 = l0Var;
        while (l0Var2 != null && !aVar.equals(l0Var2.f16613f.f16623a)) {
            l0Var2 = l0Var2.f16619l;
        }
        if (z || l0Var != l0Var2 || (l0Var2 != null && l0Var2.f16622o + j < 0)) {
            for (C4949x0 c : this.f16462b) {
                mo20502c(c);
            }
            if (l0Var2 != null) {
                while (true) {
                    n0Var = this.f16479s;
                    if (n0Var.f16639h == l0Var2) {
                        break;
                    }
                    n0Var.mo20564a();
                }
                n0Var.mo20574k(l0Var2);
                l0Var2.f16622o = 0;
                mo20508f(new boolean[this.f16462b.length]);
            }
        }
        if (l0Var2 != null) {
            this.f16479s.mo20574k(l0Var2);
            if (!l0Var2.f16611d) {
                l0Var2.f16613f = l0Var2.f16613f.mo20561b(j);
            } else {
                long j2 = l0Var2.f16613f.f16627e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0, j2 - 1);
                }
                if (l0Var2.f16612e) {
                    long f = l0Var2.f16608a.mo20655f(j);
                    l0Var2.f16608a.mo20664r(f - this.f16473m, this.f16474n);
                    j = f;
                }
            }
            mo20477B(j);
            mo20523s();
        } else {
            this.f16479s.mo20565b();
            mo20477B(j);
        }
        mo20516k(false);
        ((C6809w) this.f16468h).mo23022c(2);
        return j;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: J */
    public final void mo20483J(C4943v0 v0Var) throws ExoPlaybackException {
        if (v0Var.f16719f == this.f16470j) {
            synchronized (v0Var) {
            }
            try {
                v0Var.f16714a.mo15819j(v0Var.f16717d, v0Var.f16718e);
                v0Var.mo20612b(true);
                int i = this.f16484x.f16679e;
                if (i == 3 || i == 2) {
                    ((C6809w) this.f16468h).mo23022c(2);
                }
            } catch (Throwable th) {
                v0Var.mo20612b(true);
                throw th;
            }
        } else {
            ((C6809w) this.f16468h).mo23021a(15, v0Var).mo23023a();
        }
    }

    /* renamed from: K */
    public final void mo20484K(C4943v0 v0Var) {
        Looper looper = v0Var.f16719f;
        if (!looper.getThread().isAlive()) {
            v0Var.mo20612b(false);
            return;
        }
        C6809w b = this.f16477q.mo22943b(looper, (Handler.Callback) null);
        b.f21063a.post(new C7219n(5, this, v0Var));
    }

    /* renamed from: M */
    public final void mo20485M(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f16453G != z) {
            this.f16453G = z;
            if (!z) {
                for (C4949x0 x0Var : this.f16462b) {
                    if (!m12384q(x0Var)) {
                        x0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: N */
    public final void mo20486N(C4888a aVar) throws ExoPlaybackException {
        this.f16485y.mo20532a(1);
        if (aVar.f16489c != -1) {
            this.f16457K = new C4894g(new C4947w0(aVar.f16487a, aVar.f16488b), aVar.f16489c, aVar.f16490d);
        }
        C4924q0 q0Var = this.f16480t;
        List<C4924q0.C4927c> list = aVar.f16487a;
        C4967d0 d0Var = aVar.f16488b;
        q0Var.mo20586h(0, q0Var.f16651a.size());
        mo20517l(q0Var.mo20579a(q0Var.f16651a.size(), list, d0Var), false);
    }

    /* renamed from: O */
    public final void mo20487O(boolean z) {
        if (z != this.f16455I) {
            this.f16455I = z;
            C4930r0 r0Var = this.f16484x;
            int i = r0Var.f16679e;
            if (z || i == 4 || i == 1) {
                this.f16484x = r0Var.mo20595c(z);
            } else {
                ((C6809w) this.f16468h).mo23022c(2);
            }
        }
    }

    /* renamed from: P */
    public final void mo20488P(boolean z) throws ExoPlaybackException {
        this.f16447A = z;
        mo20476A();
        if (this.f16448B) {
            C4918n0 n0Var = this.f16479s;
            if (n0Var.f16640i != n0Var.f16639h) {
                mo20480G(true);
                mo20516k(false);
            }
        }
    }

    /* renamed from: Q */
    public final void mo20489Q(int i, int i2, boolean z, boolean z2) throws ExoPlaybackException {
        this.f16485y.mo20532a(z2 ? 1 : 0);
        C4891d dVar = this.f16485y;
        dVar.f16491a = true;
        dVar.f16496f = true;
        dVar.f16497g = i2;
        this.f16484x = this.f16484x.mo20596d(i, z);
        this.f16449C = false;
        for (C4913l0 l0Var = this.f16479s.f16639h; l0Var != null; l0Var = l0Var.f16619l) {
            for (C3997b bVar : l0Var.f16621n.f20301c) {
                if (bVar != null) {
                    bVar.mo16337a();
                }
            }
        }
        if (!mo20495W()) {
            mo20501b0();
            mo20509f0();
            return;
        }
        int i3 = this.f16484x.f16679e;
        if (i3 == 3) {
            mo20497Z();
            ((C6809w) this.f16468h).mo23022c(2);
        } else if (i3 == 2) {
            ((C6809w) this.f16468h).mo23022c(2);
        }
    }

    /* renamed from: R */
    public final void mo20490R(C4932s0 s0Var) throws ExoPlaybackException {
        this.f16475o.mo15928a(s0Var);
        C4932s0 b = this.f16475o.mo15930b();
        mo20519n(b, b.f16696a, true, true);
    }

    /* renamed from: S */
    public final void mo20491S(int i) throws ExoPlaybackException {
        this.f16451E = i;
        C4918n0 n0Var = this.f16479s;
        C4879e1 e1Var = this.f16484x.f16675a;
        n0Var.f16637f = i;
        if (!n0Var.mo20576n(e1Var)) {
            mo20480G(true);
        }
        mo20516k(false);
    }

    /* renamed from: T */
    public final void mo20492T(boolean z) throws ExoPlaybackException {
        this.f16452F = z;
        C4918n0 n0Var = this.f16479s;
        C4879e1 e1Var = this.f16484x.f16675a;
        n0Var.f16638g = z;
        if (!n0Var.mo20576n(e1Var)) {
            mo20480G(true);
        }
        mo20516k(false);
    }

    /* renamed from: U */
    public final void mo20493U(C4967d0 d0Var) throws ExoPlaybackException {
        this.f16485y.mo20532a(1);
        C4924q0 q0Var = this.f16480t;
        int size = q0Var.f16651a.size();
        if (d0Var.getLength() != size) {
            d0Var = d0Var.mo20670e().mo20672g(size);
        }
        q0Var.f16659i = d0Var;
        mo20517l(q0Var.mo20581c(), false);
    }

    /* renamed from: V */
    public final void mo20494V(int i) {
        C4930r0 r0Var = this.f16484x;
        if (r0Var.f16679e != i) {
            this.f16484x = r0Var.mo20599g(i);
        }
    }

    /* renamed from: W */
    public final boolean mo20495W() {
        C4930r0 r0Var = this.f16484x;
        return r0Var.f16686l && r0Var.f16687m == 0;
    }

    /* renamed from: X */
    public final boolean mo20496X(C4879e1 e1Var, C4987o.C4988a aVar) {
        if (aVar.mo20688a() || e1Var.mo20464p()) {
            return false;
        }
        e1Var.mo20462m(e1Var.mo20346g(aVar.f16857a, this.f16472l).f16417c, this.f16471k);
        if (!this.f16471k.mo20470a()) {
            return false;
        }
        C4879e1.C4882c cVar = this.f16471k;
        if (!cVar.f16432i || cVar.f16429f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public final void mo20497Z() throws ExoPlaybackException {
        this.f16449C = false;
        C4908k kVar = this.f16475o;
        kVar.f16573g = true;
        C6807u uVar = kVar.f16568b;
        if (!uVar.f21058c) {
            uVar.f21060e = uVar.f21057b.elapsedRealtime();
            uVar.f21058c = true;
        }
        for (C4949x0 x0Var : this.f16462b) {
            if (m12384q(x0Var)) {
                x0Var.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo20498a(C4964c0 c0Var) {
        ((C6809w) this.f16468h).mo23021a(9, (C4984m) c0Var).mo23023a();
    }

    /* renamed from: a0 */
    public final void mo20499a0(boolean z, boolean z2) {
        boolean z3;
        if (z || !this.f16453G) {
            z3 = true;
        } else {
            z3 = false;
        }
        mo20530z(z3, false, true, false);
        this.f16485y.mo20532a(z2 ? 1 : 0);
        this.f16466f.mo20538b(true);
        mo20494V(1);
    }

    /* renamed from: b */
    public final void mo20500b(C4888a aVar, int i) throws ExoPlaybackException {
        this.f16485y.mo20532a(1);
        C4924q0 q0Var = this.f16480t;
        if (i == -1) {
            i = q0Var.f16651a.size();
        }
        mo20517l(q0Var.mo20579a(i, aVar.f16487a, aVar.f16488b), false);
    }

    /* renamed from: b0 */
    public final void mo20501b0() throws ExoPlaybackException {
        C4908k kVar = this.f16475o;
        kVar.f16573g = false;
        C6807u uVar = kVar.f16568b;
        if (uVar.f21058c) {
            uVar.mo23020c(uVar.mo15939n());
            uVar.f21058c = false;
        }
        for (C4949x0 x0Var : this.f16462b) {
            if (m12384q(x0Var) && x0Var.getState() == 2) {
                x0Var.stop();
            }
        }
    }

    /* renamed from: c */
    public final void mo20502c(C4949x0 x0Var) throws ExoPlaybackException {
        boolean z;
        if (x0Var.getState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C4908k kVar = this.f16475o;
            if (x0Var == kVar.f16570d) {
                kVar.f16571e = null;
                kVar.f16570d = null;
                kVar.f16572f = true;
            }
            if (x0Var.getState() == 2) {
                x0Var.stop();
            }
            x0Var.mo15813e();
            this.f16456J--;
        }
    }

    /* renamed from: c0 */
    public final void mo20503c0() {
        boolean z;
        C4913l0 l0Var = this.f16479s.f16641j;
        if (this.f16450D || (l0Var != null && l0Var.f16608a.mo20657h())) {
            z = true;
        } else {
            z = false;
        }
        C4930r0 r0Var = this.f16484x;
        if (z != r0Var.f16681g) {
            C4930r0 r0Var2 = r2;
            C4930r0 r0Var3 = new C4930r0(r0Var.f16675a, r0Var.f16676b, r0Var.f16677c, r0Var.f16678d, r0Var.f16679e, r0Var.f16680f, z, r0Var.f16682h, r0Var.f16683i, r0Var.f16684j, r0Var.f16685k, r0Var.f16686l, r0Var.f16687m, r0Var.f16688n, r0Var.f16691q, r0Var.f16692r, r0Var.f16693s, r0Var.f16689o, r0Var.f16690p);
            this.f16484x = r0Var2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r0.f16642k < 100) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0530, code lost:
        if (r5 == false) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (r5 != -9223372036854775807L) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0366 A[EDGE_INSN: B:441:0x0366->B:201:0x0366 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0140  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20504d() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        /*
            r42 = this;
            r11 = r42
            ub.a r0 = r11.f16477q
            long r12 = r0.mo22942a()
            ga.r0 r0 = r11.f16484x
            ga.e1 r0 = r0.f16675a
            boolean r0 = r0.mo20464p()
            r14 = 0
            r15 = -9223372036854775808
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0365
            ga.q0 r0 = r11.f16480t
            boolean r0 = r0.f16660j
            if (r0 != 0) goto L_0x0022
            goto L_0x0365
        L_0x0022:
            ga.n0 r0 = r11.f16479s
            long r1 = r11.f16458L
            ga.l0 r0 = r0.f16641j
            if (r0 == 0) goto L_0x0040
            ga.l0 r3 = r0.f16619l
            if (r3 != 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            p583jk.C17875h.m44304o(r3)
            boolean r3 = r0.f16611d
            if (r3 == 0) goto L_0x0040
            gb.m r3 = r0.f16608a
            long r9 = r0.f16622o
            long r1 = r1 - r9
            r3.mo20665s(r1)
        L_0x0040:
            ga.n0 r0 = r11.f16479s
            ga.l0 r1 = r0.f16641j
            if (r1 == 0) goto L_0x0076
            ga.m0 r2 = r1.f16613f
            boolean r2 = r2.f16630h
            if (r2 != 0) goto L_0x0074
            boolean r2 = r1.f16611d
            if (r2 == 0) goto L_0x0060
            boolean r2 = r1.f16612e
            if (r2 == 0) goto L_0x005e
            gb.m r1 = r1.f16608a
            long r1 = r1.mo20663q()
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0060
        L_0x005e:
            r1 = 1
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x0074
            ga.l0 r1 = r0.f16641j
            ga.m0 r1 = r1.f16613f
            long r1 = r1.f16627e
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0074
            int r0 = r0.f16642k
            r1 = 100
            if (r0 >= r1) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r0 = 0
            goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            if (r0 == 0) goto L_0x0121
            ga.n0 r0 = r11.f16479s
            long r1 = r11.f16458L
            ga.r0 r3 = r11.f16484x
            ga.l0 r4 = r0.f16641j
            if (r4 != 0) goto L_0x009a
            ga.e1 r1 = r3.f16675a
            gb.o$a r2 = r3.f16676b
            long r9 = r3.f16677c
            long r3 = r3.f16693s
            r18 = r0
            r19 = r1
            r20 = r2
            r21 = r9
            r23 = r3
            ga.m0 r0 = r18.mo20567d(r19, r20, r21, r23)
            goto L_0x00a0
        L_0x009a:
            ga.e1 r3 = r3.f16675a
            ga.m0 r0 = r0.mo20566c(r3, r4, r1)
        L_0x00a0:
            if (r0 == 0) goto L_0x0121
            ga.n0 r1 = r11.f16479s
            ga.y0[] r2 = r11.f16463c
            sb.f r3 = r11.f16464d
            ga.j r4 = r11.f16466f
            tb.j r4 = r4.f16527a
            ga.q0 r9 = r11.f16480t
            sb.g r10 = r11.f16465e
            ga.l0 r15 = r1.f16641j
            if (r15 != 0) goto L_0x00c6
            gb.o$a r15 = r0.f16623a
            boolean r15 = r15.mo20688a()
            if (r15 == 0) goto L_0x00c3
            long r5 = r0.f16625c
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x00c3
            goto L_0x00d0
        L_0x00c3:
            r20 = 0
            goto L_0x00d2
        L_0x00c6:
            long r5 = r15.f16622o
            ga.m0 r15 = r15.f16613f
            long r7 = r15.f16627e
            long r5 = r5 + r7
            long r7 = r0.f16624b
            long r5 = r5 - r7
        L_0x00d0:
            r20 = r5
        L_0x00d2:
            ga.l0 r5 = new ga.l0
            r18 = r5
            r19 = r2
            r22 = r3
            r23 = r4
            r24 = r9
            r25 = r0
            r26 = r10
            r18.<init>(r19, r20, r22, r23, r24, r25, r26)
            ga.l0 r2 = r1.f16641j
            if (r2 == 0) goto L_0x00f7
            ga.l0 r3 = r2.f16619l
            if (r5 != r3) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            r2.mo20554b()
            r2.f16619l = r5
            r2.mo20555c()
            goto L_0x00fb
        L_0x00f7:
            r1.f16639h = r5
            r1.f16640i = r5
        L_0x00fb:
            r1.f16643l = r14
            r1.f16641j = r5
            int r2 = r1.f16642k
            r3 = 1
            int r2 = r2 + r3
            r1.f16642k = r2
            r1.mo20573j()
            gb.m r1 = r5.f16608a
            long r2 = r0.f16624b
            r1.mo20653c(r11, r2)
            ga.n0 r0 = r11.f16479s
            ga.l0 r0 = r0.f16639h
            if (r0 != r5) goto L_0x011c
            long r0 = r5.mo20557e()
            r11.mo20477B(r0)
        L_0x011c:
            r0 = 0
            r11.mo20516k(r0)
            goto L_0x0122
        L_0x0121:
            r0 = 0
        L_0x0122:
            boolean r1 = r11.f16450D
            if (r1 == 0) goto L_0x0130
            boolean r1 = r42.mo20521p()
            r11.f16450D = r1
            r42.mo20503c0()
            goto L_0x0133
        L_0x0130:
            r42.mo20523s()
        L_0x0133:
            ga.n0 r1 = r11.f16479s
            ga.l0 r1 = r1.f16640i
            if (r1 != 0) goto L_0x0140
        L_0x0139:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x025e
        L_0x0140:
            ga.l0 r2 = r1.f16619l
            if (r2 == 0) goto L_0x0216
            boolean r2 = r11.f16448B
            if (r2 == 0) goto L_0x014a
            goto L_0x0216
        L_0x014a:
            boolean r2 = r1.f16611d
            if (r2 != 0) goto L_0x014f
            goto L_0x016d
        L_0x014f:
            r2 = 0
        L_0x0150:
            ga.x0[] r3 = r11.f16462b
            int r4 = r3.length
            if (r2 >= r4) goto L_0x016f
            r3 = r3[r2]
            gb.b0[] r4 = r1.f16610c
            r4 = r4[r2]
            gb.b0 r5 = r3.mo15815g()
            if (r5 != r4) goto L_0x016d
            if (r4 == 0) goto L_0x016a
            boolean r3 = r3.mo15817h()
            if (r3 != 0) goto L_0x016a
            goto L_0x016d
        L_0x016a:
            int r2 = r2 + 1
            goto L_0x0150
        L_0x016d:
            r3 = 0
            goto L_0x0170
        L_0x016f:
            r3 = 1
        L_0x0170:
            if (r3 != 0) goto L_0x0173
            goto L_0x0139
        L_0x0173:
            ga.l0 r2 = r1.f16619l
            boolean r3 = r2.f16611d
            if (r3 != 0) goto L_0x0184
            long r3 = r11.f16458L
            long r5 = r2.mo20557e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0184
            goto L_0x0139
        L_0x0184:
            sb.g r1 = r1.f16621n
            ga.n0 r2 = r11.f16479s
            ga.l0 r3 = r2.f16640i
            if (r3 == 0) goto L_0x0192
            ga.l0 r3 = r3.f16619l
            if (r3 == 0) goto L_0x0192
            r3 = 1
            goto L_0x0193
        L_0x0192:
            r3 = 0
        L_0x0193:
            p583jk.C17875h.m44304o(r3)
            ga.l0 r3 = r2.f16640i
            ga.l0 r3 = r3.f16619l
            r2.f16640i = r3
            r2.mo20573j()
            ga.l0 r2 = r2.f16640i
            sb.g r3 = r2.f16621n
            boolean r4 = r2.f16611d
            if (r4 == 0) goto L_0x01ce
            gb.m r4 = r2.f16608a
            long r4 = r4.mo20658i()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01ce
            long r1 = r2.mo20557e()
            ga.x0[] r3 = r11.f16462b
            int r4 = r3.length
            r5 = 0
        L_0x01be:
            if (r5 >= r4) goto L_0x0139
            r6 = r3[r5]
            gb.b0 r7 = r6.mo15815g()
            if (r7 == 0) goto L_0x01cb
            m12382L(r6, r1)
        L_0x01cb:
            int r5 = r5 + 1
            goto L_0x01be
        L_0x01ce:
            r4 = 0
        L_0x01cf:
            ga.x0[] r5 = r11.f16462b
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0139
            boolean r5 = r1.mo22613b(r4)
            boolean r6 = r3.mo22613b(r4)
            if (r5 == 0) goto L_0x0213
            ga.x0[] r5 = r11.f16462b
            r5 = r5[r4]
            boolean r5 = r5.mo15821l()
            if (r5 != 0) goto L_0x0213
            ga.y0[] r5 = r11.f16463c
            r5 = r5[r4]
            com.google.android.exoplayer2.a r5 = (com.google.android.exoplayer2.C3873a) r5
            int r5 = r5.f13462b
            r7 = 7
            if (r5 != r7) goto L_0x01f5
            r5 = 1
            goto L_0x01f6
        L_0x01f5:
            r5 = 0
        L_0x01f6:
            ga.z0[] r7 = r1.f20300b
            r7 = r7[r4]
            ga.z0[] r8 = r3.f20300b
            r8 = r8[r4]
            if (r6 == 0) goto L_0x0208
            boolean r6 = r8.equals(r7)
            if (r6 == 0) goto L_0x0208
            if (r5 == 0) goto L_0x0213
        L_0x0208:
            ga.x0[] r5 = r11.f16462b
            r5 = r5[r4]
            long r6 = r2.mo20557e()
            m12382L(r5, r6)
        L_0x0213:
            int r4 = r4 + 1
            goto L_0x01cf
        L_0x0216:
            ga.m0 r2 = r1.f16613f
            boolean r2 = r2.f16630h
            if (r2 != 0) goto L_0x0220
            boolean r2 = r11.f16448B
            if (r2 == 0) goto L_0x0139
        L_0x0220:
            r2 = 0
        L_0x0221:
            ga.x0[] r3 = r11.f16462b
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0139
            r3 = r3[r2]
            gb.b0[] r4 = r1.f16610c
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0256
            gb.b0 r5 = r3.mo15815g()
            if (r5 != r4) goto L_0x0256
            boolean r4 = r3.mo15817h()
            if (r4 == 0) goto L_0x0256
            ga.m0 r4 = r1.f16613f
            long r4 = r4.f16627e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0251
            r9 = -9223372036854775808
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0251
            long r9 = r1.f16622o
            long r4 = r4 + r9
            goto L_0x0252
        L_0x0251:
            r4 = r7
        L_0x0252:
            m12382L(r3, r4)
            goto L_0x025b
        L_0x0256:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x025b:
            int r2 = r2 + 1
            goto L_0x0221
        L_0x025e:
            ga.n0 r1 = r11.f16479s
            ga.l0 r2 = r1.f16640i
            if (r2 == 0) goto L_0x02e9
            ga.l0 r1 = r1.f16639h
            if (r1 == r2) goto L_0x02e9
            boolean r1 = r2.f16614g
            if (r1 == 0) goto L_0x026e
            goto L_0x02e9
        L_0x026e:
            sb.g r1 = r2.f16621n
            r3 = 0
            r4 = 0
        L_0x0272:
            ga.x0[] r5 = r11.f16462b
            int r6 = r5.length
            if (r4 >= r6) goto L_0x02dd
            r5 = r5[r4]
            boolean r6 = m12384q(r5)
            if (r6 != 0) goto L_0x0281
        L_0x027f:
            r6 = r1
            goto L_0x02d8
        L_0x0281:
            gb.b0 r6 = r5.mo15815g()
            gb.b0[] r9 = r2.f16610c
            r9 = r9[r4]
            if (r6 == r9) goto L_0x028d
            r6 = 1
            goto L_0x028e
        L_0x028d:
            r6 = 0
        L_0x028e:
            boolean r9 = r1.mo22613b(r4)
            if (r9 == 0) goto L_0x0297
            if (r6 != 0) goto L_0x0297
            goto L_0x027f
        L_0x0297:
            boolean r6 = r5.mo15821l()
            if (r6 != 0) goto L_0x02cc
            com.google.android.exoplayer2.trackselection.b[] r6 = r1.f20301c
            r6 = r6[r4]
            if (r6 == 0) goto L_0x02a8
            int r9 = r6.length()
            goto L_0x02a9
        L_0x02a8:
            r9 = 0
        L_0x02a9:
            com.google.android.exoplayer2.Format[] r10 = new com.google.android.exoplayer2.Format[r9]
            r15 = 0
        L_0x02ac:
            if (r15 >= r9) goto L_0x02b7
            com.google.android.exoplayer2.Format r16 = r6.mo22603b(r15)
            r10[r15] = r16
            int r15 = r15 + 1
            goto L_0x02ac
        L_0x02b7:
            gb.b0[] r6 = r2.f16610c
            r20 = r6[r4]
            long r21 = r2.mo20557e()
            r6 = r1
            long r0 = r2.f16622o
            r18 = r5
            r19 = r10
            r23 = r0
            r18.mo15832u(r19, r20, r21, r23)
            goto L_0x02d8
        L_0x02cc:
            r6 = r1
            boolean r0 = r5.mo15932d()
            if (r0 == 0) goto L_0x02d7
            r11.mo20502c(r5)
            goto L_0x02d8
        L_0x02d7:
            r3 = 1
        L_0x02d8:
            int r4 = r4 + 1
            r1 = r6
            r0 = 0
            goto L_0x0272
        L_0x02dd:
            r0 = 1
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x02ea
            int r1 = r5.length
            boolean[] r1 = new boolean[r1]
            r11.mo20508f(r1)
            goto L_0x02ea
        L_0x02e9:
            r0 = 1
        L_0x02ea:
            r3 = 0
        L_0x02eb:
            boolean r1 = r42.mo20495W()
            if (r1 != 0) goto L_0x02f2
            goto L_0x0312
        L_0x02f2:
            boolean r1 = r11.f16448B
            if (r1 == 0) goto L_0x02f7
            goto L_0x0312
        L_0x02f7:
            ga.n0 r1 = r11.f16479s
            ga.l0 r1 = r1.f16639h
            if (r1 != 0) goto L_0x02fe
            goto L_0x0312
        L_0x02fe:
            ga.l0 r1 = r1.f16619l
            if (r1 == 0) goto L_0x0312
            long r4 = r11.f16458L
            long r9 = r1.mo20557e()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0312
            boolean r1 = r1.f16614g
            if (r1 == 0) goto L_0x0312
            r1 = 1
            goto L_0x0313
        L_0x0312:
            r1 = 0
        L_0x0313:
            if (r1 == 0) goto L_0x0366
            if (r3 == 0) goto L_0x031a
            r42.mo20524t()
        L_0x031a:
            ga.n0 r1 = r11.f16479s
            ga.l0 r15 = r1.f16639h
            ga.l0 r10 = r1.mo20564a()
            ga.m0 r1 = r10.f16613f
            gb.o$a r2 = r1.f16623a
            long r5 = r1.f16624b
            long r3 = r1.f16625c
            r9 = 1
            r18 = 0
            r1 = r42
            r19 = r3
            r3 = r5
            r21 = r5
            r14 = 0
            r5 = r19
            r7 = r21
            r14 = r10
            r10 = r18
            ga.r0 r1 = r1.mo20520o(r2, r3, r5, r7, r9, r10)
            r11.f16484x = r1
            ga.e1 r4 = r1.f16675a
            ga.m0 r1 = r14.f16613f
            gb.o$a r3 = r1.f16623a
            ga.m0 r1 = r15.f16613f
            gb.o$a r5 = r1.f16623a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r42
            r2 = r4
            r1.mo20505d0(r2, r3, r4, r5, r6)
            r42.mo20476A()
            r42.mo20509f0()
            r3 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            goto L_0x02eb
        L_0x0365:
            r0 = 1
        L_0x0366:
            ga.r0 r1 = r11.f16484x
            int r1 = r1.f16679e
            r2 = 2
            if (r1 == r0) goto L_0x06a6
            r3 = 4
            if (r1 != r3) goto L_0x0372
            goto L_0x06a6
        L_0x0372:
            ga.n0 r1 = r11.f16479s
            ga.l0 r1 = r1.f16639h
            r4 = 10
            if (r1 != 0) goto L_0x037e
            r11.mo20479F(r12, r4)
            return
        L_0x037e:
            java.lang.String r6 = "doSomeWork"
            p583jk.C17884p.m44368g(r6)
            r42.mo20509f0()
            boolean r6 = r1.f16611d
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x0402
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 * r7
            gb.m r6 = r1.f16608a
            ga.r0 r14 = r11.f16484x
            long r14 = r14.f16693s
            long r7 = r11.f16473m
            long r14 = r14 - r7
            boolean r7 = r11.f16474n
            r6.mo20664r(r14, r7)
            r6 = 0
            r7 = 1
            r8 = 1
        L_0x03a3:
            ga.x0[] r14 = r11.f16462b
            int r15 = r14.length
            if (r6 >= r15) goto L_0x0400
            r14 = r14[r6]
            boolean r15 = m12384q(r14)
            if (r15 != 0) goto L_0x03b1
            goto L_0x03fb
        L_0x03b1:
            long r4 = r11.f16458L
            r14.mo16049q(r4, r9)
            if (r7 == 0) goto L_0x03c0
            boolean r4 = r14.mo15932d()
            if (r4 == 0) goto L_0x03c0
            r5 = 1
            goto L_0x03c1
        L_0x03c0:
            r5 = 0
        L_0x03c1:
            gb.b0[] r4 = r1.f16610c
            r4 = r4[r6]
            gb.b0 r7 = r14.mo15815g()
            if (r4 == r7) goto L_0x03cd
            r4 = 1
            goto L_0x03ce
        L_0x03cd:
            r4 = 0
        L_0x03ce:
            if (r4 != 0) goto L_0x03d8
            boolean r7 = r14.mo15817h()
            if (r7 == 0) goto L_0x03d8
            r7 = 1
            goto L_0x03d9
        L_0x03d8:
            r7 = 0
        L_0x03d9:
            if (r4 != 0) goto L_0x03ec
            if (r7 != 0) goto L_0x03ec
            boolean r4 = r14.isReady()
            if (r4 != 0) goto L_0x03ec
            boolean r4 = r14.mo15932d()
            if (r4 == 0) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            r4 = 0
            goto L_0x03ed
        L_0x03ec:
            r4 = 1
        L_0x03ed:
            if (r8 == 0) goto L_0x03f3
            if (r4 == 0) goto L_0x03f3
            r7 = 1
            goto L_0x03f4
        L_0x03f3:
            r7 = 0
        L_0x03f4:
            if (r4 != 0) goto L_0x03f9
            r14.mo15820k()
        L_0x03f9:
            r8 = r7
            r7 = r5
        L_0x03fb:
            int r6 = r6 + 1
            r4 = 10
            goto L_0x03a3
        L_0x0400:
            r6 = r7
            goto L_0x0409
        L_0x0402:
            gb.m r4 = r1.f16608a
            r4.mo20660l()
            r6 = 1
            r8 = 1
        L_0x0409:
            ga.m0 r4 = r1.f16613f
            long r4 = r4.f16627e
            if (r6 == 0) goto L_0x0426
            boolean r6 = r1.f16611d
            if (r6 == 0) goto L_0x0426
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0424
            ga.r0 r9 = r11.f16484x
            long r9 = r9.f16693s
            int r14 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r14 > 0) goto L_0x042b
        L_0x0424:
            r5 = 1
            goto L_0x042c
        L_0x0426:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x042b:
            r5 = 0
        L_0x042c:
            if (r5 == 0) goto L_0x043d
            boolean r4 = r11.f16448B
            if (r4 == 0) goto L_0x043d
            r4 = 0
            r11.f16448B = r4
            ga.r0 r9 = r11.f16484x
            int r9 = r9.f16687m
            r10 = 5
            r11.mo20489Q(r9, r10, r4, r4)
        L_0x043d:
            r4 = 3
            if (r5 == 0) goto L_0x0450
            ga.m0 r5 = r1.f16613f
            boolean r5 = r5.f16630h
            if (r5 == 0) goto L_0x0450
            r11.mo20494V(r3)
            r42.mo20501b0()
            r22 = r1
            goto L_0x05a7
        L_0x0450:
            ga.r0 r5 = r11.f16484x
            int r9 = r5.f16679e
            if (r9 != r2) goto L_0x0548
            int r9 = r11.f16456J
            if (r9 != 0) goto L_0x0462
            boolean r5 = r42.mo20522r()
            r22 = r1
            goto L_0x0536
        L_0x0462:
            if (r8 != 0) goto L_0x0468
            r22 = r1
            goto L_0x0533
        L_0x0468:
            boolean r9 = r5.f16681g
            if (r9 != 0) goto L_0x0470
        L_0x046c:
            r22 = r1
            goto L_0x0535
        L_0x0470:
            ga.e1 r5 = r5.f16675a
            ga.n0 r9 = r11.f16479s
            ga.l0 r9 = r9.f16639h
            ga.m0 r9 = r9.f16613f
            gb.o$a r9 = r9.f16623a
            boolean r5 = r11.mo20496X(r5, r9)
            if (r5 == 0) goto L_0x0487
            ga.i0 r5 = r11.f16481u
            ga.i r5 = (p099ga.C4898i) r5
            long r9 = r5.f16520i
            goto L_0x0488
        L_0x0487:
            r9 = r6
        L_0x0488:
            ga.n0 r5 = r11.f16479s
            ga.l0 r5 = r5.f16641j
            boolean r14 = r5.f16611d
            if (r14 == 0) goto L_0x04a2
            boolean r14 = r5.f16612e
            if (r14 == 0) goto L_0x04a0
            gb.m r14 = r5.f16608a
            long r14 = r14.mo20663q()
            r21 = -9223372036854775808
            int r23 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x04a2
        L_0x04a0:
            r14 = 1
            goto L_0x04a3
        L_0x04a2:
            r14 = 0
        L_0x04a3:
            if (r14 == 0) goto L_0x04ad
            ga.m0 r14 = r5.f16613f
            boolean r14 = r14.f16630h
            if (r14 == 0) goto L_0x04ad
            r14 = 1
            goto L_0x04ae
        L_0x04ad:
            r14 = 0
        L_0x04ae:
            ga.m0 r15 = r5.f16613f
            gb.o$a r15 = r15.f16623a
            boolean r15 = r15.mo20688a()
            if (r15 == 0) goto L_0x04be
            boolean r5 = r5.f16611d
            if (r5 != 0) goto L_0x04be
            r5 = 1
            goto L_0x04bf
        L_0x04be:
            r5 = 0
        L_0x04bf:
            if (r14 != 0) goto L_0x046c
            if (r5 != 0) goto L_0x046c
            ga.j r5 = r11.f16466f
            ga.r0 r14 = r11.f16484x
            long r14 = r14.f16691q
            ga.n0 r3 = r11.f16479s
            ga.l0 r3 = r3.f16641j
            if (r3 != 0) goto L_0x04d6
            r22 = r1
            r0 = 0
            r2 = 0
            goto L_0x04e4
        L_0x04d6:
            r22 = r1
            long r0 = r11.f16458L
            long r2 = r3.f16622o
            long r0 = r0 - r2
            long r14 = r14 - r0
            r0 = 0
            long r2 = java.lang.Math.max(r0, r14)
        L_0x04e4:
            ga.k r14 = r11.f16475o
            ga.s0 r14 = r14.mo15930b()
            float r14 = r14.f16696a
            boolean r15 = r11.f16449C
            r5.getClass()
            r24 = 1065353216(0x3f800000, float:1.0)
            int r24 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r24 != 0) goto L_0x04f8
            goto L_0x04ff
        L_0x04f8:
            double r2 = (double) r2
            double r0 = (double) r14
            double r2 = r2 / r0
            long r2 = java.lang.Math.round(r2)
        L_0x04ff:
            if (r15 == 0) goto L_0x0504
            long r0 = r5.f16531e
            goto L_0x0506
        L_0x0504:
            long r0 = r5.f16530d
        L_0x0506:
            int r14 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r14 == 0) goto L_0x0511
            r14 = 2
            long r9 = r9 / r14
            long r0 = java.lang.Math.min(r9, r0)
        L_0x0511:
            r9 = 0
            int r14 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x052f
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x052f
            tb.j r1 = r5.f16527a
            monitor-enter(r1)
            int r0 = r1.f20682e     // Catch:{ all -> 0x052c }
            int r2 = r1.f20679b     // Catch:{ all -> 0x052c }
            int r0 = r0 * r2
            monitor-exit(r1)
            int r1 = r5.f16534h
            if (r0 < r1) goto L_0x052a
            goto L_0x052f
        L_0x052a:
            r5 = 0
            goto L_0x0530
        L_0x052c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x052f:
            r5 = 1
        L_0x0530:
            if (r5 == 0) goto L_0x0533
            goto L_0x0535
        L_0x0533:
            r5 = 0
            goto L_0x0536
        L_0x0535:
            r5 = 1
        L_0x0536:
            if (r5 == 0) goto L_0x054a
            r11.mo20494V(r4)
            r0 = 0
            r11.f16461O = r0
            boolean r0 = r42.mo20495W()
            if (r0 == 0) goto L_0x05a7
            r42.mo20497Z()
            goto L_0x05a7
        L_0x0548:
            r22 = r1
        L_0x054a:
            ga.r0 r0 = r11.f16484x
            int r0 = r0.f16679e
            if (r0 != r4) goto L_0x05a7
            int r0 = r11.f16456J
            if (r0 != 0) goto L_0x055b
            boolean r0 = r42.mo20522r()
            if (r0 == 0) goto L_0x055d
            goto L_0x05a7
        L_0x055b:
            if (r8 != 0) goto L_0x05a7
        L_0x055d:
            boolean r0 = r42.mo20495W()
            r11.f16449C = r0
            r0 = 2
            r11.mo20494V(r0)
            boolean r0 = r11.f16449C
            if (r0 == 0) goto L_0x05a4
            ga.n0 r0 = r11.f16479s
            ga.l0 r0 = r0.f16639h
        L_0x056f:
            if (r0 == 0) goto L_0x0586
            sb.g r1 = r0.f16621n
            com.google.android.exoplayer2.trackselection.b[] r1 = r1.f20301c
            int r2 = r1.length
            r5 = 0
        L_0x0577:
            if (r5 >= r2) goto L_0x0583
            r3 = r1[r5]
            if (r3 == 0) goto L_0x0580
            r3.mo16340l()
        L_0x0580:
            int r5 = r5 + 1
            goto L_0x0577
        L_0x0583:
            ga.l0 r0 = r0.f16619l
            goto L_0x056f
        L_0x0586:
            ga.i0 r0 = r11.f16481u
            ga.i r0 = (p099ga.C4898i) r0
            long r1 = r0.f16520i
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0591
            goto L_0x05a4
        L_0x0591:
            long r8 = r0.f16513b
            long r1 = r1 + r8
            r0.f16520i = r1
            long r8 = r0.f16519h
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x05a2
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x05a2
            r0.f16520i = r8
        L_0x05a2:
            r0.f16524m = r6
        L_0x05a4:
            r42.mo20501b0()
        L_0x05a7:
            ga.r0 r0 = r11.f16484x
            int r0 = r0.f16679e
            r1 = 2
            if (r0 != r1) goto L_0x05f9
            r5 = 0
        L_0x05af:
            ga.x0[] r0 = r11.f16462b
            int r1 = r0.length
            if (r5 >= r1) goto L_0x05db
            r0 = r0[r5]
            boolean r0 = m12384q(r0)
            if (r0 == 0) goto L_0x05d4
            ga.x0[] r0 = r11.f16462b
            r0 = r0[r5]
            gb.b0 r0 = r0.mo15815g()
            r1 = r22
            gb.b0[] r2 = r1.f16610c
            r2 = r2[r5]
            if (r0 != r2) goto L_0x05d6
            ga.x0[] r0 = r11.f16462b
            r0 = r0[r5]
            r0.mo15820k()
            goto L_0x05d6
        L_0x05d4:
            r1 = r22
        L_0x05d6:
            int r5 = r5 + 1
            r22 = r1
            goto L_0x05af
        L_0x05db:
            ga.r0 r0 = r11.f16484x
            boolean r1 = r0.f16681g
            if (r1 != 0) goto L_0x05f9
            long r0 = r0.f16692r
            r2 = 500000(0x7a120, double:2.47033E-318)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x05f9
            boolean r0 = r42.mo20521p()
            if (r0 != 0) goto L_0x05f1
            goto L_0x05f9
        L_0x05f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x05f9:
            boolean r0 = r11.f16455I
            ga.r0 r1 = r11.f16484x
            boolean r2 = r1.f16689o
            if (r0 == r2) goto L_0x0607
            ga.r0 r0 = r1.mo20595c(r0)
            r11.f16484x = r0
        L_0x0607:
            boolean r0 = r42.mo20495W()
            if (r0 == 0) goto L_0x0613
            ga.r0 r0 = r11.f16484x
            int r0 = r0.f16679e
            if (r0 == r4) goto L_0x061a
        L_0x0613:
            ga.r0 r0 = r11.f16484x
            int r0 = r0.f16679e
            r1 = 2
            if (r0 != r1) goto L_0x062e
        L_0x061a:
            boolean r0 = r11.f16455I
            if (r0 == 0) goto L_0x0625
            boolean r0 = r11.f16454H
            if (r0 == 0) goto L_0x0625
            r0 = 1
            r5 = 0
            goto L_0x062c
        L_0x0625:
            r0 = 10
            r11.mo20479F(r12, r0)
            r0 = 1
            r5 = 1
        L_0x062c:
            r5 = r5 ^ r0
            goto L_0x0646
        L_0x062e:
            int r1 = r11.f16456J
            if (r1 == 0) goto L_0x063b
            r1 = 4
            if (r0 == r1) goto L_0x063b
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.mo20479F(r12, r0)
            goto L_0x0645
        L_0x063b:
            ub.g r0 = r11.f16468h
            ub.w r0 = (p277ub.C6809w) r0
            android.os.Handler r0 = r0.f21063a
            r1 = 2
            r0.removeMessages(r1)
        L_0x0645:
            r5 = 0
        L_0x0646:
            ga.r0 r0 = r11.f16484x
            boolean r1 = r0.f16690p
            if (r1 == r5) goto L_0x069f
            ga.r0 r1 = new ga.r0
            r17 = r1
            ga.e1 r2 = r0.f16675a
            r18 = r2
            gb.o$a r2 = r0.f16676b
            r19 = r2
            long r2 = r0.f16677c
            r20 = r2
            long r2 = r0.f16678d
            r22 = r2
            int r2 = r0.f16679e
            r24 = r2
            com.google.android.exoplayer2.ExoPlaybackException r2 = r0.f16680f
            r25 = r2
            boolean r2 = r0.f16681g
            r26 = r2
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r0.f16682h
            r27 = r2
            sb.g r2 = r0.f16683i
            r28 = r2
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r2 = r0.f16684j
            r29 = r2
            gb.o$a r2 = r0.f16685k
            r30 = r2
            boolean r2 = r0.f16686l
            r31 = r2
            int r2 = r0.f16687m
            r32 = r2
            ga.s0 r2 = r0.f16688n
            r33 = r2
            long r2 = r0.f16691q
            r34 = r2
            long r2 = r0.f16692r
            r36 = r2
            long r2 = r0.f16693s
            r38 = r2
            boolean r0 = r0.f16689o
            r40 = r0
            r41 = r5
            r17.<init>(r18, r19, r20, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40, r41)
            r11.f16484x = r1
        L_0x069f:
            r0 = 0
            r11.f16454H = r0
            p583jk.C17884p.m44382v()
            return
        L_0x06a6:
            ub.g r0 = r11.f16468h
            ub.w r0 = (p277ub.C6809w) r0
            android.os.Handler r0 = r0.f21063a
            r1 = 2
            r0.removeMessages(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4887g0.mo20504d():void");
    }

    /* renamed from: d0 */
    public final void mo20505d0(C4879e1 e1Var, C4987o.C4988a aVar, C4879e1 e1Var2, C4987o.C4988a aVar2, long j) {
        if (e1Var.mo20464p() || !mo20496X(e1Var, aVar)) {
            float f = this.f16475o.mo15930b().f16696a;
            C4932s0 s0Var = this.f16484x.f16688n;
            if (f != s0Var.f16696a) {
                this.f16475o.mo15928a(s0Var);
                return;
            }
            return;
        }
        e1Var.mo20462m(e1Var.mo20346g(aVar.f16857a, this.f16472l).f16417c, this.f16471k);
        C4899i0 i0Var = this.f16481u;
        C4901j0.C4906e eVar = this.f16471k.f16434k;
        int i = C6774a0.f20959a;
        C4898i iVar = (C4898i) i0Var;
        iVar.getClass();
        iVar.f16515d = C4883f.m12376a(eVar.f16557a);
        iVar.f16518g = C4883f.m12376a(eVar.f16558b);
        iVar.f16519h = C4883f.m12376a(eVar.f16559c);
        float f2 = eVar.f16560d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        iVar.f16522k = f2;
        float f3 = eVar.f16561e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        iVar.f16521j = f3;
        iVar.mo20537a();
        if (j != -9223372036854775807L) {
            C4898i iVar2 = (C4898i) this.f16481u;
            iVar2.f16516e = mo20510g(e1Var, aVar.f16857a, j);
            iVar2.mo20537a();
            return;
        }
        Object obj = this.f16471k.f16424a;
        Object obj2 = null;
        if (!e1Var2.mo20464p()) {
            obj2 = e1Var2.mo20462m(e1Var2.mo20346g(aVar2.f16857a, this.f16472l).f16417c, this.f16471k).f16424a;
        }
        if (!C6774a0.m15941a(obj2, obj)) {
            C4898i iVar3 = (C4898i) this.f16481u;
            iVar3.f16516e = -9223372036854775807L;
            iVar3.mo20537a();
        }
    }

    /* renamed from: e */
    public final void mo20506e(C4984m mVar) {
        ((C6809w) this.f16468h).mo23021a(8, mVar).mo23023a();
    }

    /* renamed from: e0 */
    public final void mo20507e0(C6508g gVar) {
        C4900j jVar = this.f16466f;
        C4949x0[] x0VarArr = this.f16462b;
        C3997b[] bVarArr = gVar.f20301c;
        int i = jVar.f16532f;
        boolean z = true;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 >= x0VarArr.length) {
                    i = Math.max(13107200, i3);
                    break;
                }
                if (bVarArr[i2] != null) {
                    int m = x0VarArr[i2].mo15822m();
                    if (m == 0) {
                        i4 = 144310272;
                    } else if (m != 1) {
                        if (m == 2) {
                            i4 = 131072000;
                        } else if (m == 3 || m == 5 || m == 6) {
                            i4 = SQLiteDatabase.OPEN_SHAREDCACHE;
                        } else if (m == 7) {
                            i4 = 0;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    i3 += i4;
                }
                i2++;
            }
        }
        jVar.f16534h = i;
        C6658j jVar2 = jVar.f16527a;
        synchronized (jVar2) {
            if (i >= jVar2.f20681d) {
                z = false;
            }
            jVar2.f20681d = i;
            if (z) {
                jVar2.mo22832b();
            }
        }
    }

    /* renamed from: f */
    public final void mo20508f(boolean[] zArr) throws ExoPlaybackException {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        C6791m mVar;
        C4913l0 l0Var = this.f16479s.f16640i;
        C6508g gVar = l0Var.f16621n;
        for (int i2 = 0; i2 < this.f16462b.length; i2++) {
            if (!gVar.mo22613b(i2)) {
                this.f16462b[i2].reset();
            }
        }
        for (int i3 = 0; i3 < this.f16462b.length; i3++) {
            if (gVar.mo22613b(i3)) {
                boolean z4 = zArr[i3];
                C4949x0 x0Var = this.f16462b[i3];
                if (!m12384q(x0Var)) {
                    C4918n0 n0Var = this.f16479s;
                    C4913l0 l0Var2 = n0Var.f16640i;
                    if (l0Var2 == n0Var.f16639h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C6508g gVar2 = l0Var2.f16621n;
                    C4954z0 z0Var = gVar2.f20300b[i3];
                    C3997b bVar = gVar2.f20301c[i3];
                    if (bVar != null) {
                        i = bVar.length();
                    } else {
                        i = 0;
                    }
                    Format[] formatArr = new Format[i];
                    for (int i4 = 0; i4 < i; i4++) {
                        formatArr[i4] = bVar.mo22603b(i4);
                    }
                    if (!mo20495W() || this.f16484x.f16679e != 3) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z4 || !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    this.f16456J++;
                    x0Var.mo15825r(z0Var, formatArr, l0Var2.f16610c[i3], this.f16458L, z3, z, l0Var2.mo20557e(), l0Var2.f16622o);
                    x0Var.mo15819j(103, new C4884f0(this));
                    C4908k kVar = this.f16475o;
                    kVar.getClass();
                    C6791m v = x0Var.mo15833v();
                    if (!(v == null || v == (mVar = kVar.f16571e))) {
                        if (mVar == null) {
                            kVar.f16571e = v;
                            kVar.f16570d = x0Var;
                            v.mo15928a(kVar.f16568b.f21061f);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z2) {
                        x0Var.start();
                    }
                } else {
                    continue;
                }
            }
        }
        l0Var.f16614g = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x016d A[EDGE_INSN: B:130:0x016d->B:71:0x016d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0185  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20509f0() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r21 = this;
            r10 = r21
            ga.n0 r0 = r10.f16479s
            ga.l0 r0 = r0.f16639h
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f16611d
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            gb.m r1 = r0.f16608a
            long r1 = r1.mo20658i()
            r6 = r1
            goto L_0x001b
        L_0x001a:
            r6 = r11
        L_0x001b:
            r1 = 0
            r2 = 1
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0041
            r10.mo20477B(r6)
            ga.r0 r0 = r10.f16484x
            long r0 = r0.f16693s
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x003d
            ga.r0 r0 = r10.f16484x
            gb.o$a r1 = r0.f16676b
            long r4 = r0.f16677c
            r8 = 1
            r9 = 5
            r0 = r21
            r2 = r6
            ga.r0 r0 = r0.mo20520o(r1, r2, r4, r6, r8, r9)
            r10.f16484x = r0
        L_0x003d:
            r8 = r10
            r9 = r8
            goto L_0x0192
        L_0x0041:
            ga.k r3 = r10.f16475o
            ga.n0 r4 = r10.f16479s
            ga.l0 r4 = r4.f16640i
            if (r0 == r4) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            ga.x0 r5 = r3.f16570d
            if (r5 == 0) goto L_0x006b
            boolean r5 = r5.mo15932d()
            if (r5 != 0) goto L_0x006b
            ga.x0 r5 = r3.f16570d
            boolean r5 = r5.isReady()
            if (r5 != 0) goto L_0x0069
            if (r4 != 0) goto L_0x006b
            ga.x0 r4 = r3.f16570d
            boolean r4 = r4.mo15817h()
            if (r4 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r4 = 0
            goto L_0x006c
        L_0x006b:
            r4 = 1
        L_0x006c:
            if (r4 == 0) goto L_0x0085
            r3.f16572f = r2
            boolean r4 = r3.f16573g
            if (r4 == 0) goto L_0x00eb
            ub.u r4 = r3.f16568b
            boolean r5 = r4.f21058c
            if (r5 != 0) goto L_0x00eb
            ub.a r5 = r4.f21057b
            long r5 = r5.elapsedRealtime()
            r4.f21060e = r5
            r4.f21058c = r2
            goto L_0x00eb
        L_0x0085:
            ub.m r4 = r3.f16571e
            r4.getClass()
            long r5 = r4.mo15939n()
            boolean r7 = r3.f16572f
            if (r7 == 0) goto L_0x00c2
            ub.u r7 = r3.f16568b
            long r7 = r7.mo15939n()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ac
            ub.u r2 = r3.f16568b
            boolean r4 = r2.f21058c
            if (r4 == 0) goto L_0x00eb
            long r4 = r2.mo15939n()
            r2.mo23020c(r4)
            r2.f21058c = r1
            goto L_0x00eb
        L_0x00ac:
            r3.f16572f = r1
            boolean r7 = r3.f16573g
            if (r7 == 0) goto L_0x00c2
            ub.u r7 = r3.f16568b
            boolean r8 = r7.f21058c
            if (r8 != 0) goto L_0x00c2
            ub.a r8 = r7.f21057b
            long r8 = r8.elapsedRealtime()
            r7.f21060e = r8
            r7.f21058c = r2
        L_0x00c2:
            ub.u r2 = r3.f16568b
            r2.mo23020c(r5)
            ga.s0 r2 = r4.mo15930b()
            ub.u r4 = r3.f16568b
            ga.s0 r4 = r4.f21061f
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x00eb
            ub.u r4 = r3.f16568b
            r4.mo15928a(r2)
            ga.k$a r4 = r3.f16569c
            ga.g0 r4 = (p099ga.C4887g0) r4
            ub.g r4 = r4.f16468h
            ub.w r4 = (p277ub.C6809w) r4
            r5 = 16
            ub.w$a r2 = r4.mo23021a(r5, r2)
            r2.mo23023a()
        L_0x00eb:
            long r2 = r3.mo15939n()
            r10.f16458L = r2
            long r4 = r0.f16622o
            long r2 = r2 - r4
            ga.r0 r0 = r10.f16484x
            long r4 = r0.f16693s
            java.util.ArrayList<ga.g0$c> r0 = r10.f16476p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x018c
            ga.r0 r0 = r10.f16484x
            gb.o$a r0 = r0.f16676b
            boolean r0 = r0.mo20688a()
            if (r0 == 0) goto L_0x010c
            goto L_0x018c
        L_0x010c:
            boolean r0 = r10.f16460N
            if (r0 == 0) goto L_0x0115
            r6 = 1
            long r4 = r4 - r6
            r10.f16460N = r1
        L_0x0115:
            ga.r0 r0 = r10.f16484x
            ga.e1 r1 = r0.f16675a
            gb.o$a r0 = r0.f16676b
            java.lang.Object r0 = r0.f16857a
            int r0 = r1.mo20342b(r0)
            int r1 = r10.f16459M
            java.util.ArrayList<ga.g0$c> r6 = r10.f16476p
            int r6 = r6.size()
            int r1 = java.lang.Math.min(r1, r6)
            r6 = 0
            if (r1 <= 0) goto L_0x013f
            java.util.ArrayList<ga.g0$c> r7 = r10.f16476p
            int r8 = r1 + -1
            java.lang.Object r7 = r7.get(r8)
            ga.g0$c r7 = (p099ga.C4887g0.C4890c) r7
            r8 = r10
            r9 = r8
            r12 = r11
            r11 = r9
            goto L_0x0147
        L_0x013f:
            r7 = r10
            r8 = r7
            r9 = r8
        L_0x0142:
            r12 = r11
            r11 = r9
            r9 = r8
            r8 = r7
            r7 = r6
        L_0x0147:
            if (r7 == 0) goto L_0x016d
            r7.getClass()
            if (r0 < 0) goto L_0x0159
            if (r0 != 0) goto L_0x016d
            r14 = 0
            r7.getClass()
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x016d
        L_0x0159:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0168
            java.util.ArrayList<ga.g0$c> r7 = r11.f16476p
            int r14 = r1 + -1
            java.lang.Object r7 = r7.get(r14)
            ga.g0$c r7 = (p099ga.C4887g0.C4890c) r7
            goto L_0x0147
        L_0x0168:
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            goto L_0x0142
        L_0x016d:
            java.util.ArrayList<ga.g0$c> r0 = r11.f16476p
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x017e
            java.util.ArrayList<ga.g0$c> r0 = r11.f16476p
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            ga.g0$c r6 = (p099ga.C4887g0.C4890c) r6
        L_0x017e:
            if (r6 == 0) goto L_0x0183
            r6.getClass()
        L_0x0183:
            if (r6 == 0) goto L_0x0188
            r6.getClass()
        L_0x0188:
            r11.f16459M = r1
            r11 = r12
            goto L_0x018e
        L_0x018c:
            r8 = r10
            r9 = r8
        L_0x018e:
            ga.r0 r0 = r8.f16484x
            r0.f16693s = r2
        L_0x0192:
            ga.n0 r0 = r8.f16479s
            ga.l0 r0 = r0.f16641j
            ga.r0 r1 = r8.f16484x
            long r2 = r0.mo20556d()
            r1.f16691q = r2
            ga.r0 r0 = r8.f16484x
            ga.r0 r1 = r9.f16484x
            long r1 = r1.f16691q
            ga.n0 r3 = r9.f16479s
            ga.l0 r3 = r3.f16641j
            r4 = 0
            if (r3 != 0) goto L_0x01ae
            r1 = r4
            goto L_0x01b8
        L_0x01ae:
            long r6 = r9.f16458L
            long r13 = r3.f16622o
            long r6 = r6 - r13
            long r1 = r1 - r6
            long r1 = java.lang.Math.max(r4, r1)
        L_0x01b8:
            r0.f16692r = r1
            ga.r0 r0 = r8.f16484x
            boolean r1 = r0.f16686l
            if (r1 == 0) goto L_0x0320
            int r1 = r0.f16679e
            r2 = 3
            if (r1 != r2) goto L_0x0320
            ga.e1 r1 = r0.f16675a
            gb.o$a r0 = r0.f16676b
            boolean r0 = r8.mo20496X(r1, r0)
            if (r0 == 0) goto L_0x0320
            ga.r0 r0 = r8.f16484x
            ga.s0 r1 = r0.f16688n
            float r1 = r1.f16696a
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0320
            ga.i0 r1 = r8.f16481u
            ga.e1 r2 = r0.f16675a
            gb.o$a r3 = r0.f16676b
            java.lang.Object r3 = r3.f16857a
            long r6 = r0.f16693s
            long r2 = r8.mo20510g(r2, r3, r6)
            ga.r0 r0 = r9.f16484x
            long r6 = r0.f16691q
            ga.n0 r0 = r9.f16479s
            ga.l0 r0 = r0.f16641j
            if (r0 != 0) goto L_0x01f4
            goto L_0x0201
        L_0x01f4:
            long r13 = r9.f16458L
            long r4 = r0.f16622o
            long r13 = r13 - r4
            long r6 = r6 - r13
            r4 = 0
            long r6 = java.lang.Math.max(r4, r6)
            r4 = r6
        L_0x0201:
            ga.i r1 = (p099ga.C4898i) r1
            long r6 = r1.f16515d
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x020d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02f4
        L_0x020d:
            long r4 = r2 - r4
            long r6 = r1.f16525n
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x021c
            r1.f16525n = r4
            r4 = 0
            r1.f16526o = r4
            goto L_0x0245
        L_0x021c:
            float r0 = r1.f16514c
            float r6 = (float) r6
            float r6 = r6 * r0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r0
            float r0 = (float) r4
            float r7 = r7 * r0
            float r7 = r7 + r6
            long r6 = (long) r7
            long r6 = java.lang.Math.max(r4, r6)
            r1.f16525n = r6
            long r4 = r4 - r6
            long r4 = java.lang.Math.abs(r4)
            long r6 = r1.f16526o
            float r0 = r1.f16514c
            float r6 = (float) r6
            float r6 = r6 * r0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r0
            float r0 = (float) r4
            float r7 = r7 * r0
            float r7 = r7 + r6
            long r4 = (long) r7
            r1.f16526o = r4
        L_0x0245:
            long r4 = r1.f16524m
            r6 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x025c
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r13 = r1.f16524m
            long r4 = r4 - r13
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x025c
            float r0 = r1.f16523l
            goto L_0x02f4
        L_0x025c:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1.f16524m = r4
            long r4 = r1.f16525n
            long r13 = r1.f16526o
            r15 = 3
            long r13 = r13 * r15
            long r19 = r13 + r4
            long r4 = r1.f16520i
            r0 = 869711765(0x33d6bf95, float:1.0E-7)
            int r9 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r9 <= 0) goto L_0x02ac
            long r4 = p099ga.C4883f.m12376a(r6)
            float r6 = r1.f16523l
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r7
            float r4 = (float) r4
            float r6 = r6 * r4
            long r5 = (long) r6
            float r9 = r1.f16521j
            float r9 = r9 - r7
            float r9 = r9 * r4
            long r11 = (long) r9
            long r5 = r5 + r11
            r4 = 3
            long[] r7 = new long[r4]
            r9 = 0
            r7[r9] = r19
            long r11 = r1.f16517f
            r9 = 1
            r7[r9] = r11
            r9 = 2
            long r11 = r1.f16520i
            long r11 = r11 - r5
            r7[r9] = r11
            r5 = 1
            r11 = r19
        L_0x029d:
            if (r5 >= r4) goto L_0x02a9
            r13 = r7[r5]
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x02a6
            r11 = r13
        L_0x02a6:
            int r5 = r5 + 1
            goto L_0x029d
        L_0x02a9:
            r1.f16520i = r11
            goto L_0x02d0
        L_0x02ac:
            r4 = 0
            float r5 = r1.f16523l
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            float r4 = java.lang.Math.max(r4, r5)
            float r4 = r4 / r0
            long r4 = (long) r4
            long r15 = r2 - r4
            long r4 = r1.f16520i
            r17 = r4
            long r4 = p277ub.C6774a0.m15948h(r15, r17, r19)
            r1.f16520i = r4
            long r6 = r1.f16519h
            int r9 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x02d0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x02d0
            r1.f16520i = r6
        L_0x02d0:
            long r4 = r1.f16520i
            long r2 = r2 - r4
            long r4 = java.lang.Math.abs(r2)
            long r6 = r1.f16512a
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x02e2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f16523l = r0
            goto L_0x02f2
        L_0x02e2:
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r2
            float r0 = r0 * r2
            float r0 = r0 + r4
            float r2 = r1.f16522k
            float r3 = r1.f16521j
            float r0 = p277ub.C6774a0.m15946f(r0, r2, r3)
            r1.f16523l = r0
        L_0x02f2:
            float r0 = r1.f16523l
        L_0x02f4:
            ga.k r1 = r8.f16475o
            ga.s0 r1 = r1.mo15930b()
            float r1 = r1.f16696a
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x0320
            ga.k r1 = r8.f16475o
            ga.r0 r2 = r8.f16484x
            ga.s0 r2 = r2.f16688n
            ga.s0 r3 = new ga.s0
            float r2 = r2.f16697b
            r3.<init>(r0, r2)
            r1.mo15928a(r3)
            ga.r0 r0 = r8.f16484x
            ga.s0 r0 = r0.f16688n
            ga.k r1 = r8.f16475o
            ga.s0 r1 = r1.mo15930b()
            float r1 = r1.f16696a
            r2 = 0
            r8.mo20519n(r0, r1, r2, r2)
        L_0x0320:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4887g0.mo20509f0():void");
    }

    /* renamed from: g */
    public final long mo20510g(C4879e1 e1Var, Object obj, long j) {
        long j2;
        e1Var.mo20462m(e1Var.mo20346g(obj, this.f16472l).f16417c, this.f16471k);
        C4879e1.C4882c cVar = this.f16471k;
        if (cVar.f16429f != -9223372036854775807L && cVar.mo20470a()) {
            C4879e1.C4882c cVar2 = this.f16471k;
            if (cVar2.f16432i) {
                long j3 = cVar2.f16430g;
                int i = C6774a0.f20959a;
                if (j3 == -9223372036854775807L) {
                    j2 = System.currentTimeMillis();
                } else {
                    j2 = j3 + SystemClock.elapsedRealtime();
                }
                return C4883f.m12376a(j2 - this.f16471k.f16429f) - (j + this.f16472l.f16419e);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: g0 */
    public final synchronized void mo20511g0(C4878e0 e0Var, long j) {
        long elapsedRealtime = this.f16477q.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) e0Var.get()).booleanValue() && j > 0) {
            try {
                this.f16477q.mo22944c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.f16477q.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: h */
    public final long mo20512h() {
        C4913l0 l0Var = this.f16479s.f16640i;
        if (l0Var == null) {
            return 0;
        }
        long j = l0Var.f16622o;
        if (!l0Var.f16611d) {
            return j;
        }
        int i = 0;
        while (true) {
            C4949x0[] x0VarArr = this.f16462b;
            if (i >= x0VarArr.length) {
                return j;
            }
            if (m12384q(x0VarArr[i]) && this.f16462b[i].mo15815g() == l0Var.f16610c[i]) {
                long s = this.f16462b[i].mo15827s();
                if (s == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(s, j);
            }
            i++;
        }
    }

    public final boolean handleMessage(Message message) {
        C4913l0 l0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            switch (message.what) {
                case 0:
                    mo20526v();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mo20489Q(message.arg2, 1, z, true);
                    break;
                case 2:
                    mo20504d();
                    break;
                case 3:
                    mo20481H((C4894g) message.obj);
                    break;
                case 4:
                    mo20490R((C4932s0) message.obj);
                    break;
                case 5:
                    this.f16483w = (C4862b1) message.obj;
                    break;
                case 6:
                    mo20499a0(false, true);
                    break;
                case 7:
                    mo20527w();
                    return true;
                case 8:
                    mo20518m((C4984m) message.obj);
                    break;
                case 9:
                    mo20515j((C4984m) message.obj);
                    break;
                case 10:
                    mo20529y();
                    break;
                case 11:
                    mo20491S(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mo20492T(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mo20485M(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C4943v0 v0Var = (C4943v0) message.obj;
                    v0Var.getClass();
                    mo20483J(v0Var);
                    break;
                case 15:
                    mo20484K((C4943v0) message.obj);
                    break;
                case 16:
                    C4932s0 s0Var = (C4932s0) message.obj;
                    mo20519n(s0Var, s0Var.f16696a, true, false);
                    break;
                case 17:
                    mo20486N((C4888a) message.obj);
                    break;
                case 18:
                    mo20500b((C4888a) message.obj, message.arg1);
                    break;
                case 19:
                    mo20525u((C4889b) message.obj);
                    break;
                case 20:
                    mo20528x(message.arg1, message.arg2, (C4967d0) message.obj);
                    break;
                case 21:
                    mo20493U((C4967d0) message.obj);
                    break;
                case 22:
                    mo20517l(this.f16480t.mo20581c(), true);
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    mo20488P(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    mo20487O(z5);
                    break;
                case 25:
                    mo20480G(true);
                    break;
                default:
                    return false;
            }
            mo20524t();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.type == 1 && (l0Var = this.f16479s.f16640i) != null) {
                e = e.mo15793a(l0Var.f16613f.f16623a);
            }
            if (!e.isRecoverable || this.f16461O != null) {
                ExoPlaybackException exoPlaybackException = this.f16461O;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f16461O;
                }
                C6776b0.m15968a("Playback error", e);
                mo20499a0(true, false);
                this.f16484x = this.f16484x.mo20597e(e);
            } else {
                C6776b0.m15968a("Recoverable renderer error", e);
                this.f16461O = e;
                C6809w wVar = (C6809w) this.f16468h;
                C6809w.C6810a a = wVar.mo23021a(25, e);
                wVar.getClass();
                Handler handler = wVar.f21063a;
                Message message2 = a.f21064a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a.f21064a = null;
                ArrayList arrayList = C6809w.f21062b;
                synchronized (arrayList) {
                    if (arrayList.size() < 50) {
                        arrayList.add(a);
                    }
                }
            }
            mo20524t();
        } catch (IOException e2) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(0, e2);
            C4913l0 l0Var2 = this.f16479s.f16639h;
            if (l0Var2 != null) {
                exoPlaybackException2 = exoPlaybackException2.mo15793a(l0Var2.f16613f.f16623a);
            }
            C6776b0.m15968a("Playback error", exoPlaybackException2);
            mo20499a0(false, false);
            this.f16484x = this.f16484x.mo20597e(exoPlaybackException2);
            mo20524t();
        } catch (RuntimeException e3) {
            ExoPlaybackException exoPlaybackException3 = new ExoPlaybackException(2, e3);
            C6776b0.m15968a("Playback error", exoPlaybackException3);
            mo20499a0(true, false);
            this.f16484x = this.f16484x.mo20597e(exoPlaybackException3);
            mo20524t();
        }
        return true;
    }

    /* renamed from: i */
    public final Pair<C4987o.C4988a, Long> mo20514i(C4879e1 e1Var) {
        long j = 0;
        if (e1Var.mo20464p()) {
            return Pair.create(C4930r0.f16674t, 0L);
        }
        C4879e1 e1Var2 = e1Var;
        Pair<Object, Long> i = e1Var2.mo20460i(this.f16471k, this.f16472l, e1Var.mo20341a(this.f16452F), -9223372036854775807L);
        C4987o.C4988a l = this.f16479s.mo20575l(e1Var, i.first, 0);
        long longValue = ((Long) i.second).longValue();
        if (l.mo20688a()) {
            e1Var.mo20346g(l.f16857a, this.f16472l);
            if (l.f16859c == this.f16472l.mo20467c(l.f16858b)) {
                j = this.f16472l.f16421g.f17306e;
            }
            longValue = j;
        }
        return Pair.create(l, Long.valueOf(longValue));
    }

    /* renamed from: j */
    public final void mo20515j(C4984m mVar) {
        boolean z;
        C4913l0 l0Var = this.f16479s.f16641j;
        boolean z2 = true;
        if (l0Var == null || l0Var.f16608a != mVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            long j = this.f16458L;
            if (l0Var != null) {
                if (l0Var.f16619l != null) {
                    z2 = false;
                }
                C17875h.m44304o(z2);
                if (l0Var.f16611d) {
                    l0Var.f16608a.mo20665s(j - l0Var.f16622o);
                }
            }
            mo20523s();
        }
    }

    /* renamed from: k */
    public final void mo20516k(boolean z) {
        C4987o.C4988a aVar;
        long j;
        C4913l0 l0Var = this.f16479s.f16641j;
        if (l0Var == null) {
            aVar = this.f16484x.f16676b;
        } else {
            aVar = l0Var.f16613f.f16623a;
        }
        boolean z2 = !this.f16484x.f16685k.equals(aVar);
        if (z2) {
            this.f16484x = this.f16484x.mo20593a(aVar);
        }
        C4930r0 r0Var = this.f16484x;
        if (l0Var == null) {
            j = r0Var.f16693s;
        } else {
            j = l0Var.mo20556d();
        }
        r0Var.f16691q = j;
        C4930r0 r0Var2 = this.f16484x;
        long j2 = r0Var2.f16691q;
        C4913l0 l0Var2 = this.f16479s.f16641j;
        long j3 = 0;
        if (l0Var2 != null) {
            j3 = Math.max(0, j2 - (this.f16458L - l0Var2.f16622o));
        }
        r0Var2.f16692r = j3;
        if ((z2 || z) && l0Var != null && l0Var.f16611d) {
            mo20507e0(l0Var.f16621n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c9  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20517l(p099ga.C4879e1 r30, boolean r31) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r29 = this;
            r11 = r29
            r12 = r30
            ga.r0 r0 = r11.f16484x
            ga.g0$g r8 = r11.f16457K
            ga.n0 r9 = r11.f16479s
            int r4 = r11.f16451E
            boolean r10 = r11.f16452F
            ga.e1$c r13 = r11.f16471k
            ga.e1$b r14 = r11.f16472l
            boolean r1 = r30.mo20464p()
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 4
            r3 = 0
            if (r1 == 0) goto L_0x0038
            ga.g0$f r0 = new ga.g0$f
            gb.o$a r18 = p099ga.C4930r0.f16674t
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = 0
            r24 = 1
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r21, r23, r24, r25)
        L_0x0035:
            r7 = r0
            goto L_0x01d6
        L_0x0038:
            gb.o$a r2 = r0.f16676b
            java.lang.Object r1 = r2.f16857a
            boolean r17 = m12383Y(r0, r14)
            if (r17 == 0) goto L_0x0045
            long r5 = r0.f16677c
            goto L_0x0047
        L_0x0045:
            long r5 = r0.f16693s
        L_0x0047:
            r20 = r5
            if (r8 == 0) goto L_0x0099
            r5 = 1
            r6 = r1
            r1 = r30
            r26 = r2
            r2 = r8
            r3 = r5
            r5 = r10
            r27 = r6
            r6 = r13
            r7 = r14
            android.util.Pair r1 = m12380D(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x0067
            int r1 = r12.mo20341a(r10)
            r2 = 0
            r3 = 0
            r5 = 1
            r8 = 4
            goto L_0x0093
        L_0x0067:
            long r2 = r8.f16506c
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x0079
            java.lang.Object r1 = r1.first
            ga.e1$b r1 = r12.mo20346g(r1, r14)
            int r6 = r1.f16417c
            r1 = r27
            r5 = 0
            goto L_0x0086
        L_0x0079:
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r1 = r2
            r5 = 1
            r6 = -1
        L_0x0086:
            int r2 = r0.f16679e
            r8 = 4
            if (r2 != r8) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            r27 = r1
            r3 = r5
            r1 = r6
            r5 = 0
        L_0x0093:
            r28 = r3
            r3 = r2
            r2 = r28
            goto L_0x00dd
        L_0x0099:
            r27 = r1
            r26 = r2
            r8 = 4
            ga.e1 r1 = r0.f16675a
            boolean r1 = r1.mo20464p()
            if (r1 == 0) goto L_0x00ae
            int r1 = r12.mo20341a(r10)
            r6 = r1
            r8 = r27
            goto L_0x00f9
        L_0x00ae:
            r7 = r27
            int r1 = r12.mo20342b(r7)
            r6 = -1
            if (r1 != r6) goto L_0x00eb
            ga.e1 r5 = r0.f16675a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r17 = r5
            r5 = r7
            r8 = -1
            r6 = r17
            r8 = r7
            r7 = r30
            java.lang.Object r1 = m12381E(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00d2
            int r1 = r12.mo20341a(r10)
            r5 = 1
            goto L_0x00d9
        L_0x00d2:
            ga.e1$b r1 = r12.mo20346g(r1, r14)
            int r1 = r1.f16417c
            r5 = 0
        L_0x00d9:
            r27 = r8
            r2 = 0
            r3 = 0
        L_0x00dd:
            r4 = r1
            r25 = r2
            r23 = r3
            r24 = r5
            r7 = r26
            r1 = r27
            r2 = -1
            goto L_0x014d
        L_0x00eb:
            r8 = r7
            if (r17 == 0) goto L_0x0141
            int r1 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x00fc
            ga.e1$b r1 = r12.mo20346g(r8, r14)
            int r1 = r1.f16417c
            r6 = r1
        L_0x00f9:
            r7 = r26
            goto L_0x0144
        L_0x00fc:
            ga.e1 r1 = r0.f16675a
            r7 = r26
            java.lang.Object r2 = r7.f16857a
            r1.mo20346g(r2, r14)
            ga.e1 r1 = r0.f16675a
            int r2 = r14.f16417c
            ga.e1$c r1 = r1.mo20462m(r2, r13)
            int r1 = r1.f16438o
            ga.e1 r2 = r0.f16675a
            java.lang.Object r3 = r7.f16857a
            int r2 = r2.mo20342b(r3)
            if (r1 != r2) goto L_0x0137
            long r1 = r14.f16419e
            long r5 = r20 + r1
            ga.e1$b r1 = r12.mo20346g(r8, r14)
            int r4 = r1.f16417c
            r1 = r30
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo20460i(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r1 = r2
            goto L_0x0138
        L_0x0137:
            r1 = r8
        L_0x0138:
            r2 = -1
            r4 = -1
            r23 = 0
            r24 = 0
            r25 = 1
            goto L_0x014d
        L_0x0141:
            r7 = r26
            r6 = -1
        L_0x0144:
            r4 = r6
            r1 = r8
            r2 = -1
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x014d:
            if (r4 == r2) goto L_0x016c
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r30
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo20460i(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r1 = r2
            r2 = r20
            r21 = r15
            goto L_0x0170
        L_0x016c:
            r2 = r20
            r21 = r2
        L_0x0170:
            gb.o$a r4 = r9.mo20575l(r12, r1, r2)
            int r5 = r4.f16861e
            r6 = -1
            if (r5 == r6) goto L_0x0184
            int r5 = r7.f16861e
            if (r5 == r6) goto L_0x0182
            int r6 = r4.f16858b
            if (r6 < r5) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r5 = 0
            goto L_0x0185
        L_0x0184:
            r5 = 1
        L_0x0185:
            java.lang.Object r6 = r7.f16857a
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x019d
            boolean r1 = r7.mo20688a()
            if (r1 != 0) goto L_0x019d
            boolean r1 = r4.mo20688a()
            if (r1 != 0) goto L_0x019d
            if (r5 == 0) goto L_0x019d
            r5 = 1
            goto L_0x019e
        L_0x019d:
            r5 = 0
        L_0x019e:
            if (r5 == 0) goto L_0x01a1
            r4 = r7
        L_0x01a1:
            boolean r1 = r4.mo20688a()
            if (r1 == 0) goto L_0x01c9
            boolean r1 = r4.equals(r7)
            if (r1 == 0) goto L_0x01b0
            long r0 = r0.f16693s
            goto L_0x01c6
        L_0x01b0:
            java.lang.Object r0 = r4.f16857a
            r12.mo20346g(r0, r14)
            int r0 = r4.f16859c
            int r1 = r4.f16858b
            int r1 = r14.mo20467c(r1)
            if (r0 != r1) goto L_0x01c4
            hb.a r0 = r14.f16421g
            long r0 = r0.f17306e
            goto L_0x01c6
        L_0x01c4:
            r0 = 0
        L_0x01c6:
            r19 = r0
            goto L_0x01cb
        L_0x01c9:
            r19 = r2
        L_0x01cb:
            ga.g0$f r0 = new ga.g0$f
            r17 = r0
            r18 = r4
            r17.<init>(r18, r19, r21, r23, r24, r25)
            goto L_0x0035
        L_0x01d6:
            gb.o$a r8 = r7.f16498a
            long r9 = r7.f16500c
            boolean r6 = r7.f16501d
            long r13 = r7.f16499b
            ga.r0 r0 = r11.f16484x
            gb.o$a r0 = r0.f16676b
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01f4
            ga.r0 r0 = r11.f16484x
            long r0 = r0.f16693s
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01f1
            goto L_0x01f4
        L_0x01f1:
            r17 = 0
            goto L_0x01f6
        L_0x01f4:
            r17 = 1
        L_0x01f6:
            r18 = 3
            r5 = 0
            boolean r0 = r7.f16502e     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x020f
            ga.r0 r0 = r11.f16484x     // Catch:{ all -> 0x0230 }
            int r0 = r0.f16679e     // Catch:{ all -> 0x0230 }
            r3 = 1
            if (r0 == r3) goto L_0x0209
            r4 = 4
            r11.mo20494V(r4)     // Catch:{ all -> 0x0230 }
            goto L_0x020a
        L_0x0209:
            r4 = 4
        L_0x020a:
            r2 = 0
            r11.mo20530z(r2, r2, r2, r3)     // Catch:{ all -> 0x0230 }
            goto L_0x0212
        L_0x020f:
            r2 = 0
            r3 = 1
            r4 = 4
        L_0x0212:
            if (r17 != 0) goto L_0x0238
            ga.n0 r1 = r11.f16479s     // Catch:{ all -> 0x0230 }
            long r3 = r11.f16458L     // Catch:{ all -> 0x0230 }
            long r19 = r29.mo20512h()     // Catch:{ all -> 0x0230 }
            r6 = 0
            r2 = r30
            r21 = 4
            r22 = 1
            r15 = 0
            r5 = r19
            boolean r0 = r1.mo20577o(r2, r3, r5)     // Catch:{ all -> 0x0275 }
            if (r0 != 0) goto L_0x0278
            r11.mo20480G(r15)     // Catch:{ all -> 0x0275 }
            goto L_0x0278
        L_0x0230:
            r0 = move-exception
            r15 = 0
            r21 = 4
            r22 = 1
            goto L_0x02f6
        L_0x0238:
            r15 = 0
            r21 = 4
            r22 = 1
            boolean r0 = r30.mo20464p()     // Catch:{ all -> 0x0275 }
            if (r0 != 0) goto L_0x0278
            ga.n0 r0 = r11.f16479s     // Catch:{ all -> 0x0275 }
            ga.l0 r0 = r0.f16639h     // Catch:{ all -> 0x0275 }
        L_0x0247:
            if (r0 == 0) goto L_0x0260
            ga.m0 r1 = r0.f16613f     // Catch:{ all -> 0x0275 }
            gb.o$a r1 = r1.f16623a     // Catch:{ all -> 0x0275 }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0275 }
            if (r1 == 0) goto L_0x025d
            ga.n0 r1 = r11.f16479s     // Catch:{ all -> 0x0275 }
            ga.m0 r2 = r0.f16613f     // Catch:{ all -> 0x0275 }
            ga.m0 r1 = r1.mo20570g(r12, r2)     // Catch:{ all -> 0x0275 }
            r0.f16613f = r1     // Catch:{ all -> 0x0275 }
        L_0x025d:
            ga.l0 r0 = r0.f16619l     // Catch:{ all -> 0x0275 }
            goto L_0x0247
        L_0x0260:
            ga.n0 r0 = r11.f16479s     // Catch:{ all -> 0x0275 }
            ga.l0 r1 = r0.f16639h     // Catch:{ all -> 0x0275 }
            ga.l0 r0 = r0.f16640i     // Catch:{ all -> 0x0275 }
            if (r1 == r0) goto L_0x026a
            r5 = 1
            goto L_0x026b
        L_0x026a:
            r5 = 0
        L_0x026b:
            r1 = r29
            r2 = r8
            r3 = r13
            long r0 = r1.mo20482I(r2, r3, r5, r6)     // Catch:{ all -> 0x0275 }
            r13 = r0
            goto L_0x0278
        L_0x0275:
            r0 = move-exception
            goto L_0x02f6
        L_0x0278:
            ga.r0 r0 = r11.f16484x
            ga.e1 r4 = r0.f16675a
            gb.o$a r5 = r0.f16676b
            boolean r0 = r7.f16503f
            if (r0 == 0) goto L_0x0284
            r6 = r13
            goto L_0x0289
        L_0x0284:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0289:
            r1 = r29
            r2 = r30
            r3 = r8
            r1.mo20505d0(r2, r3, r4, r5, r6)
            if (r17 != 0) goto L_0x029b
            ga.r0 r0 = r11.f16484x
            long r0 = r0.f16677c
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02d7
        L_0x029b:
            ga.r0 r0 = r11.f16484x
            gb.o$a r1 = r0.f16676b
            java.lang.Object r1 = r1.f16857a
            ga.e1 r0 = r0.f16675a
            if (r17 == 0) goto L_0x02b8
            if (r31 == 0) goto L_0x02b8
            boolean r2 = r0.mo20464p()
            if (r2 != 0) goto L_0x02b8
            ga.e1$b r2 = r11.f16472l
            ga.e1$b r0 = r0.mo20346g(r1, r2)
            boolean r0 = r0.f16420f
            if (r0 != 0) goto L_0x02b8
            goto L_0x02ba
        L_0x02b8:
            r22 = 0
        L_0x02ba:
            ga.r0 r0 = r11.f16484x
            long r5 = r0.f16678d
            int r0 = r12.mo20342b(r1)
            r1 = -1
            if (r0 != r1) goto L_0x02c7
            r18 = 4
        L_0x02c7:
            r1 = r29
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r22
            r10 = r18
            ga.r0 r0 = r1.mo20520o(r2, r3, r5, r7, r9, r10)
            r11.f16484x = r0
        L_0x02d7:
            r29.mo20476A()
            ga.r0 r0 = r11.f16484x
            ga.e1 r0 = r0.f16675a
            r11.mo20478C(r12, r0)
            ga.r0 r0 = r11.f16484x
            ga.r0 r0 = r0.mo20600h(r12)
            r11.f16484x = r0
            boolean r0 = r30.mo20464p()
            if (r0 != 0) goto L_0x02f2
            r1 = 0
            r11.f16457K = r1
        L_0x02f2:
            r11.mo20516k(r15)
            return
        L_0x02f6:
            ga.r0 r1 = r11.f16484x
            ga.e1 r4 = r1.f16675a
            gb.o$a r5 = r1.f16676b
            boolean r1 = r7.f16503f
            if (r1 == 0) goto L_0x0302
            r6 = r13
            goto L_0x0307
        L_0x0302:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0307:
            r1 = r29
            r2 = r30
            r3 = r8
            r1.mo20505d0(r2, r3, r4, r5, r6)
            if (r17 != 0) goto L_0x0319
            ga.r0 r1 = r11.f16484x
            long r1 = r1.f16677c
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0355
        L_0x0319:
            ga.r0 r1 = r11.f16484x
            gb.o$a r2 = r1.f16676b
            java.lang.Object r2 = r2.f16857a
            ga.e1 r1 = r1.f16675a
            if (r17 == 0) goto L_0x0336
            if (r31 == 0) goto L_0x0336
            boolean r3 = r1.mo20464p()
            if (r3 != 0) goto L_0x0336
            ga.e1$b r3 = r11.f16472l
            ga.e1$b r1 = r1.mo20346g(r2, r3)
            boolean r1 = r1.f16420f
            if (r1 != 0) goto L_0x0336
            goto L_0x0338
        L_0x0336:
            r22 = 0
        L_0x0338:
            ga.r0 r1 = r11.f16484x
            long r5 = r1.f16678d
            int r1 = r12.mo20342b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0345
            r18 = 4
        L_0x0345:
            r1 = r29
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r22
            r10 = r18
            ga.r0 r1 = r1.mo20520o(r2, r3, r5, r7, r9, r10)
            r11.f16484x = r1
        L_0x0355:
            r29.mo20476A()
            ga.r0 r1 = r11.f16484x
            ga.e1 r1 = r1.f16675a
            r11.mo20478C(r12, r1)
            ga.r0 r1 = r11.f16484x
            ga.r0 r1 = r1.mo20600h(r12)
            r11.f16484x = r1
            boolean r1 = r30.mo20464p()
            if (r1 != 0) goto L_0x0370
            r1 = 0
            r11.f16457K = r1
        L_0x0370:
            r11.mo20516k(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4887g0.mo20517l(ga.e1, boolean):void");
    }

    /* renamed from: m */
    public final void mo20518m(C4984m mVar) throws ExoPlaybackException {
        boolean z;
        C4913l0 l0Var = this.f16479s.f16641j;
        if (l0Var == null || l0Var.f16608a != mVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float f = this.f16475o.mo15930b().f16696a;
            C4879e1 e1Var = this.f16484x.f16675a;
            l0Var.f16611d = true;
            l0Var.f16620m = l0Var.f16608a.mo20662o();
            C6508g g = l0Var.mo20559g(f, e1Var);
            C4916m0 m0Var = l0Var.f16613f;
            long j = m0Var.f16624b;
            long j2 = m0Var.f16627e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a = l0Var.mo20553a(g, j, false, new boolean[l0Var.f16616i.length]);
            long j3 = l0Var.f16622o;
            C4916m0 m0Var2 = l0Var.f16613f;
            l0Var.f16622o = (m0Var2.f16624b - a) + j3;
            l0Var.f16613f = m0Var2.mo20561b(a);
            mo20507e0(l0Var.f16621n);
            if (l0Var == this.f16479s.f16639h) {
                mo20477B(l0Var.f16613f.f16624b);
                mo20508f(new boolean[this.f16462b.length]);
                C4930r0 r0Var = this.f16484x;
                C4987o.C4988a aVar = r0Var.f16676b;
                long j4 = l0Var.f16613f.f16624b;
                this.f16484x = mo20520o(aVar, j4, r0Var.f16677c, j4, false, 5);
            }
            mo20523s();
        }
    }

    /* renamed from: n */
    public final void mo20519n(C4932s0 s0Var, float f, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        if (z) {
            if (z2) {
                this.f16485y.mo20532a(1);
            }
            this.f16484x = this.f16484x.mo20598f(s0Var);
        }
        float f2 = s0Var.f16696a;
        C4913l0 l0Var = this.f16479s.f16639h;
        while (true) {
            i = 0;
            if (l0Var == null) {
                break;
            }
            C3997b[] bVarArr = l0Var.f16621n.f20301c;
            int length = bVarArr.length;
            while (i < length) {
                C3997b bVar = bVarArr[i];
                if (bVar != null) {
                    bVar.mo16333g();
                }
                i++;
            }
            l0Var = l0Var.f16619l;
        }
        C4949x0[] x0VarArr = this.f16462b;
        int length2 = x0VarArr.length;
        while (i < length2) {
            C4949x0 x0Var = x0VarArr[i];
            if (x0Var != null) {
                x0Var.mo15823o(f, s0Var.f16696a);
            }
            i++;
        }
    }

    /* renamed from: o */
    public final C4930r0 mo20520o(C4987o.C4988a aVar, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        ImmutableList immutableList;
        C6508g gVar;
        TrackGroupArray trackGroupArray;
        long j4;
        boolean z3;
        TrackGroupArray trackGroupArray2;
        C6508g gVar2;
        ImmutableList immutableList2;
        C4987o.C4988a aVar2 = aVar;
        long j5 = j2;
        int i2 = i;
        if (this.f16460N || j != this.f16484x.f16693s || !aVar2.equals(this.f16484x.f16676b)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f16460N = z2;
        mo20476A();
        C4930r0 r0Var = this.f16484x;
        TrackGroupArray trackGroupArray3 = r0Var.f16682h;
        C6508g gVar3 = r0Var.f16683i;
        List<Metadata> list = r0Var.f16684j;
        if (this.f16480t.f16660j) {
            C4913l0 l0Var = this.f16479s.f16639h;
            if (l0Var == null) {
                trackGroupArray2 = TrackGroupArray.f14011e;
            } else {
                trackGroupArray2 = l0Var.f16620m;
            }
            if (l0Var == null) {
                gVar2 = this.f16465e;
            } else {
                gVar2 = l0Var.f16621n;
            }
            C3997b[] bVarArr = gVar2.f20301c;
            ImmutableList.C14367a aVar3 = new ImmutableList.C14367a();
            boolean z4 = false;
            for (C3997b bVar : bVarArr) {
                if (bVar != null) {
                    Metadata metadata = bVar.mo22603b(0).f13416k;
                    if (metadata == null) {
                        aVar3.mo43128b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar3.mo43128b(metadata);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                immutableList2 = aVar3.mo43129c();
            } else {
                immutableList2 = ImmutableList.m35687D();
            }
            if (l0Var != null) {
                C4916m0 m0Var = l0Var.f16613f;
                if (m0Var.f16625c != j5) {
                    l0Var.f16613f = m0Var.mo20560a(j5);
                }
            }
            immutableList = immutableList2;
            trackGroupArray = trackGroupArray2;
            gVar = gVar2;
        } else if (!aVar2.equals(r0Var.f16676b)) {
            trackGroupArray = TrackGroupArray.f14011e;
            gVar = this.f16465e;
            immutableList = ImmutableList.m35687D();
        } else {
            trackGroupArray = trackGroupArray3;
            gVar = gVar3;
            immutableList = list;
        }
        if (z) {
            C4891d dVar = this.f16485y;
            if (!dVar.f16494d || dVar.f16495e == 5) {
                dVar.f16491a = true;
                dVar.f16494d = true;
                dVar.f16495e = i2;
            } else {
                if (i2 == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C17875h.m44301k(z3);
            }
        }
        C4930r0 r0Var2 = this.f16484x;
        long j6 = r0Var2.f16691q;
        C4913l0 l0Var2 = this.f16479s.f16641j;
        if (l0Var2 == null) {
            j4 = 0;
        } else {
            j4 = Math.max(0, j6 - (this.f16458L - l0Var2.f16622o));
        }
        return r0Var2.mo20594b(aVar, j, j2, j3, j4, trackGroupArray, gVar, immutableList);
    }

    /* renamed from: p */
    public final boolean mo20521p() {
        long j;
        C4913l0 l0Var = this.f16479s.f16641j;
        if (l0Var == null) {
            return false;
        }
        if (!l0Var.f16611d) {
            j = 0;
        } else {
            j = l0Var.f16608a.mo20652b();
        }
        if (j == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20522r() {
        C4913l0 l0Var = this.f16479s.f16639h;
        long j = l0Var.f16613f.f16627e;
        if (!l0Var.f16611d || (j != -9223372036854775807L && this.f16484x.f16693s >= j && mo20495W())) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void mo20523s() {
        boolean z;
        long j;
        int i;
        boolean z2;
        boolean z3 = true;
        if (!mo20521p()) {
            z = false;
        } else {
            C4913l0 l0Var = this.f16479s.f16641j;
            long j2 = 0;
            if (!l0Var.f16611d) {
                j = 0;
            } else {
                j = l0Var.f16608a.mo20652b();
            }
            C4913l0 l0Var2 = this.f16479s.f16641j;
            if (l0Var2 != null) {
                j2 = Math.max(0, j - (this.f16458L - l0Var2.f16622o));
            }
            if (l0Var != this.f16479s.f16639h) {
                long j3 = l0Var.f16613f.f16624b;
            }
            C4900j jVar = this.f16466f;
            float f = this.f16475o.mo15930b().f16696a;
            C6658j jVar2 = jVar.f16527a;
            synchronized (jVar2) {
                i = jVar2.f20682e * jVar2.f20679b;
            }
            if (i >= jVar.f16534h) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j4 = jVar.f16528b;
            if (f > 1.0f) {
                j4 = Math.min(C6774a0.m15954n(j4, f), jVar.f16529c);
            }
            if (j2 < Math.max(j4, 500000)) {
                jVar.f16535i = !z2;
            } else if (j2 >= jVar.f16529c || z2) {
                jVar.f16535i = false;
            }
            z = jVar.f16535i;
        }
        this.f16450D = z;
        if (z) {
            C4913l0 l0Var3 = this.f16479s.f16641j;
            long j5 = this.f16458L;
            if (l0Var3.f16619l != null) {
                z3 = false;
            }
            C17875h.m44304o(z3);
            l0Var3.f16608a.mo20661m(j5 - l0Var3.f16622o);
        }
        mo20503c0();
    }

    /* renamed from: t */
    public final void mo20524t() {
        boolean z;
        C4891d dVar = this.f16485y;
        C4930r0 r0Var = this.f16484x;
        boolean z2 = dVar.f16491a;
        if (dVar.f16492b != r0Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        dVar.f16491a = z3;
        dVar.f16492b = r0Var;
        if (z3) {
            C4872d0 d0Var = (C4872d0) ((C7038d0) this.f16478r).f21894c;
            C6782g gVar = d0Var.f16379f;
            ((C6809w) gVar).f21063a.post(new C7097r(11, d0Var, dVar));
            this.f16485y = new C4891d(this.f16484x);
        }
    }

    /* renamed from: u */
    public final void mo20525u(C4889b bVar) throws ExoPlaybackException {
        boolean z = true;
        this.f16485y.mo20532a(1);
        C4924q0 q0Var = this.f16480t;
        bVar.getClass();
        q0Var.getClass();
        if (q0Var.f16651a.size() < 0) {
            z = false;
        }
        C17875h.m44301k(z);
        q0Var.f16659i = null;
        mo20517l(q0Var.mo20581c(), false);
    }

    /* renamed from: v */
    public final void mo20526v() {
        int i;
        this.f16485y.mo20532a(1);
        mo20530z(false, false, false, true);
        this.f16466f.mo20538b(false);
        if (this.f16484x.f16675a.mo20464p()) {
            i = 4;
        } else {
            i = 2;
        }
        mo20494V(i);
        C4924q0 q0Var = this.f16480t;
        C6660l d = this.f16467g.mo22819d();
        C17875h.m44304o(!q0Var.f16660j);
        q0Var.f16661k = d;
        for (int i2 = 0; i2 < q0Var.f16651a.size(); i2++) {
            C4924q0.C4927c cVar = (C4924q0.C4927c) q0Var.f16651a.get(i2);
            q0Var.mo20584f(cVar);
            q0Var.f16658h.add(cVar);
        }
        q0Var.f16660j = true;
        ((C6809w) this.f16468h).mo23022c(2);
    }

    /* renamed from: w */
    public final void mo20527w() {
        mo20530z(true, false, true, false);
        this.f16466f.mo20538b(true);
        mo20494V(1);
        this.f16469i.quit();
        synchronized (this) {
            this.f16486z = true;
            notifyAll();
        }
    }

    /* renamed from: x */
    public final void mo20528x(int i, int i2, C4967d0 d0Var) throws ExoPlaybackException {
        boolean z = true;
        this.f16485y.mo20532a(1);
        C4924q0 q0Var = this.f16480t;
        q0Var.getClass();
        if (i < 0 || i > i2 || i2 > q0Var.f16651a.size()) {
            z = false;
        }
        C17875h.m44301k(z);
        q0Var.f16659i = d0Var;
        q0Var.mo20586h(i, i2);
        mo20517l(q0Var.mo20581c(), false);
    }

    /* renamed from: y */
    public final void mo20529y() throws ExoPlaybackException {
        boolean z;
        boolean z2;
        float f = this.f16475o.mo15930b().f16696a;
        C4918n0 n0Var = this.f16479s;
        C4913l0 l0Var = n0Var.f16639h;
        C4913l0 l0Var2 = n0Var.f16640i;
        C4913l0 l0Var3 = l0Var;
        boolean z3 = true;
        while (l0Var3 != null && l0Var3.f16611d) {
            C6508g g = l0Var3.mo20559g(f, this.f16484x.f16675a);
            C6508g gVar = l0Var3.f16621n;
            if (gVar != null && gVar.f20301c.length == g.f20301c.length) {
                int i = 0;
                while (true) {
                    if (i >= g.f20301c.length) {
                        z = true;
                        break;
                    } else if (!g.mo22612a(gVar, i)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            if (!z) {
                if (z3) {
                    C4918n0 n0Var2 = this.f16479s;
                    C4913l0 l0Var4 = n0Var2.f16639h;
                    boolean k = n0Var2.mo20574k(l0Var4);
                    boolean[] zArr = new boolean[this.f16462b.length];
                    long a = l0Var4.mo20553a(g, this.f16484x.f16693s, k, zArr);
                    C4930r0 r0Var = this.f16484x;
                    if (r0Var.f16679e == 4 || a == r0Var.f16693s) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C4930r0 r0Var2 = this.f16484x;
                    boolean[] zArr2 = zArr;
                    C4913l0 l0Var5 = l0Var4;
                    this.f16484x = mo20520o(r0Var2.f16676b, a, r0Var2.f16677c, r0Var2.f16678d, z2, 5);
                    if (z2) {
                        mo20477B(a);
                    }
                    boolean[] zArr3 = new boolean[this.f16462b.length];
                    int i2 = 0;
                    while (true) {
                        C4949x0[] x0VarArr = this.f16462b;
                        if (i2 >= x0VarArr.length) {
                            break;
                        }
                        C4949x0 x0Var = x0VarArr[i2];
                        boolean q = m12384q(x0Var);
                        zArr3[i2] = q;
                        C4961b0 b0Var = l0Var5.f16610c[i2];
                        if (q) {
                            if (b0Var != x0Var.mo15815g()) {
                                mo20502c(x0Var);
                            } else if (zArr2[i2]) {
                                x0Var.mo15831t(this.f16458L);
                            }
                        }
                        i2++;
                    }
                    mo20508f(zArr3);
                } else {
                    this.f16479s.mo20574k(l0Var3);
                    if (l0Var3.f16611d) {
                        l0Var3.mo20553a(g, Math.max(l0Var3.f16613f.f16624b, this.f16458L - l0Var3.f16622o), false, new boolean[l0Var3.f16616i.length]);
                    }
                }
                mo20516k(true);
                if (this.f16484x.f16679e != 4) {
                    mo20523s();
                    mo20509f0();
                    ((C6809w) this.f16468h).mo23022c(2);
                    return;
                }
                return;
            }
            if (l0Var3 == l0Var2) {
                z3 = false;
            }
            l0Var3 = l0Var3.f16619l;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20530z(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = r29
            ub.g r0 = r1.f16468h
            ub.w r0 = (p277ub.C6809w) r0
            android.os.Handler r0 = r0.f21063a
            r2 = 2
            r0.removeMessages(r2)
            r2 = 0
            r1.f16461O = r2
            r3 = 0
            r1.f16449C = r3
            ga.k r0 = r1.f16475o
            r0.f16573g = r3
            ub.u r0 = r0.f16568b
            boolean r4 = r0.f21058c
            if (r4 == 0) goto L_0x0025
            long r4 = r0.mo15939n()
            r0.mo23020c(r4)
            r0.f21058c = r3
        L_0x0025:
            r4 = 0
            r1.f16458L = r4
            ga.x0[] r4 = r1.f16462b
            int r5 = r4.length
            r6 = 0
        L_0x002d:
            if (r6 >= r5) goto L_0x0040
            r0 = r4[r6]
            r1.mo20502c(r0)     // Catch:{ ExoPlaybackException -> 0x0037, RuntimeException -> 0x0035 }
            goto L_0x003d
        L_0x0035:
            r0 = move-exception
            goto L_0x0038
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            java.lang.String r7 = "Disable failed."
            p277ub.C6776b0.m15968a(r7, r0)
        L_0x003d:
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0040:
            if (r30 == 0) goto L_0x0058
            ga.x0[] r4 = r1.f16462b
            int r5 = r4.length
            r6 = 0
        L_0x0046:
            if (r6 >= r5) goto L_0x0058
            r0 = r4[r6]
            r0.reset()     // Catch:{ RuntimeException -> 0x004e }
            goto L_0x0055
        L_0x004e:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            p277ub.C6776b0.m15968a(r0, r7)
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x0046
        L_0x0058:
            r1.f16456J = r3
            ga.r0 r0 = r1.f16484x
            gb.o$a r4 = r0.f16676b
            long r5 = r0.f16693s
            ga.r0 r0 = r1.f16484x
            ga.e1$b r7 = r1.f16472l
            boolean r0 = m12383Y(r0, r7)
            if (r0 == 0) goto L_0x006f
            ga.r0 r0 = r1.f16484x
            long r7 = r0.f16677c
            goto L_0x0073
        L_0x006f:
            ga.r0 r0 = r1.f16484x
            long r7 = r0.f16693s
        L_0x0073:
            if (r31 == 0) goto L_0x00a0
            r1.f16457K = r2
            ga.r0 r0 = r1.f16484x
            ga.e1 r0 = r0.f16675a
            android.util.Pair r0 = r1.mo20514i(r0)
            java.lang.Object r4 = r0.first
            gb.o$a r4 = (p100gb.C4987o.C4988a) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            ga.r0 r0 = r1.f16484x
            gb.o$a r0 = r0.f16676b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a0
            r0 = 1
            r17 = r4
            r25 = r5
            goto L_0x00a5
        L_0x00a0:
            r17 = r4
            r25 = r5
            r0 = 0
        L_0x00a5:
            ga.n0 r4 = r1.f16479s
            r4.mo20565b()
            r1.f16450D = r3
            ga.r0 r15 = new ga.r0
            ga.r0 r4 = r1.f16484x
            ga.e1 r5 = r4.f16675a
            int r11 = r4.f16679e
            if (r33 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r4.f16680f
        L_0x00b9:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00c0
            com.google.android.exoplayer2.source.TrackGroupArray r2 = com.google.android.exoplayer2.source.TrackGroupArray.f14011e
            goto L_0x00c2
        L_0x00c0:
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.f16682h
        L_0x00c2:
            r14 = r2
            if (r0 == 0) goto L_0x00c8
            sb.g r2 = r1.f16465e
            goto L_0x00ca
        L_0x00c8:
            sb.g r2 = r4.f16683i
        L_0x00ca:
            if (r0 == 0) goto L_0x00d1
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m35687D()
            goto L_0x00d3
        L_0x00d1:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r0 = r4.f16684j
        L_0x00d3:
            r16 = r0
            ga.r0 r0 = r1.f16484x
            boolean r4 = r0.f16686l
            r18 = r4
            int r4 = r0.f16687m
            r19 = r4
            ga.s0 r0 = r0.f16688n
            r20 = r0
            r23 = 0
            boolean r0 = r1.f16455I
            r27 = r0
            r28 = 0
            r4 = r15
            r6 = r17
            r9 = r25
            r0 = r15
            r15 = r2
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)
            r1.f16484x = r0
            if (r32 == 0) goto L_0x013d
            ga.q0 r2 = r1.f16480t
            java.util.HashMap<ga.q0$c, ga.q0$b> r0 = r2.f16657g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0107:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r4.next()
            r5 = r0
            ga.q0$b r5 = (p099ga.C4924q0.C4926b) r5
            gb.o r0 = r5.f16666a     // Catch:{ RuntimeException -> 0x011c }
            gb.o$b r6 = r5.f16667b     // Catch:{ RuntimeException -> 0x011c }
            r0.mo20616b(r6)     // Catch:{ RuntimeException -> 0x011c }
            goto L_0x0122
        L_0x011c:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            p277ub.C6776b0.m15968a(r6, r0)
        L_0x0122:
            gb.o r0 = r5.f16666a
            ga.q0$a r6 = r5.f16668c
            r0.mo20618e(r6)
            gb.o r0 = r5.f16666a
            ga.q0$a r5 = r5.f16668c
            r0.mo20622j(r5)
            goto L_0x0107
        L_0x0131:
            java.util.HashMap<ga.q0$c, ga.q0$b> r0 = r2.f16657g
            r0.clear()
            java.util.HashSet r0 = r2.f16658h
            r0.clear()
            r2.f16660j = r3
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4887g0.mo20530z(boolean, boolean, boolean, boolean):void");
    }
}
