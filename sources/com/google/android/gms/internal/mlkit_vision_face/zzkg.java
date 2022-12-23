package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.datatransport.Priority;

public abstract class zzkg {
    public static zzkf zzf(String str) {
        zzkd zzkd = new zzkd();
        zzkd.zza(str);
        zzkd.zzb(false);
        zzkd.zzc(true);
        zzkd.zzd(Priority.VERY_LOW);
        zzkd.zze(0);
        return zzkd;
    }

    public abstract String zza();

    public abstract boolean zzb();

    public abstract boolean zzc();

    public abstract Priority zzd();

    public abstract int zze();
}
