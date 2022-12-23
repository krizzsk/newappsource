package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzd {
    public static final zzd zza = new zzd((Object) null, new zzc[0], 0, -9223372036854775807L, 0);
    public static final zzl zzb = zza.zza;
    private static final zzc zze = new zzc(0).zzb(0);
    public final int zzc = 0;
    public final long zzd = 0;
    private final zzc[] zzf;

    private zzd(Object obj, zzc[] zzcArr, long j, long j2, int i) {
        this.zzf = zzcArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            zzd zzd2 = (zzd) obj;
            if (!zzeg.zzS((Object) null, (Object) null) || !Arrays.equals(this.zzf, zzd2.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (((int) -9223372036854775807L) * 961);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }

    public final zzc zza(int i) {
        return i < 0 ? zze : this.zzf[i];
    }
}
