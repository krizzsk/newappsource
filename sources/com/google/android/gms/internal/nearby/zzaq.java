package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaq extends zzcn {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzaq(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, boolean z) {
        TaskUtil.trySetResultOrApiException(status, Boolean.valueOf(z), this.zza);
    }
}
