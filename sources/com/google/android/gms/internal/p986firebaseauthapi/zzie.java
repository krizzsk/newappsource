package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzie */
public final class zzie {
    public static final zzie zza = new zzic().zza();
    private final Map zzb;

    public /* synthetic */ zzie(Map map, zzid zzid) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzie)) {
            return false;
        }
        return this.zzb.equals(((zzie) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
