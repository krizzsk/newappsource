package com.google.android.gms.internal.ads;

final class zzglu {
    private static final zzglt zza;
    private static final zzglt zzb = new zzglt();

    static {
        zzglt zzglt;
        try {
            zzglt = (zzglt) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzglt = null;
        }
        zza = zzglt;
    }

    public static zzglt zza() {
        return zza;
    }

    public static zzglt zzb() {
        return zzb;
    }
}
