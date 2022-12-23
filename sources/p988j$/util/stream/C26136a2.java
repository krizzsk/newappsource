package p988j$.util.stream;

import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.a2 */
public abstract class C26136a2 implements C26156e2 {

    /* renamed from: a */
    protected final C26166g2 f64879a;

    public C26136a2(C26166g2 g2Var) {
        g2Var.getClass();
        this.f64879a = g2Var;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
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

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }

    public void end() {
        this.f64879a.end();
    }

    /* renamed from: f */
    public boolean mo84149f() {
        return this.f64879a.mo84149f();
    }
}
