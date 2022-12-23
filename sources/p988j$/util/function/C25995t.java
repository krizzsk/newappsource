package p988j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.t */
public final /* synthetic */ class C25995t implements C25999v {

    /* renamed from: a */
    final /* synthetic */ DoubleToIntFunction f64675a;

    private /* synthetic */ C25995t(DoubleToIntFunction doubleToIntFunction) {
        this.f64675a = doubleToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C25999v m64849b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return doubleToIntFunction instanceof C25997u ? ((C25997u) doubleToIntFunction).f64677a : new C25995t(doubleToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo84094a(double d) {
        return this.f64675a.applyAsInt(d);
    }
}
