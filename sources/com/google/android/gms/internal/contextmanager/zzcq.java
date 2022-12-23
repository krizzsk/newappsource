package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzcq extends zzb implements zzcr {
    public zzcq() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzj((Status) zzc.zza(parcel, Status.CREATOR));
                break;
            case 2:
                Parcelable.Creator creator = DataHolder.CREATOR;
                zzh((Status) zzc.zza(parcel, Status.CREATOR), (DataHolder) zzc.zza(parcel, creator), (DataHolder) zzc.zza(parcel, creator));
                break;
            case 3:
                zzk((Status) zzc.zza(parcel, Status.CREATOR), (zzct) zzc.zza(parcel, zzct.CREATOR));
                break;
            case 5:
                zze((Status) zzc.zza(parcel, Status.CREATOR), (DataHolder) zzc.zza(parcel, DataHolder.CREATOR));
                break;
            case 6:
                zzi((Status) zzc.zza(parcel, Status.CREATOR), (zzz) zzc.zza(parcel, zzz.CREATOR));
                break;
            case 7:
                zzg((Status) zzc.zza(parcel, Status.CREATOR), (zzbq) zzc.zza(parcel, zzbq.CREATOR));
                break;
            case 8:
                zzf((Status) zzc.zza(parcel, Status.CREATOR), (zzbo) zzc.zza(parcel, zzbo.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
