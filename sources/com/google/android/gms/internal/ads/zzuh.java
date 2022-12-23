package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class zzuh implements zzvh {
    public final zzck zza;
    public final int zzb;
    public final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzuh(zzck zzck, int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzck.getClass();
        this.zza = zzck;
        this.zzb = length;
        this.zzd = new zzad[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzck.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, zzug.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzck.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzuh zzuh = (zzuh) obj;
            if (this.zza != zzuh.zza || !Arrays.equals(this.zzc, zzuh.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = hashCode;
        return hashCode;
    }

    public final int zza(int i) {
        return this.zzc[0];
    }

    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzad zzd(int i) {
        return this.zzd[i];
    }

    public final zzck zze() {
        return this.zza;
    }
}
