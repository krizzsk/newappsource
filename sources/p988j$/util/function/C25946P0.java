package p988j$.util.function;

import java.util.function.ToLongFunction;

/* renamed from: j$.util.function.P0 */
public final /* synthetic */ class C25946P0 implements ToLongFunction {

    /* renamed from: a */
    final /* synthetic */ C25948Q0 f64634a;

    private /* synthetic */ C25946P0(C25948Q0 q0) {
        this.f64634a = q0;
    }

    /* renamed from: a */
    public static /* synthetic */ ToLongFunction m64791a(C25948Q0 q0) {
        if (q0 == null) {
            return null;
        }
        return q0 instanceof C25944O0 ? ((C25944O0) q0).f64632a : new C25946P0(q0);
    }

    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f64634a.applyAsLong(obj);
    }
}
