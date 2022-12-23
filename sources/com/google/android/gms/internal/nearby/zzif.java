package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzif implements BaseImplementation.ResultHolder {
    private final TaskCompletionSource zza;

    public zzif(zzih zzih, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    public final void setResult(Object obj) {
        this.zza.setResult(null);
    }
}
