package com.google.common.collect;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;

/* renamed from: com.google.common.collect.i */
public final class C14403i implements Spliterator<Object> {

    /* renamed from: a */
    public final /* synthetic */ Spliterator f36285a;

    /* renamed from: b */
    public final /* synthetic */ Function f36286b;

    public C14403i(Spliterator spliterator, Function function) {
        this.f36285a = spliterator;
        this.f36286b = function;
    }

    public final int characteristics() {
        return this.f36285a.characteristics() & -262;
    }

    public final long estimateSize() {
        return this.f36285a.estimateSize();
    }

    public final void forEachRemaining(Consumer<Object> consumer) {
        this.f36285a.forEachRemaining(new C14395g(consumer, this.f36286b));
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

    public final boolean tryAdvance(Consumer<Object> consumer) {
        return this.f36285a.tryAdvance(new C14401h(consumer, this.f36286b));
    }

    public final Spliterator<Object> trySplit() {
        Spliterator trySplit = this.f36285a.trySplit();
        if (trySplit != null) {
            return C14415o.m35877c(trySplit, this.f36286b);
        }
        return null;
    }
}
