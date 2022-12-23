package p988j$.util.function;

import java.util.function.Function;
import p988j$.util.function.Function;

/* renamed from: j$.util.function.D */
public final /* synthetic */ class C25921D implements Function {

    /* renamed from: a */
    final /* synthetic */ Function f64609a;

    private /* synthetic */ C25921D(Function function) {
        this.f64609a = function;
    }

    /* renamed from: a */
    public static /* synthetic */ Function m64765a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f64616a : new C25921D(function);
    }

    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return m64765a(this.f64609a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f64609a.apply(obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return m64765a(this.f64609a.compose(Function.VivifiedWrapper.convert(function)));
    }
}
