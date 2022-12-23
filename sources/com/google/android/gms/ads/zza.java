package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzdr;

public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ AdLoader zza;
    public final /* synthetic */ zzdr zzb;

    public /* synthetic */ zza(AdLoader adLoader, zzdr zzdr) {
        this.zza = adLoader;
        this.zzb = zzdr;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
