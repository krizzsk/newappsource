package p988j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.M */
public final /* synthetic */ class C25939M implements IntPredicate {

    /* renamed from: a */
    final /* synthetic */ C25941N f64629a;

    private /* synthetic */ C25939M(C25941N n) {
        this.f64629a = n;
    }

    /* renamed from: a */
    public static /* synthetic */ IntPredicate m64784a(C25941N n) {
        if (n == null) {
            return null;
        }
        return n instanceof C25937L ? ((C25937L) n).f64627a : new C25939M(n);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return m64784a(((C25937L) this.f64629a).mo84031a(C25937L.m64778b(intPredicate)));
    }

    public final /* synthetic */ IntPredicate negate() {
        return m64784a(((C25937L) this.f64629a).mo84032c());
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo84038or(IntPredicate intPredicate) {
        return m64784a(((C25937L) this.f64629a).mo84033d(C25937L.m64778b(intPredicate)));
    }

    public final /* synthetic */ boolean test(int i) {
        return ((C25937L) this.f64629a).mo84034e(i);
    }
}
