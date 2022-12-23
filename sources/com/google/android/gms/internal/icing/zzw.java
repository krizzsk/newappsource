package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
public final class zzw {
    private zzi zza;
    private long zzb = -1;
    private int zzc = -1;
    private zzg zzd;
    private boolean zze = false;
    private int zzf = 0;

    public final zzw zza(zzi zzi) {
        this.zza = zzi;
        return this;
    }

    public final zzw zzb(long j) {
        this.zzb = j;
        return this;
    }

    public final zzw zzc(int i) {
        this.zzc = i;
        return this;
    }

    public final zzw zzd(zzg zzg) {
        this.zzd = zzg;
        return this;
    }

    public final zzw zze(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzw zzf(int i) {
        this.zzf = i;
        return this;
    }

    public final zzx zzg() {
        return new zzx(this.zza, this.zzb, this.zzc, (String) null, this.zzd, this.zze, -1, this.zzf, (String) null);
    }
}
