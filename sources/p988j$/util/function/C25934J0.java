package p988j$.util.function;

import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.function.J0 */
public final /* synthetic */ class C25934J0 implements ToDoubleFunction {

    /* renamed from: a */
    final /* synthetic */ C25936K0 f64625a;

    private /* synthetic */ C25934J0(C25936K0 k0) {
        this.f64625a = k0;
    }

    /* renamed from: a */
    public static /* synthetic */ ToDoubleFunction m64776a(C25936K0 k0) {
        if (k0 == null) {
            return null;
        }
        return k0 instanceof C25932I0 ? ((C25932I0) k0).f64622a : new C25934J0(k0);
    }

    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f64625a.applyAsDouble(obj);
    }
}
