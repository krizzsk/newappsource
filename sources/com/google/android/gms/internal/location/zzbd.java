package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

final class zzbd extends zzap {
    private final BaseImplementation.ResultHolder zza;

    public zzbd(BaseImplementation.ResultHolder resultHolder) {
        boolean z;
        if (resultHolder != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        this.zza = resultHolder;
    }

    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
