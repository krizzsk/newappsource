package com.google.android.gms.nearby.uwb;

import com.google.android.gms.internal.nearby.zzth;
import java.util.Arrays;

public class UwbAddress {
    private static final zzth zza = zzth.zzh().zze(":", 2);
    private final byte[] zzb;

    public UwbAddress(String str) {
        this.zzb = zza.zzj(str);
    }

    public UwbAddress(byte[] bArr) {
        this.zzb = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbAddress)) {
            return false;
        }
        return Arrays.equals(this.zzb, ((UwbAddress) obj).zzb);
    }

    public byte[] getAddress() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(this.zzb);
    }

    public String toString() {
        zzth zzth = zza;
        byte[] bArr = this.zzb;
        return zzth.zzi(bArr, 0, bArr.length);
    }
}
