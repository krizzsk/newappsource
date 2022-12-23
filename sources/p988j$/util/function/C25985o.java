package p988j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.o */
public final /* synthetic */ class C25985o implements DoubleFunction {

    /* renamed from: a */
    final /* synthetic */ C25987p f64666a;

    private /* synthetic */ C25985o(C25987p pVar) {
        this.f64666a = pVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleFunction m64833a(C25987p pVar) {
        if (pVar == null) {
            return null;
        }
        return pVar instanceof C25983n ? ((C25983n) pVar).f64665a : new C25985o(pVar);
    }

    public final /* synthetic */ Object apply(double d) {
        return this.f64666a.apply(d);
    }
}
