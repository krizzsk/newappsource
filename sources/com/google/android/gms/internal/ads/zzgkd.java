package com.google.android.gms.internal.ads;

final class zzgkd {
    private static final zzgkb zza = new zzgkc();
    private static final zzgkb zzb;

    static {
        zzgkb zzgkb;
        try {
            zzgkb = (zzgkb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgkb = null;
        }
        zzb = zzgkb;
    }

    public static zzgkb zza() {
        zzgkb zzgkb = zzb;
        if (zzgkb != null) {
            return zzgkb;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgkb zzb() {
        return zza;
    }
}
