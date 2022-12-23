package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class zzcz extends zza implements zzdb {
    public zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback");
    }

    public final void zzb(Status status, List list) throws RemoteException {
        throw null;
    }
}
