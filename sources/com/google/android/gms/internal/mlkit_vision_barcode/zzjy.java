package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

public final class zzjy {
    private final zzjw zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzjy(zzjv zzjv, zzjx zzjx) {
        this.zza = zzjv.zza;
        this.zzb = zzjv.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjy)) {
            return false;
        }
        zzjy zzjy = (zzjy) obj;
        if (!Objects.equal(this.zza, zzjy.zza) || !Objects.equal(this.zzb, zzjy.zzb) || !Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    @zzdj(zza = 1)
    public final zzjw zza() {
        return this.zza;
    }

    @zzdj(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
