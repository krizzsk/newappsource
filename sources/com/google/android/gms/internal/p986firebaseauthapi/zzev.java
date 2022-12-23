package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzev */
final class zzev implements zzau {
    private static final byte[] zza = new byte[0];
    private final zzey zzb;
    private final zzex zzc;
    private final zzet zzd;
    private final zzes zze;

    private zzev(zzey zzey, zzex zzex, zzes zzes, zzet zzet, int i, byte[] bArr) {
        this.zzb = zzey;
        this.zzc = zzex;
        this.zze = zzes;
        this.zzd = zzet;
    }

    public static zzev zzb(zzmm zzmm) throws GeneralSecurityException {
        zzey zzey;
        if (!zzmm.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzmm.zze().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzmm.zzf().zzs()) {
            zzmj zzb2 = zzmm.zze().zzb();
            zzex zzb3 = zzez.zzb(zzb2);
            zzes zzc2 = zzez.zzc(zzb2);
            zzet zza2 = zzez.zza(zzb2);
            int zzf = zzb2.zzf();
            int i = 1;
            if (zzf - 2 == 1) {
                int zzf2 = zzmm.zze().zzb().zzf() - 2;
                if (zzf2 == 1) {
                    zzey = zzfj.zzc(zzmm.zzf().zzt());
                } else if (zzf2 == 2 || zzf2 == 3 || zzf2 == 4) {
                    byte[] zzt = zzmm.zzf().zzt();
                    byte[] zzt2 = zzmm.zze().zzg().zzt();
                    int zzf3 = zzmm.zze().zzb().zzf() - 2;
                    if (zzf3 != 2) {
                        if (zzf3 == 3) {
                            i = 2;
                        } else if (zzf3 == 4) {
                            i = 3;
                        } else {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                    }
                    zzey = zzfh.zzc(zzt, zzt2, i);
                } else {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return new zzev(zzey, zzb3, zzc2, zza2, 32, (byte[]) null);
            }
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzmd.zza(zzf)));
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 32) {
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
            zzey zzey = this.zzb;
            zzex zzex = this.zzc;
            zzes zzes = this.zze;
            zzet zzet = this.zzd;
            return zzeu.zzb(copyOf, zzex.zza(copyOf, zzey), zzex, zzes, zzet, new byte[0]).zza(copyOfRange, zza);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
