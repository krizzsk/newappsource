package p988j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.g */
public final /* synthetic */ class C25969g implements C25973i {

    /* renamed from: a */
    final /* synthetic */ DoubleBinaryOperator f64654a;

    private /* synthetic */ C25969g(DoubleBinaryOperator doubleBinaryOperator) {
        this.f64654a = doubleBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C25973i m64814a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C25971h ? ((C25971h) doubleBinaryOperator).f64656a : new C25969g(doubleBinaryOperator);
    }

    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f64654a.applyAsDouble(d, d2);
    }
}
