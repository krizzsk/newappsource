package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcu */
final class zzcu extends zzga {
    public final /* synthetic */ zzcv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcv, Class cls) {
        super(cls);
        this.zza = zzcv;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzkb zzb = zzkc.zzb();
        zzb.zza(zzabe.zzn(zzps.zza(((zzkf) zzadm).zza())));
        zzb.zzb(0);
        return (zzkc) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzkf.zzd(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzcv.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzcv.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzcv.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzcv.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzpu.zzb(((zzkf) zzadm).zza());
    }
}
