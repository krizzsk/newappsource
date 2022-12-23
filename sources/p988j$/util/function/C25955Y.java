package p988j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.Y */
public final /* synthetic */ class C25955Y implements C25958a0 {

    /* renamed from: a */
    final /* synthetic */ LongBinaryOperator f64641a;

    private /* synthetic */ C25955Y(LongBinaryOperator longBinaryOperator) {
        this.f64641a = longBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C25958a0 m64801a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C25956Z ? ((C25956Z) longBinaryOperator).f64642a : new C25955Y(longBinaryOperator);
    }

    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f64641a.applyAsLong(j, j2);
    }
}
