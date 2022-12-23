package p988j$.util.stream;

import p988j$.util.function.C25958a0;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.N1 */
final class C26084N1 implements C26092P1, C26161f2 {

    /* renamed from: a */
    private long f64787a;

    /* renamed from: b */
    final /* synthetic */ long f64788b;

    /* renamed from: c */
    final /* synthetic */ C25958a0 f64789c;

    C26084N1(long j, C25958a0 a0Var) {
        this.f64788b = j;
        this.f64789c = a0Var;
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
        this.f64787a = this.f64789c.applyAsLong(this.f64787a, j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64787a = this.f64788b;
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

    public final Object get() {
        return Long.valueOf(this.f64787a);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        accept(((C26084N1) p1).f64787a);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }
}
