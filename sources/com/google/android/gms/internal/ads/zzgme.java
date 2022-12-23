package com.google.android.gms.internal.ads;

final class zzgme {
    private static final zzgmd zza;
    private static final zzgmd zzb = new zzgmd();

    static {
        zzgmd zzgmd;
        try {
            zzgmd = (zzgmd) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgmd = null;
        }
        zza = zzgmd;
    }

    public static zzgmd zza() {
        return zza;
    }

    public static zzgmd zzb() {
        return zzb;
    }
}
