package com.google.android.gms.internal.ads;

final class zzfgs {
    public final String zza;
    public final String zzb;

    public zzfgs(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfgs)) {
            return false;
        }
        zzfgs zzfgs = (zzfgs) obj;
        if (!this.zza.equals(zzfgs.zza) || !this.zzb.equals(zzfgs.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
