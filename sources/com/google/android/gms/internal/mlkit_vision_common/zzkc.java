package com.google.android.gms.internal.mlkit_vision_common;

public final class zzkc {
    private static zzkb zza;

    public static synchronized zzjt zza(zzjn zzjn) {
        zzjt zzjt;
        synchronized (zzkc.class) {
            if (zza == null) {
                zza = new zzkb((zzka) null);
            }
            zzjt = (zzjt) zza.get(zzjn);
        }
        return zzjt;
    }

    public static synchronized zzjt zzb(String str) {
        zzjt zza2;
        synchronized (zzkc.class) {
            zza2 = zza(zzjn.zzd("vision-common").zzd());
        }
        return zza2;
    }
}
