package com.google.android.gms.internal.mlkit_vision_common;

public final class zzkg {
    private static zzkg zza;

    private zzkg() {
    }

    public static synchronized zzkg zza() {
        zzkg zzkg;
        synchronized (zzkg.class) {
            if (zza == null) {
                zza = new zzkg();
            }
            zzkg = zza;
        }
        return zzkg;
    }

    public static final boolean zzb() {
        return zzkf.zza("mlkit-dev-profiling");
    }
}
