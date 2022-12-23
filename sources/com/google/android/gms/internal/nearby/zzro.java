package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

final class zzro extends zznp {
    public final /* synthetic */ zzpm zza;
    public final /* synthetic */ zzrr zzb;

    public zzro(zzrr zzrr, zzpm zzpm) {
        this.zzb = zzrr;
        this.zza = zzpm;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((RangingSessionCallback) obj).onRangingInitialized(UwbDevice.createForAddress(this.zza.zza().zza().zzb()));
    }
}
