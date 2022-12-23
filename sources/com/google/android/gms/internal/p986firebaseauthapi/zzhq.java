package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhq */
public final /* synthetic */ class zzhq implements zzft {
    public static final /* synthetic */ zzhq zza = new zzhq();

    private /* synthetic */ zzhq() {
    }

    public final zzaw zza(zzgx zzgx, zzca zzca) {
        zzhl zzhl;
        int i = zzhr.zza;
        if (((zzgv) zzgx).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzip zzd = zzip.zzd(((zzgv) zzgx).zze(), zzabu.zza());
                if (zzd.zza() == 0) {
                    zziv zze = zzd.zze();
                    zzoa zzc = ((zzgv) zzgx).zzc();
                    int zza2 = zze.zza();
                    zzoa zzoa = zzoa.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzhl = zzhl.zza;
                    } else if (ordinal == 2) {
                        zzhl = zzhl.zzc;
                    } else if (ordinal == 3) {
                        zzhl = zzhl.zzd;
                    } else if (ordinal == 4) {
                        zzhl = zzhl.zzb;
                    } else {
                        int zza3 = zzc.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                    }
                    return zzhh.zzb(zzhm.zzc(zza2, zzhl), zzpy.zzb(zzd.zzf().zzt(), zzca), ((zzgv) zzgx).zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzacp | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
