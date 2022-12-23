package com.moovit.ads.interstitial.html;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moovit.ads.HtmlInterstitialAd;
import com.moovit.ads.interstitial.InterstitialActivity;
import kotlin.Metadata;
import mf0.C24362h;
import p896wp.C20389i;
import p896wp.C20390j;
import p967zp.C20881a;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/ads/interstitial/html/HtmlInterstitialActivity;", "Lcom/moovit/ads/interstitial/InterstitialActivity;", "<init>", "()V", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class HtmlInterstitialActivity extends InterstitialActivity {

    /* renamed from: A */
    public static final /* synthetic */ int f37389A = 0;

    /* renamed from: y */
    public final C14707a f37390y = new C14707a(this);

    /* renamed from: z */
    public HtmlInterstitialAd f37391z;

    /* renamed from: com.moovit.ads.interstitial.html.HtmlInterstitialActivity$a */
    public static final class C14707a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ HtmlInterstitialActivity f37392a;

        public C14707a(HtmlInterstitialActivity htmlInterstitialActivity) {
            this.f37392a = htmlInterstitialActivity;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C24362h.m61211f(webResourceRequest, "request");
            Uri url = webResourceRequest.getUrl();
            String uri = url.toString();
            C24362h.m61210e(uri, "uri.toString()");
            HtmlInterstitialAd htmlInterstitialAd = this.f37392a.f37391z;
            if (htmlInterstitialAd == null) {
                C24362h.m61217l("interstitialAd");
                throw null;
            } else if (C25081h.m62835F(uri, htmlInterstitialAd.f37373d.f37394c)) {
                C20881a aVar = this.f37392a.f37387x;
                if (aVar != null) {
                    aVar.mo52988c();
                }
                this.f37392a.finish();
                return true;
            } else {
                C20881a aVar2 = this.f37392a.f37387x;
                if (aVar2 != null) {
                    aVar2.mo52605a();
                }
                HtmlInterstitialActivity htmlInterstitialActivity = this.f37392a;
                Intent intent = new Intent("android.intent.action.VIEW", url);
                intent.addFlags(268435456);
                htmlInterstitialActivity.startActivity(intent);
                return true;
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C20390j.html_interstitial_activity);
        HtmlInterstitialAd htmlInterstitialAd = (HtmlInterstitialAd) getIntent().getParcelableExtra("interstitialAd");
        if (htmlInterstitialAd != null) {
            this.f37391z = htmlInterstitialAd;
            WebView webView = (WebView) findViewById(C20389i.webView);
            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(this.f37390y);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setMixedContentMode(2);
            HtmlInterstitialAd htmlInterstitialAd2 = this.f37391z;
            if (htmlInterstitialAd2 != null) {
                webView.loadDataWithBaseURL((String) null, htmlInterstitialAd2.f37373d.f37393b, "text/html", (String) null, (String) null);
            } else {
                C24362h.m61217l("interstitialAd");
                throw null;
            }
        } else {
            throw new IllegalStateException("Did you use HtmlInterstitialActivity.createStartIntent(...)?");
        }
    }
}
