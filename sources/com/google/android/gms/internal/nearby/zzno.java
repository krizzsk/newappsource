package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.internal.zzq;

public final class zzno extends zzq {
    private final ListenerHolder zza;
    private boolean zzb = false;

    public zzno(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzd(Status status) throws RemoteException {
        if (!this.zzb) {
            this.zza.notifyListener(new zznn(this, status));
            this.zzb = true;
            return;
        }
        String valueOf = String.valueOf(status);
        Log.wtf("NearbyMessagesCallbackWrapper", "Received multiple statuses: ".concat(valueOf), new Exception());
    }
}
