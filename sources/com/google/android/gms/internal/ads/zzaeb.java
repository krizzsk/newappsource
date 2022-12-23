package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;

final class zzaeb implements zzady {
    private final zzdy zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaeb(zzadv zzadv) {
        zzdy zzdy = zzadv.zza;
        this.zza = zzdy;
        zzdy.zzF(12);
        this.zzc = zzdy.zzn() & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        this.zzb = zzdy.zzn();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzk();
        }
        if (i == 16) {
            return this.zza.zzo();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzk = this.zza.zzk();
        this.zze = zzk;
        return (zzk & 240) >> 4;
    }
}
