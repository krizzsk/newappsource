package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzck {
    public static final zzl zza = zzcj.zza;
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzad[] zze;
    private int zzf;

    public zzck(String str, zzad... zzadArr) {
        this.zzc = str;
        this.zze = zzadArr;
        int zzb2 = zzbo.zzb(zzadArr[0].zzm);
        this.zzd = zzb2 == -1 ? zzbo.zzb(zzadArr[0].zzl) : zzb2;
        zzd(zzadArr[0].zzd);
        int i = zzadArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class == obj.getClass()) {
            zzck zzck = (zzck) obj;
            if (!this.zzc.equals(zzck.zzc) || !Arrays.equals(this.zze, zzck.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zze) + C13715c.m34238d(this.zzc, 527, 31);
        this.zzf = hashCode;
        return hashCode;
    }

    public final int zza(zzad zzad) {
        for (int i = 0; i <= 0; i++) {
            if (zzad == this.zze[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzad zzb(int i) {
        return this.zze[i];
    }

    public final zzck zzc(String str) {
        return new zzck(str, this.zze);
    }
}
