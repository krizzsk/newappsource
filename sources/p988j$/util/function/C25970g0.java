package p988j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.g0 */
public final /* synthetic */ class C25970g0 implements LongFunction {

    /* renamed from: a */
    final /* synthetic */ C25972h0 f64655a;

    private /* synthetic */ C25970g0(C25972h0 h0Var) {
        this.f64655a = h0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongFunction m64815a(C25972h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        return h0Var instanceof C25968f0 ? ((C25968f0) h0Var).f64653a : new C25970g0(h0Var);
    }

    public final /* synthetic */ Object apply(long j) {
        return this.f64655a.apply(j);
    }
}
