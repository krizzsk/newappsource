package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.SecureRandom;
import p001a0.C0016g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhg */
public final class zzhg {
    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    public static final zzpx zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzhf(C0016g.m28k("Not a printable ASCII character: ", charAt));
            }
            bArr[i] = (byte) charAt;
        }
        return zzpx.zzb(bArr);
    }
}
