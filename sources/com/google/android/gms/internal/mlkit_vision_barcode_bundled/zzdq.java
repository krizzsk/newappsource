package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzdq {
    private static final zzdo zza = new zzdp();
    private static final zzdo zzb;

    static {
        zzdo zzdo;
        try {
            zzdo = (zzdo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzdo = null;
        }
        zzb = zzdo;
    }

    public static zzdo zza() {
        zzdo zzdo = zzb;
        if (zzdo != null) {
            return zzdo;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzdo zzb() {
        return zza;
    }
}
