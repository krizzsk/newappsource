package p840uh;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import p816th.C19681b;

/* renamed from: uh.a */
public final class C19912a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C19912a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f36928a = new C19681b(webView);
    }
}
