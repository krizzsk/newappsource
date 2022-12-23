package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzax implements Iterator, p988j$.util.Iterator {
    public Map.Entry zza;
    public final /* synthetic */ Iterator zzb;
    public final /* synthetic */ zzay zzc;

    public zzax(zzay zzay, Iterator it) {
        this.zzc = zzay;
        this.zzb = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    public final void remove() {
        boolean z;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        zzaq.zzd(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzbe.zzg(this.zzc.zza, collection.size());
        collection.clear();
        this.zza = null;
    }
}
