package com.google.android.gms.internal.ads;

public abstract class zzgpm {
    public static zzgpm zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgph(cls.getSimpleName());
        }
        return new zzgpj(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
