package com.moovit.app.intro;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.ActionBar;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import ka0.C12823b;
import ka0.C12824c;
import p874vr.C20199a;
import q00.C19047a;

public class FirstTimeUseTermsAndConditionsActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f38448X = 0;

    /* renamed from: U */
    public WebView f38449U;

    /* renamed from: y2 */
    public static boolean m37941y2(C19047a aVar) {
        return aVar != null && ((Boolean) aVar.mo51505b(C20199a.f51306x0)).booleanValue();
    }

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: O1 */
    public final void mo19442O1(Object obj, String str) {
        if ("CONFIGURATION".equals(str)) {
            mo45250z2((C19047a) null);
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f38449U.onPause();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        C19047a.C19048a aVar = C19047a.f48441d;
        mo45250z2((C19047a) getSystemService("user_configuration"));
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f38449U.onResume();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView;
        if (i != 4 || (webView = this.f38449U) == null || !webView.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f38449U.goBack();
        return true;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.clear();
        hashSet.add("USER_CONTEXT");
        hashSet.add("CONFIGURATION");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo45250z2(C19047a aVar) {
        int i;
        int i2;
        setContentView((int) R.layout.first_time_use_terms_and_conditions_activity);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.f38449U = webView;
        webView.setWebChromeClient(new WebChromeClient());
        this.f38449U.setWebViewClient(new C12823b(this));
        WebSettings settings = this.f38449U.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
        }
        if (getIntent().getIntExtra("type", 0) != 1) {
            if (m37941y2(aVar)) {
                i2 = R.string.cobrand_wondo_terms_of_use_url;
            } else {
                i2 = R.string.terms_of_use_url;
            }
            setTitle(R.string.terms_of_service_link);
            this.f38449U.loadUrl(getString(i2));
        } else {
            if (m37941y2(aVar)) {
                i = R.string.cobrand_wondo_privacy_url;
            } else {
                i = R.string.privacy_url;
            }
            setTitle(R.string.privacy_text);
            this.f38449U.loadUrl(getString(i));
        }
        m37941y2(aVar);
    }
}
