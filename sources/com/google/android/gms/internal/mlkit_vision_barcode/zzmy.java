package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

public final class zzmy {
    private final zzcc zza;

    public /* synthetic */ zzmy(zzmw zzmw, zzmx zzmx) {
        this.zza = zzmw.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmy)) {
            return false;
        }
        return Objects.equal(this.zza, ((zzmy) obj).zza);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @zzdj(zza = 1)
    public final zzcc zza() {
        return this.zza;
    }
}
