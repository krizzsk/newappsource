package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfwq {
    public static zzfwp zza(String str) throws GeneralSecurityException {
        if (zzfxi.zzj().containsKey(str)) {
            return (zzfwp) zzfxi.zzj().get(str);
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
