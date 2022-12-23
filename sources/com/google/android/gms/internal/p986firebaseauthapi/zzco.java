package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzco */
final class zzco extends zzga {
    public final /* synthetic */ zzcp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzco(zzcp zzcp, Class cls) {
        super(cls);
        this.zza = zzcp;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzjq zzjq = (zzjq) zzadm;
        zzjm zzb = zzjn.zzb();
        zzb.zza(zzabe.zzn(zzps.zza(zzjq.zza())));
        zzb.zzb(zzjq.zze());
        zzb.zzc(0);
        return (zzjn) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzjq.zzd(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzcp.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzcp.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzcp.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzcp.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzjq zzjq = (zzjq) zzadm;
        zzpu.zzb(zzjq.zza());
        if (zzjq.zze().zza() != 12 && zzjq.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
