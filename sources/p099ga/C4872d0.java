package p099ga;

import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p099ga.C4879e1;
import p099ga.C4887g0;
import p099ga.C4914m;
import p099ga.C4936u0;
import p099ga.C4943v0;
import p100gb.C4967d0;
import p100gb.C4980k;
import p100gb.C4987o;
import p100gb.C4998v;
import p112ha.C5196m0;
import p252sb.C6505e;
import p252sb.C6506f;
import p252sb.C6508g;
import p265tb.C6647c;
import p277ub.C6773a;
import p277ub.C6774a0;
import p277ub.C6780f;
import p277ub.C6782g;
import p277ub.C6786k;
import p277ub.C6809w;
import p304x.C7038d0;
import p304x.C7097r;
import p583jk.C17875h;

/* renamed from: ga.d0 */
public final class C4872d0 extends C4877e implements C4914m {

    /* renamed from: A */
    public C4910k0 f16371A;

    /* renamed from: B */
    public C4930r0 f16372B;

    /* renamed from: C */
    public int f16373C;

    /* renamed from: D */
    public long f16374D;

    /* renamed from: b */
    public final C6508g f16375b;

    /* renamed from: c */
    public final C4936u0.C4937a f16376c;

    /* renamed from: d */
    public final C4949x0[] f16377d;

    /* renamed from: e */
    public final C6506f f16378e;

    /* renamed from: f */
    public final C6782g f16379f;

    /* renamed from: g */
    public final C7038d0 f16380g;

    /* renamed from: h */
    public final C4887g0 f16381h;

    /* renamed from: i */
    public final C6786k<C4936u0.C4938b> f16382i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C4914m.C4915a> f16383j;

    /* renamed from: k */
    public final C4879e1.C4881b f16384k;

    /* renamed from: l */
    public final ArrayList f16385l;

    /* renamed from: m */
    public final boolean f16386m;

    /* renamed from: n */
    public final C4998v f16387n;

    /* renamed from: o */
    public final C5196m0 f16388o;

    /* renamed from: p */
    public final Looper f16389p;

    /* renamed from: q */
    public final C6647c f16390q;

    /* renamed from: r */
    public final C6773a f16391r;

    /* renamed from: s */
    public int f16392s;

    /* renamed from: t */
    public boolean f16393t;

    /* renamed from: u */
    public int f16394u;

    /* renamed from: v */
    public int f16395v;

    /* renamed from: w */
    public boolean f16396w;

    /* renamed from: x */
    public int f16397x;

    /* renamed from: y */
    public C4967d0 f16398y;

    /* renamed from: z */
    public C4936u0.C4937a f16399z;

    /* renamed from: ga.d0$a */
    public static final class C4873a implements C4920o0 {

        /* renamed from: a */
        public final Object f16400a;

        /* renamed from: b */
        public C4879e1 f16401b;

        public C4873a(C4980k.C4981a aVar, Object obj) {
            this.f16400a = obj;
            this.f16401b = aVar;
        }

        /* renamed from: a */
        public final Object mo20445a() {
            return this.f16400a;
        }

        /* renamed from: b */
        public final C4879e1 mo20446b() {
            return this.f16401b;
        }
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [ga.u0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4872d0(p099ga.C4949x0[] r19, p252sb.C6506f r20, p100gb.C4998v r21, p099ga.C4900j r22, p265tb.C6647c r23, p112ha.C5196m0 r24, boolean r25, p099ga.C4862b1 r26, p099ga.C4898i r27, long r28, p277ub.C6808v r30, android.os.Looper r31, p099ga.C4936u0 r32, p099ga.C4936u0.C4937a r33) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r30
            r14 = r31
            r18.<init>()
            int r1 = java.lang.System.identityHashCode(r18)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r3 = p277ub.C6774a0.f20963e
            r4 = 30
            int r1 = p001a0.C0016g.m25h(r1, r4)
            int r1 = p001a0.C0016g.m25h(r3, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            int r1 = r2.length
            r3 = 0
            r4 = 1
            if (r1 <= 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            p583jk.C17875h.m44304o(r1)
            r1 = r2
            ga.x0[] r1 = (p099ga.C4949x0[]) r1
            r0.f16377d = r1
            r20.getClass()
            r5 = r20
            r0.f16378e = r5
            r1 = r21
            r0.f16387n = r1
            r0.f16390q = r6
            r0.f16388o = r9
            r1 = r25
            r0.f16386m = r1
            r0.f16389p = r14
            r0.f16391r = r15
            r0.f16392s = r3
            if (r32 == 0) goto L_0x0056
            r1 = r32
            goto L_0x0057
        L_0x0056:
            r1 = r0
        L_0x0057:
            ub.k r7 = new ub.k
            au.e r8 = new au.e
            r10 = 4
            r8.<init>(r1, r10)
            r7.<init>(r14, r15, r8)
            r0.f16382i = r7
            java.util.concurrent.CopyOnWriteArraySet r7 = new java.util.concurrent.CopyOnWriteArraySet
            r7.<init>()
            r0.f16383j = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.f16385l = r7
            gb.d0$a r7 = new gb.d0$a
            r7.<init>()
            r0.f16398y = r7
            sb.g r7 = new sb.g
            int r8 = r2.length
            ga.z0[] r8 = new p099ga.C4954z0[r8]
            int r11 = r2.length
            com.google.android.exoplayer2.trackselection.b[] r11 = new com.google.android.exoplayer2.trackselection.C3997b[r11]
            r12 = 0
            r7.<init>(r8, r11, r12)
            r0.f16375b = r7
            ga.e1$b r8 = new ga.e1$b
            r8.<init>()
            r0.f16384k = r8
            android.util.SparseBooleanArray r8 = new android.util.SparseBooleanArray
            r8.<init>()
            r11 = 9
            int[] r13 = new int[r11]
            r13 = {1, 2, 8, 9, 10, 11, 12, 13, 14} // fill-array
        L_0x009a:
            if (r3 >= r11) goto L_0x00ad
            r11 = r13[r3]
            r16 = 0
            r16 = r16 ^ 1
            p583jk.C17875h.m44304o(r16)
            r8.append(r11, r4)
            int r3 = r3 + 1
            r11 = 9
            goto L_0x009a
        L_0x00ad:
            r3 = r33
            ub.f r3 = r3.f16702a
            r11 = 0
        L_0x00b2:
            int r13 = r3.mo22950b()
            if (r11 >= r13) goto L_0x00c9
            int r13 = r3.mo22949a(r11)
            r16 = 0
            r16 = r16 ^ 1
            p583jk.C17875h.m44304o(r16)
            r8.append(r13, r4)
            int r11 = r11 + 1
            goto L_0x00b2
        L_0x00c9:
            ga.u0$a r3 = new ga.u0$a
            r11 = r4 ^ 0
            p583jk.C17875h.m44304o(r11)
            ub.f r11 = new ub.f
            r11.<init>(r8)
            r3.<init>(r11)
            r0.f16376c = r3
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r8 = 0
        L_0x00e0:
            int r13 = r11.mo22950b()
            if (r8 >= r13) goto L_0x00f7
            int r13 = r11.mo22949a(r8)
            r16 = 0
            r16 = r16 ^ 1
            p583jk.C17875h.m44304o(r16)
            r3.append(r13, r4)
            int r8 = r8 + 1
            goto L_0x00e0
        L_0x00f7:
            r8 = 3
            r11 = r4 ^ 0
            p583jk.C17875h.m44304o(r11)
            r3.append(r8, r4)
            r8 = 7
            r11 = r4 ^ 0
            p583jk.C17875h.m44304o(r11)
            r3.append(r8, r4)
            ga.u0$a r8 = new ga.u0$a
            r11 = r4 ^ 0
            p583jk.C17875h.m44304o(r11)
            ub.f r11 = new ub.f
            r11.<init>(r3)
            r8.<init>(r11)
            r0.f16399z = r8
            ga.k0 r3 = p099ga.C4910k0.f16574q
            r0.f16371A = r3
            r3 = -1
            r0.f16373C = r3
            ub.w r3 = r15.mo22943b(r14, r12)
            r0.f16379f = r3
            x.d0 r12 = new x.d0
            r12.<init>(r0, r10)
            r0.f16380g = r12
            ga.r0 r3 = p099ga.C4930r0.m12507i(r7)
            r0.f16372B = r3
            if (r9 == 0) goto L_0x0169
            ga.u0 r3 = r9.f17276g
            if (r3 == 0) goto L_0x0146
            ha.m0$a r3 = r9.f17273d
            com.google.common.collect.ImmutableList<gb.o$a> r3 = r3.f17279b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r4 = 0
        L_0x0146:
            p583jk.C17875h.m44304o(r4)
            r9.f17276g = r1
            ub.k<ha.n0> r3 = r9.f17275f
            ha.f0 r4 = new ha.f0
            r8 = 0
            r4.<init>(r8, r9, r1)
            ub.k r1 = new ub.k
            java.util.concurrent.CopyOnWriteArraySet<ub.k$c<T>> r8 = r3.f20993d
            ub.a r3 = r3.f20990a
            r1.<init>(r8, r14, r3, r4)
            r9.f17275f = r1
            r0.mo20388g(r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.mo22818c(r1, r9)
        L_0x0169:
            ga.g0 r13 = new ga.g0
            int r8 = r0.f16392s
            boolean r10 = r0.f16393t
            r1 = r13
            r2 = r19
            r3 = r20
            r4 = r7
            r5 = r22
            r6 = r23
            r7 = r8
            r8 = r10
            r9 = r24
            r10 = r26
            r11 = r27
            r16 = r12
            r17 = r13
            r12 = r28
            r14 = r31
            r15 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r1 = r17
            r0.f16381h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4872d0.<init>(ga.x0[], sb.f, gb.v, ga.j, tb.c, ha.m0, boolean, ga.b1, ga.i, long, ub.v, android.os.Looper, ga.u0, ga.u0$a):void");
    }

    /* renamed from: T */
    public static long m12292T(C4930r0 r0Var) {
        C4879e1.C4882c cVar = new C4879e1.C4882c();
        C4879e1.C4881b bVar = new C4879e1.C4881b();
        r0Var.f16675a.mo20346g(r0Var.f16676b.f16857a, bVar);
        long j = r0Var.f16677c;
        if (j == -9223372036854775807L) {
            return r0Var.f16675a.mo20462m(bVar.f16417c, cVar).f16436m;
        }
        return bVar.f16419e + j;
    }

    /* renamed from: U */
    public static boolean m12293U(C4930r0 r0Var) {
        return r0Var.f16679e == 3 && r0Var.f16686l && r0Var.f16687m == 0;
    }

    /* renamed from: A */
    public final void mo20358A(boolean z) {
        if (this.f16393t != z) {
            this.f16393t = z;
            C6809w wVar = (C6809w) this.f16381h.f16468h;
            wVar.getClass();
            C6809w.C6810a b = C6809w.m16064b();
            b.f21064a = wVar.f21063a.obtainMessage(12, z ? 1 : 0, 0);
            b.mo23023a();
            this.f16382i.mo22959b(10, new C4917n(z));
            mo20443Y();
            this.f16382i.mo22958a();
        }
    }

    /* renamed from: B */
    public final int mo20359B() {
        if (this.f16372B.f16675a.mo20464p()) {
            return 0;
        }
        C4930r0 r0Var = this.f16372B;
        return r0Var.f16675a.mo20342b(r0Var.f16676b.f16857a);
    }

    /* renamed from: C */
    public final void mo20360C(TextureView textureView) {
    }

    /* renamed from: D */
    public final int mo20361D() {
        if (mo20385d()) {
            return this.f16372B.f16676b.f16859c;
        }
        return -1;
    }

    /* renamed from: E */
    public final long mo20362E() {
        if (!mo20385d()) {
            return getCurrentPosition();
        }
        C4930r0 r0Var = this.f16372B;
        r0Var.f16675a.mo20346g(r0Var.f16676b.f16857a, this.f16384k);
        C4930r0 r0Var2 = this.f16372B;
        if (r0Var2.f16677c == -9223372036854775807L) {
            return C4883f.m12377b(r0Var2.f16675a.mo20462m(mo20393k(), this.f16412a).f16436m);
        }
        return C4883f.m12377b(this.f16384k.f16419e) + C4883f.m12377b(this.f16372B.f16677c);
    }

    /* renamed from: G */
    public final void mo20363G(C4936u0.C4940d dVar) {
        mo20388g(dVar);
    }

    /* renamed from: H */
    public final int mo20364H() {
        return this.f16372B.f16679e;
    }

    /* renamed from: I */
    public final C4936u0.C4937a mo20365I() {
        return this.f16399z;
    }

    /* renamed from: J */
    public final void mo20366J(int i) {
        if (this.f16392s != i) {
            this.f16392s = i;
            C6809w wVar = (C6809w) this.f16381h.f16468h;
            wVar.getClass();
            C6809w.C6810a b = C6809w.m16064b();
            b.f21064a = wVar.f21063a.obtainMessage(11, i, 0);
            b.mo23023a();
            this.f16382i.mo22959b(9, new C4931s(i));
            mo20443Y();
            this.f16382i.mo22958a();
        }
    }

    /* renamed from: L */
    public final void mo20367L(SurfaceView surfaceView) {
    }

    /* renamed from: M */
    public final int mo20368M() {
        return this.f16392s;
    }

    /* renamed from: N */
    public final boolean mo20369N() {
        return this.f16393t;
    }

    /* renamed from: O */
    public final long mo20370O() {
        if (this.f16372B.f16675a.mo20464p()) {
            return this.f16374D;
        }
        C4930r0 r0Var = this.f16372B;
        if (r0Var.f16685k.f16860d != r0Var.f16676b.f16860d) {
            return C4883f.m12377b(r0Var.f16675a.mo20462m(mo20393k(), this.f16412a).f16437n);
        }
        long j = r0Var.f16691q;
        if (this.f16372B.f16685k.mo20688a()) {
            C4930r0 r0Var2 = this.f16372B;
            C4879e1.C4881b g = r0Var2.f16675a.mo20346g(r0Var2.f16685k.f16857a, this.f16384k);
            long j2 = g.f16421g.f17304c[this.f16372B.f16685k.f16858b];
            if (j2 == Long.MIN_VALUE) {
                j = g.f16418d;
            } else {
                j = j2;
            }
        }
        C4930r0 r0Var3 = this.f16372B;
        r0Var3.f16675a.mo20346g(r0Var3.f16685k.f16857a, this.f16384k);
        return C4883f.m12377b(j + this.f16384k.f16419e);
    }

    /* renamed from: P */
    public final C4943v0 mo20436P(C4943v0.C4945b bVar) {
        return new C4943v0(this.f16381h, bVar, this.f16372B.f16675a, mo20393k(), this.f16391r, this.f16381h.f16470j);
    }

    /* renamed from: Q */
    public final long mo20437Q(C4930r0 r0Var) {
        if (r0Var.f16675a.mo20464p()) {
            return C4883f.m12376a(this.f16374D);
        }
        if (r0Var.f16676b.mo20688a()) {
            return r0Var.f16693s;
        }
        C4879e1 e1Var = r0Var.f16675a;
        C4987o.C4988a aVar = r0Var.f16676b;
        long j = r0Var.f16693s;
        e1Var.mo20346g(aVar.f16857a, this.f16384k);
        return j + this.f16384k.f16419e;
    }

    /* renamed from: R */
    public final int mo20438R() {
        if (this.f16372B.f16675a.mo20464p()) {
            return this.f16373C;
        }
        C4930r0 r0Var = this.f16372B;
        return r0Var.f16675a.mo20346g(r0Var.f16676b.f16857a, this.f16384k).f16417c;
    }

    /* renamed from: S */
    public final Pair<Object, Long> mo20439S(C4879e1 e1Var, int i, long j) {
        if (e1Var.mo20464p()) {
            this.f16373C = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f16374D = j;
            return null;
        }
        if (i == -1 || i >= e1Var.mo20463o()) {
            i = e1Var.mo20341a(this.f16393t);
            j = C4883f.m12377b(e1Var.mo20462m(i, this.f16412a).f16436m);
        }
        return e1Var.mo20460i(this.f16412a, this.f16384k, i, C4883f.m12376a(j));
    }

    /* renamed from: V */
    public final C4930r0 mo20440V(C4930r0 r0Var, C4879e1 e1Var, Pair<Object, Long> pair) {
        boolean z;
        C4987o.C4988a aVar;
        TrackGroupArray trackGroupArray;
        C6508g gVar;
        C4987o.C4988a aVar2;
        List list;
        int i;
        long j;
        C4879e1 e1Var2 = e1Var;
        Pair<Object, Long> pair2 = pair;
        if (e1Var.mo20464p() || pair2 != null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        C4879e1 e1Var3 = r0Var.f16675a;
        C4930r0 h = r0Var.mo20600h(e1Var);
        if (e1Var.mo20464p()) {
            C4987o.C4988a aVar3 = C4930r0.f16674t;
            long a = C4883f.m12376a(this.f16374D);
            C4930r0 a2 = h.mo20594b(aVar3, a, a, a, 0, TrackGroupArray.f14011e, this.f16375b, ImmutableList.m35687D()).mo20593a(aVar3);
            a2.f16691q = a2.f16693s;
            return a2;
        }
        Object obj = h.f16676b.f16857a;
        int i2 = C6774a0.f20959a;
        boolean z2 = !obj.equals(pair2.first);
        if (z2) {
            aVar = new C4987o.C4988a(pair2.first);
        } else {
            aVar = h.f16676b;
        }
        C4987o.C4988a aVar4 = aVar;
        long longValue = ((Long) pair2.second).longValue();
        long a3 = C4883f.m12376a(mo20362E());
        if (!e1Var3.mo20464p()) {
            a3 -= e1Var3.mo20346g(obj, this.f16384k).f16419e;
        }
        if (z2 || longValue < a3) {
            C4987o.C4988a aVar5 = aVar4;
            C17875h.m44304o(!aVar5.mo20688a());
            if (z2) {
                trackGroupArray = TrackGroupArray.f14011e;
            } else {
                trackGroupArray = h.f16682h;
            }
            TrackGroupArray trackGroupArray2 = trackGroupArray;
            if (z2) {
                aVar2 = aVar5;
                gVar = this.f16375b;
            } else {
                aVar2 = aVar5;
                gVar = h.f16683i;
            }
            C6508g gVar2 = gVar;
            if (z2) {
                list = ImmutableList.m35687D();
            } else {
                list = h.f16684j;
            }
            C4930r0 a4 = h.mo20594b(aVar2, longValue, longValue, longValue, 0, trackGroupArray2, gVar2, list).mo20593a(aVar2);
            a4.f16691q = longValue;
            return a4;
        }
        if (i == 0) {
            int b = e1Var2.mo20342b(h.f16685k.f16857a);
            if (b == -1 || e1Var2.mo20345f(b, this.f16384k, false).f16417c != e1Var2.mo20346g(aVar4.f16857a, this.f16384k).f16417c) {
                e1Var2.mo20346g(aVar4.f16857a, this.f16384k);
                if (aVar4.mo20688a()) {
                    j = this.f16384k.mo20465a(aVar4.f16858b, aVar4.f16859c);
                } else {
                    j = this.f16384k.f16418d;
                }
                h = h.mo20594b(aVar4, h.f16693s, h.f16693s, h.f16678d, j - h.f16693s, h.f16682h, h.f16683i, h.f16684j).mo20593a(aVar4);
                h.f16691q = j;
            }
        } else {
            C4987o.C4988a aVar6 = aVar4;
            C17875h.m44304o(!aVar6.mo20688a());
            long max = Math.max(0, h.f16692r - (longValue - a3));
            long j2 = h.f16691q;
            if (h.f16685k.equals(h.f16676b)) {
                j2 = longValue + max;
            }
            h = h.mo20594b(aVar6, longValue, longValue, longValue, max, h.f16682h, h.f16683i, h.f16684j);
            h.f16691q = j2;
        }
        return h;
    }

    /* renamed from: W */
    public final void mo20441W(int i, int i2, boolean z) {
        C4930r0 r0Var = this.f16372B;
        if (r0Var.f16686l != z || r0Var.f16687m != i) {
            this.f16394u++;
            C4930r0 d = r0Var.mo20596d(i, z);
            C6809w wVar = (C6809w) this.f16381h.f16468h;
            wVar.getClass();
            C6809w.C6810a b = C6809w.m16064b();
            b.f21064a = wVar.f21063a.obtainMessage(1, z ? 1 : 0, i);
            b.mo23023a();
            mo20444Z(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: X */
    public final void mo20442X(ExoPlaybackException exoPlaybackException) {
        boolean z;
        C4930r0 r0Var = this.f16372B;
        C4930r0 a = r0Var.mo20593a(r0Var.f16676b);
        a.f16691q = a.f16693s;
        a.f16692r = 0;
        C4930r0 g = a.mo20599g(1);
        if (exoPlaybackException != null) {
            g = g.mo20597e(exoPlaybackException);
        }
        C4930r0 r0Var2 = g;
        this.f16394u++;
        C6809w wVar = (C6809w) this.f16381h.f16468h;
        wVar.getClass();
        C6809w.C6810a b = C6809w.m16064b();
        b.f21064a = wVar.f21063a.obtainMessage(6);
        b.mo23023a();
        if (!r0Var2.f16675a.mo20464p() || this.f16372B.f16675a.mo20464p()) {
            z = false;
        } else {
            z = true;
        }
        mo20444Z(r0Var2, 0, 1, false, z, 4, mo20437Q(r0Var2), -1);
    }

    /* renamed from: Y */
    public final void mo20443Y() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C4936u0.C4937a aVar = this.f16399z;
        C4936u0.C4937a aVar2 = this.f16376c;
        C6780f.C6781a aVar3 = new C6780f.C6781a();
        C6780f fVar = aVar2.f16702a;
        boolean z5 = false;
        for (int i = 0; i < fVar.mo22950b(); i++) {
            aVar3.mo22953a(fVar.mo22949a(i));
        }
        if (!mo20385d()) {
            aVar3.mo22953a(3);
        }
        if (!mo20452i() || mo20385d()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            aVar3.mo22953a(4);
        }
        if (mo20451K() != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || mo20385d()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            aVar3.mo22953a(5);
        }
        if (mo20450F() != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !mo20385d()) {
            z5 = true;
        }
        if (z5) {
            aVar3.mo22953a(6);
        }
        if (!mo20385d()) {
            aVar3.mo22953a(7);
        }
        C4936u0.C4937a aVar4 = new C4936u0.C4937a(aVar3.mo22954b());
        this.f16399z = aVar4;
        if (!aVar4.equals(aVar)) {
            this.f16382i.mo22959b(14, new C4861b0(this, 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0252  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20444Z(p099ga.C4930r0 r37, int r38, int r39, boolean r40, boolean r41, int r42, long r43, int r45) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r42
            ga.r0 r3 = r0.f16372B
            r0.f16372B = r1
            ga.e1 r4 = r3.f16675a
            ga.e1 r5 = r1.f16675a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            ga.e1 r6 = r3.f16675a
            ga.e1 r7 = r1.f16675a
            boolean r8 = r7.mo20464p()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = 0
            r13 = 3
            if (r8 == 0) goto L_0x0034
            boolean r8 = r6.mo20464p()
            if (r8 == 0) goto L_0x0034
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
            goto L_0x00be
        L_0x0034:
            boolean r8 = r7.mo20464p()
            boolean r14 = r6.mo20464p()
            if (r8 == r14) goto L_0x004b
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r4.<init>(r6, r7)
            goto L_0x00be
        L_0x004b:
            gb.o$a r8 = r3.f16676b
            java.lang.Object r8 = r8.f16857a
            ga.e1$b r14 = r0.f16384k
            ga.e1$b r8 = r6.mo20346g(r8, r14)
            int r8 = r8.f16417c
            ga.e1$c r14 = r0.f16412a
            ga.e1$c r6 = r6.mo20462m(r8, r14)
            java.lang.Object r6 = r6.f16424a
            gb.o$a r8 = r1.f16676b
            java.lang.Object r8 = r8.f16857a
            ga.e1$b r14 = r0.f16384k
            ga.e1$b r8 = r7.mo20346g(r8, r14)
            int r8 = r8.f16417c
            ga.e1$c r14 = r0.f16412a
            ga.e1$c r7 = r7.mo20462m(r8, r14)
            java.lang.Object r7 = r7.f16424a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009b
            if (r41 == 0) goto L_0x007f
            if (r2 != 0) goto L_0x007f
            r4 = 1
            goto L_0x0088
        L_0x007f:
            if (r41 == 0) goto L_0x0085
            if (r2 != r5) goto L_0x0085
            r4 = 2
            goto L_0x0088
        L_0x0085:
            if (r4 == 0) goto L_0x0095
            r4 = 3
        L_0x0088:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00be
        L_0x0095:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009b:
            if (r41 == 0) goto L_0x00b7
            if (r2 != 0) goto L_0x00b7
            gb.o$a r4 = r3.f16676b
            long r6 = r4.f16860d
            gb.o$a r4 = r1.f16676b
            long r14 = r4.f16860d
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b7
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.<init>(r6, r7)
            goto L_0x00be
        L_0x00b7:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
        L_0x00be:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            ga.k0 r7 = r0.f16371A
            if (r6 == 0) goto L_0x00fe
            ga.e1 r10 = r1.f16675a
            boolean r10 = r10.mo20464p()
            if (r10 != 0) goto L_0x00f3
            ga.e1 r10 = r1.f16675a
            gb.o$a r14 = r1.f16676b
            java.lang.Object r14 = r14.f16857a
            ga.e1$b r15 = r0.f16384k
            ga.e1$b r10 = r10.mo20346g(r14, r15)
            int r10 = r10.f16417c
            ga.e1 r14 = r1.f16675a
            ga.e1$c r15 = r0.f16412a
            ga.e1$c r10 = r14.mo20462m(r10, r15)
            ga.j0 r10 = r10.f16426c
            goto L_0x00f4
        L_0x00f3:
            r10 = 0
        L_0x00f4:
            if (r10 == 0) goto L_0x00f9
            ga.k0 r14 = r10.f16539d
            goto L_0x00fb
        L_0x00f9:
            ga.k0 r14 = p099ga.C4910k0.f16574q
        L_0x00fb:
            r0.f16371A = r14
            goto L_0x00ff
        L_0x00fe:
            r10 = 0
        L_0x00ff:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r14 = r3.f16684j
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r15 = r1.f16684j
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0139
            r7.getClass()
            ga.k0$a r14 = new ga.k0$a
            r14.<init>(r7)
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r7 = r1.f16684j
            r15 = 0
        L_0x0114:
            int r8 = r7.size()
            if (r15 >= r8) goto L_0x0134
            java.lang.Object r8 = r7.get(r15)
            com.google.android.exoplayer2.metadata.Metadata r8 = (com.google.android.exoplayer2.metadata.Metadata) r8
            r13 = 0
        L_0x0121:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r11 = r8.f13864b
            int r9 = r11.length
            if (r13 >= r9) goto L_0x012f
            r9 = r11[r13]
            r9.mo16091c2(r14)
            int r13 = r13 + 1
            r9 = -1
            goto L_0x0121
        L_0x012f:
            int r15 = r15 + 1
            r9 = -1
            r13 = 3
            goto L_0x0114
        L_0x0134:
            ga.k0 r7 = new ga.k0
            r7.<init>(r14)
        L_0x0139:
            ga.k0 r8 = r0.f16371A
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f16371A = r7
            ga.e1 r7 = r3.f16675a
            ga.e1 r9 = r1.f16675a
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0158
            ub.k<ga.u0$b> r7 = r0.f16382i
            ga.u r9 = new ga.u
            r11 = r38
            r9.<init>(r1, r11)
            r7.mo22959b(r12, r9)
        L_0x0158:
            if (r41 == 0) goto L_0x0274
            ga.e1$b r7 = new ga.e1$b
            r7.<init>()
            ga.e1 r9 = r3.f16675a
            boolean r9 = r9.mo20464p()
            if (r9 != 0) goto L_0x018b
            gb.o$a r9 = r3.f16676b
            java.lang.Object r9 = r9.f16857a
            ga.e1 r11 = r3.f16675a
            r11.mo20346g(r9, r7)
            int r11 = r7.f16417c
            ga.e1 r13 = r3.f16675a
            int r13 = r13.mo20342b(r9)
            ga.e1 r14 = r3.f16675a
            ga.e1$c r15 = r0.f16412a
            ga.e1$c r14 = r14.mo20462m(r11, r15)
            java.lang.Object r14 = r14.f16424a
            r19 = r9
            r18 = r11
            r20 = r13
            r17 = r14
            goto L_0x0193
        L_0x018b:
            r18 = r45
            r17 = 0
            r19 = 0
            r20 = -1
        L_0x0193:
            if (r2 != 0) goto L_0x01ca
            long r13 = r7.f16419e
            r11 = r6
            long r5 = r7.f16418d
            long r13 = r13 + r5
            gb.o$a r5 = r3.f16676b
            boolean r5 = r5.mo20688a()
            if (r5 == 0) goto L_0x01b2
            gb.o$a r5 = r3.f16676b
            int r6 = r5.f16858b
            int r5 = r5.f16859c
            long r5 = r7.mo20465a(r6, r5)
            long r13 = m12292T(r3)
            goto L_0x01e0
        L_0x01b2:
            gb.o$a r5 = r3.f16676b
            int r5 = r5.f16861e
            r6 = -1
            if (r5 == r6) goto L_0x01df
            ga.r0 r5 = r0.f16372B
            gb.o$a r5 = r5.f16676b
            boolean r5 = r5.mo20688a()
            if (r5 == 0) goto L_0x01df
            ga.r0 r5 = r0.f16372B
            long r13 = m12292T(r5)
            goto L_0x01df
        L_0x01ca:
            r11 = r6
            gb.o$a r5 = r3.f16676b
            boolean r5 = r5.mo20688a()
            if (r5 == 0) goto L_0x01da
            long r5 = r3.f16693s
            long r13 = m12292T(r3)
            goto L_0x01e0
        L_0x01da:
            long r5 = r7.f16419e
            long r13 = r3.f16693s
            long r13 = r13 + r5
        L_0x01df:
            r5 = r13
        L_0x01e0:
            ga.u0$e r7 = new ga.u0$e
            long r21 = p099ga.C4883f.m12377b(r5)
            long r23 = p099ga.C4883f.m12377b(r13)
            gb.o$a r5 = r3.f16676b
            int r6 = r5.f16858b
            int r5 = r5.f16859c
            r16 = r7
            r25 = r6
            r26 = r5
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r26)
            int r5 = r36.mo20393k()
            ga.r0 r6 = r0.f16372B
            ga.e1 r6 = r6.f16675a
            boolean r6 = r6.mo20464p()
            if (r6 != 0) goto L_0x022f
            ga.r0 r6 = r0.f16372B
            gb.o$a r13 = r6.f16676b
            java.lang.Object r13 = r13.f16857a
            ga.e1 r6 = r6.f16675a
            ga.e1$b r14 = r0.f16384k
            r6.mo20346g(r13, r14)
            ga.r0 r6 = r0.f16372B
            ga.e1 r6 = r6.f16675a
            int r6 = r6.mo20342b(r13)
            ga.r0 r14 = r0.f16372B
            ga.e1 r14 = r14.f16675a
            ga.e1$c r15 = r0.f16412a
            ga.e1$c r14 = r14.mo20462m(r5, r15)
            java.lang.Object r14 = r14.f16424a
            r29 = r6
            r28 = r13
            r26 = r14
            goto L_0x0235
        L_0x022f:
            r26 = 0
            r28 = 0
            r29 = -1
        L_0x0235:
            long r30 = p099ga.C4883f.m12377b(r43)
            ga.u0$e r6 = new ga.u0$e
            ga.r0 r13 = r0.f16372B
            gb.o$a r13 = r13.f16676b
            boolean r13 = r13.mo20688a()
            if (r13 == 0) goto L_0x0252
            ga.r0 r13 = r0.f16372B
            long r13 = m12292T(r13)
            long r13 = p099ga.C4883f.m12377b(r13)
            r32 = r13
            goto L_0x0254
        L_0x0252:
            r32 = r30
        L_0x0254:
            ga.r0 r13 = r0.f16372B
            gb.o$a r13 = r13.f16676b
            int r14 = r13.f16858b
            int r13 = r13.f16859c
            r25 = r6
            r27 = r5
            r34 = r14
            r35 = r13
            r25.<init>(r26, r27, r28, r29, r30, r32, r34, r35)
            ub.k<ga.u0$b> r5 = r0.f16382i
            r13 = 12
            ga.z r14 = new ga.z
            r14.<init>(r2, r7, r6)
            r5.mo22959b(r13, r14)
            goto L_0x0275
        L_0x0274:
            r11 = r6
        L_0x0275:
            if (r11 == 0) goto L_0x0282
            ub.k<ga.u0$b> r2 = r0.f16382i
            ga.a0 r5 = new ga.a0
            r5.<init>(r10, r4)
            r4 = 1
            r2.mo22959b(r4, r5)
        L_0x0282:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r3.f16680f
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f16680f
            if (r2 == r4) goto L_0x0296
            if (r4 == 0) goto L_0x0296
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 11
            ga.b0 r5 = new ga.b0
            r5.<init>(r1, r12)
            r2.mo22959b(r4, r5)
        L_0x0296:
            sb.g r2 = r3.f16683i
            sb.g r4 = r1.f16683i
            if (r2 == r4) goto L_0x02b7
            sb.f r2 = r0.f16378e
            java.lang.Object r4 = r4.f20302d
            r2.mo16341a(r4)
            sb.e r2 = new sb.e
            sb.g r4 = r1.f16683i
            com.google.android.exoplayer2.trackselection.b[] r4 = r4.f20301c
            r2.<init>(r4)
            ub.k<ga.u0$b> r4 = r0.f16382i
            ga.c0 r5 = new ga.c0
            r5.<init>(r12, r1, r2)
            r2 = 2
            r4.mo22959b(r2, r5)
        L_0x02b7:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r2 = r3.f16684j
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r4 = r1.f16684j
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02cc
            ub.k<ga.u0$b> r2 = r0.f16382i
            ga.o r4 = new ga.o
            r4.<init>(r1)
            r5 = 3
            r2.mo22959b(r5, r4)
        L_0x02cc:
            if (r8 == 0) goto L_0x02dc
            ga.k0 r2 = r0.f16371A
            ub.k<ga.u0$b> r4 = r0.f16382i
            r5 = 15
            ga.p r6 = new ga.p
            r6.<init>(r2, r12)
            r4.mo22959b(r5, r6)
        L_0x02dc:
            boolean r2 = r3.f16681g
            boolean r4 = r1.f16681g
            if (r2 == r4) goto L_0x02ed
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 4
            ga.q r5 = new ga.q
            r5.<init>(r1, r12)
            r2.mo22959b(r4, r5)
        L_0x02ed:
            int r2 = r3.f16679e
            int r4 = r1.f16679e
            if (r2 != r4) goto L_0x02fc
            boolean r2 = r3.f16686l
            boolean r4 = r1.f16686l
            if (r2 == r4) goto L_0x02fa
            goto L_0x02fc
        L_0x02fa:
            r5 = 1
            goto L_0x0308
        L_0x02fc:
            ub.k<ga.u0$b> r2 = r0.f16382i
            ga.w r4 = new ga.w
            r5 = 1
            r4.<init>(r1, r5)
            r6 = -1
            r2.mo22959b(r6, r4)
        L_0x0308:
            int r2 = r3.f16679e
            int r4 = r1.f16679e
            if (r2 == r4) goto L_0x0319
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 5
            ga.x r6 = new ga.x
            r6.<init>(r1, r5)
            r2.mo22959b(r4, r6)
        L_0x0319:
            boolean r2 = r3.f16686l
            boolean r4 = r1.f16686l
            if (r2 == r4) goto L_0x032c
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 6
            ga.v r5 = new ga.v
            r6 = r39
            r5.<init>(r1, r6)
            r2.mo22959b(r4, r5)
        L_0x032c:
            int r2 = r3.f16687m
            int r4 = r1.f16687m
            if (r2 == r4) goto L_0x033d
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 7
            ga.w r5 = new ga.w
            r5.<init>(r1, r12)
            r2.mo22959b(r4, r5)
        L_0x033d:
            boolean r2 = m12293U(r3)
            boolean r4 = m12293U(r37)
            if (r2 == r4) goto L_0x0353
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 8
            ga.x r5 = new ga.x
            r5.<init>(r1, r12)
            r2.mo22959b(r4, r5)
        L_0x0353:
            ga.s0 r2 = r3.f16688n
            ga.s0 r4 = r1.f16688n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x036a
            ub.k<ga.u0$b> r2 = r0.f16382i
            r4 = 13
            ha.g0 r5 = new ha.g0
            r6 = 2
            r5.<init>(r1, r6)
            r2.mo22959b(r4, r5)
        L_0x036a:
            if (r40 == 0) goto L_0x0377
            ub.k<ga.u0$b> r2 = r0.f16382i
            ga.y r4 = new ga.y
            r4.<init>()
            r5 = -1
            r2.mo22959b(r5, r4)
        L_0x0377:
            r36.mo20443Y()
            ub.k<ga.u0$b> r2 = r0.f16382i
            r2.mo22958a()
            boolean r2 = r3.f16689o
            boolean r4 = r1.f16689o
            if (r2 == r4) goto L_0x039b
            java.util.concurrent.CopyOnWriteArraySet<ga.m$a> r2 = r0.f16383j
            java.util.Iterator r2 = r2.iterator()
        L_0x038b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x039b
            java.lang.Object r4 = r2.next()
            ga.m$a r4 = (p099ga.C4914m.C4915a) r4
            r4.mo20413f()
            goto L_0x038b
        L_0x039b:
            boolean r2 = r3.f16690p
            boolean r1 = r1.f16690p
            if (r2 == r1) goto L_0x03b7
            java.util.concurrent.CopyOnWriteArraySet<ga.m$a> r1 = r0.f16383j
            java.util.Iterator r1 = r1.iterator()
        L_0x03a7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03b7
            java.lang.Object r2 = r1.next()
            ga.m$a r2 = (p099ga.C4914m.C4915a) r2
            r2.mo20417o()
            goto L_0x03a7
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4872d0.mo20444Z(ga.r0, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: a */
    public final void mo20380a(C4932s0 s0Var) {
        if (!this.f16372B.f16688n.equals(s0Var)) {
            C4930r0 f = this.f16372B.mo20598f(s0Var);
            this.f16394u++;
            ((C6809w) this.f16381h.f16468h).mo23021a(4, s0Var).mo23023a();
            mo20444Z(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: b */
    public final C4932s0 mo20382b() {
        return this.f16372B.f16688n;
    }

    /* renamed from: c */
    public final void mo20384c() {
        int i;
        C4930r0 r0Var = this.f16372B;
        if (r0Var.f16679e == 1) {
            C4930r0 e = r0Var.mo20597e((ExoPlaybackException) null);
            if (e.f16675a.mo20464p()) {
                i = 4;
            } else {
                i = 2;
            }
            C4930r0 g = e.mo20599g(i);
            this.f16394u++;
            C6809w wVar = (C6809w) this.f16381h.f16468h;
            wVar.getClass();
            C6809w.C6810a b = C6809w.m16064b();
            b.f21064a = wVar.f21063a.obtainMessage(0);
            b.mo23023a();
            mo20444Z(g, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: d */
    public final boolean mo20385d() {
        return this.f16372B.f16676b.mo20688a();
    }

    /* renamed from: e */
    public final long mo20386e() {
        return C4883f.m12377b(this.f16372B.f16692r);
    }

    /* renamed from: f */
    public final C6506f mo20387f() {
        return this.f16378e;
    }

    /* renamed from: g */
    public final void mo20388g(C4936u0.C4938b bVar) {
        C6786k<C4936u0.C4938b> kVar = this.f16382i;
        if (!kVar.f20996g) {
            bVar.getClass();
            kVar.f20993d.add(new C6786k.C6789c(bVar));
        }
    }

    public final long getCurrentPosition() {
        return C4883f.m12377b(mo20437Q(this.f16372B));
    }

    public final long getDuration() {
        if (mo20385d()) {
            C4930r0 r0Var = this.f16372B;
            C4987o.C4988a aVar = r0Var.f16676b;
            r0Var.f16675a.mo20346g(aVar.f16857a, this.f16384k);
            return C4883f.m12377b(this.f16384k.mo20465a(aVar.f16858b, aVar.f16859c));
        }
        C4879e1 e1Var = this.f16372B.f16675a;
        if (e1Var.mo20464p()) {
            return -9223372036854775807L;
        }
        return C4883f.m12377b(e1Var.mo20462m(mo20393k(), this.f16412a).f16437n);
    }

    /* renamed from: h */
    public final List<Metadata> mo20391h() {
        return this.f16372B.f16684j;
    }

    /* renamed from: j */
    public final void mo20392j(SurfaceView surfaceView) {
    }

    /* renamed from: k */
    public final int mo20393k() {
        int R = mo20438R();
        if (R == -1) {
            return 0;
        }
        return R;
    }

    /* renamed from: l */
    public final ExoPlaybackException mo20394l() {
        return this.f16372B.f16680f;
    }

    /* renamed from: m */
    public final void mo20395m(boolean z) {
        mo20441W(0, 1, z);
    }

    /* renamed from: n */
    public final List mo20396n() {
        return ImmutableList.m35687D();
    }

    /* renamed from: o */
    public final int mo20397o() {
        if (mo20385d()) {
            return this.f16372B.f16676b.f16858b;
        }
        return -1;
    }

    /* renamed from: q */
    public final int mo20398q() {
        return this.f16372B.f16687m;
    }

    /* renamed from: r */
    public final TrackGroupArray mo20399r() {
        return this.f16372B.f16682h;
    }

    /* renamed from: s */
    public final C4879e1 mo20400s() {
        return this.f16372B.f16675a;
    }

    /* renamed from: t */
    public final Looper mo20401t() {
        return this.f16389p;
    }

    /* renamed from: u */
    public final void mo20402u(TextureView textureView) {
    }

    /* renamed from: v */
    public final C6505e mo20403v() {
        return new C6505e(this.f16372B.f16683i.f20301c);
    }

    /* renamed from: w */
    public final void mo20404w(C4936u0.C4938b bVar) {
        C6786k<C4936u0.C4938b> kVar = this.f16382i;
        Iterator<C6786k.C6789c<T>> it = kVar.f20993d.iterator();
        while (it.hasNext()) {
            C6786k.C6789c next = it.next();
            if (next.f20997a.equals(bVar)) {
                C6786k.C6788b<T> bVar2 = kVar.f20992c;
                next.f21000d = true;
                if (next.f20999c) {
                    bVar2.mo6655a(next.f20997a, next.f20998b.mo22954b());
                }
                kVar.f20993d.remove(next);
            }
        }
    }

    /* renamed from: x */
    public final void mo20405x(int i, long j) {
        int i2 = i;
        long j2 = j;
        C4879e1 e1Var = this.f16372B.f16675a;
        if (i2 < 0 || (!e1Var.mo20464p() && i2 >= e1Var.mo20463o())) {
            throw new IllegalSeekPositionException(e1Var, i, j2);
        }
        int i3 = 1;
        this.f16394u++;
        if (mo20385d()) {
            C4887g0.C4891d dVar = new C4887g0.C4891d(this.f16372B);
            dVar.mo20532a(1);
            C4872d0 d0Var = (C4872d0) this.f16380g.f21894c;
            ((C6809w) d0Var.f16379f).f21063a.post(new C7097r(11, d0Var, dVar));
            return;
        }
        if (this.f16372B.f16679e != 1) {
            i3 = 2;
        }
        int k = mo20393k();
        C4930r0 V = mo20440V(this.f16372B.mo20599g(i3), e1Var, mo20439S(e1Var, i, j2));
        ((C6809w) this.f16381h.f16468h).mo23021a(3, new C4887g0.C4894g(e1Var, i, C4883f.m12376a(j))).mo23023a();
        mo20444Z(V, 0, 1, true, true, 1, mo20437Q(V), k);
    }

    /* renamed from: y */
    public final void mo20406y(C4936u0.C4940d dVar) {
        mo20404w(dVar);
    }

    /* renamed from: z */
    public final boolean mo20407z() {
        return this.f16372B.f16686l;
    }
}
