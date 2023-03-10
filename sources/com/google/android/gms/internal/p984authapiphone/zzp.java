package com.google.android.gms.internal.p984authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzp */
final class zzp extends zzd {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzr, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, int i) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i), this.zza);
    }
}
