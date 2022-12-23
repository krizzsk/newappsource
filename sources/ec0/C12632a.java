package ec0;

import ac0.C7557a;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.analytics.ecommerce.Promotion;
import mf0.C24362h;

/* renamed from: ec0.a */
public class C12632a extends WebChromeClient {
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C24362h.m61211f(webView, Promotion.ACTION_VIEW);
        C24362h.m61211f(str, "url");
        C24362h.m61211f(str2, InAppMessageBase.MESSAGE);
        C24362h.m61211f(jsResult, "result");
        C7557a.f23040a.mo6672i(str2);
        jsResult.confirm();
        return true;
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        C24362h.m61211f(webView, Promotion.ACTION_VIEW);
        C24362h.m61211f(str, "url");
        C24362h.m61211f(str2, InAppMessageBase.MESSAGE);
        C24362h.m61211f(jsResult, "result");
        C7557a.f23040a.mo6672i(str2);
        jsResult.confirm();
        return true;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C24362h.m61211f(webView, Promotion.ACTION_VIEW);
        C24362h.m61211f(str, "url");
        C24362h.m61211f(str2, InAppMessageBase.MESSAGE);
        C24362h.m61211f(jsResult, "result");
        C7557a.f23040a.mo6672i(str2);
        jsResult.confirm();
        return true;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C24362h.m61211f(webView, Promotion.ACTION_VIEW);
        C24362h.m61211f(str, "url");
        C24362h.m61211f(str2, InAppMessageBase.MESSAGE);
        C24362h.m61211f(str3, "defaultValue");
        C24362h.m61211f(jsPromptResult, "result");
        C7557a.f23040a.mo6672i(str2);
        jsPromptResult.confirm();
        return true;
    }
}
