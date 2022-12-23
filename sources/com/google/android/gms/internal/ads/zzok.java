package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

final class zzok extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ zzon zza;
    public final /* synthetic */ zzol zzb;

    public zzok(zzol zzol, zzon zzon) {
        this.zzb = zzol;
        this.zza = zzon;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        boolean z;
        if (audioTrack == this.zzb.zza.zzq) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzon zzon = this.zzb.zza;
        if (zzon.zzn != null && zzon.zzO) {
            zzon.zzn.zzb();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        boolean z;
        if (audioTrack == this.zzb.zza.zzq) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzon zzon = this.zzb.zza;
        if (zzon.zzn != null && zzon.zzO) {
            zzon.zzn.zzb();
        }
    }
}
