package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

final class zzcaa implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcac zzb;

    public zzcaa(zzcac zzcac, Context context) {
        this.zzb = zzcac;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzz zzbzz;
        zzcab zzcab = (zzcab) this.zzb.zza.get(this.zza);
        if (zzcab != null) {
            if (((Long) zzbje.zza.zze()).longValue() + zzcab.zza >= zzt.zzA().currentTimeMillis()) {
                zzbzz = new zzbzy(this.zza, zzcab.zzb).zza();
                zzcac zzcac = this.zzb;
                zzcac.zza.put(this.zza, new zzcab(zzcac, zzbzz));
                return zzbzz;
            }
        }
        zzbzz = new zzbzy(this.zza).zza();
        zzcac zzcac2 = this.zzb;
        zzcac2.zza.put(this.zza, new zzcab(zzcac2, zzbzz));
        return zzbzz;
    }
}
