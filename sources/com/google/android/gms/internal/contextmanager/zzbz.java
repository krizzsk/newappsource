package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.common.internal.Preconditions;

public final class zzbz {
    private final zzhn zza;

    public zzbz(zzhn zzhn) {
        this.zza = (zzhn) Preconditions.checkNotNull(zzhn);
    }

    public static zzbz zza(long j, long j2) {
        return new zzbz(zzd(zzhm.AROUND_SUNRISE, j, j2));
    }

    public static zzbz zzb(long j, long j2) {
        return new zzbz(zzd(zzhm.AROUND_SUNSET, j, j2));
    }

    private static zzhn zzd(zzhm zzhm, long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (Math.abs(j) <= 86400000) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (Math.abs(j2) > 86400000) {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        zzhj zza2 = zzhn.zza();
        zza2.zzc(zzhm);
        zza2.zza(j);
        zza2.zzb(j2);
        return (zzhn) zza2.zzs();
    }

    public final zzhn zzc() {
        return this.zza;
    }
}
