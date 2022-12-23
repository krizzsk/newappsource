package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzga */
public abstract class zzga {
    private final Class zza;

    public zzga(Class cls) {
        this.zza = cls;
    }

    public abstract zzadm zza(zzadm zzadm) throws GeneralSecurityException;

    public abstract zzadm zzb(zzabe zzabe) throws zzacp;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzadm zzadm) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
