package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
final class zzgb extends zzjx {
    private final ListenerHolder zza;

    public zzgb(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public final void zzb(zzkw zzkw) {
        this.zza.notifyListener(new zzga(this, zzkw));
    }
}
