package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadu */
final class zzadu {
    private static final zzadu zza = new zzadu();
    private final zzadz zzb = new zzade();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzadu() {
    }

    public static zzadu zza() {
        return zza;
    }

    public final zzady zzb(Class cls) {
        zzacn.zzf(cls, "messageType");
        zzady zzady = (zzady) this.zzc.get(cls);
        if (zzady == null) {
            zzady = this.zzb.zza(cls);
            zzacn.zzf(cls, "messageType");
            zzacn.zzf(zzady, "schema");
            zzady zzady2 = (zzady) this.zzc.putIfAbsent(cls, zzady);
            if (zzady2 == null) {
                return zzady;
            }
            return zzady2;
        }
        return zzady;
    }
}
