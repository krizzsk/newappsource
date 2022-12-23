package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzav extends zzde {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzav(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, ExposureSummary exposureSummary) {
        TaskUtil.trySetResultOrApiException(status, exposureSummary, this.zza);
    }
}
