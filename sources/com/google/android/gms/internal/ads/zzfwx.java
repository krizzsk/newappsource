package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfwx {
    private final Object zza;
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzfwx(Object obj, byte[] bArr, int i, int i2, int i3) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    public final Object zza() {
        return this.zza;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
