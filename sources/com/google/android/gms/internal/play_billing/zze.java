package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zze implements IInterface {
    private final IBinder zza;
    private final String zzb = "com.android.vending.billing.IInAppBillingService";

    public zze(IBinder iBinder, String str) {
        this.zza = iBinder;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zzn() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final Parcel zzo(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.zza.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
