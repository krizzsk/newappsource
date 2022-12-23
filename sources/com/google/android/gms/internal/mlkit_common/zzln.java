package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

public abstract class zzln {
    public static zzlm zzh() {
        zzkz zzkz = new zzkz();
        zzkz.zzg("NA");
        zzkz.zzf(false);
        zzkz.zze(false);
        zzkz.zzd(ModelType.UNKNOWN);
        zzkz.zzb(zzid.NO_ERROR);
        zzkz.zza(zzij.UNKNOWN_STATUS);
        zzkz.zzc(0);
        return zzkz;
    }

    public abstract int zza();

    public abstract ModelType zzb();

    public abstract zzid zzc();

    public abstract zzij zzd();

    public abstract String zze();

    public abstract boolean zzf();

    public abstract boolean zzg();
}
