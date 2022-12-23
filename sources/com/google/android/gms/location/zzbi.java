package com.google.android.gms.location;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzbi extends IInterface {
    void zzd(LocationAvailability locationAvailability) throws RemoteException;

    void zze(LocationResult locationResult) throws RemoteException;
}
