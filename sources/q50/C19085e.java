package q50;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import p977zz.C20955o;

/* renamed from: q50.e */
public final class C19085e extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ WebInstruction f48516a;

    /* renamed from: b */
    public final /* synthetic */ C19083d f48517b;

    public C19085e(C19083d dVar, WebInstruction webInstruction) {
        this.f48517b = dVar;
        this.f48516a = webInstruction;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f48517b.f48514s.setVisibility(8);
        C20955o.m49072c();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return C19083d.m46214r2(this.f48517b, this.f48516a, str);
    }
}
