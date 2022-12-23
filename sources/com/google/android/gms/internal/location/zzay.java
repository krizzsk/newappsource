package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzbh;

final class zzay extends zzbh {
    private final ListenerHolder zza;

    public zzay(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    public final void zzd(LocationAvailability locationAvailability) {
        this.zza.notifyListener(new zzax(this, locationAvailability));
    }

    public final void zze(LocationResult locationResult) {
        this.zza.notifyListener(new zzaw(this, locationResult));
    }
}
