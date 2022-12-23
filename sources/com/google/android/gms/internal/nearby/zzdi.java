package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureWindow;
import java.util.ArrayList;

public abstract class zzdi extends zzb implements zzdj {
    public zzdi() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureWindowListCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<ExposureWindow> createTypedArrayList = parcel.createTypedArrayList(ExposureWindow.CREATOR);
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), createTypedArrayList);
        return true;
    }
}
