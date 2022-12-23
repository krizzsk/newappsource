package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

public final class zzcr extends zzcp {
    private final MuteThisAdListener zza;

    public zzcr(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    public final void zze() {
        this.zza.onAdMuted();
    }
}
