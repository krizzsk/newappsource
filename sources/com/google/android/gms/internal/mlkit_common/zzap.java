package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

public abstract class zzap extends zzai implements Set {
    private transient zzam zza;

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzax.zza(this);
    }

    /* renamed from: zzd */
    public abstract zzay iterator();

    public final zzam zzf() {
        zzam zzam = this.zza;
        if (zzam != null) {
            return zzam;
        }
        zzam zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzam zzg() {
        return zzam.zzh(toArray());
    }
}
