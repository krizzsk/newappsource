package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
final class zzgn extends zzjr {
    /* access modifiers changed from: private */
    public final Context zza;
    private final ListenerHolder zzb;

    public zzgn(Context context, ListenerHolder listenerHolder) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public final void zzc(zzla zzla) {
        this.zzb.notifyListener(new zzgm(this, zzla));
    }

    public final void zzd(zzli zzli) {
        this.zzb.notifyListener(new zzgl(this, zzli));
    }
}
