package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhz */
final class zzhz implements zzbm {
    private final zzbu zza;
    private final zzif zzb;
    private final zzif zzc;

    public /* synthetic */ zzhz(zzbu zzbu, zzhy zzhy) {
        zzif zzif;
        this.zza = zzbu;
        if (zzbu.zzf()) {
            zzig zzb2 = zzgl.zza().zzb();
            zzil zza2 = zzgi.zza(zzbu);
            this.zzb = zzb2.zza(zza2, "mac", "compute");
            zzif = zzb2.zza(zza2, "mac", "verify");
        } else {
            zzif = zzgi.zza;
            this.zzb = zzif;
        }
        this.zzc = zzif;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.zza.zze(copyOf)) {
                if (zzbq.zzd().equals(zzoa.LEGACY)) {
                    bArr3 = zzor.zzc(bArr2, zzia.zzb);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzbm) zzbq.zze()).zza(copyOfRange, bArr3);
                    zzbq.zza();
                    return;
                } catch (GeneralSecurityException e) {
                    zzia.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (zzbq zzbq2 : this.zza.zze(zzas.zza)) {
                try {
                    ((zzbm) zzbq2.zze()).zza(bArr, bArr2);
                    zzbq2.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
