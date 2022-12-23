package p988j$.util.stream;

import p988j$.util.function.C25922D0;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.x1 */
final class C26250x1 extends C26096Q1 implements C26092P1, C26161f2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f65056b;

    /* renamed from: c */
    final /* synthetic */ C25922D0 f65057c;

    /* renamed from: d */
    final /* synthetic */ C25967f f65058d;

    C26250x1(Supplier supplier, C25922D0 d0, C25967f fVar) {
        this.f65056b = supplier;
        this.f65057c = d0;
        this.f65058d = fVar;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final void accept(long j) {
        this.f65057c.accept(this.f64803a, j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64803a = this.f65056b.get();
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        this.f64803a = this.f65058d.apply(this.f64803a, ((C26250x1) p1).f64803a);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }
}
