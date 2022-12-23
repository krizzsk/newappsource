package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaud {
    public final int zza = 1;
    public final byte[] zzb;

    public zzaud(int i, byte[] bArr) {
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaud.class != obj.getClass() || !Arrays.equals(this.zzb, ((zzaud) obj).zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzb) + 31;
    }
}
