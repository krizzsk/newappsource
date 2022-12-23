package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p983h5.OnH5AdsEventListener;

public final class zzbpd extends zzbpf {
    private final OnH5AdsEventListener zza;

    public zzbpd(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
