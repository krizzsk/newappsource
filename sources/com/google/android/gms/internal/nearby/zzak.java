package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzak extends zzdl {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzak(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, int i) {
        TaskUtil.trySetResultOrApiException(status, Integer.valueOf(i), this.zza);
    }
}
