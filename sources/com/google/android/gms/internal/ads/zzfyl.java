package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzfyl extends zzgap {
    public final /* synthetic */ zzfym zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfyl(zzfym zzfym, Class cls) {
        super(cls);
        this.zza = zzfym;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzggh zzc = zzggi.zzc();
        zzc.zza((zzggl) zzgly);
        zzc.zzb(0);
        return (zzggi) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzggl.zze(zzgjg, zzgka.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzggl zzggl = (zzggl) zzgly;
        if (zzggl.zzf().isEmpty() || !zzggl.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
