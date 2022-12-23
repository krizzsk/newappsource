package com.google.android.gms.internal.icing;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzfh implements Iterator<String>, p988j$.util.Iterator {
    public final Iterator<String> zza;
    public final /* synthetic */ zzfi zzb;

    public zzfh(zzfi zzfi) {
        this.zzb = zzfi;
        this.zza = zzfi.zza.iterator();
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
