package com.google.android.gms.internal.ads;

import java.io.Serializable;

final class zzfsy extends zzfsp implements Serializable {
    public final zzfsp zza;

    public zzfsy(zzfsp zzfsp) {
        this.zza = zzfsp;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsy) {
            return this.zza.equals(((zzfsy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    public final zzfsp zza() {
        return this.zza;
    }
}
