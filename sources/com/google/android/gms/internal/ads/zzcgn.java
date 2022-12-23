package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

final class zzcgn implements Runnable {
    public final /* synthetic */ MediaPlayer zza;
    public final /* synthetic */ zzcgv zzb;

    public zzcgn(zzcgv zzcgv, MediaPlayer mediaPlayer) {
        this.zzb = zzcgv;
        this.zza = mediaPlayer;
    }

    public final void run() {
        zzcgv.zzl(this.zzb, this.zza);
        zzcgv zzcgv = this.zzb;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzf();
        }
    }
}
