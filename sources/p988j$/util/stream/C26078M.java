package p988j$.util.stream;

import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.M */
abstract class C26078M implements C26051F3 {

    /* renamed from: a */
    boolean f64782a;

    /* renamed from: b */
    Object f64783b;

    C26078M() {
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

    /* renamed from: accept */
    public final void mo84338m(Object obj) {
        if (!this.f64782a) {
            this.f64782a = true;
            this.f64783b = obj;
        }
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
        return this.f64782a;
    }
}
