package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabx */
final class zzabx {
    private static final zzabv zza = new zzabw();
    private static final zzabv zzb;

    static {
        zzabv zzabv;
        try {
            zzabv = (zzabv) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzabv = null;
        }
        zzb = zzabv;
    }

    public static zzabv zza() {
        zzabv zzabv = zzb;
        if (zzabv != null) {
            return zzabv;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzabv zzb() {
        return zza;
    }
}
