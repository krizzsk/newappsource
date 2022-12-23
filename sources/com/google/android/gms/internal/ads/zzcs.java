package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzcs {
    public static final zzl zza = zzcr.zza;
    public final int zzb = 1;
    private final zzck zzc;
    private final int[] zzd;
    private final boolean[] zze;

    public zzcs(zzck zzck, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzck.zzb;
        this.zzc = zzck;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcs.class == obj.getClass()) {
            zzcs zzcs = (zzcs) obj;
            if (!this.zzc.equals(zzcs.zzc) || !Arrays.equals(this.zzd, zzcs.zzd) || !Arrays.equals(this.zze, zzcs.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzd);
        return Arrays.hashCode(this.zze) + ((hashCode + (this.zzc.hashCode() * 961)) * 31);
    }

    public final int zza() {
        return this.zzc.zzd;
    }

    public final zzad zzb(int i) {
        return this.zzc.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zze) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zze[i];
    }
}
