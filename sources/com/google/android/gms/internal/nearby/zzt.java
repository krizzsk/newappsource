package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzt implements RemoteCall {
    public static final /* synthetic */ zzt zza = new zzt();

    private /* synthetic */ zzt() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzeh zzeh = new zzeh();
        zzeh.zza(true);
        zzeh.zzb(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzp(zzeh.zzc());
    }
}
