package p988j$.util.function;

import java.util.function.IntFunction;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.function.K */
public final /* synthetic */ class C25935K implements IntFunction {

    /* renamed from: a */
    final /* synthetic */ IntFunction f64626a;

    private /* synthetic */ C25935K(IntFunction intFunction) {
        this.f64626a = intFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ IntFunction m64777a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).f64623a : new C25935K(intFunction);
    }

    public final /* synthetic */ Object apply(int i) {
        return this.f64626a.apply(i);
    }
}
