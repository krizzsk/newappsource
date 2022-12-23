package com.google.android.gms.internal.p986firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcb */
final class zzcb {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zznm zza(zznh zznh) {
        zznj zza2 = zznm.zza();
        zza2.zzb(zznh.zzb());
        for (zzng zzng : zznh.zzg()) {
            zznk zzb = zznl.zzb();
            zzb.zzc(zzng.zzb().zzf());
            zzb.zzd(zzng.zzk());
            zzb.zzb(zzng.zze());
            zzb.zza(zzng.zza());
            zza2.zza((zznl) zzb.zzk());
        }
        return (zznm) zza2.zzk();
    }

    public static void zzb(zznh zznh) throws GeneralSecurityException {
        boolean z;
        int zzb = zznh.zzb();
        int i = 0;
        boolean z2 = false;
        boolean z3 = true;
        for (zzng zzng : zznh.zzg()) {
            if (zzng.zzk() == 3) {
                if (!zzng.zzi()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzng.zza())}));
                } else if (zzng.zze() == zzoa.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzng.zza())}));
                } else if (zzng.zzk() != 2) {
                    if (zzng.zza() == zzb) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (zzng.zzb().zzb() != zzmt.ASYMMETRIC_PUBLIC) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z3 &= z;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzng.zza())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z2 && !z3) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
