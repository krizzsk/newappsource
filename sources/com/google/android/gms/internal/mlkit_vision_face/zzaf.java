package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzaf implements Iterator<Map.Entry>, p988j$.util.Iterator {
    public final Iterator<Map.Entry> zza;
    @NullableDecl
    public Collection zzb;
    public final /* synthetic */ zzag zzc;

    public zzaf(zzag zzag) {
        this.zzc = zzag;
        this.zza = zzag.zza.entrySet().iterator();
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
        Map.Entry next = this.zza.next();
        this.zzb = (Collection) next.getValue();
        zzag zzag = this.zzc;
        Object key = next.getKey();
        return new zzbh(key, zzag.zzb.zza(key, (Collection) next.getValue()));
    }

    public final void remove() {
        boolean z;
        if (this.zzb != null) {
            z = true;
        } else {
            z = false;
        }
        zzaa.zza(z, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzao.zzn(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
