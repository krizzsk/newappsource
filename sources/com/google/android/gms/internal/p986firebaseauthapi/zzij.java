package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzij */
public final class zzij {
    private final zzbe zza;
    private final int zzb;
    private final zzbn zzc;

    public /* synthetic */ zzij(zzbe zzbe, int i, zzbn zzbn, zzii zzii) {
        this.zza = zzbe;
        this.zzb = i;
        this.zzc = zzbn;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzij)) {
            return false;
        }
        zzij zzij = (zzij) obj;
        if (this.zza == zzij.zza && this.zzb == zzij.zzb && this.zzc.equals(zzij.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc});
    }

    public final int zza() {
        return this.zzb;
    }
}
