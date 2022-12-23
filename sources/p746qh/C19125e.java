package p746qh;

import android.webkit.WebView;

/* renamed from: qh.e */
public final class C19125e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f48620b;

    /* renamed from: c */
    public final /* synthetic */ String f48621c;

    public C19125e(WebView webView, String str) {
        this.f48620b = webView;
        this.f48621c = str;
    }

    public final void run() {
        this.f48620b.loadUrl(this.f48621c);
    }
}
