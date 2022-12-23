package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaxp {
    public static final zzaxp zza = new zzaxp(new zzaxo[0]);
    public final int zzb;
    private final zzaxo[] zzc;
    private int zzd;

    public zzaxp(zzaxo... zzaxoArr) {
        this.zzc = zzaxoArr;
        this.zzb = zzaxoArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxp.class == obj.getClass()) {
            zzaxp zzaxp = (zzaxp) obj;
            if (this.zzb != zzaxp.zzb || !Arrays.equals(this.zzc, zzaxp.zzc)) {
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
        int hashCode = Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzaxo zzaxo) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzaxo) {
                return i;
            }
        }
        return -1;
    }

    public final zzaxo zzb(int i) {
        return this.zzc[i];
    }
}
