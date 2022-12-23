package p988j$.util.function;

import java.util.function.BinaryOperator;
import p988j$.util.function.BiFunction;

/* renamed from: j$.util.function.d */
public final /* synthetic */ class C25963d implements C25967f {

    /* renamed from: a */
    final /* synthetic */ BinaryOperator f64650a;

    private /* synthetic */ C25963d(BinaryOperator binaryOperator) {
        this.f64650a = binaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C25967f m64809a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C25965e ? ((C25965e) binaryOperator).f64652a : new C25963d(binaryOperator);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f64650a.andThen(C25921D.m64765a(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f64650a.apply(obj, obj2);
    }
}
