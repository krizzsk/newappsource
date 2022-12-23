package com.google.android.gms.internal.contextmanager;

final class zzlo {
    private final Object zza;
    private final int zzb;

    public zzlo(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlo)) {
            return false;
        }
        zzlo zzlo = (zzlo) obj;
        if (this.zza == zzlo.zza && this.zzb == zzlo.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
