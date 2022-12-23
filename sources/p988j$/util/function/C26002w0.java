package p988j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.w0 */
public final /* synthetic */ class C26002w0 implements ObjDoubleConsumer {

    /* renamed from: a */
    final /* synthetic */ C26004x0 f64680a;

    private /* synthetic */ C26002w0(C26004x0 x0Var) {
        this.f64680a = x0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjDoubleConsumer m64857a(C26004x0 x0Var) {
        if (x0Var == null) {
            return null;
        }
        return x0Var instanceof C26000v0 ? ((C26000v0) x0Var).f64678a : new C26002w0(x0Var);
    }

    public final /* synthetic */ void accept(Object obj, double d) {
        this.f64680a.accept(obj, d);
    }
}
