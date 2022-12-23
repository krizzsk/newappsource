package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

abstract class zzcz implements Iterator, p988j$.util.Iterator {
    public final Iterator zza;

    public zzcz(Iterator it) {
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

    public final Object next() {
        return zza(this.zza.next());
    }

    public final void remove() {
        this.zza.remove();
    }

    public abstract Object zza(Object obj);
}
