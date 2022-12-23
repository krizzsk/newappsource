package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class zzgie extends ThreadLocal {
    public final /* synthetic */ zzgif zza;

    public zzgie(zzgif zzgif) {
        this.zza = zzgif;
    }

    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzghq.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
