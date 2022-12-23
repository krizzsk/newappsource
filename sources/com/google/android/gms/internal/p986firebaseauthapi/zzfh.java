package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfh */
final class zzfh implements zzey {
    private final zzpx zza;
    private final zzpx zzb;

    private zzfh(byte[] bArr, byte[] bArr2) {
        this.zza = zzpx.zzb(bArr);
        this.zzb = zzpx.zzb(bArr2);
    }

    public static zzfh zzc(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        zzoz.zze(zzoz.zzj(zzoz.zzk(i), 1, bArr2), zzoz.zzh(i, bArr));
        return new zzfh(bArr, bArr2);
    }

    public final zzpx zza() {
        return this.zza;
    }

    public final zzpx zzb() {
        return this.zzb;
    }
}
