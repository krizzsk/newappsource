package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzfpo implements Iterator, p988j$.util.Iterator {
    public final Iterator zza;
    public Collection zzb;
    public final /* synthetic */ zzfpp zzc;

    public zzfpo(zzfpp zzfpp) {
        this.zzc = zzfpp;
        this.zza = zzfpp.zza.entrySet().iterator();
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
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    public final void remove() {
        boolean z;
        if (this.zzb != null) {
            z = true;
        } else {
            z = false;
        }
        zzfos.zzi(z, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfqc.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
