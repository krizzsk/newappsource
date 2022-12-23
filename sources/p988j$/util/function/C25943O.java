package p988j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.O */
public final /* synthetic */ class C25943O implements C25947Q {

    /* renamed from: a */
    final /* synthetic */ IntToDoubleFunction f64631a;

    private /* synthetic */ C25943O(IntToDoubleFunction intToDoubleFunction) {
        this.f64631a = intToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C25947Q m64787b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return intToDoubleFunction instanceof C25945P ? ((C25945P) intToDoubleFunction).f64633a : new C25943O(intToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double mo84041a(int i) {
        return this.f64631a.applyAsDouble(i);
    }
}
