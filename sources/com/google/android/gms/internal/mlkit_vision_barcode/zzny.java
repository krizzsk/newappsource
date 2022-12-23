package com.google.android.gms.internal.mlkit_vision_barcode;

public final class zzny {
    private static zzny zza;

    private zzny() {
    }

    public static synchronized zzny zza() {
        zzny zzny;
        synchronized (zzny.class) {
            if (zza == null) {
                zza = new zzny();
            }
            zzny = zza;
        }
        return zzny;
    }
}
