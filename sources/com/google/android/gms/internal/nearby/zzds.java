package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;

public final class zzds extends zza implements zzdu {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IPackageConfigurationCallback");
    }

    public final void zzb(Status status, PackageConfiguration packageConfiguration) throws RemoteException {
        throw null;
    }
}
