package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final IObjectWrapper zzd() throws RemoteException {
        return C25541a.m63873c(zzH(4, zza()));
    }

    public final IObjectWrapper zze(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return C25541a.m63873c(zzH(5, zza));
    }

    public final IObjectWrapper zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C25541a.m63873c(zzH(2, zza));
    }

    public final IObjectWrapper zzg(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        return C25541a.m63873c(zzH(6, zza));
    }

    public final IObjectWrapper zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C25541a.m63873c(zzH(3, zza));
    }

    public final IObjectWrapper zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C25541a.m63873c(zzH(7, zza));
    }

    public final IObjectWrapper zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return C25541a.m63873c(zzH(1, zza));
    }
}
