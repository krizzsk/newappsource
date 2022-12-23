package com.google.android.gms.internal.ads;

public final class zzcf {
    public static final zzl zza = zzce.zza;
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzh = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcf.class.equals(obj.getClass())) {
            zzcf zzcf = (zzcf) obj;
            if (!zzeg.zzS(this.zzb, zzcf.zzb) || !zzeg.zzS(this.zzc, zzcf.zzc) || this.zzd != zzcf.zzd || this.zze != zzcf.zze || this.zzg != zzcf.zzg || !zzeg.zzS(this.zzh, zzcf.zzh)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.zzb;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 217) * 31;
        Object obj2 = this.zzc;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.zzd;
        long j = this.zze;
        return this.zzh.hashCode() + ((((((((i3 + i2) * 31) + i4) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.zzg ? 1 : 0)) * 31);
    }

    public final int zza(int i) {
        return this.zzh.zza(i).zzc;
    }

    public final int zzb() {
        int i = this.zzh.zzc;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        return -1;
    }

    public final int zze(int i) {
        return this.zzh.zza(i).zza(-1);
    }

    public final int zzf(int i, int i2) {
        return this.zzh.zza(i).zza(i2);
    }

    public final long zzg(int i, int i2) {
        zzc zza2 = this.zzh.zza(i);
        if (zza2.zzc != -1) {
            return zza2.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i) {
        long j = this.zzh.zza(i).zzb;
        return 0;
    }

    public final long zzi() {
        long j = this.zzh.zzd;
        return 0;
    }

    public final long zzj(int i) {
        long j = this.zzh.zza(i).zzg;
        return 0;
    }

    public final zzcf zzk(Object obj, Object obj2, int i, long j, long j2, zzd zzd2, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j;
        this.zzf = 0;
        this.zzh = zzd2;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int i) {
        boolean z = this.zzh.zza(i).zzh;
        return false;
    }
}
