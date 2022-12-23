package p988j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.T */
public final /* synthetic */ class C25950T implements IntToLongFunction {

    /* renamed from: a */
    final /* synthetic */ C25951U f64637a;

    private /* synthetic */ C25950T(C25951U u) {
        this.f64637a = u;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToLongFunction m64795a(C25951U u) {
        if (u == null) {
            return null;
        }
        return u instanceof C25949S ? ((C25949S) u).f64636a : new C25950T(u);
    }

    public final /* synthetic */ long applyAsLong(int i) {
        return this.f64637a.applyAsLong(i);
    }
}
