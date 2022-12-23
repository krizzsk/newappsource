package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzae implements RemoteCall {
    public static final /* synthetic */ zzae zza = new zzae();

    private /* synthetic */ zzae() {
    }

    public final void accept(Object obj, Object obj2) {
        ((TaskCompletionSource) obj2).setResult(((zzbe) obj).zzp());
    }
}
