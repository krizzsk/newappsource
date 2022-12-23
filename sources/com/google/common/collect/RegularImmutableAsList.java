package com.google.common.collect;

import p988j$.util.function.Consumer;

class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
        this.delegate = immutableCollection;
        this.delegateList = immutableList;
    }

    /* renamed from: C */
    public final C14382a listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    /* renamed from: I */
    public final ImmutableCollection<E> mo43084I() {
        return this.delegate;
    }

    public final void forEach(Consumer<? super E> consumer) {
        this.delegateList.forEach(consumer);
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final E get(int i) {
        return this.delegateList.get(i);
    }

    /* renamed from: i */
    public final int mo43100i(int i, Object[] objArr) {
        return this.delegateList.mo43100i(i, objArr);
    }

    /* renamed from: m */
    public final Object[] mo43101m() {
        return this.delegateList.mo43101m();
    }

    /* renamed from: n */
    public final int mo43102n() {
        return this.delegateList.mo43102n();
    }

    /* renamed from: p */
    public final int mo43103p() {
        return this.delegateList.mo43103p();
    }

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr) {
        this(immutableCollection, ImmutableList.m35690x(objArr.length, objArr));
    }
}
