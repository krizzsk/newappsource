package p988j$.util.function;

import p988j$.util.concurrent.C25906u;

/* renamed from: j$.util.function.Consumer */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
            consumer2.getClass();
            return new C25906u(3, consumer, consumer2);
        }
    }

    /* renamed from: j$.util.function.Consumer$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a */
        final /* synthetic */ java.util.function.Consumer f64607a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f64607a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof Wrapper ? Consumer.this : new VivifiedWrapper(consumer);
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f64607a.accept(obj);
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.f64607a.andThen(Wrapper.convert(consumer)));
        }
    }

    /* renamed from: j$.util.function.Consumer$Wrapper */
    public final /* synthetic */ class Wrapper implements java.util.function.Consumer {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.function.Consumer convert(Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof VivifiedWrapper ? ((VivifiedWrapper) consumer).f64607a : new Wrapper();
        }

        public final /* synthetic */ void accept(Object obj) {
            Consumer.this.accept(obj);
        }

        public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return convert(Consumer.this.andThen(VivifiedWrapper.convert(consumer)));
        }
    }

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
