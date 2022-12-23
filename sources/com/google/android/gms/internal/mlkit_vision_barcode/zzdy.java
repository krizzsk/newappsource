package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

public final class zzdy {
    private final zzkj zza;
    private final Boolean zzb = null;
    private final Boolean zzc;
    private final zzjy zzd;
    private final zzmy zze;
    private final zzcc zzf;
    private final zzcc zzg;

    public /* synthetic */ zzdy(zzdw zzdw, zzdx zzdx) {
        this.zza = zzdw.zza;
        this.zzc = zzdw.zzb;
        this.zzd = null;
        this.zze = zzdw.zzc;
        this.zzf = zzdw.zzd;
        this.zzg = zzdw.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdy)) {
            return false;
        }
        zzdy zzdy = (zzdy) obj;
        if (!Objects.equal(this.zza, zzdy.zza) || !Objects.equal((Object) null, (Object) null) || !Objects.equal(this.zzc, zzdy.zzc) || !Objects.equal((Object) null, (Object) null) || !Objects.equal(this.zze, zzdy.zze) || !Objects.equal(this.zzf, zzdy.zzf) || !Objects.equal(this.zzg, zzdy.zzg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @zzdj(zza = 6)
    public final zzcc zza() {
        return this.zzf;
    }

    @zzdj(zza = 7)
    public final zzcc zzb() {
        return this.zzg;
    }

    @zzdj(zza = 1)
    public final zzkj zzc() {
        return this.zza;
    }

    @zzdj(zza = 5)
    public final zzmy zzd() {
        return this.zze;
    }

    @zzdj(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
