package p988j$.util.function;

import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.function.I0 */
public final /* synthetic */ class C25932I0 implements C25936K0 {

    /* renamed from: a */
    final /* synthetic */ ToDoubleFunction f64622a;

    private /* synthetic */ C25932I0(ToDoubleFunction toDoubleFunction) {
        this.f64622a = toDoubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C25936K0 m64774a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof C25934J0 ? ((C25934J0) toDoubleFunction).f64625a : new C25932I0(toDoubleFunction);
    }

    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f64622a.applyAsDouble(obj);
    }
}
