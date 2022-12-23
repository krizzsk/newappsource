package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

public final class zzbxg extends zzbmn {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbxg(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    public final void zze(zzbmx zzbmx) {
        this.zza.onNativeAdLoaded(new zzbwz(zzbmx));
    }
}
