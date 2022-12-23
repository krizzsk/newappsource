package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzrn implements RemoteCall {
    public static final /* synthetic */ zzrn zza = new zzrn();

    private /* synthetic */ zzrn() {
    }

    public final void accept(Object obj, Object obj2) {
        zzqs zzqs = (zzqs) obj;
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
