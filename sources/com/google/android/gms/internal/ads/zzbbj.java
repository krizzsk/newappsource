package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class zzbbj implements Runnable {
    public final ValueCallback zza;
    public final /* synthetic */ zzbbb zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzbbl zze;

    public zzbbj(zzbbl zzbbl, zzbbb zzbbb, WebView webView, boolean z) {
        this.zze = zzbbl;
        this.zzb = zzbbb;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new zzbbi(this, zzbbb, webView, z);
    }

    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
