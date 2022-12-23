package com.google.android.gms.internal.ads;

public final class zzjx {
    public static final zzjx zza;
    public static final zzjx zzb = new zzjx(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final zzjx zzc = new zzjx(Long.MAX_VALUE, 0);
    public static final zzjx zzd = new zzjx(0, Long.MAX_VALUE);
    public static final zzjx zze;
    public final long zzf;
    public final long zzg;

    static {
        zzjx zzjx = new zzjx(0, 0);
        zza = zzjx;
        zze = zzjx;
    }

    public zzjx(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        zzcw.zzd(j2 < 0 ? false : z2);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjx.class == obj.getClass()) {
            zzjx zzjx = (zzjx) obj;
            return this.zzf == zzjx.zzf && this.zzg == zzjx.zzg;
        }
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
