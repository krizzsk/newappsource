package com.google.android.gms.internal.ads;

public final class zzr {
    public static final zzr zza = new zzr(0, 0, 0);
    public static final zzl zzb = zzq.zza;
    public final int zzc = 0;
    public final int zzd;
    public final int zze;

    public zzr(int i, int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzr)) {
            return false;
        }
        zzr zzr = (zzr) obj;
        int i = zzr.zzc;
        if (this.zzd == zzr.zzd && this.zze == zzr.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzd + 16337) * 31) + this.zze;
    }
}
