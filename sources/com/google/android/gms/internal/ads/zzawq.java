package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzawq implements Runnable {
    public final /* synthetic */ IOException zza;
    public final /* synthetic */ zzawu zzb;

    public zzawq(zzawu zzawu, IOException iOException) {
        this.zzb = zzawu;
        this.zza = iOException;
    }

    public final void run() {
        this.zzb.zze.zzi(this.zza);
    }
}
