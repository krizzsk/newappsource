package p988j$.util.stream;

import p988j$.util.C26009g;
import p988j$.util.C26012j;
import p988j$.util.C26013k;
import p988j$.util.C26264u;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25916A0;
import p988j$.util.function.C25927G;
import p988j$.util.function.C25941N;
import p988j$.util.function.C25947Q;
import p988j$.util.function.C25951U;
import p988j$.util.function.C25954X;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.d0 */
abstract class C26149d0 extends C26143c implements IntStream {

    /* renamed from: s */
    public static final /* synthetic */ int f64899s = 0;

    C26149d0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    C26149d0(C26143c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static Spliterator.OfInt m65375A1(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (C26061H3.f64754a) {
            C26061H3.m65025a(C26143c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* renamed from: A */
    public final Object mo84253A(Supplier supplier, C25916A0 a0, BiConsumer biConsumer) {
        C26218r rVar = new C26218r(biConsumer, 1);
        supplier.getClass();
        a0.getClass();
        return mo84467j1(new C26245w1(2, rVar, a0, supplier, 4));
    }

    /* renamed from: D */
    public final boolean mo84254D(C25941N n) {
        return ((Boolean) mo84467j1(C26239v0.m65663b1(n, C26224s0.ANY))).booleanValue();
    }

    /* renamed from: O */
    public void mo84255O(IntConsumer intConsumer) {
        intConsumer.getClass();
        mo84467j1(new C26090P(intConsumer, true));
    }

    /* renamed from: P */
    public final Stream mo84256P(IntFunction intFunction) {
        intFunction.getClass();
        return new C26238v(this, C26116V2.f64844p | C26116V2.f64842n, intFunction, 1);
    }

    /* renamed from: S */
    public final IntStream mo84257S(IntFunction intFunction) {
        return new C26243w(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, intFunction, 3);
    }

    /* renamed from: W */
    public void mo84258W(IntConsumer intConsumer) {
        intConsumer.getClass();
        mo84467j1(new C26090P(intConsumer, false));
    }

    /* renamed from: X */
    public final C26047F mo84259X(C25947Q q) {
        q.getClass();
        return new C26233u(this, C26116V2.f64844p | C26116V2.f64842n, q, 4);
    }

    /* renamed from: a0 */
    public final IntStream mo84260a0(C25941N n) {
        n.getClass();
        return new C26243w(this, C26116V2.f64848t, n, 4);
    }

    public final C26047F asDoubleStream() {
        return new C26253y(this, C26116V2.f64844p | C26116V2.f64842n, 1);
    }

    public final C26194m0 asLongStream() {
        return new C26125Y(this, C26116V2.f64844p | C26116V2.f64842n, 0);
    }

    public final C26012j average() {
        long[] jArr = (long[]) mo84253A(new C26138b(19), new C26138b(20), new C26138b(21));
        long j = jArr[0];
        return j > 0 ? C26012j.m64877d(((double) jArr[1]) / ((double) j)) : C26012j.m64876a();
    }

    /* renamed from: b0 */
    public final C26013k mo84264b0(C25927G g) {
        g.getClass();
        return (C26013k) mo84467j1(new C26024A1(2, g, 2));
    }

    public final Stream boxed() {
        return mo84256P(new C26052G(5));
    }

    /* renamed from: c0 */
    public final IntStream mo84266c0(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C26243w(this, 0, intConsumer, 1);
    }

    public final long count() {
        return ((C26179j0) mo84268d(new C26138b(18))).sum();
    }

    /* renamed from: d */
    public final C26194m0 mo84268d(C25951U u) {
        u.getClass();
        return new C26248x(this, C26116V2.f64844p | C26116V2.f64842n, u, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public final C26259z0 mo84162d1(long j, IntFunction intFunction) {
        return C26239v0.m65660Y0(j);
    }

    public final IntStream distinct() {
        return ((C26127Y1) ((C26127Y1) boxed()).distinct()).mo84373I(new C26138b(17));
    }

    public final C26013k findAny() {
        return (C26013k) mo84467j1(new C26057H(false, 2, C26013k.m64880a(), new C26052G(0), new C26138b(15)));
    }

    public final C26013k findFirst() {
        return (C26013k) mo84467j1(new C26057H(true, 2, C26013k.m64880a(), new C26052G(0), new C26138b(15)));
    }

    public final C26264u iterator() {
        return Spliterators.m64707g(spliterator());
    }

    /* renamed from: k */
    public final IntStream mo84272k(C25954X x) {
        x.getClass();
        return new C26243w(this, C26116V2.f64844p | C26116V2.f64842n, x, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public final C26043E0 mo84171l1(C26239v0 v0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return C26239v0.m65651L0(v0Var, spliterator, z);
    }

    public final IntStream limit(long j) {
        if (j >= 0) {
            return C26221r2.m65611f(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84173m1(p988j$.util.Spliterator r3, p988j$.util.stream.C26166g2 r4) {
        /*
            r2 = this;
            j$.util.Spliterator$OfInt r3 = m65375A1(r3)
            boolean r0 = r4 instanceof p988j$.util.function.IntConsumer
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.IntConsumer r0 = (p988j$.util.function.IntConsumer) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = p988j$.util.stream.C26061H3.f64754a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.W r0 = new j$.util.stream.W
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.mo84149f()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.tryAdvance((p988j$.util.function.IntConsumer) r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = p988j$.util.stream.C26143c.class
            java.lang.String r4 = "using IntStream.adapt(Sink<Integer> s)"
            p988j$.util.stream.C26061H3.m65025a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26149d0.mo84173m1(j$.util.Spliterator, j$.util.stream.g2):void");
    }

    public final C26013k max() {
        return mo84264b0(new C26052G(6));
    }

    public final C26013k min() {
        return mo84264b0(new C26052G(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public final int mo84176n1() {
        return 2;
    }

    /* renamed from: r */
    public final int mo84276r(int i, C25927G g) {
        g.getClass();
        return ((Integer) mo84467j1(new C26064I1(2, g, i))).intValue();
    }

    /* renamed from: s */
    public final boolean mo84277s(C25941N n) {
        return ((Boolean) mo84467j1(C26239v0.m65663b1(n, C26224s0.ALL))).booleanValue();
    }

    public final IntStream skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C26221r2.m65611f(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final IntStream sorted() {
        return new C26025A2(this);
    }

    public final Spliterator.OfInt spliterator() {
        return m65375A1(super.spliterator());
    }

    public final int sum() {
        return mo84276r(0, new C26052G(2));
    }

    public final C26009g summaryStatistics() {
        return (C26009g) mo84253A(new C26067J0(15), new C26052G(3), new C26052G(4));
    }

    /* renamed from: t */
    public final boolean mo84282t(C25941N n) {
        return ((Boolean) mo84467j1(C26239v0.m65663b1(n, C26224s0.NONE))).booleanValue();
    }

    public final int[] toArray() {
        return (int[]) C26239v0.m65658V0((C26028B0) mo84468k1(new C26138b(22))).mo84199b();
    }

    public final C26173i unordered() {
        return !mo84470p1() ? this : new C26129Z(this, C26116V2.f64846r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final Spliterator mo84188x1(C26239v0 v0Var, C26133a aVar, boolean z) {
        return new C26172h3(v0Var, aVar, z);
    }
}
