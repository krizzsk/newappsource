package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class zzav extends zzah {
    public final /* synthetic */ zzao zza;

    public zzav(zzbe zzbe, zzao zzao) {
        this.zza = zzao;
    }

    public final void zzb(zzaa zzaa) throws RemoteException {
        if (!zzaa.getStatus().isSuccess()) {
            this.zza.zzb(zzaa.getStatus(), (Location) null);
        }
    }

    public final void zzc() throws RemoteException {
        this.zza.zzb(Status.RESULT_SUCCESS, (Location) null);
    }
}
