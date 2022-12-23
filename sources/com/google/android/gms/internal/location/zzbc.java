package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzbk;

final class zzbc extends zzbk {
    private final ListenerHolder zza;

    public zzbc(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    public final synchronized void zzd(Location location) {
        this.zza.notifyListener(new zzbb(this, location));
    }
}
