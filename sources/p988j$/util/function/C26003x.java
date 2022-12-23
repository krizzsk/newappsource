package p988j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.x */
public final /* synthetic */ class C26003x implements DoubleToLongFunction {

    /* renamed from: a */
    final /* synthetic */ C26005y f64681a;

    private /* synthetic */ C26003x(C26005y yVar) {
        this.f64681a = yVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToLongFunction m64858a(C26005y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar instanceof C26001w ? ((C26001w) yVar).f64679a : new C26003x(yVar);
    }

    public final /* synthetic */ long applyAsLong(double d) {
        return this.f64681a.applyAsLong(d);
    }
}
