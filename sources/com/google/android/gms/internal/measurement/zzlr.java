package com.google.android.gms.internal.measurement;

final class zzlr {
    private static final zzlq zza;
    private static final zzlq zzb = new zzlq();

    static {
        zzlq zzlq;
        try {
            zzlq = (zzlq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlq = null;
        }
        zza = zzlq;
    }

    public static zzlq zza() {
        return zza;
    }

    public static zzlq zzb() {
        return zzb;
    }
}
