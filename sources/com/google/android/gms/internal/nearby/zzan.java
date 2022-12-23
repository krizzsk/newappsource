package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzan extends zzdt {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzan(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, PackageConfiguration packageConfiguration) {
        TaskUtil.trySetResultOrApiException(status, packageConfiguration, this.zza);
    }
}
