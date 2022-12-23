package p988j$.util.stream;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.G1 */
final class C26054G1 extends C26096Q1 implements C26092P1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f64738b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f64739c;

    /* renamed from: d */
    final /* synthetic */ C25967f f64740d;

    C26054G1(Supplier supplier, BiConsumer biConsumer, C25967f fVar) {
        this.f64738b = supplier;
        this.f64739c = biConsumer;
        this.f64740d = fVar;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final void accept(Object obj) {
        this.f64739c.accept(this.f64803a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64803a = this.f64738b.get();
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        this.f64803a = this.f64740d.apply(this.f64803a, ((C26054G1) p1).f64803a);
    }
}
