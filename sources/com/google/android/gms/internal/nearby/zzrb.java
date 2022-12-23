package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzrb implements RemoteCall {
    public final /* synthetic */ zzrs zza;

    public /* synthetic */ zzrb(zzrs zzrs) {
        this.zza = zzrs;
    }

    public final void accept(Object obj, Object obj2) {
        zzol zzol = new zzol();
        zzol.zza(new zzrh(this.zza, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzh(zzol.zzb());
    }
}
