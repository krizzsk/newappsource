package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.measurement.e */
public class C2821e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2822f f9683a;

    public C2821e(C2822f fVar) {
        this.f9683a = fVar;
    }

    public void run() {
        IAlog.m9902a("clearing webview", new Object[0]);
        WebView webView = this.f9683a.f9688e;
        if (webView != null) {
            webView.destroy();
            this.f9683a.f9688e = null;
        }
    }
}
