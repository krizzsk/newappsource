package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzox extends zzb implements zzoy {
    public zzox() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzd((zzpm) zzc.zza(parcel, zzpm.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.zzc(parcel);
            zze((zzpo) zzc.zza(parcel, zzpo.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            zzc.zzc(parcel);
            zzf((zzpq) zzc.zza(parcel, zzpq.CREATOR));
            return true;
        }
    }
}
