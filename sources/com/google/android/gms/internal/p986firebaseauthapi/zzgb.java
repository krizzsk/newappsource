package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgb */
public abstract class zzgb {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzgb(Class cls, zzgt... zzgtArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzgt zzgt = zzgtArr[i];
            if (!hashMap.containsKey(zzgt.zzb())) {
                hashMap.put(zzgt.zzb(), zzgt);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgt.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgtArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzga zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzmt zzb();

    public abstract zzadm zzc(zzabe zzabe) throws zzacp;

    public abstract String zzd();

    public abstract void zze(zzadm zzadm) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzj() {
        return this.zzc;
    }

    public final Class zzk() {
        return this.zza;
    }

    public final Object zzl(zzadm zzadm, Class cls) throws GeneralSecurityException {
        zzgt zzgt = (zzgt) this.zzb.get(cls);
        if (zzgt != null) {
            return zzgt.zza(zzadm);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzm() {
        return this.zzb.keySet();
    }
}
