package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhv implements RemoteCall {
    public static final /* synthetic */ zzhv zza = new zzhv();

    private /* synthetic */ zzhv() {
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzih.zza;
        ((zzgy) obj).zzC();
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }
}
