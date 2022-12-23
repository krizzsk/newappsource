package p988j$.util.function;

import java.util.function.ToIntFunction;

/* renamed from: j$.util.function.M0 */
public final /* synthetic */ class C25940M0 implements ToIntFunction {

    /* renamed from: a */
    final /* synthetic */ C25942N0 f64630a;

    private /* synthetic */ C25940M0(C25942N0 n0) {
        this.f64630a = n0;
    }

    /* renamed from: a */
    public static /* synthetic */ ToIntFunction m64786a(C25942N0 n0) {
        if (n0 == null) {
            return null;
        }
        return n0 instanceof C25938L0 ? ((C25938L0) n0).f64628a : new C25940M0(n0);
    }

    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f64630a.applyAsInt(obj);
    }
}
