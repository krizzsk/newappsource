package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzrc implements RemoteCall {
    public final /* synthetic */ zzrs zza;
    public final /* synthetic */ UwbAddress zzb;

    public /* synthetic */ zzrc(zzrs zzrs, UwbAddress uwbAddress) {
        this.zza = zzrs;
        this.zzb = uwbAddress;
    }

    public final void accept(Object obj, Object obj2) {
        zzrs zzrs = this.zza;
        UwbAddress uwbAddress = this.zzb;
        zznx zznx = new zznx();
        zzqo zzqo = new zzqo();
        zzqo.zza(uwbAddress.getAddress());
        zznx.zza(zzqo.zzb());
        zznx.zzb(new zzrk(zzrs, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzd(zznx.zzc());
    }
}
