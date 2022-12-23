package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;

class zzav extends zzah {
    private final TaskCompletionSource zza;

    public zzav(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(zzaa zzaa) {
        TaskUtil.setResultOrApiException(zzaa.getStatus(), this.zza);
    }

    public void zzc() {
    }
}
