package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p988j$.util.Spliterator;
import p988j$.util.function.C25967f;
import p988j$.util.function.C25972h0;

/* renamed from: j$.util.stream.L0 */
class C26075L0 extends C26158f {

    /* renamed from: h */
    protected final C26239v0 f64775h;

    /* renamed from: i */
    protected final C25972h0 f64776i;

    /* renamed from: j */
    protected final C25967f f64777j;

    C26075L0(C26075L0 l0, Spliterator spliterator) {
        super((C26158f) l0, spliterator);
        this.f64775h = l0.f64775h;
        this.f64776i = l0.f64776i;
        this.f64777j = l0.f64777j;
    }

    C26075L0(C26239v0 v0Var, Spliterator spliterator, C25972h0 h0Var, C26067J0 j0) {
        super(v0Var, spliterator);
        this.f64775h = v0Var;
        this.f64776i = h0Var;
        this.f64777j = j0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo84333a() {
        C26259z0 z0Var = (C26259z0) this.f64776i.apply(this.f64775h.mo84462S0(this.f64914b));
        this.f64775h.mo84464g1(this.f64914b, z0Var);
        return z0Var.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C26158f mo84334d(Spliterator spliterator) {
        return new C26075L0(this, spliterator);
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C26158f fVar = this.f64916d;
        if (!(fVar == null)) {
            mo84478e((C26043E0) this.f64777j.apply((C26043E0) ((C26075L0) fVar).mo84476b(), (C26043E0) ((C26075L0) this.f64917e).mo84476b()));
        }
        super.onCompletion(countedCompleter);
    }
}
