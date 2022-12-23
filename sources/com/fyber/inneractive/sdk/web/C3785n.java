package com.fyber.inneractive.sdk.web;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3676d;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.web.n */
public class C3785n extends WebViewClient {

    /* renamed from: a */
    public final boolean f13052a;

    /* renamed from: b */
    public final int f13053b;

    /* renamed from: c */
    public final int f13054c;

    /* renamed from: d */
    public final int f13055d;

    /* renamed from: e */
    public C3761b f13056e;

    public C3785n(C3761b bVar, boolean z, int i, int i2, int i3) {
        this.f13056e = bVar;
        this.f13052a = z;
        this.f13053b = i;
        this.f13054c = i2;
        this.f13055d = i3;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.m9905d("Resources to load: %s", str);
        IAlog.m9900a(1, (Exception) null, "%s %s", "RESOURCES", str);
        C3761b bVar = this.f13056e;
        if (bVar != null) {
            C3753a aVar = (C3753a) bVar;
            if (!TextUtils.isEmpty(str) && str.startsWith(UrlPrivacyValidator.HTTP_SCHEME) && !C3725r.m9983a()) {
                IAlog.m9902a("%s Found a portential unsecure resource url: %s", IAlog.m9899a((Object) aVar), str);
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.m9905d("onPageFinished - url: %s", str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.m9905d("onPageStarted - url: %s", str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m9905d("%sError: code = %d text = %s WebView = %s", IAlog.m9899a((Object) this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean z;
        IAlog.m9902a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        if (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
            z = false;
        } else {
            z = true;
        }
        objArr[0] = Boolean.valueOf(z);
        IAlog.m9902a("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        C3753a aVar = (C3753a) this.f13056e;
        L l = aVar.f12962g;
        if (l != null) {
            l.mo13911a();
        }
        aVar.mo15410a(true);
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f13052a && webResourceRequest != null) {
            IAlog.m9905d("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            C3790r rVar = C3790r.f13063c;
            int i = this.f13053b;
            int i2 = this.f13054c;
            int i3 = this.f13055d;
            rVar.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                C3791s sVar = (C3791s) rVar.f13064a.get(new C3792t(webResourceRequest));
                if (sVar != null) {
                    webResourceResponse = sVar.mo15499b();
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer b = C3676d.f12833b.mo15347b();
                        try {
                            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                C3790r.m10090a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            C3791s sVar2 = null;
                            while (i3 > 0) {
                                try {
                                    sVar2 = C3790r.m10089a(httpURLConnection, b);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i3 = 0;
                                }
                                if (sVar2 != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (sVar2 != null) {
                                try {
                                    if (sVar2.mo15498a()) {
                                        rVar.f13064a.put(new C3792t(webResourceRequest), sVar2);
                                    }
                                    webResourceResponse = sVar2.mo15499b();
                                    httpURLConnection.disconnect();
                                    C3676d.f12833b.f12834a.offer(b);
                                } catch (Throwable unused6) {
                                }
                            }
                            httpURLConnection.disconnect();
                            C3676d.f12833b.f12834a.offer(b);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.m9905d("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        C3761b bVar = this.f13056e;
        if (bVar == null || !((IAmraidWebViewController) bVar).mo15322a(webView, str)) {
            return false;
        }
        return true;
    }
}
