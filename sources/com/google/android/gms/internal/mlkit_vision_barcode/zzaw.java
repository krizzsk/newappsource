package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class zzaw extends zzcn {
    public final transient Map zza;
    public final /* synthetic */ zzbe zzb;

    public zzaw(zzbe zzbe, Map map) {
        this.zzb = zzbe;
        this.zza = map;
    }

    public final void clear() {
        Map map = this.zza;
        zzbe zzbe = this.zzb;
        if (map == zzbe.zza) {
            zzbe.zzn();
        } else {
            zzcg.zza(new zzav(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return zzco.zzb(this.zza, obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzco.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Set keySet() {
        return this.zzb.zzq();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza2 = this.zzb.zza();
        zza2.addAll(collection);
        zzbe.zzg(this.zzb, collection.size());
        collection.clear();
        return zza2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Set zza() {
        return new zzau(this);
    }
}
