package p988j$.util.stream;

import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.c2 */
public abstract class C26146c2 implements C26166g2 {

    /* renamed from: a */
    protected final C26166g2 f64895a;

    public C26146c2(C26166g2 g2Var) {
        g2Var.getClass();
        this.f64895a = g2Var;
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public void end() {
        this.f64895a.end();
    }

    /* renamed from: f */
    public boolean mo84149f() {
        return this.f64895a.mo84149f();
    }
}
