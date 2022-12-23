package com.moovit.ads.banner.html;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appboy.models.outgoing.AttributionData;
import com.moovit.ads.AdSize;
import com.moovit.ads.BannerAd;
import com.moovit.ads.HtmlBannerAd;
import com.moovit.ads.banner.BannerAdView;
import com.moovit.commons.utils.UiUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p896wp.C20389i;
import p896wp.C20390j;
import p920xp.C20552a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/ads/banner/html/HtmlBannerView;", "Lcom/moovit/ads/banner/BannerAdView;", "Lcom/moovit/ads/HtmlBannerAd;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
@SuppressLint({"SetJavaScriptEnabled"})
public final class HtmlBannerView extends BannerAdView<HtmlBannerAd> {

    /* renamed from: k */
    public static final /* synthetic */ int f37383k = 0;

    /* renamed from: j */
    public final WebView f37384j;

    /* renamed from: com.moovit.ads.banner.html.HtmlBannerView$a */
    public static final class C14706a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ HtmlBannerView f37385a;

        /* renamed from: b */
        public final /* synthetic */ Context f37386b;

        public C14706a(HtmlBannerView htmlBannerView, Context context) {
            this.f37385a = htmlBannerView;
            this.f37386b = context;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C24362h.m61211f(webResourceRequest, "request");
            HtmlBannerView htmlBannerView = this.f37385a;
            int i = HtmlBannerView.f37383k;
            C20552a aVar = htmlBannerView.f37380i;
            if (aVar != null) {
                aVar.mo52605a();
            }
            Context context = this.f37386b;
            Intent intent = new Intent("android.intent.action.VIEW", webResourceRequest.getUrl());
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HtmlBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HtmlBannerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HtmlBannerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* renamed from: c */
    public final void mo44652c(BannerAd bannerAd) {
        HtmlBannerAd htmlBannerAd = (HtmlBannerAd) bannerAd;
        C24362h.m61211f(htmlBannerAd, AttributionData.CREATIVE_KEY);
        BannerAdCreativeHtml bannerAdCreativeHtml = htmlBannerAd.f37370e;
        AdSize adSize = bannerAdCreativeHtml.f37382c;
        setLayoutParams(new ConstraintLayout.LayoutParams((int) UiUtils.m40246e(getContext(), (float) adSize.f37357b), (int) UiUtils.m40246e(getContext(), (float) adSize.f37358c)));
        this.f37384j.loadDataWithBaseURL((String) null, bannerAdCreativeHtml.f37381b, "text/html", (String) null, (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HtmlBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C14706a aVar = new C14706a(this, context);
        LayoutInflater.from(context).inflate(C20390j.html_banner_view, this, true);
        View findViewById = findViewById(C20389i.webView);
        WebView webView = (WebView) findViewById;
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(aVar);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMixedContentMode(2);
        C24362h.m61210e(findViewById, "findViewById<WebView>(R.…NT_COMPATIBILITY_MODE\n\t\t}");
        this.f37384j = (WebView) findViewById;
    }
}
