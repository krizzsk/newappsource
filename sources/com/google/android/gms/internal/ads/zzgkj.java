package com.google.android.gms.internal.ads;

final class zzgkj implements zzglw {
    private static final zzgkj zza = new zzgkj();

    private zzgkj() {
    }

    public static zzgkj zza() {
        return zza;
    }

    public final zzglv zzb(Class cls) {
        Class<zzgko> cls2 = zzgko.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzglv) zzgko.zzay(cls.asSubclass(cls2)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgko.class.isAssignableFrom(cls);
    }
}
