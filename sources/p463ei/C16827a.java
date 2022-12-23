package p463ei;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import p439di.C16670b;

/* renamed from: ei.a */
public final class C16827a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C16827a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f36941a = new C16670b(webView);
    }
}
