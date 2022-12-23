package com.google.android.gms.internal.contextmanager;

import android.location.Location;
import com.google.android.gms.awareness.snapshot.LocationResult;
import com.google.android.gms.common.api.Status;

final class zzah implements LocationResult {
    public final /* synthetic */ zzaq zza;

    public zzah(zzai zzai, zzaq zzaq) {
        this.zza = zzaq;
    }

    public final Location getLocation() {
        zzz zza2 = this.zza.zza();
        if (zza2 == null) {
            return null;
        }
        return zza2.zza();
    }

    public final Status getStatus() {
        return this.zza.getStatus();
    }
}
