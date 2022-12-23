package p988j$.util.function;

import p988j$.util.concurrent.C25906u;

/* renamed from: j$.util.function.BiConsumer */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, U> {
        public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
            biConsumer2.getClass();
            return new C25906u(1, biConsumer, biConsumer2);
        }
    }

    /* renamed from: j$.util.function.BiConsumer$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a */
        final /* synthetic */ java.util.function.BiConsumer f64601a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f64601a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C25957a ? ((C25957a) biConsumer).f64643a : new VivifiedWrapper(biConsumer);
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f64601a.accept(obj, obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return convert(this.f64601a.andThen(C25957a.m64803a(biConsumer)));
        }
    }

    void accept(T t, U u);

    BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> biConsumer);
}
