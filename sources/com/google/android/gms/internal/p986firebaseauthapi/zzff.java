package com.google.android.gms.internal.p986firebaseauthapi;

import com.appboy.support.ValidationUtils;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff */
public final class zzff {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 16);
    public static final byte[] zzd = zzc(2, 17);
    public static final byte[] zze = zzc(2, 18);
    public static final byte[] zzf = zzc(2, 1);
    public static final byte[] zzg = zzc(2, 2);
    public static final byte[] zzh = zzc(2, 3);
    public static final byte[] zzi = zzc(2, 1);
    public static final byte[] zzj = zzc(2, 2);
    public static final byte[] zzk = zzc(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzm = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzn = "HPKE".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzo = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static void zza(zzmj zzmj) throws GeneralSecurityException {
        if (zzmj.zzf() == 2 || zzmj.zzf() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zzmd.zza(zzmj.zzf())));
        }
        String str = "UNRECOGNIZED";
        if (zzmj.zze() == 2 || zzmj.zze() == 1) {
            int zze2 = zzmj.zze();
            if (zze2 == 2) {
                str = "KDF_UNKNOWN";
            } else if (zze2 == 3) {
                str = "HKDF_SHA256";
            } else if (zze2 == 4) {
                str = "HKDF_SHA384";
            } else if (zze2 == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (zzmj.zzd() == 2 || zzmj.zzd() == 1) {
            int zzd2 = zzmj.zzd();
            if (zzd2 == 2) {
                str = "AEAD_UNKNOWN";
            } else if (zzd2 == 3) {
                str = "AES_128_GCM";
            } else if (zzd2 == 4) {
                str = "AES_256_GCM";
            } else if (zzd2 == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    public static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzor.zzc(zzn, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        }
        return bArr;
    }

    public static byte[] zzd(byte[] bArr) throws GeneralSecurityException {
        return zzor.zzc(zzm, bArr);
    }

    public static byte[] zze(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzor.zzc(zzo, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzor.zzc(zzc(2, i), zzo, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
