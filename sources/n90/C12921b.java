package n90;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m80.C12869e;
import m80.C12870f;
import m90.C12889a;
import m90.C12890b;

/* renamed from: n90.b */
public class C12921b extends C12889a<C12919a> {
    public C12921b() {
        super(C12919a.class);
    }

    /* renamed from: n2 */
    public final void mo24271n2(View view, C12890b bVar) {
        WebView webView = (WebView) view.findViewById(C12869e.web_view);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL((String) null, ((C12919a) bVar).f31983d, "text/html", (String) null, (String) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.ticket_receipt_html_content, viewGroup, false);
    }
}
