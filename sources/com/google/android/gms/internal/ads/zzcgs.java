package com.google.android.gms.internal.ads;

final class zzcgs implements Runnable {
    public final /* synthetic */ zzcgv zza;

    public zzcgs(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzd();
            this.zza.zzq.zzi();
        }
    }
}
