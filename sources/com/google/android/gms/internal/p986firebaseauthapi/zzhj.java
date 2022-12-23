package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhj */
final class zzhj extends zzga {
    public zzhj(zzhk zzhk, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzis zzis = (zzis) zzadm;
        zzio zzb = zzip.zzb();
        zzb.zzc(0);
        zzb.zza(zzabe.zzn(zzps.zza(zzis.zza())));
        zzb.zzb(zzis.zze());
        return (zzip) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzis.zzd(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzir zzb = zzis.zzb();
        zzb.zza(32);
        zziu zzb2 = zziv.zzb();
        zzb2.zza(16);
        zzb.zzb((zziv) zzb2.zzk());
        hashMap.put("AES_CMAC", new zzfz((zzis) zzb.zzk(), 1));
        zzir zzb3 = zzis.zzb();
        zzb3.zza(32);
        zziu zzb4 = zziv.zzb();
        zzb4.zza(16);
        zzb3.zzb((zziv) zzb4.zzk());
        hashMap.put("AES256_CMAC", new zzfz((zzis) zzb3.zzk(), 1));
        zzir zzb5 = zzis.zzb();
        zzb5.zza(32);
        zziu zzb6 = zziv.zzb();
        zzb6.zza(16);
        zzb5.zzb((zziv) zzb6.zzk());
        hashMap.put("AES256_CMAC_RAW", new zzfz((zzis) zzb5.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzis zzis = (zzis) zzadm;
        zzhk.zzi(zzis.zze());
        zzhk.zzn(zzis.zza());
    }
}
