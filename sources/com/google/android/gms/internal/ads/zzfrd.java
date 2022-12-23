package com.google.android.gms.internal.ads;

import java.io.Serializable;

final class zzfrd extends zzfqd implements Serializable {
    public final Object zza;
    public final Object zzb;

    public zzfrd(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    public final Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
