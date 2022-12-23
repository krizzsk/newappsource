package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p988j$.util.Spliterator;
import p988j$.util.function.C25933J;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.E */
public final /* synthetic */ class C25857E implements Spliterator.OfInt {

    /* renamed from: a */
    final /* synthetic */ Spliterator.OfInt f64476a;

    private /* synthetic */ C25857E(Spliterator.OfInt ofInt) {
        this.f64476a = ofInt;
    }

    /* renamed from: d */
    public static /* synthetic */ Spliterator.OfInt m64682d(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C25858F ? ((C25858F) ofInt).f64477a : new C25857E(ofInt);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64476a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64476a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64476a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f64476a.forEachRemaining(C25933J.m64775a(intConsumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64476a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64476a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64476a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64476a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f64476a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f64476a.tryAdvance(C25933J.m64775a(intConsumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64476a.tryAdvance(obj);
    }
}
