package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class zzasq extends Thread {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzata zzb;

    public zzasq(zzata zzata, AudioTrack audioTrack) {
        this.zzb = zzata;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zze.open();
        }
    }
}
