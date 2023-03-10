package com.google.android.gms.internal.ads;

public final class zzcv {
    public static final zzcv zza = new zzcv(0, 0, 0, 1.0f);
    public static final zzl zzb = zzcu.zza;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    public zzcv(int i, int i2, int i3, float f) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcv) {
            zzcv zzcv = (zzcv) obj;
            if (this.zzc == zzcv.zzc && this.zzd == zzcv.zzd && this.zze == zzcv.zze && this.zzf == zzcv.zzf) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzf) + ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31);
    }
}
