package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

final class zzdt extends zzax {
    public final /* synthetic */ zzdu zza;

    public zzdt(zzdu zzdu) {
        this.zza = zzdu;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzdu zzdu = this.zza;
        zzdu.zze.zzb(zzdu.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    public final void onAdLoaded() {
        zzdu zzdu = this.zza;
        zzdu.zze.zzb(zzdu.zzi());
        super.onAdLoaded();
    }
}
