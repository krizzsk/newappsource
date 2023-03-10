package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

public final class zzbnj extends zzbmt {
    private final UnifiedNativeAd.UnconfirmedClickListener zza;

    public zzbnj(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
