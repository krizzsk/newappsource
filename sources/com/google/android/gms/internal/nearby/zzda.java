package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureInformation;
import java.util.ArrayList;

public abstract class zzda extends zzb implements zzdb {
    public zzda() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<ExposureInformation> createTypedArrayList = parcel.createTypedArrayList(ExposureInformation.CREATOR);
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), createTypedArrayList);
        return true;
    }
}
