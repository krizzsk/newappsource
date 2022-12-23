package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

public final class zziq {
    private final String zza;
    private final String zzb = null;
    private final zzio zzc;
    private final String zzd;
    private final String zze;
    private final zzin zzf;
    private final Long zzg;
    private final Boolean zzh;
    private final Boolean zzi;

    public /* synthetic */ zziq(zzim zzim, zzip zzip) {
        this.zza = zzim.zza;
        this.zzc = zzim.zzb;
        this.zzd = null;
        this.zze = zzim.zzc;
        this.zzf = zzim.zzd;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziq = (zziq) obj;
        if (!Objects.equal(this.zza, zziq.zza) || !Objects.equal((Object) null, (Object) null) || !Objects.equal(this.zzc, zziq.zzc) || !Objects.equal((Object) null, (Object) null) || !Objects.equal(this.zze, zziq.zze) || !Objects.equal(this.zzf, zziq.zzf) || !Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    @zzbi(zza = 6)
    public final zzin zza() {
        return this.zzf;
    }

    @zzbi(zza = 3)
    public final zzio zzb() {
        return this.zzc;
    }

    @zzbi(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @zzbi(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}
