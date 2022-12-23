package com.google.android.gms.internal.p986firebaseauthapi;

import com.appboy.support.ValidationUtils;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzox */
public final class zzox {
    private final ECPrivateKey zza;

    public zzox(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, int i2) throws GeneralSecurityException {
        int i3 = 1;
        byte[] zzc = zzor.zzc(bArr, zzoz.zzg(this.zza, zzoz.zzj(this.zza.getParams(), i2, bArr)));
        Mac mac = (Mac) zzpb.zzb.zza(str);
        if (i <= mac.getMacLength() * ValidationUtils.APPBOY_STRING_MAX_LENGTH) {
            if (bArr2 == null || bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] doFinal = mac.doFinal(zzc);
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr5 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update((byte[]) null);
                mac.update((byte) i3);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i5 = i4 + length;
                if (i5 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i4, i - i4);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
