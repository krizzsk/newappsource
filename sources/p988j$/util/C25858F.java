package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p988j$.util.Spliterator;
import p988j$.util.function.C25931I;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.F */
public final /* synthetic */ class C25858F implements Spliterator.OfInt {

    /* renamed from: a */
    final /* synthetic */ Spliterator.OfInt f64477a;

    private /* synthetic */ C25858F(Spliterator.OfInt ofInt) {
        this.f64477a = ofInt;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m64683a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C25857E ? ((C25857E) ofInt).f64476a : new C25858F(ofInt);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64477a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64477a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64477a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64477a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f64477a.forEachRemaining(C25931I.m64773a(intConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64477a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64477a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64477a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64477a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f64477a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f64477a.tryAdvance(C25931I.m64773a(intConsumer));
    }
}
