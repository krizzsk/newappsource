package com.google.android.gms.internal.nearby;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

public interface zzcy extends IInterface {
    void zzb(Status status, DiagnosisKeysDataMapping diagnosisKeysDataMapping) throws RemoteException;
}
