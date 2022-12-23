package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

final class zzik implements Serializable, zzih {
    public final Object zza;

    public zzik(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzik)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((zzik) obj).zza;
        if (obj2 == obj3 || obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return C16530d.m42015h(C13555b.m33972k("Suppliers.ofInstance("), this.zza, ")");
    }

    public final Object zza() {
        return this.zza;
    }
}
