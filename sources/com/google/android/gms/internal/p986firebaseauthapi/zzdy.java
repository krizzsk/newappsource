package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdy */
final class zzdy extends zzga {
    public final /* synthetic */ zzdz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdy(zzdz zzdz, Class cls) {
        super(cls);
        this.zza = zzdz;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzkh zzb = zzki.zzb();
        zzb.zza(zzabe.zzn(zzps.zza(((zzkl) zzadm).zza())));
        zzb.zzb(0);
        return (zzki) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzkl.zzd(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzkk zzb = zzkl.zzb();
        zzb.zza(64);
        hashMap.put("AES256_SIV", new zzfz((zzkl) zzb.zzk(), 1));
        zzkk zzb2 = zzkl.zzb();
        zzb2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzfz((zzkl) zzb2.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzkl zzkl = (zzkl) zzadm;
        if (zzkl.zza() != 64) {
            throw new InvalidAlgorithmParameterException(C25541a.m63878h("invalid key size: ", zzkl.zza(), ". Valid keys must have 64 bytes."));
        }
    }
}
