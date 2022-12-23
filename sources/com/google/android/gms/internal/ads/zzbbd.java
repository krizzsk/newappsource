package com.google.android.gms.internal.ads;

final class zzbbd implements Runnable {
    public final /* synthetic */ zzbbe zza;

    public zzbbd(zzbbe zzbbe) {
        this.zza = zzbbe;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzbbe zzbbe = this.zza;
            if (!zzbbe.zzd || !zzbbe.zze) {
                zzcfi.zze("App is still foreground");
            } else {
                zzbbe.zzd = false;
                zzcfi.zze("App went background");
                for (zzbbf zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e) {
                        zzcfi.zzh("", e);
                    }
                }
            }
        }
    }
}
