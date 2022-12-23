package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzrk extends zzpa {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzrk(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzd(int i) {
        if (i == 42004) {
            this.zza.setException(new SecurityException("Missing UWB_RANGING permission"));
        } else if (i != 0) {
            this.zza.setException(new ApiException(new Status(i, UwbStatusCodes.zza(i))));
        } else {
            this.zza.setResult(null);
        }
    }
}
