package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

public abstract class zzcf extends zzbx implements Set {
    private transient zzcc zza;

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
        return zzcy.zza(this);
    }

    /* renamed from: zzd */
    public abstract zzda iterator();

    public final zzcc zzf() {
        zzcc zzcc = this.zza;
        if (zzcc != null) {
            return zzcc;
        }
        zzcc zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzcc zzg() {
        return zzcc.zzg(toArray());
    }
}
