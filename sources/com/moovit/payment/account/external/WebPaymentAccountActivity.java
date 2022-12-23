package com.moovit.payment.account.external;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import c50.C25556b;
import c50.C25557c;
import c70.C13753f;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.collections.CollectionHashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ka0.C12822a;
import ka0.C12823b;
import ka0.C12824c;
import p435de.C16596f;
import p543hq.C17474b;
import p551hy.C17517b;
import p824tp.C19740r;
import p824tp.C19742t;
import p977zz.C20955o;
import p977zz.C20964s0;

public class WebPaymentAccountActivity extends MoovitActivity {

    /* renamed from: U */
    public final C12822a f63981U = new C12822a(this);

    /* renamed from: X */
    public final C25650a f63982X = new C25650a(this);

    /* renamed from: Y */
    public WebView f63983Y;

    /* renamed from: Z */
    public ProgressBar f63984Z;

    /* renamed from: l0 */
    public C17517b f63985l0;

    /* renamed from: com.moovit.payment.account.external.WebPaymentAccountActivity$a */
    public class C25650a extends C12823b {
        public C25650a(Activity activity) {
            super(activity);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebPaymentAccountActivity.this.f63984Z.setVisibility(8);
            C20955o.m49072c();
        }
    }

    /* renamed from: X1 */
    public final void mo44515X1(CollectionHashMap.ArrayListHashMap arrayListHashMap) {
        this.f63985l0 = ((C25557c) arrayListHashMap.mo47003d("getWebAccountInfo")).f63817m;
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f63983Y.onPause();
        C20955o.m49070a();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.web_view_layout);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(!isTaskRoot());
        }
        this.f63984Z = (ProgressBar) findViewById(C19740r.progress_bar);
        WebView webView = (WebView) findViewById(C19740r.webView);
        this.f63983Y = webView;
        webView.setWebChromeClient(this.f63981U);
        this.f63983Y.setWebViewClient(this.f63982X);
        WebSettings settings = this.f63983Y.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        String str = (String) this.f63985l0.f45095c;
        C16596f a = C16596f.m42113a();
        a.mo49363b("URL: " + str);
        if (!this.f63982X.shouldOverrideUrlLoading(this.f63983Y, str)) {
            this.f63983Y.loadUrl(str, (Map) this.f63985l0.f45096d);
        } else if (C20964s0.m49090h(this.f63983Y.getUrl())) {
            finish();
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.WEB_VIEW_LOAD);
        aVar.mo49939g(AnalyticsAttributeKey.WEB_VIEW_URL, str);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        return new C13753f<>("getWebAccountInfo", new C25556b(mo44548x1()));
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        C20955o.m49071b();
        this.f63983Y.onResume();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView;
        if (i != 4 || (webView = this.f63983Y) == null || !webView.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f63983Y.goBack();
        return true;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }
}
