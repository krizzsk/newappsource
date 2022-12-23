package p988j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.G0 */
public final /* synthetic */ class C25928G0 implements Supplier {

    /* renamed from: a */
    final /* synthetic */ Supplier f64617a;

    private /* synthetic */ C25928G0(Supplier supplier) {
        this.f64617a = supplier;
    }

    /* renamed from: a */
    public static /* synthetic */ Supplier m64771a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof C25930H0 ? ((C25930H0) supplier).f64620a : new C25928G0(supplier);
    }

    public final /* synthetic */ Object get() {
        return this.f64617a.get();
    }
}
