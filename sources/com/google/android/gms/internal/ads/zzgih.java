package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

final class zzgih extends ThreadLocal {
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
