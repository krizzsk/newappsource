package p988j$.util.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p988j$.util.function.Function;

/* renamed from: j$.util.function.e */
public final /* synthetic */ class C25965e implements BinaryOperator {

    /* renamed from: a */
    final /* synthetic */ C25967f f64652a;

    private /* synthetic */ C25965e(C25967f fVar) {
        this.f64652a = fVar;
    }

    /* renamed from: a */
    public static /* synthetic */ BinaryOperator m64811a(C25967f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar instanceof C25963d ? ((C25963d) fVar).f64650a : new C25965e(fVar);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return C25959b.m64804a(this.f64652a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f64652a.apply(obj, obj2);
    }
}
