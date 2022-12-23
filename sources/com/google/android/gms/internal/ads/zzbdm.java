package com.google.android.gms.internal.ads;

import android.content.Context;

public final /* synthetic */ class zzbdm implements Runnable {
    public final /* synthetic */ zzbdr zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbdm(zzbdr zzbdr, Context context) {
        this.zza = zzbdr;
        this.zzb = context;
    }

    public final void run() {
        this.zza.zzb(this.zzb);
    }
}
