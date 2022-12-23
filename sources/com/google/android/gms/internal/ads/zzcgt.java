package com.google.android.gms.internal.ads;

final class zzcgt implements Runnable {
    public final /* synthetic */ zzcgv zza;

    public zzcgt(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            if (!zzcgv.zzr) {
                zzcgv.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
