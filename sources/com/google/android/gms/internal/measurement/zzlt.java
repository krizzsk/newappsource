package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

final class zzlt {
    private static final zzlt zza = new zzlt();
    private final zzlx zzb = new zzld();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzlt() {
    }

    public static zzlt zza() {
        return zza;
    }

    public final zzlw zzb(Class cls) {
        zzkm.zzf(cls, "messageType");
        zzlw zzlw = (zzlw) this.zzc.get(cls);
        if (zzlw == null) {
            zzlw = this.zzb.zza(cls);
            zzkm.zzf(cls, "messageType");
            zzkm.zzf(zzlw, "schema");
            zzlw zzlw2 = (zzlw) this.zzc.putIfAbsent(cls, zzlw);
            if (zzlw2 == null) {
                return zzlw;
            }
            return zzlw2;
        }
        return zzlw;
    }
}
