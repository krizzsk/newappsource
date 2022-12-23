package p988j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.h */
public final /* synthetic */ class C25971h implements DoubleBinaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25973i f64656a;

    private /* synthetic */ C25971h(C25973i iVar) {
        this.f64656a = iVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleBinaryOperator m64816a(C25973i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar instanceof C25969g ? ((C25969g) iVar).f64654a : new C25971h(iVar);
    }

    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f64656a.applyAsDouble(d, d2);
    }
}
