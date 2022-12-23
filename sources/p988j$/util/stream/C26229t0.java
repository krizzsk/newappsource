package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.t0 */
final class C26229t0 implements C26046E3 {

    /* renamed from: a */
    final C26224s0 f65022a;

    /* renamed from: b */
    final Supplier f65023b;

    C26229t0(int i, C26224s0 s0Var, C26198n nVar) {
        this.f65022a = s0Var;
        this.f65023b = nVar;
    }

    /* renamed from: L */
    public final int mo84247L() {
        return C26116V2.f64849u | C26116V2.f64846r;
    }

    /* renamed from: j0 */
    public final Object mo84248j0(C26239v0 v0Var, Spliterator spliterator) {
        C26219r0 r0Var = (C26219r0) this.f65023b.get();
        v0Var.mo84464g1(spliterator, r0Var);
        return Boolean.valueOf(r0Var.f65008b);
    }

    /* renamed from: w */
    public final Object mo84249w(C26239v0 v0Var, Spliterator spliterator) {
        return (Boolean) new C26234u0(this, v0Var, spliterator).invoke();
    }
}
