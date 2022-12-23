package com.google.common.collect;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.v0 */
public abstract class C14437v0<F, T> implements Iterator<T>, p988j$.util.Iterator {

    /* renamed from: b */
    public final Iterator<? extends F> f36325b;

    public C14437v0(Iterator<? extends F> it) {
        it.getClass();
        this.f36325b = it;
    }

    /* renamed from: a */
    public abstract T mo43192a(F f);

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f36325b.hasNext();
    }

    public final T next() {
        return mo43192a(this.f36325b.next());
    }

    public final void remove() {
        this.f36325b.remove();
    }
}
