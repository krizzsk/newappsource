package com.google.android.gms.internal.ads;

final class zztb {
    public final int zza;
    public final boolean zzb;

    public zztb(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztb.class == obj.getClass()) {
            zztb zztb = (zztb) obj;
            return this.zza == zztb.zza && this.zzb == zztb.zzb;
        }
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
