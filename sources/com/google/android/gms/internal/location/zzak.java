package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

public interface zzak extends IInterface {
    void zzb(int i, String[] strArr) throws RemoteException;

    void zzc(int i, PendingIntent pendingIntent) throws RemoteException;

    void zzd(int i, String[] strArr) throws RemoteException;
}
