package p988j$.util.function;

import java.util.function.ToLongFunction;

/* renamed from: j$.util.function.O0 */
public final /* synthetic */ class C25944O0 implements C25948Q0 {

    /* renamed from: a */
    final /* synthetic */ ToLongFunction f64632a;

    private /* synthetic */ C25944O0(ToLongFunction toLongFunction) {
        this.f64632a = toLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C25948Q0 m64789a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof C25946P0 ? ((C25946P0) toLongFunction).f64634a : new C25944O0(toLongFunction);
    }

    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f64632a.applyAsLong(obj);
    }
}
