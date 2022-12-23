package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzzy {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzzy(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzy.class == obj.getClass()) {
            zzzy zzzy = (zzzy) obj;
            if (this.zza == zzzy.zza && this.zzc == zzzy.zzc && this.zzd == zzzy.zzd && Arrays.equals(this.zzb, zzzy.zzb)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + (this.zza * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
