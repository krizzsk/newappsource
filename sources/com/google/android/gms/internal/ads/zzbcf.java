package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbcf extends IInterface {
    zzbs zze() throws RemoteException;

    zzdh zzf() throws RemoteException;

    void zzg(boolean z) throws RemoteException;

    void zzh(zzde zzde) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzbcm zzbcm) throws RemoteException;

    void zzj(zzbcj zzbcj) throws RemoteException;
}
