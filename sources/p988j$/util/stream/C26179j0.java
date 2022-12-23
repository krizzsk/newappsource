package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C26010h;
import p988j$.util.C26012j;
import p988j$.util.C26014l;
import p988j$.util.C26268y;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25922D0;
import p988j$.util.function.C25958a0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25972h0;
import p988j$.util.function.C25978k0;
import p988j$.util.function.C25984n0;
import p988j$.util.function.C25990q0;
import p988j$.util.function.C25998u0;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.j0 */
abstract class C26179j0 extends C26143c implements C26194m0 {

    /* renamed from: s */
    public static final /* synthetic */ int f64938s = 0;

    C26179j0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    C26179j0(C26143c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static C25861I m65449A1(Spliterator spliterator) {
        if (spliterator instanceof C25861I) {
            return (C25861I) spliterator;
        }
        if (C26061H3.f64754a) {
            C26061H3.m65025a(C26143c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* renamed from: E */
    public void mo84486E(C25966e0 e0Var) {
        e0Var.getClass();
        mo84467j1(new C26094Q(e0Var, false));
    }

    /* renamed from: J */
    public final C26047F mo84504J(C25984n0 n0Var) {
        n0Var.getClass();
        return new C26233u(this, C26116V2.f64844p | C26116V2.f64842n, n0Var, 5);
    }

    /* renamed from: M */
    public final C26194m0 mo84505M(C25998u0 u0Var) {
        u0Var.getClass();
        return new C26248x(this, C26116V2.f64844p | C26116V2.f64842n, u0Var, 2);
    }

    /* renamed from: T */
    public final IntStream mo84506T(C25990q0 q0Var) {
        q0Var.getClass();
        return new C26243w(this, C26116V2.f64844p | C26116V2.f64842n, q0Var, 5);
    }

    /* renamed from: U */
    public final Stream mo84507U(C25972h0 h0Var) {
        h0Var.getClass();
        return new C26238v(this, C26116V2.f64844p | C26116V2.f64842n, h0Var, 2);
    }

    /* renamed from: a */
    public final boolean mo84508a(C25978k0 k0Var) {
        return ((Boolean) mo84467j1(C26239v0.m65664c1(k0Var, C26224s0.NONE))).booleanValue();
    }

    public final C26047F asDoubleStream() {
        return new C26253y(this, C26116V2.f64844p | C26116V2.f64842n, 2);
    }

    public final C26012j average() {
        long[] jArr = (long[]) mo84530y(new C26138b(26), new C26138b(27), new C26138b(28));
        long j = jArr[0];
        return j > 0 ? C26012j.m64877d(((double) jArr[1]) / ((double) j)) : C26012j.m64876a();
    }

    public final Stream boxed() {
        return mo84507U(new C26052G(9));
    }

    public final long count() {
        return ((C26179j0) mo84505M(new C26138b(23))).sum();
    }

    /* renamed from: d0 */
    public final boolean mo84513d0(C25978k0 k0Var) {
        return ((Boolean) mo84467j1(C26239v0.m65664c1(k0Var, C26224s0.ANY))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public final C26259z0 mo84162d1(long j, IntFunction intFunction) {
        return C26239v0.m65661Z0(j);
    }

    public final C26194m0 distinct() {
        return ((C26127Y1) ((C26127Y1) boxed()).distinct()).mo84382f0(new C26138b(24));
    }

    /* renamed from: e */
    public final C26014l mo84515e(C25958a0 a0Var) {
        a0Var.getClass();
        return (C26014l) mo84467j1(new C26024A1(3, a0Var, 3));
    }

    /* renamed from: f */
    public final C26194m0 mo84516f(C25966e0 e0Var) {
        e0Var.getClass();
        return new C26248x(this, 0, e0Var, 5);
    }

    public final C26014l findAny() {
        return (C26014l) mo84467j1(new C26057H(false, 3, C26014l.m64884a(), new C26067J0(28), new C26138b(13)));
    }

    public final C26014l findFirst() {
        return (C26014l) mo84467j1(new C26057H(true, 3, C26014l.m64884a(), new C26067J0(28), new C26138b(13)));
    }

    /* renamed from: g */
    public final C26194m0 mo84519g(C25972h0 h0Var) {
        return new C26248x(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, h0Var, 3);
    }

    /* renamed from: g0 */
    public final C26194m0 mo84520g0(C25978k0 k0Var) {
        k0Var.getClass();
        return new C26248x(this, C26116V2.f64848t, k0Var, 4);
    }

    public final C26268y iterator() {
        return Spliterators.m64708h(spliterator());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public final C26043E0 mo84171l1(C26239v0 v0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return C26239v0.m65652M0(v0Var, spliterator, z);
    }

    public final C26194m0 limit(long j) {
        if (j >= 0) {
            return C26221r2.m65612g(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    /* renamed from: m */
    public final long mo84522m(long j, C25958a0 a0Var) {
        a0Var.getClass();
        return ((Long) mo84467j1(new C26080M1(3, a0Var, j))).longValue();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84173m1(p988j$.util.Spliterator r3, p988j$.util.stream.C26166g2 r4) {
        /*
            r2 = this;
            j$.util.I r3 = m65449A1(r3)
            boolean r0 = r4 instanceof p988j$.util.function.C25966e0
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.e0 r0 = (p988j$.util.function.C25966e0) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = p988j$.util.stream.C26061H3.f64754a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.e0 r0 = new j$.util.stream.e0
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.mo84149f()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.mo83849c(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = p988j$.util.stream.C26143c.class
            java.lang.String r4 = "using LongStream.adapt(Sink<Long> s)"
            p988j$.util.stream.C26061H3.m65025a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26179j0.mo84173m1(j$.util.Spliterator, j$.util.stream.g2):void");
    }

    public final C26014l max() {
        return mo84515e(new C26052G(8));
    }

    public final C26014l min() {
        return mo84515e(new C26052G(7));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public final int mo84176n1() {
        return 3;
    }

    public final C26194m0 skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C26221r2.m65612g(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final C26194m0 sorted() {
        return new C26030B2(this);
    }

    public final C25861I spliterator() {
        return m65449A1(super.spliterator());
    }

    public final long sum() {
        return mo84522m(0, new C26052G(10));
    }

    public final C26010h summaryStatistics() {
        return (C26010h) mo84530y(new C26067J0(18), new C26052G(11), new C26052G(12));
    }

    public final long[] toArray() {
        return (long[]) C26239v0.m65659W0((C26033C0) mo84468k1(new C26138b(25))).mo84199b();
    }

    public final C26173i unordered() {
        return !mo84470p1() ? this : new C26125Y(this, C26116V2.f64846r, 1);
    }

    /* renamed from: x */
    public void mo84487x(C25966e0 e0Var) {
        e0Var.getClass();
        mo84467j1(new C26094Q(e0Var, true));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final Spliterator mo84188x1(C26239v0 v0Var, C26133a aVar, boolean z) {
        return new C26182j3(v0Var, aVar, z);
    }

    /* renamed from: y */
    public final Object mo84530y(Supplier supplier, C25922D0 d0, BiConsumer biConsumer) {
        C26218r rVar = new C26218r(biConsumer, 2);
        supplier.getClass();
        d0.getClass();
        return mo84467j1(new C26245w1(3, rVar, d0, supplier, 0));
    }

    /* renamed from: z */
    public final boolean mo84531z(C25978k0 k0Var) {
        return ((Boolean) mo84467j1(C26239v0.m65664c1(k0Var, C26224s0.ALL))).booleanValue();
    }
}
