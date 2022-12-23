package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzfjf implements Runnable {
    public final /* synthetic */ WebView zza;
    public final /* synthetic */ String zzb;

    public zzfjf(zzfjg zzfjg, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
