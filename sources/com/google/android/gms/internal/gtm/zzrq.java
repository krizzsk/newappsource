package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public final class zzrq {
    private final Map<String, zzak> zza = new HashMap();
    private zzak zzb;

    private zzrq() {
    }

    public final zzro zza() {
        return new zzro(this.zza, this.zzb, (zzrn) null);
    }

    public final zzrq zzb(String str, zzak zzak) {
        this.zza.put(str, zzak);
        return this;
    }

    public final zzrq zzc(zzak zzak) {
        this.zzb = zzak;
        return this;
    }

    public /* synthetic */ zzrq(zzrp zzrp) {
    }
}
