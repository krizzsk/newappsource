package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbg */
public final class zzbg {
    public static zzbf zza(String str) throws GeneralSecurityException {
        zzbf zzbf = (zzbf) zzbz.zzl().get(str);
        if (zzbf != null) {
            return zzbf;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
