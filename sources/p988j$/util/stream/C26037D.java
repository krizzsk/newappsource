package p988j$.util.stream;

import java.util.stream.DoubleStream;
import p988j$.util.C25914f;
import p988j$.util.C26011i;
import p988j$.util.C26012j;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25915A;
import p988j$.util.function.C25917B;
import p988j$.util.function.C25930H0;
import p988j$.util.function.C25957a;
import p988j$.util.function.C25971h;
import p988j$.util.function.C25973i;
import p988j$.util.function.C25979l;
import p988j$.util.function.C25981m;
import p988j$.util.function.C25985o;
import p988j$.util.function.C25987p;
import p988j$.util.function.C25991r;
import p988j$.util.function.C25993s;
import p988j$.util.function.C25997u;
import p988j$.util.function.C25999v;
import p988j$.util.function.C26002w0;
import p988j$.util.function.C26003x;
import p988j$.util.function.C26004x0;
import p988j$.util.function.C26005y;
import p988j$.util.function.Supplier;
import p988j$.util.stream.IntStream;

/* renamed from: j$.util.stream.D */
public final /* synthetic */ class C26037D implements C26047F {

    /* renamed from: a */
    final /* synthetic */ DoubleStream f64713a;

    private /* synthetic */ C26037D(DoubleStream doubleStream) {
        this.f64713a = doubleStream;
    }

    /* renamed from: w */
    public static /* synthetic */ C26047F m64950w(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C26042E ? ((C26042E) doubleStream).f64721a : new C26037D(doubleStream);
    }

    /* renamed from: B */
    public final /* synthetic */ IntStream mo84152B(C25999v vVar) {
        return IntStream.VivifiedWrapper.convert(this.f64713a.mapToInt(C25997u.m64852a(vVar)));
    }

    /* renamed from: H */
    public final /* synthetic */ void mo84153H(C25981m mVar) {
        this.f64713a.forEach(C25979l.m64827a(mVar));
    }

    /* renamed from: N */
    public final /* synthetic */ C26012j mo84154N(C25973i iVar) {
        return C26011i.m64869b(this.f64713a.reduce(C25971h.m64816a(iVar)));
    }

    /* renamed from: Q */
    public final /* synthetic */ double mo84155Q(double d, C25973i iVar) {
        return this.f64713a.reduce(d, C25971h.m64816a(iVar));
    }

    /* renamed from: R */
    public final /* synthetic */ boolean mo84156R(C25993s sVar) {
        return this.f64713a.noneMatch(C25991r.m64842a(sVar));
    }

    /* renamed from: V */
    public final /* synthetic */ boolean mo84157V(C25993s sVar) {
        return this.f64713a.allMatch(C25991r.m64842a(sVar));
    }

    public final /* synthetic */ C26012j average() {
        return C26011i.m64869b(this.f64713a.average());
    }

    /* renamed from: b */
    public final /* synthetic */ C26047F mo84159b(C25981m mVar) {
        return m64950w(this.f64713a.peek(C25979l.m64827a(mVar)));
    }

    public final /* synthetic */ Stream boxed() {
        return C26104S2.m65177w(this.f64713a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f64713a.close();
    }

    public final /* synthetic */ long count() {
        return this.f64713a.count();
    }

    public final /* synthetic */ C26047F distinct() {
        return m64950w(this.f64713a.distinct());
    }

    public final /* synthetic */ C26012j findAny() {
        return C26011i.m64869b(this.f64713a.findAny());
    }

    public final /* synthetic */ C26012j findFirst() {
        return C26011i.m64869b(this.f64713a.findFirst());
    }

    /* renamed from: h */
    public final /* synthetic */ C26047F mo84166h(C25993s sVar) {
        return m64950w(this.f64713a.filter(C25991r.m64842a(sVar)));
    }

    /* renamed from: i */
    public final /* synthetic */ C26047F mo84167i(C25987p pVar) {
        return m64950w(this.f64713a.flatMap(C25985o.m64833a(pVar)));
    }

    /* renamed from: i0 */
    public final /* synthetic */ void mo84168i0(C25981m mVar) {
        this.f64713a.forEachOrdered(C25979l.m64827a(mVar));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64713a.isParallel();
    }

    /* renamed from: j */
    public final /* synthetic */ C26194m0 mo84170j(C26005y yVar) {
        return C26184k0.m65488w(this.f64713a.mapToLong(C26003x.m64858a(yVar)));
    }

    public final /* synthetic */ C26047F limit(long j) {
        return m64950w(this.f64713a.limit(j));
    }

    public final /* synthetic */ C26012j max() {
        return C26011i.m64869b(this.f64713a.max());
    }

    public final /* synthetic */ C26012j min() {
        return C26011i.m64869b(this.f64713a.min());
    }

    /* renamed from: o */
    public final /* synthetic */ Object mo84177o(Supplier supplier, C26004x0 x0Var, BiConsumer biConsumer) {
        return this.f64713a.collect(C25930H0.m64772a(supplier), C26002w0.m64857a(x0Var), C25957a.m64803a(biConsumer));
    }

    public final /* synthetic */ C26173i onClose(Runnable runnable) {
        return C26163g.m65417w(this.f64713a.onClose(runnable));
    }

    /* renamed from: p */
    public final /* synthetic */ C26047F mo84178p(C25917B b) {
        return m64950w(this.f64713a.map(C25915A.m64762a(b)));
    }

    /* renamed from: q */
    public final /* synthetic */ Stream mo84179q(C25987p pVar) {
        return C26104S2.m65177w(this.f64713a.mapToObj(C25985o.m64833a(pVar)));
    }

    public final /* synthetic */ C26047F skip(long j) {
        return m64950w(this.f64713a.skip(j));
    }

    public final /* synthetic */ C26047F sorted() {
        return m64950w(this.f64713a.sorted());
    }

    public final /* synthetic */ double sum() {
        return this.f64713a.sum();
    }

    public final C25914f summaryStatistics() {
        this.f64713a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ double[] toArray() {
        return this.f64713a.toArray();
    }

    public final /* synthetic */ C26173i unordered() {
        return C26163g.m65417w(this.f64713a.unordered());
    }

    /* renamed from: v */
    public final /* synthetic */ boolean mo84187v(C25993s sVar) {
        return this.f64713a.anyMatch(C25991r.m64842a(sVar));
    }
}
