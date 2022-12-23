package com.google.android.gms.internal.contextmanager;

import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

final class zznw {
    private static final zznw zza = new zznw();
    private final zzoa zzb = new zznf();
    private final ConcurrentMap<Class<?>, zznz<?>> zzc = new ConcurrentHashMap();

    private zznw() {
    }

    public static zznw zza() {
        return zza;
    }

    public final <T> zznz<T> zzb(Class<T> cls) {
        zzmn.zzf(cls, "messageType");
        zznz<T> zznz = this.zzc.get(cls);
        if (zznz == null) {
            zznz = this.zzb.zza(cls);
            zzmn.zzf(cls, "messageType");
            zzmn.zzf(zznz, "schema");
            zznz<T> putIfAbsent = this.zzc.putIfAbsent(cls, zznz);
            if (putIfAbsent == null) {
                return zznz;
            }
            return putIfAbsent;
        }
        return zznz;
    }
}
