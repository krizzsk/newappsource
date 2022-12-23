package com.google.android.gms.internal.contextmanager;

final class zzls {
    private static final zzlq<?> zza = new zzlr();
    private static final zzlq<?> zzb;

    static {
        zzlq<?> zzlq;
        try {
            zzlq = (zzlq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlq = null;
        }
        zzb = zzlq;
    }

    public static zzlq<?> zza() {
        zzlq<?> zzlq = zzb;
        if (zzlq != null) {
            return zzlq;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzlq<?> zzb() {
        return zza;
    }
}
