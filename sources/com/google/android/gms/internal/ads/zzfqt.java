package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

final class zzfqt extends zzfsp implements Serializable {
    public final Comparator zza;

    public zzfqt(Comparator comparator) {
        comparator.getClass();
        this.zza = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqt) {
            return this.zza.equals(((zzfqt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
