package com.moovit.ads.mapitem.html;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.moovit.ads.HtmlMapItemAd;
import com.moovit.ads.MapItemAd;
import com.moovit.ads.mapitem.MapItemAdView;
import com.moovit.commons.utils.UiUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p393bq.C13653b;
import p896wp.C20389i;
import p896wp.C20390j;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/ads/mapitem/html/HtmlMapItemAdView;", "Lcom/moovit/ads/mapitem/MapItemAdView;", "Lcom/moovit/ads/HtmlMapItemAd;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
@SuppressLint({"SetJavaScriptEnabled"})
public final class HtmlMapItemAdView extends MapItemAdView<HtmlMapItemAd> {

    /* renamed from: k */
    public static final /* synthetic */ int f37398k = 0;

    /* renamed from: j */
    public final WebView f37399j;

    /* renamed from: com.moovit.ads.mapitem.html.HtmlMapItemAdView$a */
    public static final class C14710a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ HtmlMapItemAdView f37400a;

        /* renamed from: b */
        public final /* synthetic */ Context f37401b;

        public C14710a(HtmlMapItemAdView htmlMapItemAdView, Context context) {
            this.f37400a = htmlMapItemAdView;
            this.f37401b = context;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String str;
            MapItemAdCreativeHtml mapItemAdCreativeHtml;
            C24362h.m61211f(webResourceRequest, "request");
            HtmlMapItemAdView htmlMapItemAdView = this.f37400a;
            int i = HtmlMapItemAdView.f37398k;
            HtmlMapItemAd htmlMapItemAd = (HtmlMapItemAd) htmlMapItemAdView.getAd();
            if (htmlMapItemAd == null || (mapItemAdCreativeHtml = htmlMapItemAd.f37376e) == null) {
                str = null;
            } else {
                str = mapItemAdCreativeHtml.f37404d;
            }
            Uri url = webResourceRequest.getUrl();
            if (str != null) {
                String uri = url.toString();
                C24362h.m61210e(uri, "uri.toString()");
                if (C25081h.m62835F(uri, str)) {
                    C13653b bVar = this.f37400a.f37396i;
                    if (bVar != null) {
                        bVar.mo40532c();
                    }
                    return true;
                }
            }
            C13653b bVar2 = this.f37400a.f37396i;
            if (bVar2 != null) {
                bVar2.mo52605a();
            }
            Context context = this.f37401b;
            Intent intent = new Intent("android.intent.action.VIEW", webResourceRequest.getUrl());
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HtmlMapItemAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HtmlMapItemAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HtmlMapItemAdView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* renamed from: c */
    public final void mo44673c(MapItemAd mapItemAd) {
        HtmlMapItemAd htmlMapItemAd = (HtmlMapItemAd) mapItemAd;
        C24362h.m61211f(htmlMapItemAd, AttributionData.CREATIVE_KEY);
        MapItemAdCreativeHtml mapItemAdCreativeHtml = htmlMapItemAd.f37376e;
        AdSize adSize = mapItemAdCreativeHtml.f37403c;
        setLayoutParams(new ConstraintLayout.LayoutParams((int) UiUtils.m40246e(getContext(), (float) adSize.f37357b), (int) UiUtils.m40246e(getContext(), (float) adSize.f37358c)));
        this.f37399j.loadDataWithBaseURL((String) null, mapItemAdCreativeHtml.f37402b, "text/html", (String) null, (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HtmlMapItemAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C14710a aVar = new C14710a(this, context);
        LayoutInflater.from(context).inflate(C20390j.html_direct_ad_view, this, true);
        View findViewById = findViewById(C20389i.webView);
        WebView webView = (WebView) findViewById;
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(aVar);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMixedContentMode(2);
        C24362h.m61210e(findViewById, "findViewById<WebView>(R.…PATIBILITY_MODE\n        }");
        this.f37399j = (WebView) findViewById;
    }
}
