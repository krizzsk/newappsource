package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzao extends IStatusCallback.Stub {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzao(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.zza);
    }
}
