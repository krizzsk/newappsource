package l50;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import l50.C18171b;
import p054d0.C4314v;
import p977zz.C20955o;
import p977zz.C20964s0;

/* renamed from: l50.a */
public final class C18170a extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C18171b f46403a;

    public C18170a(C18171b bVar) {
        this.f46403a = bVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f46403a.f46409m.setVisibility(8);
        C20955o.m49072c();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f46403a.f46406j.f42777b)) {
            C18171b bVar = this.f46403a;
            bVar.getClass();
            if (C20964s0.m49090h(str)) {
                bVar.dismissAllowingStateLoss();
            } else {
                bVar.mo46753L1(C18171b.C18172a.class, new C4314v(bVar, 14));
            }
            return true;
        } else if (str.startsWith(this.f46403a.f46406j.f42778c)) {
            this.f46403a.dismissAllowingStateLoss();
            return true;
        } else if (str.startsWith(this.f46403a.f46406j.f42779d)) {
            this.f46403a.dismissAllowingStateLoss();
            return true;
        } else if (!str.startsWith(this.f46403a.f46406j.f42780e)) {
            return false;
        } else {
            this.f46403a.dismissAllowingStateLoss();
            return true;
        }
    }
}
