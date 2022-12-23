package com.google.common.collect;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;

/* renamed from: com.google.common.collect.l */
public final class C14409l implements Spliterator<Object> {

    /* renamed from: a */
    public final Spliterator.OfInt f36293a;

    /* renamed from: b */
    public final /* synthetic */ IntFunction f36294b;

    /* renamed from: c */
    public final /* synthetic */ int f36295c;

    /* renamed from: d */
    public final /* synthetic */ Comparator f36296d;

    public C14409l(Spliterator.OfInt ofInt, IntFunction intFunction, int i, Comparator comparator) {
        this.f36294b = intFunction;
        this.f36295c = i;
        this.f36296d = comparator;
        this.f36293a = ofInt;
    }

    public final int characteristics() {
        return this.f36295c | 16464;
    }

    public final long estimateSize() {
        return this.f36293a.estimateSize();
    }

    public final void forEachRemaining(Consumer<Object> consumer) {
        this.f36293a.forEachRemaining((IntConsumer) new C14405j(consumer, this.f36294b));
    }

    public final Comparator<Object> getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return this.f36296d;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer<Object> consumer) {
        return this.f36293a.tryAdvance((IntConsumer) new C14407k(consumer, this.f36294b));
    }

    public final Spliterator<Object> trySplit() {
        Spliterator.OfInt trySplit = this.f36293a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C14409l(trySplit, this.f36294b, this.f36295c, this.f36296d);
    }
}
