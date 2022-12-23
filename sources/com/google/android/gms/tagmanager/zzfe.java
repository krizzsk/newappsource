package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.gtm.zzga;

final class zzfe implements zzfb {
    public final /* synthetic */ zzff zza;
    private final Handler zzb;

    public /* synthetic */ zzfe(zzff zzff, zzfd zzfd) {
        this.zza = zzff;
        this.zzb = new zzga(zzff.zzc.getMainLooper(), new zzfc(this));
    }

    private final Message zzd() {
        return this.zzb.obtainMessage(1, zzff.zza);
    }

    public final void zza() {
        this.zzb.removeMessages(1, zzff.zza);
    }

    public final void zzb() {
        this.zzb.removeMessages(1, zzff.zza);
        this.zzb.sendMessage(zzd());
    }

    public final void zzc(long j) {
        this.zzb.removeMessages(1, zzff.zza);
        this.zzb.sendMessageDelayed(zzd(), 1800000);
    }
}
