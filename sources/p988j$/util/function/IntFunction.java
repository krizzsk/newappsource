package p988j$.util.function;

/* renamed from: j$.util.function.IntFunction */
public interface IntFunction<R> {

    /* renamed from: j$.util.function.IntFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements IntFunction {

        /* renamed from: a */
        final /* synthetic */ java.util.function.IntFunction f64623a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntFunction intFunction) {
            this.f64623a = intFunction;
        }

        public static /* synthetic */ IntFunction convert(java.util.function.IntFunction intFunction) {
            if (intFunction == null) {
                return null;
            }
            return intFunction instanceof C25935K ? ((C25935K) intFunction).f64626a : new VivifiedWrapper(intFunction);
        }

        public final /* synthetic */ Object apply(int i) {
            return this.f64623a.apply(i);
        }
    }

    R apply(int i);
}
