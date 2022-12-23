package p988j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.S */
public final /* synthetic */ class C25949S implements C25951U {

    /* renamed from: a */
    final /* synthetic */ IntToLongFunction f64636a;

    private /* synthetic */ C25949S(IntToLongFunction intToLongFunction) {
        this.f64636a = intToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C25951U m64794a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof C25950T ? ((C25950T) intToLongFunction).f64637a : new C25949S(intToLongFunction);
    }

    public final /* synthetic */ long applyAsLong(int i) {
        return this.f64636a.applyAsLong(i);
    }
}
