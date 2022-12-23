package p988j$.util.stream;

import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;

/* renamed from: j$.util.stream.e0 */
public final /* synthetic */ class C26154e0 implements C25966e0 {

    /* renamed from: a */
    public final /* synthetic */ int f64908a;

    /* renamed from: b */
    public final /* synthetic */ C26166g2 f64909b;

    public /* synthetic */ C26154e0(int i, C26166g2 g2Var) {
        this.f64908a = i;
        this.f64909b = g2Var;
    }

    public final void accept(long j) {
        switch (this.f64908a) {
            case 0:
                this.f64909b.accept(j);
                return;
            default:
                ((C26159f0) this.f64909b).f64882a.accept(j);
                return;
        }
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        switch (this.f64908a) {
            case 0:
                e0Var.getClass();
                return new C25960b0(this, e0Var);
            default:
                e0Var.getClass();
                return new C25960b0(this, e0Var);
        }
    }
}
