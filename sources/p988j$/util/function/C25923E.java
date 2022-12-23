package p988j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.E */
public final /* synthetic */ class C25923E implements C25927G {

    /* renamed from: a */
    final /* synthetic */ IntBinaryOperator f64610a;

    private /* synthetic */ C25923E(IntBinaryOperator intBinaryOperator) {
        this.f64610a = intBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C25927G m64766a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof C25925F ? ((C25925F) intBinaryOperator).f64614a : new C25923E(intBinaryOperator);
    }

    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f64610a.applyAsInt(i, i2);
    }
}
