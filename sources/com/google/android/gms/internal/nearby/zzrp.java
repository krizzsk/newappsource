package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

final class zzrp extends zznp {
    public final /* synthetic */ zzpo zza;
    public final /* synthetic */ zzrr zzb;

    public zzrp(zzrr zzrr, zzpo zzpo) {
        this.zzb = zzrr;
        this.zza = zzpo;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((RangingSessionCallback) obj).onRangingResult(UwbDevice.createForAddress(this.zza.zzb().zza().zzb()), zzrr.zzb(this.zzb, this.zza.zza()));
    }
}
