package p988j$.util.stream;

import java.util.stream.LongStream;
import p988j$.util.C26010h;
import p988j$.util.C26011i;
import p988j$.util.C26012j;
import p988j$.util.C26014l;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25920C0;
import p988j$.util.function.C25922D0;
import p988j$.util.function.C25930H0;
import p988j$.util.function.C25956Z;
import p988j$.util.function.C25957a;
import p988j$.util.function.C25958a0;
import p988j$.util.function.C25964d0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25970g0;
import p988j$.util.function.C25972h0;
import p988j$.util.function.C25976j0;
import p988j$.util.function.C25978k0;
import p988j$.util.function.C25982m0;
import p988j$.util.function.C25984n0;
import p988j$.util.function.C25988p0;
import p988j$.util.function.C25990q0;
import p988j$.util.function.C25996t0;
import p988j$.util.function.C25998u0;
import p988j$.util.function.Supplier;
import p988j$.util.stream.IntStream;

/* renamed from: j$.util.stream.k0 */
public final /* synthetic */ class C26184k0 implements C26194m0 {

    /* renamed from: a */
    final /* synthetic */ LongStream f64945a;

    private /* synthetic */ C26184k0(LongStream longStream) {
        this.f64945a = longStream;
    }

    /* renamed from: w */
    public static /* synthetic */ C26194m0 m65488w(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C26189l0 ? ((C26189l0) longStream).f64951a : new C26184k0(longStream);
    }

    /* renamed from: E */
    public final /* synthetic */ void mo84486E(C25966e0 e0Var) {
        this.f64945a.forEach(C25964d0.m64810a(e0Var));
    }

    /* renamed from: J */
    public final /* synthetic */ C26047F mo84504J(C25984n0 n0Var) {
        return C26037D.m64950w(this.f64945a.mapToDouble(C25982m0.m64831a(n0Var)));
    }

    /* renamed from: M */
    public final /* synthetic */ C26194m0 mo84505M(C25998u0 u0Var) {
        return m65488w(this.f64945a.map(C25996t0.m64851a(u0Var)));
    }

    /* renamed from: T */
    public final /* synthetic */ IntStream mo84506T(C25990q0 q0Var) {
        return IntStream.VivifiedWrapper.convert(this.f64945a.mapToInt(C25988p0.m64836a(q0Var)));
    }

    /* renamed from: U */
    public final /* synthetic */ Stream mo84507U(C25972h0 h0Var) {
        return C26104S2.m65177w(this.f64945a.mapToObj(C25970g0.m64815a(h0Var)));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo84508a(C25978k0 k0Var) {
        return this.f64945a.noneMatch(C25976j0.m64823a(k0Var));
    }

    public final /* synthetic */ C26047F asDoubleStream() {
        return C26037D.m64950w(this.f64945a.asDoubleStream());
    }

    public final /* synthetic */ C26012j average() {
        return C26011i.m64869b(this.f64945a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return C26104S2.m65177w(this.f64945a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f64945a.close();
    }

    public final /* synthetic */ long count() {
        return this.f64945a.count();
    }

    /* renamed from: d0 */
    public final /* synthetic */ boolean mo84513d0(C25978k0 k0Var) {
        return this.f64945a.anyMatch(C25976j0.m64823a(k0Var));
    }

    public final /* synthetic */ C26194m0 distinct() {
        return m65488w(this.f64945a.distinct());
    }

    /* renamed from: e */
    public final /* synthetic */ C26014l mo84515e(C25958a0 a0Var) {
        return C26011i.m64871d(this.f64945a.reduce(C25956Z.m64802a(a0Var)));
    }

    /* renamed from: f */
    public final /* synthetic */ C26194m0 mo84516f(C25966e0 e0Var) {
        return m65488w(this.f64945a.peek(C25964d0.m64810a(e0Var)));
    }

    public final /* synthetic */ C26014l findAny() {
        return C26011i.m64871d(this.f64945a.findAny());
    }

    public final /* synthetic */ C26014l findFirst() {
        return C26011i.m64871d(this.f64945a.findFirst());
    }

    /* renamed from: g */
    public final /* synthetic */ C26194m0 mo84519g(C25972h0 h0Var) {
        return m65488w(this.f64945a.flatMap(C25970g0.m64815a(h0Var)));
    }

    /* renamed from: g0 */
    public final /* synthetic */ C26194m0 mo84520g0(C25978k0 k0Var) {
        return m65488w(this.f64945a.filter(C25976j0.m64823a(k0Var)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64945a.isParallel();
    }

    public final /* synthetic */ C26194m0 limit(long j) {
        return m65488w(this.f64945a.limit(j));
    }

    /* renamed from: m */
    public final /* synthetic */ long mo84522m(long j, C25958a0 a0Var) {
        return this.f64945a.reduce(j, C25956Z.m64802a(a0Var));
    }

    public final /* synthetic */ C26014l max() {
        return C26011i.m64871d(this.f64945a.max());
    }

    public final /* synthetic */ C26014l min() {
        return C26011i.m64871d(this.f64945a.min());
    }

    public final /* synthetic */ C26173i onClose(Runnable runnable) {
        return C26163g.m65417w(this.f64945a.onClose(runnable));
    }

    public final /* synthetic */ C26194m0 skip(long j) {
        return m65488w(this.f64945a.skip(j));
    }

    public final /* synthetic */ C26194m0 sorted() {
        return m65488w(this.f64945a.sorted());
    }

    public final /* synthetic */ long sum() {
        return this.f64945a.sum();
    }

    public final C26010h summaryStatistics() {
        this.f64945a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    public final /* synthetic */ long[] toArray() {
        return this.f64945a.toArray();
    }

    public final /* synthetic */ C26173i unordered() {
        return C26163g.m65417w(this.f64945a.unordered());
    }

    /* renamed from: x */
    public final /* synthetic */ void mo84487x(C25966e0 e0Var) {
        this.f64945a.forEachOrdered(C25964d0.m64810a(e0Var));
    }

    /* renamed from: y */
    public final /* synthetic */ Object mo84530y(Supplier supplier, C25922D0 d0, BiConsumer biConsumer) {
        return this.f64945a.collect(C25930H0.m64772a(supplier), C25920C0.m64764a(d0), C25957a.m64803a(biConsumer));
    }

    /* renamed from: z */
    public final /* synthetic */ boolean mo84531z(C25978k0 k0Var) {
        return this.f64945a.allMatch(C25976j0.m64823a(k0Var));
    }
}
