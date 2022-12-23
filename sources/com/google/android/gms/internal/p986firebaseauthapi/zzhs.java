package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhs */
final class zzhs extends zzgt {
    public zzhs(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzadm zzadm) throws GeneralSecurityException {
        zzlv zzlv = (zzlv) zzadm;
        int zzf = zzlv.zzf().zzf();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzlv.zzg().zzt(), "HMAC");
        int zza = zzlv.zzf().zza();
        int i = zzf - 2;
        if (i == 1) {
            return new zzpq(new zzpp("HMACSHA1", secretKeySpec), zza);
        }
        if (i == 2) {
            return new zzpq(new zzpp("HMACSHA384", secretKeySpec), zza);
        }
        if (i == 3) {
            return new zzpq(new zzpp("HMACSHA256", secretKeySpec), zza);
        }
        if (i == 4) {
            return new zzpq(new zzpp("HMACSHA512", secretKeySpec), zza);
        }
        if (i == 5) {
            return new zzpq(new zzpp("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
