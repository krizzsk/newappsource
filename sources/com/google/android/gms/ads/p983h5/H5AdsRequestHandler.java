package com.google.android.gms.ads.p983h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpn;

/* renamed from: com.google.android.gms.ads.h5.H5AdsRequestHandler */
public final class H5AdsRequestHandler {
    private final zzbpn zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbpn(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbpn.zzc(str);
    }
}
