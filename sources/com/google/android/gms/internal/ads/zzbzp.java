package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

public abstract class zzbzp extends zzaqw implements zzbzq {
    public zzbzp() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzaqx.zzc(parcel);
            zzf((ParcelFileDescriptor) zzaqx.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zze((zzaz) zzaqx.zza(parcel, zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
