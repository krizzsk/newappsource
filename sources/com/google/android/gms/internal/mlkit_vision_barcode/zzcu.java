package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

final class zzcu extends zzcf {
    private final transient zzce zza;
    private final transient zzcc zzb;

    public zzcu(zzce zzce, zzcc zzcc) {
        this.zza = zzce;
        this.zzb = zzcc;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    public final zzda zzd() {
        return this.zzb.listIterator(0);
    }
}
