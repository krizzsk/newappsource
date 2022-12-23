package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

public final class zzib {
    private final zzhz zza;
    private final zzhx zzb;
    private final zzia zzc;
    private final zzhy zzd;
    private final Boolean zze;
    private final Float zzf;

    public /* synthetic */ zzib(zzhw zzhw, zzhv zzhv) {
        this.zza = zzhw.zza;
        this.zzb = zzhw.zzb;
        this.zzc = zzhw.zzc;
        this.zzd = zzhw.zzd;
        this.zze = zzhw.zze;
        this.zzf = zzhw.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzib)) {
            return false;
        }
        zzib zzib = (zzib) obj;
        if (!Objects.equal(this.zza, zzib.zza) || !Objects.equal(this.zzb, zzib.zzb) || !Objects.equal(this.zzc, zzib.zzc) || !Objects.equal(this.zzd, zzib.zzd) || !Objects.equal(this.zze, zzib.zze) || !Objects.equal(this.zzf, zzib.zzf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @zzcw(zza = 1)
    public final zzhz zza() {
        return this.zza;
    }

    @zzcw(zza = 2)
    public final zzhx zzb() {
        return this.zzb;
    }

    @zzcw(zza = 3)
    public final zzia zzc() {
        return this.zzc;
    }

    @zzcw(zza = 4)
    public final zzhy zzd() {
        return this.zzd;
    }

    @zzcw(zza = 5)
    public final Boolean zze() {
        return this.zze;
    }

    @zzcw(zza = 6)
    public final Float zzf() {
        return this.zzf;
    }
}
