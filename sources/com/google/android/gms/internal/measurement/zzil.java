package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class zzil {
    public static zzih zza(zzih zzih) {
        if ((zzih instanceof zzij) || (zzih instanceof zzii)) {
            return zzih;
        }
        if (zzih instanceof Serializable) {
            return new zzii(zzih);
        }
        return new zzij(zzih);
    }

    public static zzih zzb(Object obj) {
        return new zzik(obj);
    }
}
