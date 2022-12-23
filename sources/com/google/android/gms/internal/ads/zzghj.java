package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

public final class zzghj implements zzfwk {
    private final ECPrivateKey zza;
    private final zzghl zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzghi zze;

    public zzghj(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzghi zzghi) throws GeneralSecurityException {
        this.zza = eCPrivateKey;
        this.zzb = new zzghl(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzghi;
    }
}
