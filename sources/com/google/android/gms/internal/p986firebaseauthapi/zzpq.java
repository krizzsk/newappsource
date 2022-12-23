package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpq */
public final class zzpq implements zzbm {
    private final zzim zza;
    private final int zzb;

    public zzpq(zzim zzim, int i) throws GeneralSecurityException {
        this.zza = zzim;
        this.zzb = i;
        if (i >= 10) {
            zzim.zza(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzor.zzb(this.zza.zza(bArr2, this.zzb), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
