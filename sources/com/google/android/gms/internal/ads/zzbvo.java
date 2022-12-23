package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbvo extends zzaqw implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zze(readString);
        } else if (i != 4) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzf((zze) zzaqx.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
