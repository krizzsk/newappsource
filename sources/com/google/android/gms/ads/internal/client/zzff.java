package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

public final class zzff extends zzdm {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzff(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    public final void zze() {
        this.zza.onVideoEnd();
    }

    public final void zzf(boolean z) {
        this.zza.onVideoMute(z);
    }

    public final void zzg() {
        this.zza.onVideoPause();
    }

    public final void zzh() {
        this.zza.onVideoPlay();
    }

    public final void zzi() {
        this.zza.onVideoStart();
    }
}
