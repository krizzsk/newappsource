package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhr */
final class zzhr {
    public static final /* synthetic */ int zza = 0;
    private static final zzpx zzb;
    private static final zzgs zzc;
    private static final zzgp zzd;
    private static final zzfy zze;
    private static final zzfv zzf;

    static {
        Class<zzgv> cls = zzgv.class;
        Class<zzgw> cls2 = zzgw.class;
        zzpx zzb2 = zzhg.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgs.zzc(zzhn.zza, zzhm.class, cls2);
        zzd = zzgp.zzc(zzho.zza, zzb2, cls2);
        zze = zzfy.zzc(zzhp.zza, zzhh.class, cls);
        zzf = zzfv.zzb(zzhq.zza, zzb2, cls);
    }

    public static void zza() throws GeneralSecurityException {
        zzgm zzb2 = zzgm.zzb();
        zzb2.zzf(zzc);
        zzb2.zze(zzd);
        zzb2.zzd(zze);
        zzb2.zzc(zzf);
    }
}
