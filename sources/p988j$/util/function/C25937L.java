package p988j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.L */
public final /* synthetic */ class C25937L implements C25941N {

    /* renamed from: a */
    final /* synthetic */ IntPredicate f64627a;

    private /* synthetic */ C25937L(IntPredicate intPredicate) {
        this.f64627a = intPredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ C25941N m64778b(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return intPredicate instanceof C25939M ? ((C25939M) intPredicate).f64629a : new C25937L(intPredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ C25941N mo84031a(C25941N n) {
        return m64778b(this.f64627a.and(C25939M.m64784a(n)));
    }

    /* renamed from: c */
    public final /* synthetic */ C25941N mo84032c() {
        return m64778b(this.f64627a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ C25941N mo84033d(C25941N n) {
        return m64778b(this.f64627a.or(C25939M.m64784a(n)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo84034e(int i) {
        return this.f64627a.test(i);
    }
}
