package p988j$.util.stream;

import p988j$.util.function.C25916A0;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.L1 */
final class C26076L1 extends C26096Q1 implements C26092P1, C26156e2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f64778b;

    /* renamed from: c */
    final /* synthetic */ C25916A0 f64779c;

    /* renamed from: d */
    final /* synthetic */ C25967f f64780d;

    C26076L1(Supplier supplier, C25916A0 a0, C25967f fVar) {
        this.f64778b = supplier;
        this.f64779c = a0;
        this.f64780d = fVar;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final void accept(int i) {
        this.f64779c.accept(this.f64803a, i);
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64803a = this.f64778b.get();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        this.f64803a = this.f64780d.apply(this.f64803a, ((C26076L1) p1).f64803a);
    }
}
