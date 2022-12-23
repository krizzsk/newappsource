package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzrd implements RemoteCall {
    public final /* synthetic */ zzrs zza;

    public /* synthetic */ zzrd(zzrs zzrs) {
        this.zza = zzrs;
    }

    public final void accept(Object obj, Object obj2) {
        zzod zzod = new zzod();
        zzod.zza(new zzrj(this.zza, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzf(zzod.zzb());
    }
}
