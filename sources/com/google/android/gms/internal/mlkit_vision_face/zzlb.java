package com.google.android.gms.internal.mlkit_vision_face;

public final class zzlb {
    private static zzlb zza;

    private zzlb() {
    }

    public static synchronized zzlb zza() {
        zzlb zzlb;
        synchronized (zzlb.class) {
            if (zza == null) {
                zza = new zzlb();
            }
            zzlb = zza;
        }
        return zzlb;
    }
}
