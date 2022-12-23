package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Predicate;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.H */
final class C26057H implements C26046E3 {

    /* renamed from: a */
    final boolean f64743a;

    /* renamed from: b */
    final Object f64744b;

    /* renamed from: c */
    final Predicate f64745c;

    /* renamed from: d */
    final Supplier f64746d;

    C26057H(boolean z, int i, Object obj, Predicate predicate, C26138b bVar) {
        this.f64743a = z;
        this.f64744b = obj;
        this.f64745c = predicate;
        this.f64746d = bVar;
    }

    /* renamed from: L */
    public final int mo84247L() {
        return C26116V2.f64849u | (this.f64743a ? 0 : C26116V2.f64846r);
    }

    /* renamed from: j0 */
    public final Object mo84248j0(C26239v0 v0Var, Spliterator spliterator) {
        C26051F3 f3 = (C26051F3) this.f64746d.get();
        v0Var.mo84464g1(spliterator, f3);
        Object obj = f3.get();
        return obj != null ? obj : this.f64744b;
    }

    /* renamed from: w */
    public final Object mo84249w(C26239v0 v0Var, Spliterator spliterator) {
        return new C26082N(this, v0Var, spliterator).invoke();
    }
}
