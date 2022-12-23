package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

final class zzegr implements zzfuw {
    public final /* synthetic */ zzegs zza;

    public zzegr(zzegs zzegs) {
        this.zza = zzegs;
    }

    public final void zza(Throwable th) {
        zze zza2 = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zza(zza2);
        zzfcs.zzb(zza2.zza, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object obj) {
        ((zzcvu) obj).zzW();
    }
}
