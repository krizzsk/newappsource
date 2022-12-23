package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzxs implements Iterator<String>, p988j$.util.Iterator {
    public final Iterator<String> zza;
    public final /* synthetic */ zzxt zzb;

    public zzxs(zzxt zzxt) {
        this.zzb = zzxt;
        this.zza = zzxt.zza.iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
