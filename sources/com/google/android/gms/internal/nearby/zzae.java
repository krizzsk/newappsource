package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzae implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzae(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzar zzar = new zzar(this.zza, (TaskCompletionSource) obj2);
        zzce zzce = new zzce();
        zzce.zza(zzar);
        ((zzdr) ((zzn) obj).getService()).zzl(zzce.zzb());
    }
}
