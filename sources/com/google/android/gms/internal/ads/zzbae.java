package com.google.android.gms.internal.ads;

import android.view.Surface;

final class zzbae implements Runnable {
    public final /* synthetic */ Surface zza;
    public final /* synthetic */ zzbag zzb;

    public zzbae(zzbag zzbag, Surface surface) {
        this.zzb = zzbag;
        this.zza = surface;
    }

    public final void run() {
        this.zzb.zzb.zzm(this.zza);
    }
}
