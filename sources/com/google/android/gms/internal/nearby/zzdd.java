package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;

public final class zzdd extends zza implements zzdf {
    public zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
    }

    public final void zzb(Status status, ExposureSummary exposureSummary) throws RemoteException {
        throw null;
    }
}
