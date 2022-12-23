package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public abstract class zzcr extends zzb implements zzcs {
    public zzcr() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList zzb = zzc.zzb(parcel);
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), zzb);
        return true;
    }
}
