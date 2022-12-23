package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

public final class zzif {
    private final zzie zza;
    private final Integer zzb;
    private final Integer zzc = null;

    public /* synthetic */ zzif(zzid zzid, zzic zzic) {
        this.zza = zzid.zza;
        this.zzb = zzid.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzif)) {
            return false;
        }
        zzif zzif = (zzif) obj;
        if (!Objects.equal(this.zza, zzif.zza) || !Objects.equal(this.zzb, zzif.zzb) || !Objects.equal((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null);
    }

    @zzcw(zza = 1)
    public final zzie zza() {
        return this.zza;
    }

    @zzcw(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
