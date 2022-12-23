package p988j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.s0 */
public final /* synthetic */ class C25994s0 implements C25998u0 {

    /* renamed from: a */
    final /* synthetic */ LongUnaryOperator f64674a;

    private /* synthetic */ C25994s0(LongUnaryOperator longUnaryOperator) {
        this.f64674a = longUnaryOperator;
    }

    /* renamed from: c */
    public static /* synthetic */ C25998u0 m64846c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof C25996t0 ? ((C25996t0) longUnaryOperator).f64676a : new C25994s0(longUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ C25998u0 mo84091a(C25998u0 u0Var) {
        return m64846c(this.f64674a.compose(C25996t0.m64851a(u0Var)));
    }

    public final /* synthetic */ long applyAsLong(long j) {
        return this.f64674a.applyAsLong(j);
    }

    /* renamed from: b */
    public final /* synthetic */ C25998u0 mo84093b(C25998u0 u0Var) {
        return m64846c(this.f64674a.andThen(C25996t0.m64851a(u0Var)));
    }
}
