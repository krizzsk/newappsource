package com.google.android.gms.ads.p983h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbpp;

/* renamed from: com.google.android.gms.ads.h5.H5AdsWebViewClient */
public final class H5AdsWebViewClient extends zzbpc {
    private final zzbpp zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.zza = new zzbpp(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
