package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class zzcq extends zza implements zzcs {
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
    }

    public final void zzb(Status status, List list) throws RemoteException {
        throw null;
    }
}
