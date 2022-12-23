package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzai extends zzdo {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzai(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, long j) {
        TaskUtil.trySetResultOrApiException(status, Long.valueOf(j), this.zza);
    }
}
