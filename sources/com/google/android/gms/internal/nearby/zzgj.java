package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzgj extends zzkb {
    private final ListenerHolder zza;

    public zzgj(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public final synchronized void zzb(zzlc zzlc) {
    }

    public final void zzc(zzle zzle) {
        this.zza.notifyListener(new zzgh(this, zzle));
    }

    public final void zzd(zzlg zzlg) {
        this.zza.notifyListener(new zzgi(this, zzlg));
    }
}
