package p988j$.util.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p988j$.util.C26011i;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25918B0;
import p988j$.util.function.C25928G0;
import p988j$.util.function.C25955Y;
import p988j$.util.function.C25962c0;
import p988j$.util.function.C25968f0;
import p988j$.util.function.C25974i0;
import p988j$.util.function.C25980l0;
import p988j$.util.function.C25986o0;
import p988j$.util.function.C25994s0;
import p988j$.util.stream.IntStream;
import p988j$.util.stream.Stream;

/* renamed from: j$.util.stream.l0 */
public final /* synthetic */ class C26189l0 implements LongStream {

    /* renamed from: a */
    final /* synthetic */ C26194m0 f64951a;

    private /* synthetic */ C26189l0(C26194m0 m0Var) {
        this.f64951a = m0Var;
    }

    /* renamed from: w */
    public static /* synthetic */ LongStream m65514w(C26194m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return m0Var instanceof C26184k0 ? ((C26184k0) m0Var).f64945a : new C26189l0(m0Var);
    }

    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f64951a.mo84531z(C25974i0.m64817b(longPredicate));
    }

    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f64951a.mo84513d0(C25974i0.m64817b(longPredicate));
    }

    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C26042E.m64974w(this.f64951a.asDoubleStream());
    }

    public final /* synthetic */ OptionalDouble average() {
        return C26011i.m64873f(this.f64951a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f64951a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f64951a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f64951a.mo84530y(C25928G0.m64771a(supplier), C25918B0.m64763a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ long count() {
        return this.f64951a.count();
    }

    public final /* synthetic */ LongStream distinct() {
        return m65514w(this.f64951a.distinct());
    }

    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return m65514w(this.f64951a.mo84520g0(C25974i0.m64817b(longPredicate)));
    }

    public final /* synthetic */ OptionalLong findAny() {
        return C26011i.m64875h(this.f64951a.findAny());
    }

    public final /* synthetic */ OptionalLong findFirst() {
        return C26011i.m64875h(this.f64951a.findFirst());
    }

    public final /* synthetic */ LongStream flatMap(LongFunction longFunction) {
        return m65514w(this.f64951a.mo84519g(C25968f0.m64813a(longFunction)));
    }

    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f64951a.mo84486E(C25962c0.m64807a(longConsumer));
    }

    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f64951a.mo84487x(C25962c0.m64807a(longConsumer));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64951a.isParallel();
    }

    public final /* synthetic */ LongStream limit(long j) {
        return m65514w(this.f64951a.limit(j));
    }

    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return m65514w(this.f64951a.mo84505M(C25994s0.m64846c(longUnaryOperator)));
    }

    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C26042E.m64974w(this.f64951a.mo84504J(C25980l0.m64828b(longToDoubleFunction)));
    }

    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return IntStream.Wrapper.convert(this.f64951a.mo84506T(C25986o0.m64834b(longToIntFunction)));
    }

    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return Stream.Wrapper.convert(this.f64951a.mo84507U(C25968f0.m64813a(longFunction)));
    }

    public final /* synthetic */ OptionalLong max() {
        return C26011i.m64875h(this.f64951a.max());
    }

    public final /* synthetic */ OptionalLong min() {
        return C26011i.m64875h(this.f64951a.min());
    }

    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f64951a.mo84508a(C25974i0.m64817b(longPredicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C26168h.m65431w(this.f64951a.onClose(runnable));
    }

    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return m65514w(this.f64951a.mo84516f(C25962c0.m64807a(longConsumer)));
    }

    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f64951a.mo84522m(j, C25955Y.m64801a(longBinaryOperator));
    }

    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return C26011i.m64875h(this.f64951a.mo84515e(C25955Y.m64801a(longBinaryOperator)));
    }

    public final /* synthetic */ LongStream skip(long j) {
        return m65514w(this.f64951a.skip(j));
    }

    public final /* synthetic */ LongStream sorted() {
        return m65514w(this.f64951a.sorted());
    }

    public final /* synthetic */ long sum() {
        return this.f64951a.sum();
    }

    public final LongSummaryStatistics summaryStatistics() {
        this.f64951a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    public final /* synthetic */ long[] toArray() {
        return this.f64951a.toArray();
    }

    public final /* synthetic */ BaseStream unordered() {
        return C26168h.m65431w(this.f64951a.unordered());
    }
}
