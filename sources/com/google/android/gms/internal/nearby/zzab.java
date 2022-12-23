package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzab implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzab(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzal zzal = new zzal(this.zza, (TaskCompletionSource) obj2);
        zzbg zzbg = new zzbg();
        zzbg.zza(zzal);
        ((zzdr) ((zzn) obj).getService()).zzf(zzbg.zzb());
    }
}
