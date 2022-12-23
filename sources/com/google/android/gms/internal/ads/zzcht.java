package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

final class zzcht implements Runnable {
    private final zzchf zza;
    private boolean zzb = false;

    public zzcht(zzchf zzchf) {
        this.zza = zzchf;
    }

    private final void zzc() {
        zzfnu zzfnu = zzs.zza;
        zzfnu.removeCallbacks(this);
        zzfnu.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.zzb) {
            this.zza.zzs();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzs();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
