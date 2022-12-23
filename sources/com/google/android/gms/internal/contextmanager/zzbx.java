package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.common.internal.Preconditions;

public final class zzbx {
    private final zzfh zza;

    public zzbx(zzfh zzfh) {
        this.zza = (zzfh) Preconditions.checkNotNull(zzfh);
    }

    public static zzbx zza(int i, int i2, double d) {
        boolean z;
        if (d >= 0.0d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new zzbx(zze(zzfg.ENTERING, zzfd.CIRCLE, i, i2, d, d, 3000, 0));
    }

    public static zzbx zzb(int i, int i2, double d) {
        boolean z;
        if (d >= 0.0d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new zzbx(zze(zzfg.EXITING, zzfd.CIRCLE, i, i2, d, d, 3000, 0));
    }

    public static zzbx zzc(int i, int i2, double d, long j) {
        boolean z;
        if (d >= 0.0d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new zzbx(zze(zzfg.IN, zzfd.CIRCLE, i, i2, d, d, 0, j));
    }

    private static zzfh zze(zzfg zzfg, zzfd zzfd, int i, int i2, double d, double d2, long j, long j2) {
        zzfa zza2 = zzfh.zza();
        zza2.zzh(zzfg);
        zza2.zze(zzfd);
        zza2.zzc(j);
        zza2.zzd(j2);
        if (zzfd == zzfd.CIRCLE) {
            zza2.zza(i);
            zza2.zzb(i2);
            zza2.zzg(d);
            zza2.zzf(d2);
        }
        return (zzfh) zza2.zzs();
    }

    public final zzfh zzd() {
        return this.zza;
    }
}
