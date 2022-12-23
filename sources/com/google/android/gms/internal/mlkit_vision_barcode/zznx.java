package com.google.android.gms.internal.mlkit_vision_barcode;

public final class zznx {
    private static zznw zza;

    public static synchronized zznm zza(zzne zzne) {
        zznm zznm;
        synchronized (zznx.class) {
            if (zza == null) {
                zza = new zznw((zznv) null);
            }
            zznm = (zznm) zza.get(zzne);
        }
        return zznm;
    }

    public static synchronized zznm zzb(String str) {
        zznm zza2;
        synchronized (zznx.class) {
            zza2 = zza(zzne.zzd(str).zzd());
        }
        return zza2;
    }
}
