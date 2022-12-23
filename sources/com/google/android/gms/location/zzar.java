package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzar extends zzah {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzar(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(zzaa zzaa) {
        Status status = zzaa.getStatus();
        if (status == null) {
            this.zza.trySetException(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.zza.setResult(Boolean.TRUE);
        } else {
            this.zza.trySetException(ApiExceptionUtil.fromStatus(status));
        }
    }

    public final void zzc() {
    }
}
