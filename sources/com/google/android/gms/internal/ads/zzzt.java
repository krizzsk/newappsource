package com.google.android.gms.internal.ads;

public final class zzzt {
    public final zzzw zza;
    public final zzzw zzb;

    public zzzt(zzzw zzzw, zzzw zzzw2) {
        this.zza = zzzw;
        this.zzb = zzzw2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzt.class == obj.getClass()) {
            zzzt zzzt = (zzzt) obj;
            if (!this.zza.equals(zzzt.zza) || !this.zzb.equals(zzzt.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str;
        String zzzw = this.zza.toString();
        if (this.zza.equals(this.zzb)) {
            str = "";
        } else {
            str = ", ".concat(this.zzb.toString());
        }
        return C25541a.m63882l("[", zzzw, str, "]");
    }
}
