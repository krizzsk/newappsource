package p988j$.util.stream;

import p988j$.util.Optional;
import p988j$.util.function.C25967f;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.E1 */
final class C26044E1 implements C26092P1 {

    /* renamed from: a */
    private boolean f64722a;

    /* renamed from: b */
    private Object f64723b;

    /* renamed from: c */
    final /* synthetic */ C25967f f64724c;

    C26044E1(C25967f fVar) {
        this.f64724c = fVar;
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
        if (this.f64722a) {
            this.f64722a = false;
        } else {
            obj = this.f64724c.apply(this.f64723b, obj);
        }
        this.f64723b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64722a = true;
        this.f64723b = null;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final Object get() {
        return this.f64722a ? Optional.m64693a() : Optional.m64694d(this.f64723b);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        C26044E1 e1 = (C26044E1) p1;
        if (!e1.f64722a) {
            accept(e1.f64723b);
        }
    }
}
