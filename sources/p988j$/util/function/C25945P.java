package p988j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.P */
public final /* synthetic */ class C25945P implements IntToDoubleFunction {

    /* renamed from: a */
    final /* synthetic */ C25947Q f64633a;

    private /* synthetic */ C25945P(C25947Q q) {
        this.f64633a = q;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToDoubleFunction m64790a(C25947Q q) {
        if (q == null) {
            return null;
        }
        return q instanceof C25943O ? ((C25943O) q).f64631a : new C25945P(q);
    }

    public final /* synthetic */ double applyAsDouble(int i) {
        return ((C25943O) this.f64633a).mo84041a(i);
    }
}
