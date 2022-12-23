package com.moovit.app.useraccount.campaigns;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.appboy.models.outgoing.AttributionData;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import ka0.C12823b;
import p543hq.C17474b;
import p977zz.C20964s0;

public class CampaignActivity extends MoovitActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f40555Z = 0;

    /* renamed from: U */
    public WebView f40556U;

    /* renamed from: X */
    public ProgressBar f40557X;

    /* renamed from: Y */
    public final C15590a f40558Y = new C15590a(this);

    /* renamed from: com.moovit.app.useraccount.campaigns.CampaignActivity$a */
    public class C15590a extends C12823b {
        public C15590a(Activity activity) {
            super(activity);
        }

        /* renamed from: a */
        public final void mo39653a(String str) {
            super.mo39653a(str);
            CampaignActivity campaignActivity = CampaignActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.WEB_VIEW_LOAD);
            aVar.mo49939g(AnalyticsAttributeKey.WEB_VIEW_URL, str);
            campaignActivity.mo44545v2(aVar.mo49933a());
            CampaignActivity.this.finish();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CampaignActivity.this.f40557X.setVisibility(8);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            CampaignActivity.this.f40557X.setVisibility(0);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        String str = ((Campaign) getIntent().getParcelableExtra(AttributionData.CAMPAIGN_KEY)).f40554c;
        if (C20964s0.m49090h(str)) {
            finish();
            return;
        }
        setContentView((int) R.layout.campaign_activity);
        this.f40557X = (ProgressBar) findViewById(R.id.progress_bar);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.f40556U = webView;
        webView.setWebChromeClient(new WebChromeClient());
        this.f40556U.getSettings().setJavaScriptEnabled(true);
        this.f40556U.setWebViewClient(this.f40558Y);
        this.f40556U.loadDataWithBaseURL((String) null, str, "text/html", (String) null, (String) null);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49935c(AnalyticsAttributeKey.ID, ((Campaign) getIntent().getParcelableExtra(AttributionData.CAMPAIGN_KEY)).f40553b);
        return m1;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView;
        if (i != 4 || (webView = this.f40556U) == null || !webView.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f40556U.goBack();
        return true;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }
}
