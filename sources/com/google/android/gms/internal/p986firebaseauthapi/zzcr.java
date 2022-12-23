package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcr */
final class zzcr extends zzga {
    public final /* synthetic */ zzcs zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcr(zzcs zzcs, Class cls) {
        super(cls);
        this.zza = zzcs;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzjv zzb = zzjw.zzb();
        zzb.zza(zzabe.zzn(zzps.zza(((zzjz) zzadm).zza())));
        zzb.zzb(0);
        return (zzjw) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzjz.zzd(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzcs.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzcs.zzg(16, 3));
        hashMap.put("AES256_GCM", zzcs.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzcs.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzpu.zzb(((zzjz) zzadm).zza());
    }
}
