package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhr implements RemoteCall {
    public static final /* synthetic */ zzhr zza = new zzhr();

    private /* synthetic */ zzhr() {
    }

    public final void accept(Object obj, Object obj2) {
        zzgy zzgy = (zzgy) obj;
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }
}
