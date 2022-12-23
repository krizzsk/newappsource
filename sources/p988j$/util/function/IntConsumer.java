package p988j$.util.function;

/* renamed from: j$.util.function.IntConsumer */
public interface IntConsumer {

    /* renamed from: j$.util.function.IntConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntConsumer $default$andThen(IntConsumer intConsumer, IntConsumer intConsumer2) {
            intConsumer2.getClass();
            return new C25929H(intConsumer, intConsumer2);
        }
    }

    void accept(int i);

    IntConsumer andThen(IntConsumer intConsumer);
}
