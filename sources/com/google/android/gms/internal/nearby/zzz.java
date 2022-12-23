package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzz implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzz(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzak zzak = new zzak(this.zza, (TaskCompletionSource) obj2);
        zzay zzay = new zzay();
        zzay.zza(zzak);
        ((zzdr) ((zzn) obj).getService()).zzd(zzay.zzb());
    }
}
