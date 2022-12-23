package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzci */
final class zzci extends zzga {
    public final /* synthetic */ zzcj zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzci(zzcj zzcj, Class cls) {
        super(cls);
        this.zza = zzcj;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzjb zzjb = (zzjb) zzadm;
        new zzcm();
        zzje zzf = zzcl.zzf(zzjb.zzd());
        zzadm zza2 = new zzhu().zza().zza(zzjb.zze());
        zzix zzb = zziy.zzb();
        zzb.zza(zzf);
        zzb.zzb((zzlv) zza2);
        zzb.zzc(0);
        return (zziy) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzjb.zzc(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzcj.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzcj.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzcj.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzcj.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzjb zzjb = (zzjb) zzadm;
        ((zzcl) new zzcm().zza()).zzd(zzjb.zzd());
        new zzhu().zza().zzd(zzjb.zze());
        zzpu.zzb(zzjb.zzd().zza());
    }
}
