package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbe {
    private final zzdo zza;

    public zzbe(zzdo zzdo) {
        this.zza = (zzdo) Preconditions.checkNotNull(zzdo);
    }

    public static zzbe zza(BeaconState.TypeFilter[] typeFilterArr) {
        return new zzbe(zze(zzdn.FOUND, typeFilterArr, 3000));
    }

    public static zzbe zzb(BeaconState.TypeFilter[] typeFilterArr) {
        return new zzbe(zze(zzdn.LOST, typeFilterArr, 3000));
    }

    public static zzbe zzc(BeaconState.TypeFilter[] typeFilterArr) {
        return new zzbe(zze(zzdn.NEAR, typeFilterArr, 3000));
    }

    private static zzdo zze(zzdn zzdn, BeaconState.TypeFilter[] typeFilterArr, long j) {
        zzdk zza2 = zzdo.zza();
        zza2.zzc(zzdn);
        zza2.zzb(3000);
        for (zzo zza3 : typeFilterArr) {
            zza2.zza(zza3.zza());
        }
        return (zzdo) zza2.zzs();
    }

    public final zzdo zzd() {
        return this.zza;
    }
}
