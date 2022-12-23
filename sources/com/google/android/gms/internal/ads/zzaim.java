package com.google.android.gms.internal.ads;

final class zzaim implements Runnable {
    public final /* synthetic */ zzajb zza;
    public final /* synthetic */ zzain zzb;

    public zzaim(zzain zzain, zzajb zzajb) {
        this.zzb = zzain;
        this.zza = zzajb;
    }

    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
