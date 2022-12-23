package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p001a0.C0016g;

public final class zzo {
    public static final zzl zza = zzn.zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    private int zzf;

    public zzo(int i, int i2, int i3, byte[] bArr) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
    }

    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzo.class == obj.getClass()) {
            zzo zzo = (zzo) obj;
            if (this.zzb == zzo.zzb && this.zzc == zzo.zzc && this.zzd == zzo.zzd && Arrays.equals(this.zze, zzo.zze)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31);
        this.zzf = hashCode;
        return hashCode;
    }

    public final String toString() {
        boolean z;
        int i = this.zzb;
        int i2 = this.zzc;
        int i3 = this.zzd;
        if (this.zze != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder s = C0016g.m35s("ColorInfo(", i, ", ", i2, ", ");
        s.append(i3);
        s.append(", ");
        s.append(z);
        s.append(")");
        return s.toString();
    }
}
