package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzaq implements RemoteCall {
    public final /* synthetic */ zzbh zza;
    public final /* synthetic */ zzbc zzb;

    public /* synthetic */ zzaq(zzbh zzbh, zzbc zzbc) {
        this.zza = zzbh;
        this.zzb = zzbc;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zzd(this.zzb, (zzai) obj, (TaskCompletionSource) obj2);
    }
}
