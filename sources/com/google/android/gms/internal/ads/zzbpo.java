package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.p983h5.OnH5AdsEventListener;

public final /* synthetic */ class zzbpo implements OnH5AdsEventListener {
    public final /* synthetic */ WebView zza;

    public /* synthetic */ zzbpo(WebView webView) {
        this.zza = webView;
    }

    public final void onH5AdsEvent(String str) {
        WebView webView = this.zza;
        int i = zzbpp.zza;
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
