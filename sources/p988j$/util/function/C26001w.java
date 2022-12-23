package p988j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.w */
public final /* synthetic */ class C26001w implements C26005y {

    /* renamed from: a */
    final /* synthetic */ DoubleToLongFunction f64679a;

    private /* synthetic */ C26001w(DoubleToLongFunction doubleToLongFunction) {
        this.f64679a = doubleToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C26005y m64856a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C26003x ? ((C26003x) doubleToLongFunction).f64681a : new C26001w(doubleToLongFunction);
    }

    public final /* synthetic */ long applyAsLong(double d) {
        return this.f64679a.applyAsLong(d);
    }
}
