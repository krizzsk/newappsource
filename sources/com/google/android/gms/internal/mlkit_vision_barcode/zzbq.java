package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

final class zzbq extends zzbf {
    public final /* synthetic */ zzbs zza;
    private final Object zzb;
    private int zzc;

    public zzbq(zzbs zzbs, int i) {
        this.zza = zzbs;
        this.zzb = zzbs.zzg(zzbs, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzam.zza(this.zzb, zzbs.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzv(this.zzb);
        }
    }

    public final Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzbs.zzj(this.zza, i);
    }

    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzbs.zzj(this.zza, i);
        zzbs.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}
