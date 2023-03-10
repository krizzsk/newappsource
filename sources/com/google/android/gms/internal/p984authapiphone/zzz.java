package com.google.android.gms.internal.p984authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzz */
final class zzz extends zzi {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzab zzab, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.zza);
    }
}
