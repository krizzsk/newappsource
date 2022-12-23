package p361ai;

import android.webkit.WebView;

/* renamed from: ai.e */
public final class C13470e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f33341b;

    /* renamed from: c */
    public final /* synthetic */ String f33342c;

    public C13470e(WebView webView, String str) {
        this.f33341b = webView;
        this.f33342c = str;
    }

    public final void run() {
        this.f33341b.loadUrl(this.f33342c);
    }
}
