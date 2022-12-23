package com.google.android.gms.internal.measurement;

final class zzjz implements zzlj {
    private static final zzjz zza = new zzjz();

    private zzjz() {
    }

    public static zzjz zza() {
        return zza;
    }

    public final zzli zzb(Class cls) {
        Class<zzke> cls2 = zzke.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzli) zzke.zzbz(cls.asSubclass(cls2)).zzl(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzke.class.isAssignableFrom(cls);
    }
}
