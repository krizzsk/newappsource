package p988j$.util.stream;

import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.r0 */
abstract class C26219r0 implements C26166g2 {

    /* renamed from: a */
    boolean f65007a;

    /* renamed from: b */
    boolean f65008b;

    C26219r0(C26224s0 s0Var) {
        this.f65008b = !s0Var.f65013b;
    }

    public /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84147d(long j) {
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final boolean mo84149f() {
        return this.f65007a;
    }
}
