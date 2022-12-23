package com.google.android.gms.tagmanager;

final class zzbb implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbe zzb;

    public zzbb(zzbe zzbe, String str) {
        this.zzb = zzbe;
        this.zza = str;
    }

    public final void run() {
        zzbe.zzg(this.zzb, this.zza);
    }
}
