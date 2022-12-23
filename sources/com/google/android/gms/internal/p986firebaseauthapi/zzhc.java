package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhc */
final class zzhc {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhc(Class cls, Class cls2, zzhb zzhb) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhc)) {
            return false;
        }
        zzhc zzhc = (zzhc) obj;
        if (!zzhc.zza.equals(this.zza) || !zzhc.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return C13437d.m33706k(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
