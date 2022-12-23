package com.google.android.gms.internal.ads;

public final class zzzl {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!zzzm.zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i2;
        this.zzb = zzzm.zza[3 - i3];
        int i8 = zzzm.zzb[i5];
        this.zzd = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.zzd = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.zzd = i8;
        }
        int i11 = (i >>> 9) & 1;
        this.zzg = zzzm.zzl(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = zzzm.zzc[i4 - 1];
            } else {
                i7 = zzzm.zzd[i4 - 1];
            }
            this.zzf = i7;
            this.zzc = (((i7 * 12) / i8) + i11) * 4;
        } else {
            int i12 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = zzzm.zze[i4 - 1];
                } else {
                    i6 = zzzm.zzf[i4 - 1];
                }
                this.zzf = i6;
                this.zzc = C13715c.m34237b(i6, 144, i8, i11);
            } else {
                int i13 = zzzm.zzg[i4 - 1];
                this.zzf = i13;
                if (i3 == 1) {
                    i12 = 72;
                }
                this.zzc = C13715c.m34237b(i12, i13, i8, i11);
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.zze = i9;
        return true;
    }
}
