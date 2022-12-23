package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzau extends zzav {
    private final zzaf zza;

    public zzau(TaskCompletionSource taskCompletionSource, zzaf zzaf, byte[] bArr) {
        super(taskCompletionSource);
        this.zza = zzaf;
    }

    public final void zzc() {
        zzaf zzaf = this.zza;
        FusedLocationProviderClient fusedLocationProviderClient = zzaf.zza;
        zzaw zzaw = zzaf.zzb;
        ListenerHolder listenerHolder = zzaf.zzc;
        zzaw.zza(false);
        ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
        if (listenerKey != null) {
            fusedLocationProviderClient.doUnregisterEventListener(listenerKey);
        }
    }
}
