package p988j$.util.stream;

import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.C25989q;
import p988j$.util.function.C25993s;

/* renamed from: j$.util.stream.q0 */
final class C26214q0 extends C26219r0 implements C26151d2 {

    /* renamed from: c */
    final /* synthetic */ C26224s0 f64990c;

    /* renamed from: d */
    final /* synthetic */ C25993s f64991d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26214q0(C25993s sVar, C26224s0 s0Var) {
        super(s0Var);
        this.f64990c = s0Var;
        this.f64991d = sVar;
    }

    public final void accept(double d) {
        if (!this.f65007a && ((C25989q) this.f64991d).mo84086e(d) == this.f64990c.f65012a) {
            this.f65007a = true;
            this.f65008b = this.f64990c.f65013b;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84151m((Double) obj);
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        C26239v0.m65667m0(this, d);
    }
}
