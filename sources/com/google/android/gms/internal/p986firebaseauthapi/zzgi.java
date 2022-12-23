package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgi */
public final class zzgi {
    public static final zzif zza = new zzgh((zzgg) null);

    public static zzil zza(zzbu zzbu) {
        zzbe zzbe;
        zzih zzih = new zzih();
        zzih.zzb(zzbu.zzb());
        for (List it : zzbu.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzbq zzbq = (zzbq) it2.next();
                    int zzg = zzbq.zzg() - 2;
                    if (zzg == 1) {
                        zzbe = zzbe.zza;
                    } else if (zzg == 2) {
                        zzbe = zzbe.zzb;
                    } else if (zzg == 3) {
                        zzbe = zzbe.zzc;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzih.zza(zzbe, zzbq.zza(), zzbq.zzc());
                }
            }
        }
        if (zzbu.zza() != null) {
            zzih.zzc(zzbu.zza().zza());
        }
        try {
            return zzih.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
