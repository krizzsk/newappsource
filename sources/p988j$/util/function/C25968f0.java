package p988j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.f0 */
public final /* synthetic */ class C25968f0 implements C25972h0 {

    /* renamed from: a */
    final /* synthetic */ LongFunction f64653a;

    private /* synthetic */ C25968f0(LongFunction longFunction) {
        this.f64653a = longFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C25972h0 m64813a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C25970g0 ? ((C25970g0) longFunction).f64655a : new C25968f0(longFunction);
    }

    public final /* synthetic */ Object apply(long j) {
        return this.f64653a.apply(j);
    }
}
