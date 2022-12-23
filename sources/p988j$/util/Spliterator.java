package p988j$.util;

import java.util.Comparator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.Spliterator */
public interface Spliterator<T> {
    public static final int CONCURRENT = 4096;
    public static final int DISTINCT = 1;
    public static final int IMMUTABLE = 1024;
    public static final int NONNULL = 256;
    public static final int ORDERED = 16;
    public static final int SIZED = 64;
    public static final int SORTED = 4;
    public static final int SUBSIZED = 16384;

    /* renamed from: j$.util.Spliterator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Comparator $default$getComparator(Spliterator spliterator) {
            throw new IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    /* renamed from: j$.util.Spliterator$OfInt */
    public interface OfInt extends C25864L {
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(IntConsumer intConsumer);

        boolean tryAdvance(Consumer consumer);

        boolean tryAdvance(IntConsumer intConsumer);

        OfInt trySplit();
    }

    /* renamed from: j$.util.Spliterator$Wrapper */
    public final /* synthetic */ class Wrapper implements java.util.Spliterator {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.Spliterator convert(Spliterator spliterator) {
            if (spliterator == null) {
                return null;
            }
            return spliterator instanceof C25865M ? ((C25865M) spliterator).f64482a : new Wrapper();
        }

        public final /* synthetic */ int characteristics() {
            return Spliterator.this.characteristics();
        }

        public final /* synthetic */ long estimateSize() {
            return Spliterator.this.estimateSize();
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Spliterator.this.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ Comparator getComparator() {
            return Spliterator.this.getComparator();
        }

        public final /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.this.getExactSizeIfKnown();
        }

        public final /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.this.hasCharacteristics(i);
        }

        public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
            return Spliterator.this.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ java.util.Spliterator trySplit() {
            return convert(Spliterator.this.trySplit());
        }
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer<? super T> consumer);

    Comparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer<? super T> consumer);

    Spliterator<T> trySplit();
}
