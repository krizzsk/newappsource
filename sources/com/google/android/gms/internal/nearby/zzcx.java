package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

public abstract class zzcx extends zzb implements zzcy {
    public zzcx() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeysDataMappingCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (DiagnosisKeysDataMapping) zzc.zza(parcel, DiagnosisKeysDataMapping.CREATOR));
        return true;
    }
}
