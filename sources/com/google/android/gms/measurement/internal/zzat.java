package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzat implements Iterator, p988j$.util.Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzau zzb;

    public zzat(zzau zzau) {
        this.zzb = zzau;
        this.zza = zzau.zza.keySet().iterator();
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

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    /* renamed from: zza */
    public final String next() {
        return (String) this.zza.next();
    }
}
