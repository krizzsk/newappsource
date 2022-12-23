package p988j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.u */
public final /* synthetic */ class C25997u implements DoubleToIntFunction {

    /* renamed from: a */
    final /* synthetic */ C25999v f64677a;

    private /* synthetic */ C25997u(C25999v vVar) {
        this.f64677a = vVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToIntFunction m64852a(C25999v vVar) {
        if (vVar == null) {
            return null;
        }
        return vVar instanceof C25995t ? ((C25995t) vVar).f64675a : new C25997u(vVar);
    }

    public final /* synthetic */ int applyAsInt(double d) {
        return ((C25995t) this.f64677a).mo84094a(d);
    }
}
