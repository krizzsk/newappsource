package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu */
public abstract class zzgu extends zzgb {
    private final Class zza;

    @SafeVarargs
    public zzgu(Class cls, Class cls2, zzgt... zzgtArr) {
        super(cls, zzgtArr);
        this.zza = cls2;
    }

    public abstract zzadm zzg(zzadm zzadm) throws GeneralSecurityException;
}
