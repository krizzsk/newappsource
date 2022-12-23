package com.google.android.gms.internal.ads;

final class zzcgr implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzcgv zzc;

    public zzcgr(zzcgv zzcgv, int i, int i2) {
        this.zzc = zzcgv;
        this.zza = i;
        this.zzb = i2;
    }

    public final void run() {
        zzcgv zzcgv = this.zzc;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzj(this.zza, this.zzb);
        }
    }
}
