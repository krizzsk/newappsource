package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class zzgii {
    private static final ThreadLocal zza = new zzgih();

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
