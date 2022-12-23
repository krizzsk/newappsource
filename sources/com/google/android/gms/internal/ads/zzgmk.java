package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgmk extends zzgiy {
    public final zzgmo zza;
    public zzgja zzb = zzb();
    public final /* synthetic */ zzgmq zzc;

    public zzgmk(zzgmq zzgmq) {
        this.zzc = zzgmq;
        this.zza = new zzgmo(zzgmq, (zzgmn) null);
    }

    private final zzgja zzb() {
        zzgmo zzgmo = this.zza;
        if (zzgmo.hasNext()) {
            return zzgmo.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgja zzgja = this.zzb;
        if (zzgja != null) {
            byte zza2 = zzgja.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
