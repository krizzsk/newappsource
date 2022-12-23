package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhj implements RemoteCall {
    public static final /* synthetic */ zzhj zza = new zzhj();

    private /* synthetic */ zzhj() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzih.zza;
        ((zzgy) obj).zzE();
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }
}
