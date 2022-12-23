package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class zzny extends Thread {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzon zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzny(zzon zzon, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.zzb = zzon;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zzf.open();
        }
    }
}
