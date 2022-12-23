package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;

final class zzp implements zzgz {
    public final zzci zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzci) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzci;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.zza.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfy zzfy = this.zzb.zza;
            if (zzfy != null) {
                zzfy.zzay().zzk().zzb("Event listener threw exception", e);
            }
        }
    }
}
