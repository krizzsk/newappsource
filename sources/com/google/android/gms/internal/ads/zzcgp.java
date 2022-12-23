package com.google.android.gms.internal.ads;

final class zzcgp implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcgv zzc;

    public zzcgp(zzcgv zzcgv, String str, String str2) {
        this.zzc = zzcgv;
        this.zza = str;
        this.zzb = str2;
    }

    public final void run() {
        zzcgv zzcgv = this.zzc;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzb(this.zza, this.zzb);
        }
    }
}
