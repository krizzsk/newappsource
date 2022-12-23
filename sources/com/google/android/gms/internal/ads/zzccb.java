package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

public final /* synthetic */ class zzccb implements Runnable {
    public final /* synthetic */ zzccd zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzccb(zzccd zzccd, Bitmap bitmap) {
        this.zza = zzccd;
        this.zzb = bitmap;
    }

    public final void run() {
        this.zza.zzf(this.zzb);
    }
}
