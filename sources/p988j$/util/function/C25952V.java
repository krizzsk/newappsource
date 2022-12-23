package p988j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.V */
public final /* synthetic */ class C25952V implements C25954X {

    /* renamed from: a */
    final /* synthetic */ IntUnaryOperator f64639a;

    private /* synthetic */ C25952V(IntUnaryOperator intUnaryOperator) {
        this.f64639a = intUnaryOperator;
    }

    /* renamed from: d */
    public static /* synthetic */ C25954X m64796d(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof C25953W ? ((C25953W) intUnaryOperator).f64640a : new C25952V(intUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ C25954X mo84047a(C25954X x) {
        return m64796d(this.f64639a.andThen(C25953W.m64800a(x)));
    }

    /* renamed from: b */
    public final /* synthetic */ int mo84048b(int i) {
        return this.f64639a.applyAsInt(i);
    }

    /* renamed from: c */
    public final /* synthetic */ C25954X mo84049c(C25954X x) {
        return m64796d(this.f64639a.compose(C25953W.m64800a(x)));
    }
}
