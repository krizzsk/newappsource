package p988j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.F */
public final /* synthetic */ class C25925F implements IntBinaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25927G f64614a;

    private /* synthetic */ C25925F(C25927G g) {
        this.f64614a = g;
    }

    /* renamed from: a */
    public static /* synthetic */ IntBinaryOperator m64768a(C25927G g) {
        if (g == null) {
            return null;
        }
        return g instanceof C25923E ? ((C25923E) g).f64610a : new C25925F(g);
    }

    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f64614a.applyAsInt(i, i2);
    }
}
