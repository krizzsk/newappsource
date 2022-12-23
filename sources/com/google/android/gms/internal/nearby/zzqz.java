package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzqz implements RemoteCall {
    public final /* synthetic */ zzrs zza;

    public /* synthetic */ zzqz(zzrs zzrs) {
        this.zza = zzrs;
    }

    public final void accept(Object obj, Object obj2) {
        zzpi zzpi = new zzpi();
        zzpi.zza(new zzrg(this.zza, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzi(zzpi.zzb());
    }
}
