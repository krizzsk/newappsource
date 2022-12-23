package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhs implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Payload zzc;

    public /* synthetic */ zzhs(zzih zzih, String str, Payload payload) {
        this.zza = zzih;
        this.zzb = str;
        this.zzc = payload;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        String str = this.zzb;
        Payload payload = this.zzc;
        ((zzgy) obj).zzy(new zzif(zzih, (TaskCompletionSource) obj2), new String[]{str}, payload, false);
    }
}
