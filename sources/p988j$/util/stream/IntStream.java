package p988j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p988j$.util.C26009g;
import p988j$.util.C26011i;
import p988j$.util.C26012j;
import p988j$.util.C26013k;
import p988j$.util.C26264u;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25916A0;
import p988j$.util.function.C25923E;
import p988j$.util.function.C25925F;
import p988j$.util.function.C25927G;
import p988j$.util.function.C25928G0;
import p988j$.util.function.C25930H0;
import p988j$.util.function.C25931I;
import p988j$.util.function.C25933J;
import p988j$.util.function.C25935K;
import p988j$.util.function.C25937L;
import p988j$.util.function.C25939M;
import p988j$.util.function.C25941N;
import p988j$.util.function.C25943O;
import p988j$.util.function.C25945P;
import p988j$.util.function.C25947Q;
import p988j$.util.function.C25949S;
import p988j$.util.function.C25950T;
import p988j$.util.function.C25951U;
import p988j$.util.function.C25952V;
import p988j$.util.function.C25953W;
import p988j$.util.function.C25954X;
import p988j$.util.function.C25957a;
import p988j$.util.function.C26006y0;
import p988j$.util.function.C26008z0;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Supplier;
import p988j$.util.stream.Stream;

/* renamed from: j$.util.stream.IntStream */
public interface IntStream extends C26173i {

    /* renamed from: j$.util.stream.IntStream$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream range(int i, int i2) {
            return i >= i2 ? C26031B3.m64917b(Spliterators.m64703c()) : C26031B3.m64917b(new C26041D3(i, i2));
        }
    }

    /* renamed from: j$.util.stream.IntStream$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        final /* synthetic */ java.util.stream.IntStream f64764a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f64764a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        /* renamed from: A */
        public final /* synthetic */ Object mo84253A(Supplier supplier, C25916A0 a0, BiConsumer biConsumer) {
            return this.f64764a.collect(C25930H0.m64772a(supplier), C26008z0.m64864a(a0), C25957a.m64803a(biConsumer));
        }

        /* renamed from: D */
        public final /* synthetic */ boolean mo84254D(C25941N n) {
            return this.f64764a.anyMatch(C25939M.m64784a(n));
        }

        /* renamed from: O */
        public final /* synthetic */ void mo84255O(IntConsumer intConsumer) {
            this.f64764a.forEachOrdered(C25933J.m64775a(intConsumer));
        }

        /* renamed from: P */
        public final /* synthetic */ Stream mo84256P(IntFunction intFunction) {
            return C26104S2.m65177w(this.f64764a.mapToObj(C25935K.m64777a(intFunction)));
        }

        /* renamed from: S */
        public final /* synthetic */ IntStream mo84257S(IntFunction intFunction) {
            return convert(this.f64764a.flatMap(C25935K.m64777a(intFunction)));
        }

        /* renamed from: W */
        public final /* synthetic */ void mo84258W(IntConsumer intConsumer) {
            this.f64764a.forEach(C25933J.m64775a(intConsumer));
        }

        /* renamed from: X */
        public final /* synthetic */ C26047F mo84259X(C25947Q q) {
            return C26037D.m64950w(this.f64764a.mapToDouble(C25945P.m64790a(q)));
        }

        /* renamed from: a0 */
        public final /* synthetic */ IntStream mo84260a0(C25941N n) {
            return convert(this.f64764a.filter(C25939M.m64784a(n)));
        }

        public final /* synthetic */ C26047F asDoubleStream() {
            return C26037D.m64950w(this.f64764a.asDoubleStream());
        }

        public final /* synthetic */ C26194m0 asLongStream() {
            return C26184k0.m65488w(this.f64764a.asLongStream());
        }

        public final /* synthetic */ C26012j average() {
            return C26011i.m64869b(this.f64764a.average());
        }

        /* renamed from: b0 */
        public final /* synthetic */ C26013k mo84264b0(C25927G g) {
            return C26011i.m64870c(this.f64764a.reduce(C25925F.m64768a(g)));
        }

        public final /* synthetic */ Stream boxed() {
            return C26104S2.m65177w(this.f64764a.boxed());
        }

        /* renamed from: c0 */
        public final /* synthetic */ IntStream mo84266c0(IntConsumer intConsumer) {
            return convert(this.f64764a.peek(C25933J.m64775a(intConsumer)));
        }

        public final /* synthetic */ void close() {
            this.f64764a.close();
        }

        public final /* synthetic */ long count() {
            return this.f64764a.count();
        }

        /* renamed from: d */
        public final /* synthetic */ C26194m0 mo84268d(C25951U u) {
            return C26184k0.m65488w(this.f64764a.mapToLong(C25950T.m64795a(u)));
        }

        public final /* synthetic */ IntStream distinct() {
            return convert(this.f64764a.distinct());
        }

        public final /* synthetic */ C26013k findAny() {
            return C26011i.m64870c(this.f64764a.findAny());
        }

        public final /* synthetic */ C26013k findFirst() {
            return C26011i.m64870c(this.f64764a.findFirst());
        }

        public final /* synthetic */ boolean isParallel() {
            return this.f64764a.isParallel();
        }

        /* renamed from: k */
        public final /* synthetic */ IntStream mo84272k(C25954X x) {
            return convert(this.f64764a.map(C25953W.m64800a(x)));
        }

        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.f64764a.limit(j));
        }

        public final /* synthetic */ C26013k max() {
            return C26011i.m64870c(this.f64764a.max());
        }

        public final /* synthetic */ C26013k min() {
            return C26011i.m64870c(this.f64764a.min());
        }

        public final /* synthetic */ C26173i onClose(Runnable runnable) {
            return C26163g.m65417w(this.f64764a.onClose(runnable));
        }

        /* renamed from: r */
        public final /* synthetic */ int mo84276r(int i, C25927G g) {
            return this.f64764a.reduce(i, C25925F.m64768a(g));
        }

        /* renamed from: s */
        public final /* synthetic */ boolean mo84277s(C25941N n) {
            return this.f64764a.allMatch(C25939M.m64784a(n));
        }

        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.f64764a.skip(j));
        }

        public final /* synthetic */ IntStream sorted() {
            return convert(this.f64764a.sorted());
        }

        public final /* synthetic */ int sum() {
            return this.f64764a.sum();
        }

        public final C26009g summaryStatistics() {
            this.f64764a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        /* renamed from: t */
        public final /* synthetic */ boolean mo84282t(C25941N n) {
            return this.f64764a.noneMatch(C25939M.m64784a(n));
        }

        public final /* synthetic */ int[] toArray() {
            return this.f64764a.toArray();
        }

        public final /* synthetic */ C26173i unordered() {
            return C26163g.m65417w(this.f64764a.unordered());
        }
    }

    /* renamed from: j$.util.stream.IntStream$Wrapper */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f64764a : new Wrapper();
        }

        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.mo84277s(C25937L.m64778b(intPredicate));
        }

        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.mo84254D(C25937L.m64778b(intPredicate));
        }

        public final /* synthetic */ DoubleStream asDoubleStream() {
            return C26042E.m64974w(IntStream.this.asDoubleStream());
        }

        public final /* synthetic */ LongStream asLongStream() {
            return C26189l0.m65514w(IntStream.this.asLongStream());
        }

        public final /* synthetic */ OptionalDouble average() {
            return C26011i.m64873f(IntStream.this.average());
        }

        public final /* synthetic */ Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        public final /* synthetic */ Object collect(java.util.function.Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.mo84253A(C25928G0.m64771a(supplier), C26006y0.m64859a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.mo84260a0(C25937L.m64778b(intPredicate)));
        }

        public final /* synthetic */ OptionalInt findAny() {
            return C26011i.m64874g(IntStream.this.findAny());
        }

        public final /* synthetic */ OptionalInt findFirst() {
            return C26011i.m64874g(IntStream.this.findFirst());
        }

        public final /* synthetic */ java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            return convert(IntStream.this.mo84257S(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        public final /* synthetic */ void forEach(java.util.function.IntConsumer intConsumer) {
            IntStream.this.mo84258W(C25931I.m64773a(intConsumer));
        }

        public final /* synthetic */ void forEachOrdered(java.util.function.IntConsumer intConsumer) {
            IntStream.this.mo84255O(C25931I.m64773a(intConsumer));
        }

        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.mo84272k(C25952V.m64796d(intUnaryOperator)));
        }

        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return C26042E.m64974w(IntStream.this.mo84259X(C25943O.m64787b(intToDoubleFunction)));
        }

        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C26189l0.m65514w(IntStream.this.mo84268d(C25949S.m64794a(intToLongFunction)));
        }

        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mo84256P(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        public final /* synthetic */ OptionalInt max() {
            return C26011i.m64874g(IntStream.this.max());
        }

        public final /* synthetic */ OptionalInt min() {
            return C26011i.m64874g(IntStream.this.min());
        }

        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.mo84282t(C25937L.m64778b(intPredicate));
        }

        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C26168h.m65431w(IntStream.this.onClose(runnable));
        }

        public final /* synthetic */ java.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
            return convert(IntStream.this.mo84266c0(C25931I.m64773a(intConsumer)));
        }

        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.mo84276r(i, C25923E.m64766a(intBinaryOperator));
        }

        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return C26011i.m64874g(IntStream.this.mo84264b0(C25923E.m64766a(intBinaryOperator)));
        }

        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        public final /* synthetic */ BaseStream unordered() {
            return C26168h.m65431w(IntStream.this.unordered());
        }
    }

    /* renamed from: A */
    Object mo84253A(Supplier supplier, C25916A0 a0, BiConsumer biConsumer);

    /* renamed from: D */
    boolean mo84254D(C25941N n);

    /* renamed from: O */
    void mo84255O(IntConsumer intConsumer);

    /* renamed from: P */
    Stream mo84256P(IntFunction intFunction);

    /* renamed from: S */
    IntStream mo84257S(IntFunction intFunction);

    /* renamed from: W */
    void mo84258W(IntConsumer intConsumer);

    /* renamed from: X */
    C26047F mo84259X(C25947Q q);

    /* renamed from: a0 */
    IntStream mo84260a0(C25941N n);

    C26047F asDoubleStream();

    C26194m0 asLongStream();

    C26012j average();

    /* renamed from: b0 */
    C26013k mo84264b0(C25927G g);

    Stream boxed();

    /* renamed from: c0 */
    IntStream mo84266c0(IntConsumer intConsumer);

    long count();

    /* renamed from: d */
    C26194m0 mo84268d(C25951U u);

    IntStream distinct();

    C26013k findAny();

    C26013k findFirst();

    C26264u iterator();

    /* renamed from: k */
    IntStream mo84272k(C25954X x);

    IntStream limit(long j);

    C26013k max();

    C26013k min();

    IntStream parallel();

    /* renamed from: r */
    int mo84276r(int i, C25927G g);

    /* renamed from: s */
    boolean mo84277s(C25941N n);

    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    Spliterator.OfInt spliterator();

    int sum();

    C26009g summaryStatistics();

    /* renamed from: t */
    boolean mo84282t(C25941N n);

    int[] toArray();
}
