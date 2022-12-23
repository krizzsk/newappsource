package p988j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.H0 */
public final /* synthetic */ class C25930H0 implements Supplier {

    /* renamed from: a */
    final /* synthetic */ Supplier f64620a;

    private /* synthetic */ C25930H0(Supplier supplier) {
        this.f64620a = supplier;
    }

    /* renamed from: a */
    public static /* synthetic */ Supplier m64772a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof C25928G0 ? ((C25928G0) supplier).f64617a : new C25930H0(supplier);
    }

    public final /* synthetic */ Object get() {
        return this.f64620a.get();
    }
}
