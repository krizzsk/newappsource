package com.moovit.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import com.appboy.Constants;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import java.util.HashSet;
import java.util.Set;
import ka0.C12822a;
import ka0.C12823b;
import ka0.C12824c;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19740r;
import p824tp.C19742t;
import p977zz.C20955o;
import p977zz.C20964s0;

public final class WebViewActivity extends MoovitActivity {

    /* renamed from: U */
    public final C12822a f24157U = new C12822a(this);

    /* renamed from: X */
    public final C7974a f24158X = new C7974a(this);

    /* renamed from: Y */
    public WebView f24159Y;

    /* renamed from: Z */
    public ProgressBar f24160Z;

    /* renamed from: com.moovit.web.WebViewActivity$a */
    public class C7974a extends C12823b {
        public C7974a(Activity activity) {
            super(activity);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebViewActivity.this.f24160Z.setVisibility(8);
            C20955o.m49072c();
        }
    }

    /* renamed from: y2 */
    public static Intent m18168y2(Context context, String str, CharSequence charSequence) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra(Constants.APPBOY_PUSH_TITLE_KEY, charSequence);
        return intent;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo24882z2(intent);
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f24159Y.onPause();
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
        this.f24160Z = (ProgressBar) findViewById(C19740r.progress_bar);
        WebView webView = (WebView) findViewById(C19740r.webView);
        this.f24159Y = webView;
        webView.setWebChromeClient(this.f24157U);
        this.f24159Y.setWebViewClient(this.f24158X);
        WebSettings settings = this.f24159Y.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        mo24882z2(getIntent());
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        C20955o.m49071b();
        this.f24159Y.onResume();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView;
        if (i != 4 || (webView = this.f24159Y) == null || !webView.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f24159Y.goBack();
        return true;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }

    /* renamed from: z2 */
    public final void mo24882z2(Intent intent) {
        String str;
        Uri data = intent.getData();
        CharSequence charSequence = null;
        if (data != null) {
            str = data.getQueryParameter("url");
        } else {
            str = null;
        }
        if (C20964s0.m49090h(str)) {
            str = intent.getStringExtra("url");
        }
        if (str == null) {
            finish();
            return;
        }
        Uri data2 = intent.getData();
        if (data2 != null) {
            charSequence = data2.getQueryParameter(Constants.APPBOY_PUSH_TITLE_KEY);
        }
        if (C20964s0.m49090h(charSequence)) {
            charSequence = intent.getCharSequenceExtra(Constants.APPBOY_PUSH_TITLE_KEY);
        }
        if (charSequence != null) {
            setTitle(charSequence);
        }
        C16596f.m42113a().mo49363b("URL: " + str);
        if (!this.f24158X.shouldOverrideUrlLoading(this.f24159Y, str)) {
            this.f24159Y.loadUrl(str);
        } else if (C20964s0.m49090h(this.f24159Y.getUrl())) {
            finish();
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.WEB_VIEW_LOAD);
        aVar.mo49939g(AnalyticsAttributeKey.WEB_VIEW_URL, str);
        mo44545v2(aVar.mo49933a());
    }
}
