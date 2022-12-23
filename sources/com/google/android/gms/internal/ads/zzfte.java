package com.google.android.gms.internal.ads;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

abstract class zzfte implements Iterator, p988j$.util.Iterator {
    public final Iterator zzb;

    public zzfte(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        return zza(this.zzb.next());
    }

    public final void remove() {
        this.zzb.remove();
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}
