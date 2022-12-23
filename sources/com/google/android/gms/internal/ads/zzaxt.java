package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class zzaxt {
    public final zzaxo zza;
    public final int[] zzb;
    private final zzars[] zzc = new zzars[1];
    private int zzd;

    public zzaxt(zzaxo zzaxo, int... iArr) {
        zzaxo.getClass();
        this.zza = zzaxo;
        for (int i = 0; i <= 0; i++) {
            this.zzc[i] = zzaxo.zzb(iArr[i]);
        }
        Arrays.sort(this.zzc, new zzaxs((zzaxr) null));
        this.zzb = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.zzb[i2] = zzaxo.zza(this.zzc[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxt zzaxt = (zzaxt) obj;
            if (this.zza != zzaxt.zza || !Arrays.equals(this.zzb, zzaxt.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb) + (System.identityHashCode(this.zza) * 31);
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(int i) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzars zzc(int i) {
        return this.zzc[i];
    }

    public final zzaxo zzd() {
        return this.zza;
    }
}
