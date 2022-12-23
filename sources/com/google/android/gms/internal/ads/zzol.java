package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;

final class zzol {
    public final /* synthetic */ zzon zza;
    private final Handler zzb = new Handler();
    private final AudioTrack$StreamEventCallback zzc;

    public zzol(zzon zzon) {
        this.zza = zzon;
        this.zzc = new zzok(this, zzon);
    }

    public final void zza(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new zzoj(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages((Object) null);
    }
}
