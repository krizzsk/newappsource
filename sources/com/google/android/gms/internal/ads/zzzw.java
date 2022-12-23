package com.google.android.gms.internal.ads;

public final class zzzw {
    public static final zzzw zza = new zzzw(0, 0);
    public final long zzb;
    public final long zzc;

    public zzzw(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzw.class == obj.getClass()) {
            zzzw zzzw = (zzzw) obj;
            return this.zzb == zzzw.zzb && this.zzc == zzzw.zzc;
        }
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        return C25541a.m63884o(C16759e.m42351g("[timeUs=", j, ", position="), this.zzc, "]");
    }
}
