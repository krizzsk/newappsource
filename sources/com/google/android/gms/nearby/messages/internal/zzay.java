package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzay implements BaseImplementation.ResultHolder {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzay(zzbh zzbh, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    public final /* synthetic */ void setResult(Object obj) {
        Status status = (Status) obj;
        this.zza.setResult(null);
    }
}
