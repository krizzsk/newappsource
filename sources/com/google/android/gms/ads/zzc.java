package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbyx;

public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ BaseAdView zza;
    public final /* synthetic */ AdRequest zzb;

    public /* synthetic */ zzc(BaseAdView baseAdView, AdRequest adRequest) {
        this.zza = baseAdView;
        this.zzb = adRequest;
    }

    public final void run() {
        BaseAdView baseAdView = this.zza;
        try {
            baseAdView.zza.zzm(this.zzb.zza());
        } catch (IllegalStateException e) {
            zzbyx.zza(baseAdView.getContext()).zzd(e, "BaseAdView.loadAd");
        }
    }
}
