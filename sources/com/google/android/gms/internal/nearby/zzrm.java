package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzrm implements RemoteCall {
    public final /* synthetic */ Runnable zza;

    public /* synthetic */ zzrm(Runnable runnable) {
        this.zza = runnable;
    }

    public final void accept(Object obj, Object obj2) {
        zzqs zzqs = (zzqs) obj;
        this.zza.run();
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
