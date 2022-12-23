package p988j$.util.stream;

import java.util.Set;
import p988j$.util.C25856D;
import p988j$.util.C25914f;
import p988j$.util.C26012j;
import p988j$.util.C26019q;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25917B;
import p988j$.util.function.C25973i;
import p988j$.util.function.C25981m;
import p988j$.util.function.C25987p;
import p988j$.util.function.C25993s;
import p988j$.util.function.C25999v;
import p988j$.util.function.C26004x0;
import p988j$.util.function.C26005y;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.C */
abstract class C26032C extends C26143c implements C26047F {

    /* renamed from: s */
    public static final /* synthetic */ int f64704s = 0;

    C26032C(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    C26032C(C26143c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static C25856D m64920A1(Spliterator spliterator) {
        if (spliterator instanceof C25856D) {
            return (C25856D) spliterator;
        }
        if (C26061H3.f64754a) {
            C26061H3.m65025a(C26143c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* renamed from: B */
    public final IntStream mo84152B(C25999v vVar) {
        vVar.getClass();
        return new C26243w(this, C26116V2.f64844p | C26116V2.f64842n, vVar, 0);
    }

    /* renamed from: H */
    public void mo84153H(C25981m mVar) {
        mVar.getClass();
        mo84467j1(new C26086O(mVar, false));
    }

    /* renamed from: N */
    public final C26012j mo84154N(C25973i iVar) {
        iVar.getClass();
        return (C26012j) mo84467j1(new C26024A1(4, iVar, 0));
    }

    /* renamed from: Q */
    public final double mo84155Q(double d, C25973i iVar) {
        iVar.getClass();
        return ((Double) mo84467j1(new C26255y1(4, iVar, d))).doubleValue();
    }

    /* renamed from: R */
    public final boolean mo84156R(C25993s sVar) {
        return ((Boolean) mo84467j1(C26239v0.m65662a1(sVar, C26224s0.NONE))).booleanValue();
    }

    /* renamed from: V */
    public final boolean mo84157V(C25993s sVar) {
        return ((Boolean) mo84467j1(C26239v0.m65662a1(sVar, C26224s0.ALL))).booleanValue();
    }

    public final C26012j average() {
        double[] dArr = (double[]) mo84177o(new C26138b(7), new C26138b(8), new C26138b(9));
        if (dArr[2] <= 0.0d) {
            return C26012j.m64876a();
        }
        Set set = Collectors.f64712a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return C26012j.m64877d(d / dArr[2]);
    }

    /* renamed from: b */
    public final C26047F mo84159b(C25981m mVar) {
        mVar.getClass();
        return new C26233u(this, 0, mVar, 3);
    }

    public final Stream boxed() {
        return mo84179q(new C26067J0(24));
    }

    public final long count() {
        return ((C26179j0) mo84170j(new C26138b(6))).sum();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public final C26259z0 mo84162d1(long j, IntFunction intFunction) {
        return C26239v0.m65654Q0(j);
    }

    public final C26047F distinct() {
        return ((C26127Y1) ((C26127Y1) boxed()).distinct()).mo84388h0(new C26138b(10));
    }

    public final C26012j findAny() {
        return (C26012j) mo84467j1(new C26057H(false, 4, C26012j.m64876a(), new C26067J0(27), new C26138b(12)));
    }

    public final C26012j findFirst() {
        return (C26012j) mo84467j1(new C26057H(true, 4, C26012j.m64876a(), new C26067J0(27), new C26138b(12)));
    }

    /* renamed from: h */
    public final C26047F mo84166h(C25993s sVar) {
        sVar.getClass();
        return new C26233u(this, C26116V2.f64848t, sVar, 2);
    }

    /* renamed from: i */
    public final C26047F mo84167i(C25987p pVar) {
        return new C26233u(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, pVar, 1);
    }

    /* renamed from: i0 */
    public void mo84168i0(C25981m mVar) {
        mVar.getClass();
        mo84467j1(new C26086O(mVar, true));
    }

    public final C26019q iterator() {
        return Spliterators.m64706f(spliterator());
    }

    /* renamed from: j */
    public final C26194m0 mo84170j(C26005y yVar) {
        yVar.getClass();
        return new C26248x(this, C26116V2.f64844p | C26116V2.f64842n, yVar, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public final C26043E0 mo84171l1(C26239v0 v0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return C26239v0.m65650K0(v0Var, spliterator, z);
    }

    public final C26047F limit(long j) {
        if (j >= 0) {
            return C26221r2.m65610e(this, 0, j);
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
            j$.util.D r3 = m64920A1(r3)
            boolean r0 = r4 instanceof p988j$.util.function.C25981m
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.m r0 = (p988j$.util.function.C25981m) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = p988j$.util.stream.C26061H3.f64754a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.s r0 = new j$.util.stream.s
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.mo84149f()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.mo83820h(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = p988j$.util.stream.C26143c.class
            java.lang.String r4 = "using DoubleStream.adapt(Sink<Double> s)"
            p988j$.util.stream.C26061H3.m65025a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26032C.mo84173m1(j$.util.Spliterator, j$.util.stream.g2):void");
    }

    public final C26012j max() {
        return mo84154N(new C26067J0(23));
    }

    public final C26012j min() {
        return mo84154N(new C26067J0(22));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public final int mo84176n1() {
        return 4;
    }

    /* renamed from: o */
    public final Object mo84177o(Supplier supplier, C26004x0 x0Var, BiConsumer biConsumer) {
        C26218r rVar = new C26218r(biConsumer, 0);
        supplier.getClass();
        x0Var.getClass();
        return mo84467j1(new C26245w1(4, rVar, x0Var, supplier, 1));
    }

    /* renamed from: p */
    public final C26047F mo84178p(C25917B b) {
        b.getClass();
        return new C26233u(this, C26116V2.f64844p | C26116V2.f64842n, b, 0);
    }

    /* renamed from: q */
    public final Stream mo84179q(C25987p pVar) {
        pVar.getClass();
        return new C26238v(this, C26116V2.f64844p | C26116V2.f64842n, pVar, 0);
    }

    public final C26047F skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C26221r2.m65610e(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final C26047F sorted() {
        return new C26261z2(this);
    }

    public final C25856D spliterator() {
        return m64920A1(super.spliterator());
    }

    public final double sum() {
        double[] dArr = (double[]) mo84177o(new C26138b(11), new C26138b(4), new C26138b(5));
        Set set = Collectors.f64712a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (!Double.isNaN(d) || !Double.isInfinite(d2)) ? d : d2;
    }

    public final C25914f summaryStatistics() {
        return (C25914f) mo84177o(new C26067J0(14), new C26067J0(25), new C26067J0(26));
    }

    public final double[] toArray() {
        return (double[]) C26239v0.m65657U0((C26023A0) mo84468k1(new C26138b(3))).mo84199b();
    }

    public final C26173i unordered() {
        return !mo84470p1() ? this : new C26253y(this, C26116V2.f64846r, 0);
    }

    /* renamed from: v */
    public final boolean mo84187v(C25993s sVar) {
        return ((Boolean) mo84467j1(C26239v0.m65662a1(sVar, C26224s0.ANY))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final Spliterator mo84188x1(C26239v0 v0Var, C26133a aVar, boolean z) {
        return new C26162f3(v0Var, aVar, z);
    }
}
