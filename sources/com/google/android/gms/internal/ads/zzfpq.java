package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

class zzfpq implements Iterator, p988j$.util.Iterator {
    public final Iterator zza;
    public Object zzb = null;
    public Collection zzc = null;
    public Iterator zzd = zzfrq.INSTANCE;
    public final /* synthetic */ zzfqc zze;

    public zzfpq(zzfqc zzfqc) {
        this.zze = zzfqc;
        this.zza = zzfqc.zza.entrySet().iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    public final void remove() {
        this.zzd.remove();
        Collection collection = this.zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfqc.zze(this.zze);
    }
}
