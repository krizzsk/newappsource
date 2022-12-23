package p588jp;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import p701oj.C18770n;

/* renamed from: jp.b */
public final class C17907b extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ C17905a f45948a;

    public C17907b(C17905a aVar) {
        this.f45948a = aVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        super.onProgressChanged(webView, i);
        if (i == 100) {
            C18770n nVar = this.f45948a.f45945c;
            if (!(nVar == null || (progressBar = nVar.f47770a) == null)) {
                progressBar.setVisibility(8);
            }
            this.f45948a.f45946d = true;
        }
    }
}
