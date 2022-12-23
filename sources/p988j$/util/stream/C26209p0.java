package p988j$.util.stream;

import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25974i0;
import p988j$.util.function.C25978k0;

/* renamed from: j$.util.stream.p0 */
final class C26209p0 extends C26219r0 implements C26161f2 {

    /* renamed from: c */
    final /* synthetic */ C26224s0 f64986c;

    /* renamed from: d */
    final /* synthetic */ C25978k0 f64987d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26209p0(C25978k0 k0Var, C26224s0 s0Var) {
        super(s0Var);
        this.f64986c = s0Var;
        this.f64987d = k0Var;
    }

    public final void accept(long j) {
        if (!this.f65007a && ((C25974i0) this.f64987d).mo84070e(j) == this.f64986c.f65012a) {
            this.f65007a = true;
            this.f65008b = this.f64986c.f65013b;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }
}
