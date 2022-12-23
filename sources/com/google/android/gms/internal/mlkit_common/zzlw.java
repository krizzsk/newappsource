package com.google.android.gms.internal.mlkit_common;

public final class zzlw {
    private static zzlv zza;

    public static synchronized zzll zza(zzle zzle) {
        zzll zzll;
        synchronized (zzlw.class) {
            if (zza == null) {
                zza = new zzlv((zzlu) null);
            }
            zzll = (zzll) zza.get(zzle);
        }
        return zzll;
    }

    public static synchronized zzll zzb(String str) {
        zzll zza2;
        synchronized (zzlw.class) {
            zza2 = zza(zzle.zzd("common").zzd());
        }
        return zza2;
    }
}
