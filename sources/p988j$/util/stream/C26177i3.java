package p988j$.util.stream;

import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.i3 */
public final /* synthetic */ class C26177i3 implements C26161f2 {

    /* renamed from: a */
    public final /* synthetic */ int f64935a;

    /* renamed from: b */
    public final /* synthetic */ C25966e0 f64936b;

    public /* synthetic */ C26177i3(C25966e0 e0Var, int i) {
        this.f64935a = i;
        this.f64936b = e0Var;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f64935a) {
            case 0:
                C26239v0.m65666l0();
                throw null;
            default:
                C26239v0.m65666l0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f64935a) {
            case 0:
                C26239v0.m65673s0();
                throw null;
            default:
                C26239v0.m65673s0();
                throw null;
        }
    }

    public final void accept(long j) {
        switch (this.f64935a) {
            case 0:
                ((C26089O2) this.f64936b).accept(j);
                return;
            default:
                this.f64936b.accept(j);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f64935a) {
            case 0:
                mo84344k((Long) obj);
                return;
            default:
                mo84344k((Long) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f64935a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84147d(long j) {
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        switch (this.f64935a) {
            case 0:
                e0Var.getClass();
                return new C25960b0(this, e0Var);
            default:
                e0Var.getClass();
                return new C25960b0(this, e0Var);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        switch (this.f64935a) {
            case 0:
                C26239v0.m65671q0(this, l);
                return;
            default:
                C26239v0.m65671q0(this, l);
                return;
        }
    }
}
