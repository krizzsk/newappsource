package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class zzcn extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zza2 = zza();
        this.zza = zza2;
        return zza2;
    }

    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        zzcl zzcl = new zzcl(this);
        this.zzb = zzcl;
        return zzcl;
    }

    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzcm zzcm = new zzcm(this);
        this.zzc = zzcm;
        return zzcm;
    }

    public abstract Set zza();
}
