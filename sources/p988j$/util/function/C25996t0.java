package p988j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.t0 */
public final /* synthetic */ class C25996t0 implements LongUnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25998u0 f64676a;

    private /* synthetic */ C25996t0(C25998u0 u0Var) {
        this.f64676a = u0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongUnaryOperator m64851a(C25998u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        return u0Var instanceof C25994s0 ? ((C25994s0) u0Var).f64674a : new C25996t0(u0Var);
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return m64851a(this.f64676a.mo84093b(C25994s0.m64846c(longUnaryOperator)));
    }

    public final /* synthetic */ long applyAsLong(long j) {
        return this.f64676a.applyAsLong(j);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return m64851a(this.f64676a.mo84091a(C25994s0.m64846c(longUnaryOperator)));
    }
}
