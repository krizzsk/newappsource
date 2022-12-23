package p988j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.W */
public final /* synthetic */ class C25953W implements IntUnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25954X f64640a;

    private /* synthetic */ C25953W(C25954X x) {
        this.f64640a = x;
    }

    /* renamed from: a */
    public static /* synthetic */ IntUnaryOperator m64800a(C25954X x) {
        if (x == null) {
            return null;
        }
        return x instanceof C25952V ? ((C25952V) x).f64639a : new C25953W(x);
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return m64800a(((C25952V) this.f64640a).mo84047a(C25952V.m64796d(intUnaryOperator)));
    }

    public final /* synthetic */ int applyAsInt(int i) {
        return ((C25952V) this.f64640a).mo84048b(i);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return m64800a(((C25952V) this.f64640a).mo84049c(C25952V.m64796d(intUnaryOperator)));
    }
}
