package com.google.android.gms.internal.mlkit_vision_face;

public final class zzkz {
    private static zzky zza;
    private static final zzbm<String> zzb = zzbm.zzf("common", "vision-common", "play-services-mlkit-barcode-scanning", "barcode-scanning", "play-services-mlkit-face-detection", "face-detection", "play-services-mlkit-image-labeling", "play-services-mlkit-text-recognition");

    public static synchronized zzko zza(String str) {
        zzko zzb2;
        synchronized (zzkz.class) {
            zzkf zzf = zzkg.zzf(str);
            zzf.zzb(zzb.contains(str));
            zzb2 = zzb(zzf.zzf());
        }
        return zzb2;
    }

    public static synchronized zzko zzb(zzkg zzkg) {
        zzko zzko;
        synchronized (zzkz.class) {
            if (zza == null) {
                zza = new zzky((zzkx) null);
            }
            zzko = (zzko) zza.get(zzkg);
        }
        return zzko;
    }
}
