package p988j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p988j$.util.C26011i;
import p988j$.util.Spliterator;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25928G0;
import p988j$.util.function.C25932I0;
import p988j$.util.function.C25936K0;
import p988j$.util.function.C25938L0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25944O0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.C25963d;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.stream.IntStream;

/* renamed from: j$.util.stream.Stream */
public interface Stream<T> extends C26173i {

    /* renamed from: j$.util.stream.Stream$Wrapper */
    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof C26104S2 ? ((C26104S2) stream).f64814a : new Wrapper();
        }

        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.mo84375Y(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return Stream.this.mo84370C(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.mo84372G(C25928G0.m64771a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.collect(C26183k.m65487a(collector));
        }

        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(Stream.this.filter(Predicate.VivifiedWrapper.convert(predicate)));
        }

        public final /* synthetic */ Optional findAny() {
            return C26011i.m64872e(Stream.this.findAny());
        }

        public final /* synthetic */ Optional findFirst() {
            return C26011i.m64872e(Stream.this.findFirst());
        }

        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.flatMap(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
            return C26042E.m64974w(Stream.this.mo84395n(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
            return IntStream.Wrapper.convert(Stream.this.mo84377c(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
            return C26189l0.m65514w(Stream.this.mo84376Z(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            Stream.this.mo84371F(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        public final /* synthetic */ java.util.stream.Stream limit(long j) {
            return convert(Stream.this.limit(j));
        }

        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(Stream.this.map(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return C26042E.m64974w(Stream.this.mo84388h0(C25932I0.m64774a(toDoubleFunction)));
        }

        public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
            return IntStream.Wrapper.convert(Stream.this.mo84373I(C25938L0.m64783a(toIntFunction)));
        }

        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C26189l0.m65514w(Stream.this.mo84382f0(C25944O0.m64789a(toLongFunction)));
        }

        public final /* synthetic */ Optional max(Comparator comparator) {
            return C26011i.m64872e(Stream.this.max(comparator));
        }

        public final /* synthetic */ Optional min(Comparator comparator) {
            return C26011i.m64872e(Stream.this.min(comparator));
        }

        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return Stream.this.mo84381e0(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C26168h.m65431w(Stream.this.onClose(runnable));
        }

        public final /* synthetic */ BaseStream parallel() {
            return C26168h.m65431w(Stream.this.parallel());
        }

        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(Stream.this.mo84401u(Consumer.VivifiedWrapper.convert(consumer)));
        }

        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.mo84390l(obj, BiFunction.VivifiedWrapper.convert(biFunction), C25963d.m64809a(binaryOperator));
        }

        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.mo84389k0(obj, C25963d.m64809a(binaryOperator));
        }

        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return C26011i.m64872e(Stream.this.mo84374K(C25963d.m64809a(binaryOperator)));
        }

        public final /* synthetic */ BaseStream sequential() {
            return C26168h.m65431w(Stream.this.sequential());
        }

        public final /* synthetic */ java.util.stream.Stream skip(long j) {
            return convert(Stream.this.skip(j));
        }

        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(IntFunction.VivifiedWrapper.convert(intFunction));
        }

        public final /* synthetic */ BaseStream unordered() {
            return C26168h.m65431w(Stream.this.unordered());
        }
    }

    /* renamed from: C */
    boolean mo84370C(p988j$.util.function.Predicate predicate);

    /* renamed from: F */
    void mo84371F(p988j$.util.function.Consumer consumer);

    /* renamed from: G */
    Object mo84372G(p988j$.util.function.Supplier supplier, p988j$.util.function.BiConsumer biConsumer, p988j$.util.function.BiConsumer biConsumer2);

    /* renamed from: I */
    IntStream mo84373I(C25942N0 n0);

    /* renamed from: K */
    p988j$.util.Optional mo84374K(C25967f fVar);

    /* renamed from: Y */
    boolean mo84375Y(p988j$.util.function.Predicate predicate);

    /* renamed from: Z */
    C26194m0 mo84376Z(p988j$.util.function.Function function);

    /* renamed from: c */
    IntStream mo84377c(p988j$.util.function.Function function);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream distinct();

    /* renamed from: e0 */
    boolean mo84381e0(p988j$.util.function.Predicate predicate);

    /* renamed from: f0 */
    C26194m0 mo84382f0(C25948Q0 q0);

    Stream<T> filter(p988j$.util.function.Predicate<? super T> predicate);

    p988j$.util.Optional findAny();

    p988j$.util.Optional findFirst();

    <R> Stream<R> flatMap(p988j$.util.function.Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(p988j$.util.function.Consumer consumer);

    /* renamed from: h0 */
    C26047F mo84388h0(C25936K0 k0);

    /* renamed from: k0 */
    Object mo84389k0(Object obj, C25967f fVar);

    /* renamed from: l */
    Object mo84390l(Object obj, p988j$.util.function.BiFunction biFunction, C25967f fVar);

    Stream limit(long j);

    <R> Stream<R> map(p988j$.util.function.Function<? super T, ? extends R> function);

    p988j$.util.Optional max(Comparator comparator);

    p988j$.util.Optional min(Comparator comparator);

    /* renamed from: n */
    C26047F mo84395n(p988j$.util.function.Function function);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object[] toArray();

    Object[] toArray(p988j$.util.function.IntFunction intFunction);

    /* renamed from: u */
    Stream mo84401u(p988j$.util.function.Consumer consumer);
}
