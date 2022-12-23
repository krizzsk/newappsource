package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;

final class zzaux implements zzauu {
    private final zzazg zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaux(zzaur zzaur) {
        zzazg zzazg = zzaur.zza;
        this.zza = zzazg;
        zzazg.zzv(12);
        this.zzc = zzazg.zzi() & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        this.zzb = zzazg.zzi();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzg();
        }
        if (i == 16) {
            return this.zza.zzj();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzg = this.zza.zzg();
        this.zze = zzg;
        return (zzg & 240) >> 4;
    }

    public final boolean zzc() {
        return false;
    }
}
