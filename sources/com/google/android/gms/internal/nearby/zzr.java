package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzr implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzr(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzai zzai = new zzai(this.zza, (TaskCompletionSource) obj2);
        zzci zzci = new zzci();
        zzci.zza(zzai);
        ((zzdr) ((zzn) obj).getService()).zzm(zzci.zzb());
    }
}
