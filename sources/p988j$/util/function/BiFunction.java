package p988j$.util.function;

/* renamed from: j$.util.function.BiFunction */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        final /* synthetic */ java.util.function.BiFunction f64602a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f64602a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C25959b ? ((C25959b) biFunction).f64644a : new VivifiedWrapper(biFunction);
        }

        public final /* synthetic */ BiFunction andThen(Function function) {
            return convert(this.f64602a.andThen(C25921D.m64765a(function)));
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f64602a.apply(obj, obj2);
        }
    }

    BiFunction andThen(Function function);

    Object apply(Object obj, Object obj2);
}
