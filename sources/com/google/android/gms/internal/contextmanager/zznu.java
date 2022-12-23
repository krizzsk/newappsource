package com.google.android.gms.internal.contextmanager;

final class zznu {
    private static final zznt zza;
    private static final zznt zzb = new zznt();

    static {
        zznt zznt;
        try {
            zznt = (zznt) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zznt = null;
        }
        zza = zznt;
    }

    public static zznt zza() {
        return zza;
    }

    public static zznt zzb() {
        return zzb;
    }
}
