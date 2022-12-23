package com.cubic.umo.p045ad.playback.p046ui.activities;

import ac0.C7557a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.umo.ads.p343d.zzc;
import com.umo.ads.p347l.zzd;
import com.umo.ads.p350u.zzk;
import ec0.C12632a;
import ic0.C12771a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import mf0.C24362h;
import nc0.C12950a;
import nc0.C12951b;
import nc0.C12952c;
import nc0.C12954d;
import p026b7.C1500e;
import p026b7.C1501f;
import p026b7.C1502g;
import p043ch.qos.logback.classic.Logger;
import p073e7.C4583a;
import p073e7.C4584b;
import p073e7.C4585c;
import p125ia.C5322i;
import p297w5.C6996c;
import p584jl.C17885a;
import wb0.C13233c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo59060d2 = {"Lcom/cubic/umo/ad/playback/ui/activities/AKBrowserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "a", "b", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity */
public final class AKBrowserActivity extends AppCompatActivity {

    /* renamed from: G */
    public static WeakReference<AKBrowserActivity> f7313G;

    /* renamed from: A */
    public ImageView f7314A;

    /* renamed from: B */
    public ImageView f7315B;

    /* renamed from: C */
    public FrameLayout f7316C;

    /* renamed from: D */
    public String f7317D = "";

    /* renamed from: E */
    public String f7318E;

    /* renamed from: F */
    public boolean f7319F = true;

    /* renamed from: x */
    public AKWebView f7320x;

    /* renamed from: y */
    public ImageView f7321y;

    /* renamed from: z */
    public ImageView f7322z;

    /* renamed from: com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity$a */
    public final class C2224a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ AKBrowserActivity f7323a;

        public C2224a(AKBrowserActivity aKBrowserActivity) {
            C24362h.m61211f(aKBrowserActivity, "this$0");
            this.f7323a = aKBrowserActivity;
        }

        public final void onPageFinished(WebView webView, String str) {
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, "url");
            super.onPageFinished(webView, str);
            C13233c.f32843b.post(new C12950a(this.f7323a.f7316C, false));
            ImageView imageView = this.f7323a.f7321y;
            if (imageView != null) {
                C13233c.f32843b.post(new C5322i(1, imageView, webView.canGoBack()));
            }
            ImageView imageView2 = this.f7323a.f7322z;
            if (imageView2 != null) {
                C13233c.f32843b.post(new C5322i(1, imageView2, webView.canGoForward()));
            }
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            int i;
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            if (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
                i = C1502g.umoak_webview_gone_unspecified;
            } else {
                i = C1502g.umoak_webview_gone_crash;
            }
            C7557a.f23040a.mo6667d(this.f7323a.getApplicationContext().getString(i));
            this.f7323a.finish();
            return true;
        }
    }

    /* renamed from: com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity$b */
    public static final class C2225b {
        /* renamed from: a */
        public static boolean m5861a(String str, String str2, boolean z) {
            C24362h.m61211f(str, "spotId");
            String str3 = "";
            if (!C12954d.m32800c(str2)) {
                Logger logger = C7557a.f23040a;
                if (C12954d.m32800c(str)) {
                    str3 = C17885a.m44403H0(str);
                }
                logger.mo6667d(C24362h.m61216k(str3, "INTERNAL_BROWSER: Invalid Browser Content"));
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("BROWSER_URL_OR_CONTENT", str2);
            bundle.putBoolean("BROWSER_IS_URL", z);
            bundle.putString("BROADCAST_IDENTIFIER", str);
            Context b = C13233c.m33333b();
            Intent intent = new Intent(b, AKBrowserActivity.class);
            if (!(b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtras(bundle);
            try {
                Context b2 = C13233c.m33333b();
                if (!(b2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                b2.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                throw new zzc(e);
            } catch (zzc e2) {
                e2.printStackTrace();
                Logger logger2 = C7557a.f23040a;
                if (C12954d.m32800c(str)) {
                    str3 = C17885a.m44403H0(str);
                }
                logger2.mo6667d(C24362h.m61216k(str3, "INTERNAL_BROWSER: Unable to start Activity for loading Url"));
                return false;
            }
        }
    }

    /* renamed from: com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity$c */
    public static final class C2226c extends C12632a {

        /* renamed from: a */
        public final /* synthetic */ AKBrowserActivity f7324a;

        public C2226c(AKBrowserActivity aKBrowserActivity) {
            this.f7324a = aKBrowserActivity;
        }

        public final void onProgressChanged(WebView webView, int i) {
            String str;
            C24362h.m61211f(webView, "webView");
            AKBrowserActivity aKBrowserActivity = this.f7324a;
            if (i == 100) {
                str = webView.getUrl();
            } else {
                str = "Loading...";
            }
            aKBrowserActivity.setTitle(str);
            this.f7324a.getClass();
        }
    }

    public final void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        AKWebView aKWebView = this.f7320x;
        if (aKWebView != null) {
            aKWebView.destroy();
        }
        this.f7320x = null;
        super.finish();
    }

    public final void onBackPressed() {
        AKWebView aKWebView = this.f7320x;
        C24362h.m61208c(aKWebView);
        aKWebView.stopLoading();
        aKWebView.loadUrl("");
        zzk zzk = zzk.BROADCAST_ACTION_BROWSER_DISMISS;
        int i = zzd.f30827d;
        zzd.C12091a.m32061a(this, this.f7317D, zzk.zza, (String) null);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        WebSettings webSettings;
        super.onCreate(bundle);
        f7313G = new WeakReference<>(this);
        setContentView(C1501f.umoak_layout_browser);
        this.f7318E = getIntent().getStringExtra("BROWSER_URL_OR_CONTENT");
        this.f7319F = getIntent().getBooleanExtra("BROWSER_IS_URL", true);
        String stringExtra = getIntent().getStringExtra("BROADCAST_IDENTIFIER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f7317D = stringExtra;
        this.f7320x = (AKWebView) findViewById(C1500e.ak_web_view);
        this.f7321y = (ImageView) findViewById(C1500e.iv_browser_back);
        this.f7322z = (ImageView) findViewById(C1500e.iv_browser_forward);
        this.f7314A = (ImageView) findViewById(C1500e.iv_browser_refresh);
        this.f7315B = (ImageView) findViewById(C1500e.iv_browser_close);
        AKWebView aKWebView = this.f7320x;
        if (aKWebView == null) {
            webSettings = null;
        } else {
            webSettings = aKWebView.getSettings();
        }
        AKWebView aKWebView2 = this.f7320x;
        if (aKWebView2 != null) {
            aKWebView2.setWebViewClient(new C2224a(this));
        }
        AKWebView aKWebView3 = this.f7320x;
        if (aKWebView3 != null) {
            aKWebView3.mo11147b();
        }
        if (webSettings != null) {
            webSettings.setUseWideViewPort(true);
        }
        if (webSettings != null) {
            webSettings.setLoadWithOverviewMode(true);
        }
        if (webSettings != null) {
            webSettings.setSupportZoom(true);
        }
        if (webSettings != null) {
            webSettings.setBuiltInZoomControls(true);
        }
        if (webSettings != null) {
            webSettings.setDisplayZoomControls(false);
        }
        AKWebView aKWebView4 = this.f7320x;
        if (aKWebView4 != null) {
            aKWebView4.setWebChromeClient(new C12771a(this));
        }
        ImageView imageView = this.f7321y;
        if (imageView != null) {
            imageView.setOnClickListener(new C4583a(this, 0));
        }
        ImageView imageView2 = this.f7322z;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C6996c(this, 1));
        }
        ImageView imageView3 = this.f7314A;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C4584b(this, 0));
        }
        ImageView imageView4 = this.f7315B;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new C4585c(this, 0));
        }
        CookieManager instance = CookieManager.getInstance();
        C24362h.m61210e(instance, "getInstance()");
        instance.flush();
        if (this.f7316C == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(C1500e.progress_bar_layout);
            this.f7316C = frameLayout;
            C24362h.m61208c(frameLayout);
            C12952c.m32795e(frameLayout);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        AKWebView aKWebView = this.f7320x;
        if (aKWebView != null) {
            aKWebView.destroy();
        }
        this.f7320x = null;
    }

    public final void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        AKWebView aKWebView = this.f7320x;
        if (aKWebView != null) {
            aKWebView.setWebChromeClient((WebChromeClient) null);
        }
        AKWebView aKWebView2 = this.f7320x;
        if (aKWebView2 != null && isFinishing()) {
            aKWebView2.stopLoading();
            aKWebView2.loadUrl("");
        }
    }

    public final void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        AKWebView aKWebView = this.f7320x;
        if (aKWebView != null) {
            aKWebView.setWebChromeClient(new C2226c(this));
        }
        AKWebView aKWebView2 = this.f7320x;
        if (aKWebView2 != null) {
            aKWebView2.onResume();
        }
    }

    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            C24362h.m61210e(decorView, "window.decorView");
            decorView.setSystemUiVisibility(4870);
            decorView.setOnSystemUiVisibilityChangeListener(new C12951b(decorView));
        }
        C13233c.f32843b.post(new C12950a(this.f7316C, true));
        if (this.f7319F) {
            AKWebView aKWebView = this.f7320x;
            if (aKWebView != null) {
                String str = this.f7318E;
                C24362h.m61208c(str);
                aKWebView.loadUrl(str);
            }
        } else {
            AKWebView aKWebView2 = this.f7320x;
            if (aKWebView2 != null) {
                String str2 = this.f7318E;
                C24362h.m61208c(str2);
                aKWebView2.loadDataWithBaseURL("", str2, "text/html", "UTF-8", (String) null);
            }
        }
        zzk zzk = zzk.BROADCAST_ACTION_BROWSER_OPEN;
        int i = zzd.f30827d;
        zzd.C12091a.m32061a(this, this.f7317D, zzk.zza, (String) null);
    }
}
