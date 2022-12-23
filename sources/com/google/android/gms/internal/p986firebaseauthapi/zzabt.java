package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabt */
final class zzabt {
    private final Object zza;
    private final int zzb;

    public zzabt(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzabt)) {
            return false;
        }
        zzabt zzabt = (zzabt) obj;
        if (this.zza == zzabt.zza && this.zzb == zzabt.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
