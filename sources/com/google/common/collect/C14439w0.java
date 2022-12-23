package com.google.common.collect;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.w0 */
public abstract class C14439w0<E> implements Iterator<E>, p988j$.util.Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
