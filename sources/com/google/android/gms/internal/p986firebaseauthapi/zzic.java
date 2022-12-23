package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzic */
public final class zzic {
    private HashMap zza = new HashMap();

    public final zzie zza() {
        if (this.zza != null) {
            zzie zzie = new zzie(Collections.unmodifiableMap(this.zza), (zzid) null);
            this.zza = null;
            return zzie;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
