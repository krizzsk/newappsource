package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzap extends zzan {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzap(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, Location location) {
        TaskUtil.trySetResultOrApiException(status, location, this.zza);
    }
}
