package com.google.android.gms.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzn extends TaskApiCall<zzx, Void> {
    public zzn(SafetyNetClient safetyNetClient) {
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzi) ((zzx) anyClient).getService()).zzb();
    }
}
