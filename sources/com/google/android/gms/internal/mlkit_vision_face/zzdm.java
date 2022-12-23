package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

public final class zzdm {
    private final zzin zza;
    private final Boolean zzb;
    private final zzif zzc;
    private final zzib zzd;
    private final Integer zze;
    private final Integer zzf;

    public /* synthetic */ zzdm(zzdl zzdl, zzdj zzdj) {
        this.zza = zzdl.zza;
        this.zzb = zzdl.zzb;
        this.zzc = zzdl.zzc;
        this.zzd = zzdl.zzd;
        this.zze = zzdl.zze;
        this.zzf = zzdl.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdm = (zzdm) obj;
        if (!Objects.equal(this.zza, zzdm.zza) || !Objects.equal(this.zzb, zzdm.zzb) || !Objects.equal(this.zzc, zzdm.zzc) || !Objects.equal(this.zzd, zzdm.zzd) || !Objects.equal(this.zze, zzdm.zze) || !Objects.equal(this.zzf, zzdm.zzf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @zzcw(zza = 1)
    public final zzin zza() {
        return this.zza;
    }

    @zzcw(zza = 2)
    public final Boolean zzb() {
        return this.zzb;
    }

    @zzcw(zza = 3)
    public final zzif zzc() {
        return this.zzc;
    }

    @zzcw(zza = 4)
    public final zzib zzd() {
        return this.zzd;
    }

    @zzcw(zza = 5)
    public final Integer zze() {
        return this.zze;
    }

    @zzcw(zza = 6)
    public final Integer zzf() {
        return this.zzf;
    }
}
