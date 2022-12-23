package com.google.android.gms.internal.measurement;

final class zzjp {
    private final Object zza;
    private final int zzb;

    public zzjp(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjp)) {
            return false;
        }
        zzjp zzjp = (zzjp) obj;
        if (this.zza == zzjp.zza && this.zzb == zzjp.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
