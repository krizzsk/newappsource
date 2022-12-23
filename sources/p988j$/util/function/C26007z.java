package p988j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.z */
public final /* synthetic */ class C26007z implements C25917B {

    /* renamed from: a */
    final /* synthetic */ DoubleUnaryOperator f64683a;

    private /* synthetic */ C26007z(DoubleUnaryOperator doubleUnaryOperator) {
        this.f64683a = doubleUnaryOperator;
    }

    /* renamed from: d */
    public static /* synthetic */ C25917B m64860d(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof C25915A ? ((C25915A) doubleUnaryOperator).f64599a : new C26007z(doubleUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ C25917B mo84103a(C25917B b) {
        return m64860d(this.f64683a.andThen(C25915A.m64762a(b)));
    }

    /* renamed from: b */
    public final /* synthetic */ double mo84104b(double d) {
        return this.f64683a.applyAsDouble(d);
    }

    /* renamed from: c */
    public final /* synthetic */ C25917B mo84105c(C25917B b) {
        return m64860d(this.f64683a.compose(C25915A.m64762a(b)));
    }
}
