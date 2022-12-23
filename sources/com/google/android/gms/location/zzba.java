package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzba implements BaseImplementation.ResultHolder {
    private final TaskCompletionSource zza;

    public zzba(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.zza);
    }
}
