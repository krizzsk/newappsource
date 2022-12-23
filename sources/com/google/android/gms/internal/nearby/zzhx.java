package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhx implements RemoteCall {
    public final /* synthetic */ zzig zza;

    public /* synthetic */ zzhx(zzig zzig) {
        this.zza = zzig;
    }

    public final void accept(Object obj, Object obj2) {
        int i = zzih.zza;
        this.zza.zza((zzgy) obj);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
