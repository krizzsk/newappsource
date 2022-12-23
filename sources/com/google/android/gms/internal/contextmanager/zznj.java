package com.google.android.gms.internal.contextmanager;

final class zznj {
    private static final zzni zza;
    private static final zzni zzb = new zzni();

    static {
        zzni zzni;
        try {
            zzni = (zzni) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzni = null;
        }
        zza = zzni;
    }

    public static zzni zza() {
        return zza;
    }

    public static zzni zzb() {
        return zzb;
    }
}
