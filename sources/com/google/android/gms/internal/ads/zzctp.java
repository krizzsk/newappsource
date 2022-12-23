package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

final class zzctp implements zzfuw {
    public final /* synthetic */ zzctr zza;

    public zzctp(zzctr zzctr) {
        this.zza = zzctr;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctr zzctr = this.zza;
        zzfch zzd = zzctr.zzh;
        List zzb = zzctr.zzg.zzb(zzctr.zze, zzctr.zzf, false, "", (String) obj, zzctr.zzf.zzc);
        int i = 1;
        if (true == zzt.zzo().zzv(this.zza.zza)) {
            i = 2;
        }
        zzd.zzc(zzb, i);
    }
}
