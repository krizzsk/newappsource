package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaq extends zzaw {
    public final /* synthetic */ ListenerHolder zza;
    public final /* synthetic */ FusedLocationProviderClient zzb;

    public zzaq(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.zzb = fusedLocationProviderClient;
        this.zza = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        zzbe zzbe = (zzbe) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (zzb()) {
            zzar zzar = new zzar(this.zzb, taskCompletionSource);
            ListenerHolder.ListenerKey listenerKey = this.zza.getListenerKey();
            if (listenerKey != null) {
                zzbe.zzy(listenerKey, zzar);
            }
        }
    }
}
