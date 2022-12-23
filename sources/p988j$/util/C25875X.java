package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.X */
final class C25875X extends C26016n implements Spliterator {
    C25875X() {
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return false;
    }
}
