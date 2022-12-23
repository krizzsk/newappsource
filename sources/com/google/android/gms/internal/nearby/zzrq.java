package com.google.android.gms.internal.nearby;

import android.annotation.SuppressLint;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

final class zzrq extends zznp {
    public final /* synthetic */ zzpq zza;
    public final /* synthetic */ zzrr zzb;

    public zzrq(zzrr zzrr, zzpq zzpq) {
        this.zzb = zzrr;
        this.zza = zzpq;
    }

    @SuppressLint({"WrongConstant"})
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((RangingSessionCallback) obj).onRangingSuspended(UwbDevice.createForAddress(this.zza.zzb().zza().zzb()), this.zza.zza());
    }

    @SuppressLint({"WrongConstant"})
    public final void onNotifyListenerFailed() {
        zzrr zzrr = this.zzb;
        zzrr.zzc.onRangingSuspended(UwbDevice.createForAddress(this.zza.zzb().zza().zzb()), this.zza.zza());
    }
}
