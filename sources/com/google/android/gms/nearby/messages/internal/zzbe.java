package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznp;

class zzbe extends zzu {
    private static final zznp zza = new zzbd();
    private final ListenerHolder zzb;

    public zzbe(ListenerHolder listenerHolder) {
        this.zzb = listenerHolder;
    }

    public void zzd() {
        ListenerHolder listenerHolder = this.zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(zza);
        }
    }
}
