package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

public final class zzbni extends zzbmn {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbni(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    public final void zze(zzbmx zzbmx) {
        this.zza.onUnifiedNativeAdLoaded(new zzbmy(zzbmx));
    }
}
