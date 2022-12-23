package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbs;

final class zzbng implements Runnable {
    public final /* synthetic */ AdManagerAdView zza;
    public final /* synthetic */ zzbs zzb;
    public final /* synthetic */ zzbnh zzc;

    public zzbng(zzbnh zzbnh, AdManagerAdView adManagerAdView, zzbs zzbs) {
        this.zzc = zzbnh;
        this.zza = adManagerAdView;
        this.zzb = zzbs;
    }

    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
        } else {
            zzcfi.zzj("Could not bind.");
        }
    }
}
