package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.M */
public final /* synthetic */ class C25865M implements Spliterator {

    /* renamed from: a */
    final /* synthetic */ Spliterator f64482a;

    private /* synthetic */ C25865M(Spliterator spliterator) {
        this.f64482a = spliterator;
    }

    /* renamed from: d */
    public static /* synthetic */ Spliterator m64692d(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : new C25865M(spliterator);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64482a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64482a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64482a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64482a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64482a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64482a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f64482a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ Spliterator trySplit() {
        return m64692d(this.f64482a.trySplit());
    }
}
