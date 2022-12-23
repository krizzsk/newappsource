package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzbp extends AbstractSet {
    public final /* synthetic */ zzbs zza;

    public zzbp(zzbs zzbs) {
        this.zza = zzbs;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzbs zzbs = this.zza;
        Map zzl = zzbs.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzbk(zzbs);
    }

    public final boolean remove(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        if (this.zza.zzx(obj) == zzbs.zzd) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
