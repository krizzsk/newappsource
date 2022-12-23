package p988j$.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p988j$.util.C26011i;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25928G0;
import p988j$.util.function.C25969g;
import p988j$.util.function.C25977k;
import p988j$.util.function.C25983n;
import p988j$.util.function.C25989q;
import p988j$.util.function.C25995t;
import p988j$.util.function.C26000v0;
import p988j$.util.function.C26001w;
import p988j$.util.function.C26007z;
import p988j$.util.stream.IntStream;
import p988j$.util.stream.Stream;

/* renamed from: j$.util.stream.E */
public final /* synthetic */ class C26042E implements DoubleStream {

    /* renamed from: a */
    final /* synthetic */ C26047F f64721a;

    private /* synthetic */ C26042E(C26047F f) {
        this.f64721a = f;
    }

    /* renamed from: w */
    public static /* synthetic */ DoubleStream m64974w(C26047F f) {
        if (f == null) {
            return null;
        }
        return f instanceof C26037D ? ((C26037D) f).f64713a : new C26042E(f);
    }

    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f64721a.mo84157V(C25989q.m64837b(doublePredicate));
    }

    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f64721a.mo84187v(C25989q.m64837b(doublePredicate));
    }

    public final /* synthetic */ OptionalDouble average() {
        return C26011i.m64873f(this.f64721a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f64721a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f64721a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f64721a.mo84177o(C25928G0.m64771a(supplier), C26000v0.m64855a(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ long count() {
        return this.f64721a.count();
    }

    public final /* synthetic */ DoubleStream distinct() {
        return m64974w(this.f64721a.distinct());
    }

    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return m64974w(this.f64721a.mo84166h(C25989q.m64837b(doublePredicate)));
    }

    public final /* synthetic */ OptionalDouble findAny() {
        return C26011i.m64873f(this.f64721a.findAny());
    }

    public final /* synthetic */ OptionalDouble findFirst() {
        return C26011i.m64873f(this.f64721a.findFirst());
    }

    public final /* synthetic */ DoubleStream flatMap(DoubleFunction doubleFunction) {
        return m64974w(this.f64721a.mo84167i(C25983n.m64832a(doubleFunction)));
    }

    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f64721a.mo84153H(C25977k.m64825a(doubleConsumer));
    }

    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f64721a.mo84168i0(C25977k.m64825a(doubleConsumer));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64721a.isParallel();
    }

    public final /* synthetic */ DoubleStream limit(long j) {
        return m64974w(this.f64721a.limit(j));
    }

    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return m64974w(this.f64721a.mo84178p(C26007z.m64860d(doubleUnaryOperator)));
    }

    public final /* synthetic */ IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return IntStream.Wrapper.convert(this.f64721a.mo84152B(C25995t.m64849b(doubleToIntFunction)));
    }

    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C26189l0.m65514w(this.f64721a.mo84170j(C26001w.m64856a(doubleToLongFunction)));
    }

    public final /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.Wrapper.convert(this.f64721a.mo84179q(C25983n.m64832a(doubleFunction)));
    }

    public final /* synthetic */ OptionalDouble max() {
        return C26011i.m64873f(this.f64721a.max());
    }

    public final /* synthetic */ OptionalDouble min() {
        return C26011i.m64873f(this.f64721a.min());
    }

    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f64721a.mo84156R(C25989q.m64837b(doublePredicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C26168h.m65431w(this.f64721a.onClose(runnable));
    }

    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return m64974w(this.f64721a.mo84159b(C25977k.m64825a(doubleConsumer)));
    }

    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f64721a.mo84155Q(d, C25969g.m64814a(doubleBinaryOperator));
    }

    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return C26011i.m64873f(this.f64721a.mo84154N(C25969g.m64814a(doubleBinaryOperator)));
    }

    public final /* synthetic */ DoubleStream skip(long j) {
        return m64974w(this.f64721a.skip(j));
    }

    public final /* synthetic */ DoubleStream sorted() {
        return m64974w(this.f64721a.sorted());
    }

    public final /* synthetic */ double sum() {
        return this.f64721a.sum();
    }

    public final DoubleSummaryStatistics summaryStatistics() {
        this.f64721a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ double[] toArray() {
        return this.f64721a.toArray();
    }

    public final /* synthetic */ BaseStream unordered() {
        return C26168h.m65431w(this.f64721a.unordered());
    }
}
