package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzvj {
    private final String[] zza;
    private final int[] zzb;
    private final zztz[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zztz zzf;

    public zzvj(String[] strArr, int[] iArr, zztz[] zztzArr, int[] iArr2, int[][][] iArr3, zztz zztz) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zztzArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zztz;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzc[i].zzb(i2).zzb;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.zze[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 16;
        while (i4 < copyOf.length) {
            String str2 = this.zzc[i].zzb(i2).zzb(copyOf[i4]).zzm;
            int i9 = i7 + 1;
            if (i7 != 0) {
                z2 |= !zzeg.zzS(str, str2);
            } else {
                str = str2;
            }
            i8 = Math.min(i8, this.zze[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        if (z2) {
            return Math.min(i8, this.zzd[i]);
        }
        return i8;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zze[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    public final zztz zzd(int i) {
        return this.zzc[i];
    }

    public final zztz zze() {
        return this.zzf;
    }
}
