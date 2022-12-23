package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzra implements RemoteCall {
    public final /* synthetic */ zzrs zza;
    public final /* synthetic */ UwbAddress zzb;

    public /* synthetic */ zzra(zzrs zzrs, UwbAddress uwbAddress) {
        this.zza = zzrs;
        this.zzb = uwbAddress;
    }

    public final void accept(Object obj, Object obj2) {
        zzrs zzrs = this.zza;
        UwbAddress uwbAddress = this.zzb;
        zzqc zzqc = new zzqc();
        zzqo zzqo = new zzqo();
        zzqo.zza(uwbAddress.getAddress());
        zzqc.zza(zzqo.zzb());
        zzqc.zzb(new zzrk(zzrs, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzj(zzqc.zzc());
    }
}
