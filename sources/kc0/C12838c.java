package kc0;

import ac0.C7557a;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.google.android.gms.analytics.ecommerce.Promotion;
import hc0.C12751a;
import kc0.C12836b;
import mf0.C24362h;
import nc0.C12954d;
import p001a0.C0017h;
import p043ch.qos.logback.classic.Logger;
import uh0.C25081h;

/* renamed from: kc0.c */
public final class C12838c extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C12836b f31718a;

    public C12838c(C12836b bVar) {
        this.f31718a = bVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener: Page Finished");
        J0.append(this.f31718a.f31715l);
        J0.append(": ");
        J0.append(str);
        logger.mo6672i(J0.toString());
        if (!this.f31718a.f31714k) {
            if (C25081h.m62830A(str, "about:blank", false) || (this.f31718a.getBannerUrl() != null && C25081h.m62830A(str, this.f31718a.getBannerUrl(), false))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C12836b bVar = this.f31718a;
                if (!bVar.f31713j) {
                    bVar.mo39657d(false);
                    bVar.f31714k = true;
                    C12836b.C12837a aVar = bVar.f31708e;
                    if (aVar != null) {
                        ((C12751a) aVar).mo39547e(bVar, bVar.f31707d);
                    }
                }
            }
        }
        super.onPageFinished(webView, str);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C24362h.m61211f(webView, Promotion.ACTION_VIEW);
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener");
        J0.append(this.f31718a.f31715l);
        J0.append(": Error - 1 (");
        J0.append(str);
        J0.append(": ");
        J0.append(str2);
        J0.append(')');
        logger.mo6667d(J0.toString());
        this.f31718a.mo39656c(str2, UMOAdKitError.AD_PLAY_FAILED);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        Uri uri;
        Uri url;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener");
        J0.append(this.f31718a.f31715l);
        J0.append(": HTTP Error (");
        String str2 = null;
        if (webResourceResponse == null) {
            str = null;
        } else {
            str = webResourceResponse.getReasonPhrase();
        }
        J0.append(str);
        J0.append(" : ");
        if (webResourceRequest == null) {
            uri = null;
        } else {
            uri = webResourceRequest.getUrl();
        }
        J0.append(uri);
        J0.append(')');
        logger.mo6667d(J0.toString());
        C12836b bVar = this.f31718a;
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            str2 = url.toString();
        }
        bVar.mo39656c(str2, UMOAdKitError.AD_PLAY_FAILED);
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        String str2;
        Integer num = null;
        if (sslError == null) {
            str = null;
        } else {
            str = sslError.getUrl();
        }
        if (sslError != null) {
            num = Integer.valueOf(sslError.getPrimaryError());
        }
        if (num != null && num.intValue() == 3) {
            str2 = "SSL_UNTRUSTED";
        } else if (num != null && num.intValue() == 1) {
            str2 = "SSL_EXPIRED";
        } else if (num != null && num.intValue() == 2) {
            str2 = "SSL_IDMISMATCH";
        } else if (num != null && num.intValue() == 0) {
            str2 = "SSL_NOTYETVALID";
        } else {
            str2 = "SSL_UNKNOWN_ERROR";
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener");
        C0017h.m61R(J0, this.f31718a.f31715l, ": SSL Error (", str2, "): [ ");
        J0.append(str);
        J0.append(" ]");
        logger.mo6667d(J0.toString());
        this.f31718a.mo39656c(str, UMOAdKitError.AD_PLAY_FAILED);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!C12954d.m32800c(str)) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(this.f31718a.f31715l, "HTMLAdWebViewListener: Invalid Click Url"));
            return true;
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener: REDIRECTED_CLICK_URL - 1");
        J0.append(this.f31718a.f31715l);
        J0.append(": ");
        J0.append(str);
        logger.mo6672i(J0.toString());
        C12836b bVar = this.f31718a;
        C12836b.C12837a aVar = bVar.f31708e;
        if (aVar != null) {
            ((C12751a) aVar).mo39546d(bVar.f31707d, str);
        }
        return true;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener");
        J0.append(this.f31718a.f31715l);
        J0.append(": Error - 2 (");
        String str = null;
        J0.append(webResourceError == null ? null : Integer.valueOf(webResourceError.getErrorCode()));
        J0.append(": ");
        J0.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        J0.append(')');
        logger.mo6667d(J0.toString());
        C12836b bVar = this.f31718a;
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            str = url.toString();
        }
        bVar.mo39656c(str, UMOAdKitError.AD_PLAY_FAILED);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if ((webResourceRequest == null ? null : webResourceRequest.getUrl()) == null || !C12954d.m32800c(webResourceRequest.getUrl().toString())) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(this.f31718a.f31715l, "HTMLAdWebViewListener: Invalid Click Url"));
            return true;
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener: REDIRECTED_CLICK_URL - 2");
        J0.append(this.f31718a.f31715l);
        J0.append(": ");
        J0.append(webResourceRequest.getUrl());
        logger.mo6672i(J0.toString());
        C12836b bVar = this.f31718a;
        C12836b.C12837a aVar = bVar.f31708e;
        if (aVar != null) {
            ((C12751a) aVar).mo39546d(bVar.f31707d, webResourceRequest.getUrl().toString());
        }
        return true;
    }
}
