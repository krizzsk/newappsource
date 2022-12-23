package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzag implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzag(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzan zzan = new zzan(this.zza, (TaskCompletionSource) obj2);
        zzbw zzbw = new zzbw();
        zzbw.zza(zzan);
        ((zzdr) ((zzn) obj).getService()).zzj(zzbw.zzb());
    }
}
