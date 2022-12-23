package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhe implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ListenerHolder zzc;

    public /* synthetic */ zzhe(zzih zzih, String str, ListenerHolder listenerHolder) {
        this.zza = zzih;
        this.zzb = str;
        this.zzc = listenerHolder;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        ((zzgy) obj).zzq(new zzif(zzih, (TaskCompletionSource) obj2), this.zzb, this.zzc);
    }
}
