package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzht */
final class zzht extends zzga {
    public final /* synthetic */ zzhu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzht(zzhu zzhu, Class cls) {
        super(cls);
        this.zza = zzhu;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzly zzly = (zzly) zzadm;
        zzlu zzb = zzlv.zzb();
        zzb.zzc(0);
        zzb.zzb(zzly.zzf());
        zzb.zza(zzabe.zzn(zzps.zza(zzly.zza())));
        return (zzlv) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzly.zze(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzhu.zzi(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzhu.zzi(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzhu.zzi(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzhu.zzi(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzhu.zzi(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzhu.zzi(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzhu.zzi(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzhu.zzi(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzhu.zzi(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzhu.zzi(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzly zzly = (zzly) zzadm;
        if (zzly.zza() >= 16) {
            zzhu.zzn(zzly.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
