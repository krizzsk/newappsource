package com.google.android.gms.internal.ads;

final class zzcgu implements Runnable {
    public final /* synthetic */ zzcgv zza;

    public zzcgu(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzd();
        }
    }
}
