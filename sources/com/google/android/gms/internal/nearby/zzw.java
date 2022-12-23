package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzw implements RemoteCall {
    public static final /* synthetic */ zzw zza = new zzw();

    private /* synthetic */ zzw() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzet zzet = new zzet();
        zzet.zza(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzs(zzet.zzb());
    }
}
