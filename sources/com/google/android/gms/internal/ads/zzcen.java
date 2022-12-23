package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

final class zzcen extends zzb {
    public final /* synthetic */ zzcer zza;

    public zzcen(zzcer zzcer) {
        this.zza = zzcer;
    }

    public final void zza() {
        zzcer zzcer = this.zza;
        zzbib zzbib = new zzbib(zzcer.zze, zzcer.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                zzt.zze();
                zzbie.zza(this.zza.zzg, zzbib);
            } catch (IllegalArgumentException e) {
                zzcfi.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
