package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfg */
final class zzfg implements zzex {
    private final zzes zza;
    private final int zzb;

    private zzfg(zzes zzes, int i) {
        this.zza = zzes;
        this.zzb = i;
    }

    public static zzfg zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 == 0) {
            return new zzfg(new zzes("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new zzfg(new zzes("HmacSha512"), 3);
        }
        return new zzfg(new zzes("HmacSha384"), 2);
    }

    public final byte[] zza(byte[] bArr, zzey zzey) throws GeneralSecurityException {
        byte[] zzg = zzoz.zzg(zzoz.zzh(this.zzb, zzey.zza().zzc()), zzoz.zzj(zzoz.zzk(this.zzb), 1, bArr));
        byte[] zzc = zzor.zzc(bArr, zzey.zzb().zzc());
        byte[] zzd = zzff.zzd(zzb());
        zzes zzes = this.zza;
        return zzes.zzb((byte[]) null, zzg, "eae_prk", zzc, "shared_secret", zzd, zzes.zza());
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        if (i == 0) {
            return zzff.zzc;
        }
        if (i != 1) {
            return zzff.zze;
        }
        return zzff.zzd;
    }
}
