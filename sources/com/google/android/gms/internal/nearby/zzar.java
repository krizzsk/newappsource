package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

final class zzar extends zzdx {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzar(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, List list) {
        TaskUtil.trySetResultOrApiException(status, list, this.zza);
    }
}
