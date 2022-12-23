package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzfjp implements Runnable {
    public final /* synthetic */ zzfjq zza;
    private final WebView zzb;

    public zzfjp(zzfjq zzfjq) {
        this.zza = zzfjq;
        this.zzb = zzfjq.zza;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
