package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc */
final class zzacc implements zzadk {
    private static final zzacc zza = new zzacc();

    private zzacc() {
    }

    public static zzacc zza() {
        return zza;
    }

    public final zzadj zzb(Class cls) {
        Class<zzach> cls2 = zzach.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzadj) zzach.zzv(cls.asSubclass(cls2)).zzj(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzach.class.isAssignableFrom(cls);
    }
}
