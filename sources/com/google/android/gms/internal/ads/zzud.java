package com.google.android.gms.internal.ads;

public final class zzud {
    public final long zza;
    public final long zzb;

    public zzud(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzud)) {
            return false;
        }
        zzud zzud = (zzud) obj;
        if (this.zza == zzud.zza && this.zzb == zzud.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
