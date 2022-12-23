package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.internal.Preconditions;

public final class zzc {
    private int zza = 0;

    public final zzc zza(int i) {
        this.zza = i;
        return this;
    }

    public final zze zzb() {
        boolean z;
        if (this.zza != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "deviceType must be set.");
        return new zze(this.zza, false, (String) null, (zzd) null);
    }
}
