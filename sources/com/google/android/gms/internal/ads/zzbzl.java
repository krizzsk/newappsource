package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public abstract class zzbzl extends zzaqw implements zzbzm {
    public zzbzl() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbzq zzbzq = null;
        if (i == 1) {
            zzbzg zzbzg = (zzbzg) zzaqx.zza(parcel, zzbzg.CREATOR);
            zzaqx.zzc(parcel);
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, (Parcelable) null);
        } else if (i == 2) {
            zzbzg zzbzg2 = (zzbzg) zzaqx.zza(parcel, zzbzg.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbzn) {
                    zzbzn zzbzn = (zzbzn) queryLocalInterface;
                }
            }
            zzaqx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbzu zzbzu = (zzbzu) zzaqx.zza(parcel, zzbzu.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface2 instanceof zzbzq) {
                    zzbzq = (zzbzq) queryLocalInterface2;
                } else {
                    zzbzq = new zzbzo(readStrongBinder2);
                }
            }
            zzaqx.zzc(parcel);
            zzg(zzbzu, zzbzq);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbzu zzbzu2 = (zzbzu) zzaqx.zza(parcel, zzbzu.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface3 instanceof zzbzq) {
                    zzbzq = (zzbzq) queryLocalInterface3;
                } else {
                    zzbzq = new zzbzo(readStrongBinder3);
                }
            }
            zzaqx.zzc(parcel);
            zzf(zzbzu2, zzbzq);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbzu zzbzu3 = (zzbzu) zzaqx.zza(parcel, zzbzu.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface4 instanceof zzbzq) {
                    zzbzq = (zzbzq) queryLocalInterface4;
                } else {
                    zzbzq = new zzbzo(readStrongBinder4);
                }
            }
            zzaqx.zzc(parcel);
            zze(zzbzu3, zzbzq);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface5 instanceof zzbzq) {
                    zzbzq = (zzbzq) queryLocalInterface5;
                } else {
                    zzbzq = new zzbzo(readStrongBinder5);
                }
            }
            zzaqx.zzc(parcel);
            zzh(readString, zzbzq);
            parcel2.writeNoException();
        }
        return true;
    }
}
