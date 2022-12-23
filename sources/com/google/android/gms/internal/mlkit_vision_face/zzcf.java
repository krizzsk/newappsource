package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

abstract class zzcf<F, T> implements Iterator<T>, p988j$.util.Iterator {
    public final Iterator<? extends F> zza;

    public zzcf(Iterator<? extends F> it) {
        it.getClass();
        this.zza = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final T next() {
        return zza(this.zza.next());
    }

    public final void remove() {
        this.zza.remove();
    }

    public abstract T zza(F f);
}
