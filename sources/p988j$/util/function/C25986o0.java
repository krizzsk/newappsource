package p988j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.o0 */
public final /* synthetic */ class C25986o0 implements C25990q0 {

    /* renamed from: a */
    final /* synthetic */ LongToIntFunction f64667a;

    private /* synthetic */ C25986o0(LongToIntFunction longToIntFunction) {
        this.f64667a = longToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C25990q0 m64834b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return longToIntFunction instanceof C25988p0 ? ((C25988p0) longToIntFunction).f64668a : new C25986o0(longToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo84081a(long j) {
        return this.f64667a.applyAsInt(j);
    }
}
