package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

public final /* synthetic */ class zzhh implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ Payload zzc;

    public /* synthetic */ zzhh(zzih zzih, List list, Payload payload) {
        this.zza = zzih;
        this.zzb = list;
        this.zzc = payload;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        List list = this.zzb;
        ((zzgy) obj).zzy(new zzif(zzih, (TaskCompletionSource) obj2), (String[]) list.toArray(new String[0]), this.zzc, false);
    }
}
