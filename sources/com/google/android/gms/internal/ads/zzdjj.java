package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzdjj {
    private final List zza;
    private final zzfig zzb;
    private boolean zzc;

    public zzdjj(zzfbg zzfbg, zzfig zzfig) {
        this.zza = zzfbg.zzq;
        this.zzb = zzfig;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
