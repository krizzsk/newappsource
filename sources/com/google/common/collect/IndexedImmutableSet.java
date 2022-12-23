package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

abstract class IndexedImmutableSet<E> extends ImmutableSet.CachingAsList<E> {
    /* renamed from: G */
    public final ImmutableList<E> mo43157G() {
        return new ImmutableAsList<E>() {
            /* renamed from: I */
            public final ImmutableCollection<E> mo43084I() {
                return IndexedImmutableSet.this;
            }

            public final E get(int i) {
                return IndexedImmutableSet.this.get(i);
            }

            /* renamed from: s */
            public final boolean mo43086s() {
                return IndexedImmutableSet.this.mo43086s();
            }

            public final int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    public void forEach(Consumer<? super E> consumer) {
        consumer.getClass();
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public abstract E get(int i);

    /* renamed from: i */
    public final int mo43100i(int i, Object[] objArr) {
        return mo43098e().mo43100i(i, objArr);
    }

    public Spliterator<E> spliterator() {
        return C14415o.m35876b(size(), 1297, new C14440x(this));
    }

    /* renamed from: u */
    public C14439w0<E> iterator() {
        return mo43098e().iterator();
    }
}
