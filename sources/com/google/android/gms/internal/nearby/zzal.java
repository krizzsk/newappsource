package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzal extends zzcx {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzal(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        TaskUtil.trySetResultOrApiException(status, diagnosisKeysDataMapping, this.zza);
    }
}
