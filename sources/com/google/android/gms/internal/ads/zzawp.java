package com.google.android.gms.internal.ads;

final class zzawp implements Runnable {
    public final /* synthetic */ zzaws zza;
    public final /* synthetic */ zzawu zzb;

    public zzawp(zzawu zzawu, zzaws zzaws) {
        this.zzb = zzawu;
        this.zza = zzaws;
    }

    public final void run() {
        this.zza.zza();
        int size = this.zzb.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzaxj) this.zzb.zzn.valueAt(i)).zzi();
        }
    }
}
