package p988j$.util.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import p988j$.util.function.BiFunction;
import p988j$.util.function.Function;

/* renamed from: j$.util.function.b */
public final /* synthetic */ class C25959b implements BiFunction {

    /* renamed from: a */
    final /* synthetic */ BiFunction f64644a;

    private /* synthetic */ C25959b(BiFunction biFunction) {
        this.f64644a = biFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ BiFunction m64804a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).f64602a : new C25959b(biFunction);
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(Function function) {
        return m64804a(this.f64644a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f64644a.apply(obj, obj2);
    }
}
