package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

public final class zzh extends zza {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public final void zzc(zzg zzg, UserAddressRequest userAddressRequest, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzg);
        zzc.zzb(zza, userAddressRequest);
        zzc.zzb(zza, bundle);
        zzb(2, zza);
    }
}
