package p988j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.m0 */
public final /* synthetic */ class C25982m0 implements LongToDoubleFunction {

    /* renamed from: a */
    final /* synthetic */ C25984n0 f64664a;

    private /* synthetic */ C25982m0(C25984n0 n0Var) {
        this.f64664a = n0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongToDoubleFunction m64831a(C25984n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return n0Var instanceof C25980l0 ? ((C25980l0) n0Var).f64663a : new C25982m0(n0Var);
    }

    public final /* synthetic */ double applyAsDouble(long j) {
        return ((C25980l0) this.f64664a).mo84077a(j);
    }
}
