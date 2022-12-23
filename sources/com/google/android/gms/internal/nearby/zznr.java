package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.internal.zzx;

public final class zznr extends zzx {
    private final ListenerHolder zza;

    public zznr(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final void zzd(boolean z) {
        this.zza.notifyListener(new zznq(this, z));
    }
}
