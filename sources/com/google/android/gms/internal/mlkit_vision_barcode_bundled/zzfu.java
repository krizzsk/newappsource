package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

final class zzfu {
    private static final zzfu zza = new zzfu();
    private final zzgc zzb = new zzfd();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzfu() {
    }

    public static zzfu zza() {
        return zza;
    }

    public final zzgb zzb(Class cls) {
        zzel.zzf(cls, "messageType");
        zzgb zzgb = (zzgb) this.zzc.get(cls);
        if (zzgb == null) {
            zzgb = this.zzb.zza(cls);
            zzel.zzf(cls, "messageType");
            zzel.zzf(zzgb, "schema");
            zzgb zzgb2 = (zzgb) this.zzc.putIfAbsent(cls, zzgb);
            if (zzgb2 == null) {
                return zzgb;
            }
            return zzgb2;
        }
        return zzgb;
    }
}
