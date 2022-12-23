package com.google.android.gms.internal.ads;

public final class zzbbu {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzbbu(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbbu)) {
            zzbbu zzbbu = (zzbbu) obj;
            if (zzbbu.zza == this.zza && zzbbu.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
