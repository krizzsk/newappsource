package p988j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.l0 */
public final /* synthetic */ class C25980l0 implements C25984n0 {

    /* renamed from: a */
    final /* synthetic */ LongToDoubleFunction f64663a;

    private /* synthetic */ C25980l0(LongToDoubleFunction longToDoubleFunction) {
        this.f64663a = longToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C25984n0 m64828b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof C25982m0 ? ((C25982m0) longToDoubleFunction).f64664a : new C25980l0(longToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double mo84077a(long j) {
        return this.f64663a.applyAsDouble(j);
    }
}
