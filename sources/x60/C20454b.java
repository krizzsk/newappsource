package x60;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import p977zz.C20955o;

/* renamed from: x60.b */
public final class C20454b extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ WebInstruction f51807a;

    /* renamed from: b */
    public final /* synthetic */ C20451a f51808b;

    public C20454b(C20451a aVar, WebInstruction webInstruction) {
        this.f51808b = aVar;
        this.f51807a = webInstruction;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f51808b.f51804v.setVisibility(8);
        C20955o.m49072c();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return C20451a.m48069y2(this.f51808b, this.f51807a, str);
    }
}
