package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzp implements RemoteCall {
    public static final /* synthetic */ zzp zza = new zzp();

    private /* synthetic */ zzp() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzex zzex = new zzex();
        zzex.zza(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzt(zzex.zzb());
    }
}
