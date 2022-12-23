package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

final class zzau {
    public final String zza;
    public final Object zzb;

    public zzau(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzau)) {
            return false;
        }
        zzau zzau = (zzau) obj;
        if (!this.zza.equals(zzau.zza)) {
            return false;
        }
        Object obj2 = this.zzb;
        if (obj2 == null && zzau.zzb == null) {
            return true;
        }
        if (obj2 == null || !obj2.equals(zzau.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Preconditions.checkNotNull(this.zzb);
        return Arrays.hashCode(new Integer[]{Integer.valueOf(this.zza.hashCode()), Integer.valueOf(this.zzb.hashCode())});
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return C13715c.m34246l(new StringBuilder(String.valueOf(str).length() + 13 + valueOf.length()), "Key: ", str, " value: ", valueOf);
    }
}
