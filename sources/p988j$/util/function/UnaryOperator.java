package p988j$.util.function;

import p988j$.util.function.Function;

/* renamed from: j$.util.function.UnaryOperator */
public interface UnaryOperator<T> extends Function<T, T> {

    /* renamed from: j$.util.function.UnaryOperator$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {

        /* renamed from: a */
        final /* synthetic */ java.util.function.UnaryOperator f64638a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.f64638a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return new VivifiedWrapper(unaryOperator);
        }

        public final /* synthetic */ Function andThen(Function function) {
            return Function.VivifiedWrapper.convert(this.f64638a.andThen(C25921D.m64765a(function)));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.f64638a.apply(obj);
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function.VivifiedWrapper.convert(this.f64638a.compose(C25921D.m64765a(function)));
        }
    }
}
