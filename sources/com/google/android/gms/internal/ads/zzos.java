package com.google.android.gms.internal.ads;

final class zzos implements zzno {
    public final /* synthetic */ zzot zza;

    public /* synthetic */ zzos(zzot zzot, zzor zzor) {
        this.zza = zzot;
    }

    public final void zza(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    public final void zzb() {
        zzot zzot = this.zza;
        if (zzot.zzl != null) {
            zzot.zzl.zzb();
        }
    }
}
