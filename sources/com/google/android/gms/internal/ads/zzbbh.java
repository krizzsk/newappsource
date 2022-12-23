package com.google.android.gms.internal.ads;

import android.view.View;

final class zzbbh implements Runnable {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzbbl zzb;

    public zzbbh(zzbbl zzbbl, View view) {
        this.zzb = zzbbl;
        this.zza = view;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
