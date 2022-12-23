package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzgfr extends zzgkk implements zzglz {
    private zzgfr() {
        super(zzgfu.zzb);
    }

    public final zzgfr zza(zzgft zzgft) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfu.zzj((zzgfu) this.zza, zzgft);
        return this;
    }

    public final zzgfr zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfu) this.zza).zze = i;
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgfu) this.zza).zzh());
    }

    public /* synthetic */ zzgfr(zzgfq zzgfq) {
        super(zzgfu.zzb);
    }
}
