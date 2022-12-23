package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzqy implements RemoteCall {
    public final /* synthetic */ zzrs zza;

    public /* synthetic */ zzqy(zzrs zzrs) {
        this.zza = zzrs;
    }

    public final void accept(Object obj, Object obj2) {
        zzoh zzoh = new zzoh();
        zzoh.zza(new zzri(this.zza, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzg(zzoh.zzb());
    }
}
