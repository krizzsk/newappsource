package com.google.android.gms.internal.mlkit_common;

public final class zzlz {
    private static zzlz zza;

    private zzlz() {
    }

    public static synchronized zzlz zza() {
        zzlz zzlz;
        synchronized (zzlz.class) {
            if (zza == null) {
                zza = new zzlz();
            }
            zzlz = zza;
        }
        return zzlz;
    }

    public static void zzb() {
        zzly.zza();
    }
}
