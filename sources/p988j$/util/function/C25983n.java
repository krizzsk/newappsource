package p988j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.n */
public final /* synthetic */ class C25983n implements C25987p {

    /* renamed from: a */
    final /* synthetic */ DoubleFunction f64665a;

    private /* synthetic */ C25983n(DoubleFunction doubleFunction) {
        this.f64665a = doubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C25987p m64832a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C25985o ? ((C25985o) doubleFunction).f64666a : new C25983n(doubleFunction);
    }

    public final /* synthetic */ Object apply(double d) {
        return this.f64665a.apply(d);
    }
}
