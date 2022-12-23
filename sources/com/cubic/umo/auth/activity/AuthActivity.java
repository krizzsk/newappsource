package com.cubic.umo.auth.activity;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C1021l0;
import bf0.C21049c;
import ff0.C23349c;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import mf0.C24365j;
import p001a0.C0016g;
import p008a7.C0088a;
import p109h7.C5135a;
import p109h7.C5136b;
import p122i7.C5297a;
import p122i7.C5301c;
import p183n7.C5867a;
import p196o7.C6009a;
import p323y7.C7344b;
import p583jk.C17875h;
import uh0.C25081h;
import wh0.C25177g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/cubic/umo/auth/activity/AuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AuthActivity extends AppCompatActivity {

    /* renamed from: C */
    public static final /* synthetic */ int f7728C = 0;

    /* renamed from: A */
    public final C21049c f7729A = C23812a.m58432b(AuthActivity$clientData$2.f7735f);

    /* renamed from: B */
    public final C21049c f7730B = C23812a.m58432b(new AuthActivity$oathCallback$2(this));

    /* renamed from: x */
    public boolean f7731x;

    /* renamed from: y */
    public final C1021l0 f7732y = new C1021l0(C24365j.m61219a(AuthViewModel.class), new AuthActivity$special$$inlined$viewModels$default$2(this), new AuthActivity$special$$inlined$viewModels$default$1(this));

    /* renamed from: z */
    public final C21049c f7733z = C23812a.m58432b(new AuthActivity$webView$2(this));

    /* renamed from: com.cubic.umo.auth.activity.AuthActivity$a */
    public static final class C2230a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ AuthActivity f7734a;

        public C2230a(AuthActivity authActivity) {
            this.f7734a = authActivity;
        }

        public final void onLoadResource(WebView webView, String str) {
            if (str != null) {
                AuthActivity authActivity = this.f7734a;
                int i = AuthActivity.f7728C;
                if (C25081h.m62835F(str, (String) authActivity.f7730B.getValue())) {
                    AuthActivity authActivity2 = this.f7734a;
                    int i2 = C5301c.C5302a.f17482a;
                    authActivity2.getClass();
                    String queryParameter = Uri.parse(str).getQueryParameter("code");
                    if (queryParameter != null) {
                        AuthActivity authActivity3 = this.f7734a;
                        authActivity3.mo11598d1();
                        AuthViewModel authViewModel = (AuthViewModel) authActivity3.f7732y.getValue();
                        authViewModel.getClass();
                        authViewModel.f7739e.postValue(Boolean.TRUE);
                        C25177g.m63218b(C17875h.m44315z(authViewModel), (CoroutineContext) null, new AuthViewModel$authenticate$1(authViewModel, queryParameter, (C23349c<? super AuthViewModel$authenticate$1>) null), 3);
                        return;
                    }
                    return;
                }
            }
            super.onLoadResource(webView, str);
        }
    }

    public AuthActivity() {
        int i = C5301c.C5303b.f17483a;
    }

    /* renamed from: b1 */
    public final WebView mo11597b1() {
        return (WebView) this.f7733z.getValue();
    }

    /* renamed from: d1 */
    public final void mo11598d1() {
        mo11597b1().clearCache(true);
        mo11597b1().clearFormData();
        mo11597b1().clearHistory();
        mo11597b1().clearSslPreferences();
        mo11597b1().clearMatches();
        CookieManager.getInstance().removeSessionCookies((ValueCallback) null);
    }

    /* renamed from: e1 */
    public final void mo11599e1() {
        mo11597b1().getSettings().setJavaScriptEnabled(true);
        mo11597b1().getSettings().setDomStorageEnabled(true);
        mo11597b1().getSettings().setAppCacheEnabled(true);
        mo11597b1().getSettings().setAppCachePath(getCacheDir().getAbsolutePath());
    }

    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(C5136b.umo_auth_activity_auth);
        Toolbar toolbar = (Toolbar) findViewById(C5135a.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
        ActionBar supportActionBar = getSupportActionBar();
        boolean z2 = true;
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
        }
        mo11597b1().setWebViewClient(new C2230a(this));
        if (bundle == null) {
            this.f7731x = false;
        } else {
            this.f7731x = bundle.getBoolean("is_authenticating", false);
        }
        if (C0088a.f265d != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            setResult(0);
            finish();
            return;
        }
        ((AuthViewModel) this.f7732y.getValue()).f7738d.observe(this, new C5297a(this, 0));
        if (!this.f7731x) {
            int i = C5301c.C5304c.f17484a;
            mo11597b1().getSettings().setAllowFileAccess(false);
            mo11597b1().getSettings().setAllowContentAccess(false);
            mo11597b1().getSettings().setAllowFileAccessFromFileURLs(false);
            mo11597b1().getSettings().setAllowUniversalAccessFromFileURLs(false);
            mo11599e1();
            WebView b1 = mo11597b1();
            C0088a aVar = C0088a.f265d;
            if (aVar == null) {
                z2 = false;
            }
            if (!z2) {
                throw new UninitializedPropertyAccessException();
            } else if (aVar != null) {
                String uri = Uri.parse(C24362h.m61216k(C0016g.m31o(C13555b.m33972k("auth/realms/"), ((C6009a) this.f7729A.getValue()).f19204c, "/protocol/openid-connect/auth"), C5867a.m14302a(aVar.f267b))).buildUpon().appendQueryParameter("response_type", "code").appendQueryParameter("device_id", String.valueOf(C7344b.m16970a(this))).appendQueryParameter("client_id", ((C6009a) this.f7729A.getValue()).f19202a).appendQueryParameter("scope", "openid email profile").appendQueryParameter("redirect_uri", (String) this.f7730B.getValue()).build().toString();
                C24362h.m61210e(uri, "authUri.toString()");
                b1.loadUrl(uri);
            } else {
                C24362h.m61217l("instance");
                throw null;
            }
        } else if (C24362h.m61206a(((AuthViewModel) this.f7732y.getValue()).f7740f.getValue(), Boolean.FALSE)) {
            setResult(0);
            finish();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C24362h.m61211f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_authenticating", this.f7731x);
    }
}
