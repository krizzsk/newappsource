package p988j$.util.function;

/* renamed from: j$.util.function.Function */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, R> {
        public static Function $default$andThen(Function function, Function function2) {
            function2.getClass();
            return new C25919C(function, function2, 0);
        }

        public static Function $default$compose(Function function, Function function2) {
            function2.getClass();
            return new C25919C(function, function2, 1);
        }
    }

    /* renamed from: j$.util.function.Function$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        final /* synthetic */ java.util.function.Function f64616a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f64616a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C25921D ? ((C25921D) function).f64609a : new VivifiedWrapper(function);
        }

        public final /* synthetic */ Function andThen(Function function) {
            return convert(this.f64616a.andThen(C25921D.m64765a(function)));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.f64616a.apply(obj);
        }

        public final /* synthetic */ Function compose(Function function) {
            return convert(this.f64616a.compose(C25921D.m64765a(function)));
        }
    }

    <V> Function<T, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
