package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznp;

final class zzbw extends zzaa {
    private static final zznp zza = new zzbv();
    private final ListenerHolder zzb;

    public zzbw(ListenerHolder listenerHolder) {
        this.zzb = listenerHolder;
    }

    public final void zzd() {
        this.zzb.notifyListener(zza);
    }
}
