package m60;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import p977zz.C20955o;

/* renamed from: m60.f */
public final class C18348f extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ WebInstruction f46782a;

    /* renamed from: b */
    public final /* synthetic */ C18346e f46783b;

    public C18348f(C18346e eVar, WebInstruction webInstruction) {
        this.f46783b = eVar;
        this.f46782a = webInstruction;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f46783b.f46780s.setVisibility(8);
        C20955o.m49072c();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return C18346e.m45172s2(this.f46783b, this.f46782a, str);
    }
}
