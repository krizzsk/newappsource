package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;

public abstract class zzde extends zzb implements zzdf {
    public zzde() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (ExposureSummary) zzc.zza(parcel, ExposureSummary.CREATOR));
        return true;
    }
}
