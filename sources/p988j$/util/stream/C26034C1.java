package p988j$.util.stream;

import p988j$.util.function.C25967f;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.C26004x0;
import p988j$.util.function.Consumer;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.C1 */
final class C26034C1 extends C26096Q1 implements C26092P1, C26151d2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f64705b;

    /* renamed from: c */
    final /* synthetic */ C26004x0 f64706c;

    /* renamed from: d */
    final /* synthetic */ C25967f f64707d;

    C26034C1(Supplier supplier, C26004x0 x0Var, C25967f fVar) {
        this.f64705b = supplier;
        this.f64706c = x0Var;
        this.f64707d = fVar;
    }

    public final void accept(double d) {
        this.f64706c.accept(this.f64803a, d);
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84151m((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64803a = this.f64705b.get();
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        this.f64803a = this.f64707d.apply(this.f64803a, ((C26034C1) p1).f64803a);
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        C26239v0.m65667m0(this, d);
    }
}
