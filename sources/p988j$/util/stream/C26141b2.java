package p988j$.util.stream;

import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.b2 */
public abstract class C26141b2 implements C26161f2 {

    /* renamed from: a */
    protected final C26166g2 f64882a;

    public C26141b2(C26166g2 g2Var) {
        g2Var.getClass();
        this.f64882a = g2Var;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public void end() {
        this.f64882a.end();
    }

    /* renamed from: f */
    public boolean mo84149f() {
        return this.f64882a.mo84149f();
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }
}
