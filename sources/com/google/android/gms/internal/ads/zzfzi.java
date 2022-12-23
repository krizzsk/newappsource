package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzfzi implements zzfwj {
    private final zzfxa zza;

    public zzfzi(zzfxa zzfxa) {
        this.zza = zzfxa;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwj) this.zza.zzb().zza()).zza(bArr, bArr2));
    }
}
