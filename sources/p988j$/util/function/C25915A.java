package p988j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.A */
public final /* synthetic */ class C25915A implements DoubleUnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25917B f64599a;

    private /* synthetic */ C25915A(C25917B b) {
        this.f64599a = b;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleUnaryOperator m64762a(C25917B b) {
        if (b == null) {
            return null;
        }
        return b instanceof C26007z ? ((C26007z) b).f64683a : new C25915A(b);
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return m64762a(((C26007z) this.f64599a).mo84103a(C26007z.m64860d(doubleUnaryOperator)));
    }

    public final /* synthetic */ double applyAsDouble(double d) {
        return ((C26007z) this.f64599a).mo84104b(d);
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return m64762a(((C26007z) this.f64599a).mo84105c(C26007z.m64860d(doubleUnaryOperator)));
    }
}
