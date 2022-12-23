package p988j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.j0 */
public final /* synthetic */ class C25976j0 implements LongPredicate {

    /* renamed from: a */
    final /* synthetic */ C25978k0 f64660a;

    private /* synthetic */ C25976j0(C25978k0 k0Var) {
        this.f64660a = k0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongPredicate m64823a(C25978k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        return k0Var instanceof C25974i0 ? ((C25974i0) k0Var).f64657a : new C25976j0(k0Var);
    }

    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return m64823a(((C25974i0) this.f64660a).mo84067a(C25974i0.m64817b(longPredicate)));
    }

    public final /* synthetic */ LongPredicate negate() {
        return m64823a(((C25974i0) this.f64660a).mo84068c());
    }

    /* renamed from: or */
    public final /* synthetic */ LongPredicate mo84073or(LongPredicate longPredicate) {
        return m64823a(((C25974i0) this.f64660a).mo84069d(C25974i0.m64817b(longPredicate)));
    }

    public final /* synthetic */ boolean test(long j) {
        return ((C25974i0) this.f64660a).mo84070e(j);
    }
}
