package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzad implements RemoteCall {
    public static final /* synthetic */ zzad zza = new zzad();

    private /* synthetic */ zzad() {
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzs(new zzav((TaskCompletionSource) obj2));
    }
}
