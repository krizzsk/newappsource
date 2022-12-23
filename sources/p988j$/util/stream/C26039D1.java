package p988j$.util.stream;

import p988j$.util.function.BiFunction;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.D1 */
final class C26039D1 extends C26096Q1 implements C26092P1 {

    /* renamed from: b */
    final /* synthetic */ Object f64714b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f64715c;

    /* renamed from: d */
    final /* synthetic */ C25967f f64716d;

    C26039D1(Object obj, BiFunction biFunction, C25967f fVar) {
        this.f64714b = obj;
        this.f64715c = biFunction;
        this.f64716d = fVar;
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
        this.f64803a = this.f64715c.apply(this.f64803a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64803a = this.f64714b;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        this.f64803a = this.f64716d.apply(this.f64803a, ((C26039D1) p1).f64803a);
    }
}
