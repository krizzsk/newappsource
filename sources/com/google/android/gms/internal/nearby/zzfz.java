package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
final class zzfz extends zzjo {
    private final ListenerHolder zza;

    public zzfz(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public final void zzb(zzku zzku) {
        this.zza.notifyListener(new zzfy(this, zzku));
    }
}
