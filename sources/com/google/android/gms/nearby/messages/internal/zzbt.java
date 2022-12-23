package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznp;

final class zzbt extends zzu {
    private static final zznp zza = new zzbs();
    private final ListenerHolder zzb;

    public zzbt(ListenerHolder listenerHolder) {
        this.zzb = listenerHolder;
    }

    public final void zzd() {
        this.zzb.notifyListener(zza);
    }
}
