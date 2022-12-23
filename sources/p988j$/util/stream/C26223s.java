package p988j$.util.stream;

import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;

/* renamed from: j$.util.stream.s */
public final /* synthetic */ class C26223s implements C25981m {

    /* renamed from: a */
    public final /* synthetic */ int f65009a;

    /* renamed from: b */
    public final /* synthetic */ C26166g2 f65010b;

    public /* synthetic */ C26223s(int i, C26166g2 g2Var) {
        this.f65009a = i;
        this.f65010b = g2Var;
    }

    public final void accept(double d) {
        switch (this.f65009a) {
            case 0:
                this.f65010b.accept(d);
                return;
            default:
                ((C26228t) this.f65010b).f64873a.accept(d);
                return;
        }
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        switch (this.f65009a) {
            case 0:
                mVar.getClass();
                return new C25975j(this, mVar);
            default:
                mVar.getClass();
                return new C25975j(this, mVar);
        }
    }
}
