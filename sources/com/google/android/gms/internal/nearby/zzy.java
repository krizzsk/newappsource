package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzy implements RemoteCall {
    public static final /* synthetic */ zzy zza = new zzy();

    private /* synthetic */ zzy() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzeh zzeh = new zzeh();
        zzeh.zza(false);
        zzeh.zzb(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzp(zzeh.zzc());
    }
}
