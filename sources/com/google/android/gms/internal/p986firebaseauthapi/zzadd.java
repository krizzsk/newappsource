package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadd */
final class zzadd implements zzadk {
    private final zzadk[] zza;

    public zzadd(zzadk... zzadkArr) {
        this.zza = zzadkArr;
    }

    public final zzadj zzb(Class cls) {
        zzadk[] zzadkArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzadk zzadk = zzadkArr[i];
            if (zzadk.zzc(cls)) {
                return zzadk.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzadk[] zzadkArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzadkArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
