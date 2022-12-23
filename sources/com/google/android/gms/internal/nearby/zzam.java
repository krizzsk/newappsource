package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatus;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzam extends zzdo {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzam(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, long j) {
        TaskUtil.trySetResultOrApiException(status, ExposureNotificationStatus.zza(j), this.zza);
    }
}
