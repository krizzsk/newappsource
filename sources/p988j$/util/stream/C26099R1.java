package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.R1 */
final class C26099R1 extends C26158f {

    /* renamed from: h */
    private final C26239v0 f64808h;

    C26099R1(C26099R1 r1, Spliterator spliterator) {
        super((C26158f) r1, spliterator);
        this.f64808h = r1.f64808h;
    }

    C26099R1(C26239v0 v0Var, C26239v0 v0Var2, Spliterator spliterator) {
        super(v0Var2, spliterator);
        this.f64808h = v0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo84333a() {
        C26239v0 v0Var = this.f64913a;
        C26092P1 f1 = this.f64808h.mo84140f1();
        v0Var.mo84464g1(this.f64914b, f1);
        return f1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C26158f mo84334d(Spliterator spliterator) {
        return new C26099R1(this, spliterator);
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C26158f fVar = this.f64916d;
        if (!(fVar == null)) {
            C26092P1 p1 = (C26092P1) ((C26099R1) fVar).mo84476b();
            p1.mo84150i((C26092P1) ((C26099R1) this.f64917e).mo84476b());
            mo84478e(p1);
        }
        super.onCompletion(countedCompleter);
    }
}
