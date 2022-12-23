package p988j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import p988j$.util.C25865M;
import p988j$.util.C26011i;
import p988j$.util.Optional;
import p988j$.util.Spliterator;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25921D;
import p988j$.util.function.C25926F0;
import p988j$.util.function.C25930H0;
import p988j$.util.function.C25934J0;
import p988j$.util.function.C25935K;
import p988j$.util.function.C25936K0;
import p988j$.util.function.C25940M0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25946P0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.C25957a;
import p988j$.util.function.C25959b;
import p988j$.util.function.C25965e;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.function.Supplier;
import p988j$.util.stream.IntStream;
import p988j$.util.stream.Stream;

/* renamed from: j$.util.stream.S2 */
public final /* synthetic */ class C26104S2 implements Stream {

    /* renamed from: a */
    final /* synthetic */ Stream f64814a;

    private /* synthetic */ C26104S2(Stream stream) {
        this.f64814a = stream;
    }

    /* renamed from: w */
    public static /* synthetic */ Stream m65177w(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C26104S2(stream);
    }

    /* renamed from: C */
    public final /* synthetic */ boolean mo84370C(Predicate predicate) {
        return this.f64814a.anyMatch(C25926F0.m64769a(predicate));
    }

    /* renamed from: F */
    public final /* synthetic */ void mo84371F(Consumer consumer) {
        this.f64814a.forEachOrdered(Consumer.Wrapper.convert(consumer));
    }

    /* renamed from: G */
    public final /* synthetic */ Object mo84372G(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f64814a.collect(C25930H0.m64772a(supplier), C25957a.m64803a(biConsumer), C25957a.m64803a(biConsumer2));
    }

    /* renamed from: I */
    public final /* synthetic */ IntStream mo84373I(C25942N0 n0) {
        return IntStream.VivifiedWrapper.convert(this.f64814a.mapToInt(C25940M0.m64786a(n0)));
    }

    /* renamed from: K */
    public final /* synthetic */ Optional mo84374K(C25967f fVar) {
        return C26011i.m64868a(this.f64814a.reduce(C25965e.m64811a(fVar)));
    }

    /* renamed from: Y */
    public final /* synthetic */ boolean mo84375Y(Predicate predicate) {
        return this.f64814a.allMatch(C25926F0.m64769a(predicate));
    }

    /* renamed from: Z */
    public final /* synthetic */ C26194m0 mo84376Z(Function function) {
        return C26184k0.m65488w(this.f64814a.flatMapToLong(C25921D.m64765a(function)));
    }

    /* renamed from: c */
    public final /* synthetic */ IntStream mo84377c(Function function) {
        return IntStream.VivifiedWrapper.convert(this.f64814a.flatMapToInt(C25921D.m64765a(function)));
    }

    public final /* synthetic */ void close() {
        this.f64814a.close();
    }

    public final /* synthetic */ Object collect(Collector collector) {
        return this.f64814a.collect(C26188l.m65513a(collector));
    }

    public final /* synthetic */ long count() {
        return this.f64814a.count();
    }

    public final /* synthetic */ Stream distinct() {
        return m65177w(this.f64814a.distinct());
    }

    /* renamed from: e0 */
    public final /* synthetic */ boolean mo84381e0(Predicate predicate) {
        return this.f64814a.noneMatch(C25926F0.m64769a(predicate));
    }

    /* renamed from: f0 */
    public final /* synthetic */ C26194m0 mo84382f0(C25948Q0 q0) {
        return C26184k0.m65488w(this.f64814a.mapToLong(C25946P0.m64791a(q0)));
    }

    public final /* synthetic */ Stream filter(Predicate predicate) {
        return m65177w(this.f64814a.filter(C25926F0.m64769a(predicate)));
    }

    public final /* synthetic */ Optional findAny() {
        return C26011i.m64868a(this.f64814a.findAny());
    }

    public final /* synthetic */ Optional findFirst() {
        return C26011i.m64868a(this.f64814a.findFirst());
    }

    public final /* synthetic */ Stream flatMap(Function function) {
        return m65177w(this.f64814a.flatMap(C25921D.m64765a(function)));
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f64814a.forEach(Consumer.Wrapper.convert(consumer));
    }

    /* renamed from: h0 */
    public final /* synthetic */ C26047F mo84388h0(C25936K0 k0) {
        return C26037D.m64950w(this.f64814a.mapToDouble(C25934J0.m64776a(k0)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64814a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f64814a.iterator();
    }

    /* renamed from: k0 */
    public final /* synthetic */ Object mo84389k0(Object obj, C25967f fVar) {
        return this.f64814a.reduce(obj, C25965e.m64811a(fVar));
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo84390l(Object obj, BiFunction biFunction, C25967f fVar) {
        return this.f64814a.reduce(obj, C25959b.m64804a(biFunction), C25965e.m64811a(fVar));
    }

    public final /* synthetic */ Stream limit(long j) {
        return m65177w(this.f64814a.limit(j));
    }

    public final /* synthetic */ Stream map(Function function) {
        return m65177w(this.f64814a.map(C25921D.m64765a(function)));
    }

    public final /* synthetic */ Optional max(Comparator comparator) {
        return C26011i.m64868a(this.f64814a.max(comparator));
    }

    public final /* synthetic */ Optional min(Comparator comparator) {
        return C26011i.m64868a(this.f64814a.min(comparator));
    }

    /* renamed from: n */
    public final /* synthetic */ C26047F mo84395n(Function function) {
        return C26037D.m64950w(this.f64814a.flatMapToDouble(C25921D.m64765a(function)));
    }

    public final /* synthetic */ C26173i onClose(Runnable runnable) {
        return C26163g.m65417w(this.f64814a.onClose(runnable));
    }

    public final /* synthetic */ C26173i parallel() {
        return C26163g.m65417w(this.f64814a.parallel());
    }

    public final /* synthetic */ C26173i sequential() {
        return C26163g.m65417w(this.f64814a.sequential());
    }

    public final /* synthetic */ Stream skip(long j) {
        return m65177w(this.f64814a.skip(j));
    }

    public final /* synthetic */ Stream sorted() {
        return m65177w(this.f64814a.sorted());
    }

    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m65177w(this.f64814a.sorted(comparator));
    }

    public final /* synthetic */ Spliterator spliterator() {
        return C25865M.m64692d(this.f64814a.spliterator());
    }

    public final /* synthetic */ Object[] toArray() {
        return this.f64814a.toArray();
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f64814a.toArray(C25935K.m64777a(intFunction));
    }

    /* renamed from: u */
    public final /* synthetic */ Stream mo84401u(Consumer consumer) {
        return m65177w(this.f64814a.peek(Consumer.Wrapper.convert(consumer)));
    }

    public final /* synthetic */ C26173i unordered() {
        return C26163g.m65417w(this.f64814a.unordered());
    }
}
