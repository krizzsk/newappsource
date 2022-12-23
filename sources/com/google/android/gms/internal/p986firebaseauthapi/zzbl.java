package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbl */
public final class zzbl {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzbk zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzbk zzbk = (zzbk) it.next();
            if (zzbk.zzb(str)) {
                return zzbk;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
