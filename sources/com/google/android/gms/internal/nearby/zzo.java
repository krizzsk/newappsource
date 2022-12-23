package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzo implements RemoteCall {
    public static final /* synthetic */ zzo zza = new zzo();

    private /* synthetic */ zzo() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzel zzel = new zzel();
        zzel.zza(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzq(zzel.zzb());
    }
}
