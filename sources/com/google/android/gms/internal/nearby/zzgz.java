package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzgz implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ zzid zzb;

    public /* synthetic */ zzgz(zzih zzih, zzid zzid) {
        this.zza = zzih;
        this.zzb = zzid;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzb.zza((zzgy) obj, new zzif(this.zza, (TaskCompletionSource) obj2));
    }
}
