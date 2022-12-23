package p988j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.Z */
public final /* synthetic */ class C25956Z implements LongBinaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25958a0 f64642a;

    private /* synthetic */ C25956Z(C25958a0 a0Var) {
        this.f64642a = a0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongBinaryOperator m64802a(C25958a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        return a0Var instanceof C25955Y ? ((C25955Y) a0Var).f64641a : new C25956Z(a0Var);
    }

    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f64642a.applyAsLong(j, j2);
    }
}
