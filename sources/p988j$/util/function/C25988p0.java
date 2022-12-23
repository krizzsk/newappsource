package p988j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.p0 */
public final /* synthetic */ class C25988p0 implements LongToIntFunction {

    /* renamed from: a */
    final /* synthetic */ C25990q0 f64668a;

    private /* synthetic */ C25988p0(C25990q0 q0Var) {
        this.f64668a = q0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongToIntFunction m64836a(C25990q0 q0Var) {
        if (q0Var == null) {
            return null;
        }
        return q0Var instanceof C25986o0 ? ((C25986o0) q0Var).f64667a : new C25988p0(q0Var);
    }

    public final /* synthetic */ int applyAsInt(long j) {
        return ((C25986o0) this.f64668a).mo84081a(j);
    }
}
