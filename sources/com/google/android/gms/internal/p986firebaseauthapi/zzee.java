package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzee */
final class zzee extends zzga {
    public final /* synthetic */ zzef zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzee(zzef zzef, Class cls) {
        super(cls);
        this.zza = zzef;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzkz zzkz = (zzkz) zzadm;
        ECParameterSpec zzk = zzoz.zzk(zzeo.zzc(zzkz.zzd().zze().zzf()));
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzpb.zzf.zza("EC");
        keyPairGenerator.initialize(zzk);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        zzlh zzc = zzli.zzc();
        zzc.zzb(0);
        zzc.zza(zzkz.zzd());
        zzc.zzc(zzabe.zzn(w.getAffineX().toByteArray()));
        zzc.zzd(zzabe.zzn(w.getAffineY().toByteArray()));
        zzle zzb = zzlf.zzb();
        zzb.zzc(0);
        zzb.zzb((zzli) zzc.zzk());
        zzb.zza(zzabe.zzn(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray()));
        return (zzlf) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzkz.zzc(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzef.zzi(4, 5, 3, zzbg.zza("AES128_GCM"), zzef.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzef.zzi(4, 5, 3, zzbg.zza("AES128_GCM"), zzef.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzef.zzi(4, 5, 4, zzbg.zza("AES128_GCM"), zzef.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzef.zzi(4, 5, 4, zzbg.zza("AES128_GCM"), zzef.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzef.zzi(4, 5, 4, zzbg.zza("AES128_GCM"), zzef.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzef.zzi(4, 5, 3, zzbg.zza("AES128_CTR_HMAC_SHA256"), zzef.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzef.zzi(4, 5, 3, zzbg.zza("AES128_CTR_HMAC_SHA256"), zzef.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzef.zzi(4, 5, 4, zzbg.zza("AES128_CTR_HMAC_SHA256"), zzef.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzef.zzi(4, 5, 4, zzbg.zza("AES128_CTR_HMAC_SHA256"), zzef.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzeo.zza(((zzkz) zzadm).zzd());
    }
}
