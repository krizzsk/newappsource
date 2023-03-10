package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

final class zzgmg {
    private static final zzgmg zza = new zzgmg();
    private final zzgms zzb = new zzglq();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzgmg() {
    }

    public static zzgmg zza() {
        return zza;
    }

    public final zzgmr zzb(Class cls) {
        zzgky.zzf(cls, "messageType");
        zzgmr zzgmr = (zzgmr) this.zzc.get(cls);
        if (zzgmr == null) {
            zzgmr = this.zzb.zza(cls);
            zzgky.zzf(cls, "messageType");
            zzgky.zzf(zzgmr, "schema");
            zzgmr zzgmr2 = (zzgmr) this.zzc.putIfAbsent(cls, zzgmr);
            if (zzgmr2 == null) {
                return zzgmr;
            }
            return zzgmr2;
        }
        return zzgmr;
    }
}
