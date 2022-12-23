package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdh */
final class zzdh extends zzga {
    public final /* synthetic */ zzdi zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdh(zzdi zzdi, Class cls) {
        super(cls);
        this.zza = zzdi;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzoj zzoj = (zzoj) zzadm;
        zzof zzb = zzog.zzb();
        zzb.zzb(0);
        zzb.zza(zzabe.zzn(zzps.zza(32)));
        return (zzog) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzoj.zzc(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzfz(zzoj.zzb(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzfz(zzoj.zzb(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzoj zzoj = (zzoj) zzadm;
    }
}
