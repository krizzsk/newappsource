package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzq implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzq(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzam zzam = new zzam(this.zza, (TaskCompletionSource) obj2);
        zzca zzca = new zzca();
        zzca.zza(zzam);
        ((zzdr) ((zzn) obj).getService()).zzk(zzca.zzb());
    }
}
