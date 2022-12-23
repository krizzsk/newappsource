package com.google.android.gms.internal.nearby;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;

public interface zzdf extends IInterface {
    void zzb(Status status, ExposureSummary exposureSummary) throws RemoteException;
}
