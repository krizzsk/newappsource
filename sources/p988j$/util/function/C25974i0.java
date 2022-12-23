package p988j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.i0 */
public final /* synthetic */ class C25974i0 implements C25978k0 {

    /* renamed from: a */
    final /* synthetic */ LongPredicate f64657a;

    private /* synthetic */ C25974i0(LongPredicate longPredicate) {
        this.f64657a = longPredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ C25978k0 m64817b(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C25976j0 ? ((C25976j0) longPredicate).f64660a : new C25974i0(longPredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ C25978k0 mo84067a(C25978k0 k0Var) {
        return m64817b(this.f64657a.and(C25976j0.m64823a(k0Var)));
    }

    /* renamed from: c */
    public final /* synthetic */ C25978k0 mo84068c() {
        return m64817b(this.f64657a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ C25978k0 mo84069d(C25978k0 k0Var) {
        return m64817b(this.f64657a.or(C25976j0.m64823a(k0Var)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo84070e(long j) {
        return this.f64657a.test(j);
    }
}
