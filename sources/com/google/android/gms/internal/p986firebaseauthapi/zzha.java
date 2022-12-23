package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzha */
final class zzha {
    private final Class zza;
    private final zzpx zzb;

    public /* synthetic */ zzha(Class cls, zzpx zzpx, zzgz zzgz) {
        this.zza = cls;
        this.zzb = zzpx;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzha)) {
            return false;
        }
        zzha zzha = (zzha) obj;
        if (!zzha.zza.equals(this.zza) || !zzha.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return C13437d.m33706k(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
