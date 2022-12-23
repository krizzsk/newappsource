package p988j$.util.function;

import java.util.function.ToIntFunction;

/* renamed from: j$.util.function.L0 */
public final /* synthetic */ class C25938L0 implements C25942N0 {

    /* renamed from: a */
    final /* synthetic */ ToIntFunction f64628a;

    private /* synthetic */ C25938L0(ToIntFunction toIntFunction) {
        this.f64628a = toIntFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C25942N0 m64783a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof C25940M0 ? ((C25940M0) toIntFunction).f64630a : new C25938L0(toIntFunction);
    }

    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f64628a.applyAsInt(obj);
    }
}
