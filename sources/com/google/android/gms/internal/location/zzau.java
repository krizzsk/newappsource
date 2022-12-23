package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnTokenCanceledListener;

final class zzau extends LocationCallback {
    public final /* synthetic */ zzao zza;
    public final /* synthetic */ OnTokenCanceledListener zzb;

    public zzau(zzbe zzbe, zzao zzao, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = zzao;
        this.zzb = onTokenCanceledListener;
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }

    public final void onLocationResult(LocationResult locationResult) {
        try {
            this.zza.zzb(Status.RESULT_SUCCESS, locationResult.getLastLocation());
            this.zzb.onCanceled();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
