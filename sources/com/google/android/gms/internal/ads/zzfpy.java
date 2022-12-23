package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

class zzfpy implements Iterator, p988j$.util.Iterator {
    public final Iterator zza;
    public final Collection zzb;
    public final /* synthetic */ zzfpz zzc;

    public zzfpy(zzfpz zzfpz) {
        Iterator it;
        this.zzc = zzfpz;
        Collection collection = zzfpz.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    public zzfpy(zzfpz zzfpz, Iterator it) {
        this.zzc = zzfpz;
        this.zzb = zzfpz.zzb;
        this.zza = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzfqc.zze(this.zzc.zze);
        this.zzc.zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
