package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

class zzfpp extends zzfsb {
    public final transient Map zza;
    public final /* synthetic */ zzfqc zzb;

    public zzfpp(zzfqc zzfqc, Map map) {
        this.zzb = zzfqc;
        this.zza = map;
    }

    public final void clear() {
        Map map = this.zza;
        zzfqc zzfqc = this.zzb;
        if (map == zzfqc.zza) {
            zzfqc.zzr();
        } else {
            zzfrr.zzb(new zzfpo(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfsc.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public Set keySet() {
        return this.zzb.zzv();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza2 = this.zzb.zza();
        zza2.addAll(collection);
        zzfqc.zzg(this.zzb, collection.size());
        collection.clear();
        return zza2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Map.Entry zza(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfrd(key, this.zzb.zzc(key, (Collection) entry.getValue()));
    }

    public final Set zzb() {
        return new zzfpn(this);
    }
}
