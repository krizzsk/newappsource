package p988j$.util.stream;

import p988j$.util.C26014l;
import p988j$.util.function.C25958a0;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.O1 */
final class C26088O1 implements C26092P1, C26161f2 {

    /* renamed from: a */
    private boolean f64792a;

    /* renamed from: b */
    private long f64793b;

    /* renamed from: c */
    final /* synthetic */ C25958a0 f64794c;

    C26088O1(C25958a0 a0Var) {
        this.f64794c = a0Var;
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
        if (this.f64792a) {
            this.f64792a = false;
        } else {
            j = this.f64794c.applyAsLong(this.f64793b, j);
        }
        this.f64793b = j;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64792a = true;
        this.f64793b = 0;
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
        return this.f64792a ? C26014l.m64884a() : C26014l.m64885d(this.f64793b);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        C26088O1 o1 = (C26088O1) p1;
        if (!o1.f64792a) {
            accept(o1.f64793b);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }
}
