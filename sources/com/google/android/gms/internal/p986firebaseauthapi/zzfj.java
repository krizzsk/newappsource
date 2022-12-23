package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfj */
final class zzfj implements zzey {
    private final zzpx zza;
    private final zzpx zzb;

    private zzfj(byte[] bArr, byte[] bArr2) {
        this.zza = zzpx.zzb(bArr);
        this.zzb = zzpx.zzb(bArr2);
    }

    public static zzfj zzc(byte[] bArr) throws GeneralSecurityException {
        return new zzfj(bArr, zzpv.zzb(bArr));
    }

    public final zzpx zza() {
        return this.zza;
    }

    public final zzpx zzb() {
        return this.zzb;
    }
}
