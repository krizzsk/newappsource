package p988j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import p988j$.util.Optional;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25936K0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.C25961c;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.Y1 */
abstract class C26127Y1 extends C26143c implements Stream {

    /* renamed from: s */
    public static final /* synthetic */ int f64871s = 0;

    C26127Y1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    C26127Y1(C26143c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: C */
    public final boolean mo84370C(Predicate predicate) {
        return ((Boolean) mo84467j1(C26239v0.m65665e1(predicate, C26224s0.ANY))).booleanValue();
    }

    /* renamed from: F */
    public void mo84371F(Consumer consumer) {
        consumer.getClass();
        mo84467j1(new C26101S(consumer, true));
    }

    /* renamed from: G */
    public final Object mo84372G(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return mo84467j1(new C26245w1(1, biConsumer2, biConsumer, supplier, 3));
    }

    /* renamed from: I */
    public final IntStream mo84373I(C25942N0 n0) {
        n0.getClass();
        return new C26243w(this, C26116V2.f64844p | C26116V2.f64842n, n0, 6);
    }

    /* renamed from: K */
    public final Optional mo84374K(C25967f fVar) {
        fVar.getClass();
        return (Optional) mo84467j1(new C26024A1(1, fVar, 1));
    }

    /* renamed from: Y */
    public final boolean mo84375Y(Predicate predicate) {
        return ((Boolean) mo84467j1(C26239v0.m65665e1(predicate, C26224s0.ALL))).booleanValue();
    }

    /* renamed from: Z */
    public final C26194m0 mo84376Z(Function function) {
        function.getClass();
        return new C26248x(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, function, 6);
    }

    /* renamed from: c */
    public final IntStream mo84377c(Function function) {
        function.getClass();
        return new C26243w(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, function, 7);
    }

    public final Object collect(Collector collector) {
        Object obj;
        if (!isParallel() || !collector.characteristics().contains(C26178j.CONCURRENT) || (mo84470p1() && !collector.characteristics().contains(C26178j.UNORDERED))) {
            collector.getClass();
            obj = mo84467j1(new C26049F1(1, collector.combiner(), collector.accumulator(), collector.supplier(), collector));
        } else {
            obj = collector.supplier().get();
            forEach(new C26198n(5, collector.accumulator(), obj));
        }
        return collector.characteristics().contains(C26178j.IDENTITY_FINISH) ? obj : collector.finisher().apply(obj);
    }

    public final long count() {
        return ((C26179j0) mo84382f0(new C26067J0(7))).sum();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public final C26259z0 mo84162d1(long j, IntFunction intFunction) {
        return C26239v0.m65648I0(j, intFunction);
    }

    public final Stream distinct() {
        return new C26213q(this, C26116V2.f64841m | C26116V2.f64848t);
    }

    /* renamed from: e0 */
    public final boolean mo84381e0(Predicate predicate) {
        return ((Boolean) mo84467j1(C26239v0.m65665e1(predicate, C26224s0.NONE))).booleanValue();
    }

    /* renamed from: f0 */
    public final C26194m0 mo84382f0(C25948Q0 q0) {
        q0.getClass();
        return new C26248x(this, C26116V2.f64844p | C26116V2.f64842n, q0, 7);
    }

    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C26238v(this, C26116V2.f64848t, predicate, 4);
    }

    public final Optional findAny() {
        return (Optional) mo84467j1(new C26057H(false, 1, Optional.m64693a(), new C26067J0(29), new C26138b(14)));
    }

    public final Optional findFirst() {
        return (Optional) mo84467j1(new C26057H(true, 1, Optional.m64693a(), new C26067J0(29), new C26138b(14)));
    }

    public final Stream flatMap(Function function) {
        function.getClass();
        return new C26111U1(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        mo84467j1(new C26101S(consumer, false));
    }

    /* renamed from: h0 */
    public final C26047F mo84388h0(C25936K0 k0) {
        k0.getClass();
        return new C26233u(this, C26116V2.f64844p | C26116V2.f64842n, k0, 6);
    }

    public final Iterator iterator() {
        return Spliterators.m64709i(spliterator());
    }

    /* renamed from: k0 */
    public final Object mo84389k0(Object obj, C25967f fVar) {
        fVar.getClass();
        return mo84467j1(new C26245w1(1, fVar, fVar, obj, 2));
    }

    /* renamed from: l */
    public final Object mo84390l(Object obj, BiFunction biFunction, C25967f fVar) {
        biFunction.getClass();
        fVar.getClass();
        return mo84467j1(new C26245w1(1, fVar, biFunction, obj, 2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public final C26043E0 mo84171l1(C26239v0 v0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return C26239v0.m65649J0(v0Var, spliterator, z, intFunction);
    }

    public final Stream limit(long j) {
        if (j >= 0) {
            return C26221r2.m65613h(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84173m1(p988j$.util.Spliterator r2, p988j$.util.stream.C26166g2 r3) {
        /*
            r1 = this;
        L_0x0000:
            boolean r0 = r3.mo84149f()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.tryAdvance(r3)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26127Y1.mo84173m1(j$.util.Spliterator, j$.util.stream.g2):void");
    }

    public final Stream map(Function function) {
        function.getClass();
        return new C26111U1(this, C26116V2.f64844p | C26116V2.f64842n, function, 0);
    }

    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return mo84374K(new C25961c(0, comparator));
    }

    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return mo84374K(new C25961c(1, comparator));
    }

    /* renamed from: n */
    public final C26047F mo84395n(Function function) {
        function.getClass();
        return new C26233u(this, C26116V2.f64844p | C26116V2.f64842n | C26116V2.f64848t, function, 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public final int mo84176n1() {
        return 1;
    }

    public final Stream skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C26221r2.m65613h(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final Stream sorted() {
        return new C26035C2(this);
    }

    public final Stream sorted(Comparator comparator) {
        return new C26035C2(this, comparator);
    }

    public final Object[] toArray() {
        return toArray(new C26067J0(6));
    }

    public final Object[] toArray(IntFunction intFunction) {
        return C26239v0.m65656T0(mo84468k1(intFunction), intFunction).mo84245o(intFunction);
    }

    /* renamed from: u */
    public final Stream mo84401u(Consumer consumer) {
        consumer.getClass();
        return new C26238v(this, 0, consumer, 3);
    }

    public final C26173i unordered() {
        return !mo84470p1() ? this : new C26107T1(this, C26116V2.f64846r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final Spliterator mo84188x1(C26239v0 v0Var, C26133a aVar, boolean z) {
        return new C26026A3(v0Var, aVar, z);
    }
}
