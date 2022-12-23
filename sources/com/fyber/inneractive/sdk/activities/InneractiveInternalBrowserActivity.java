package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.URL;
import java.net.URLDecoder;

public class InneractiveInternalBrowserActivity extends Activity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* renamed from: j */
    public static InternalBrowserListener f9005j;

    /* renamed from: a */
    public C2776j f9006a;

    /* renamed from: b */
    public String f9007b;

    /* renamed from: c */
    public LinearLayout f9008c;

    /* renamed from: d */
    public WebView f9009d;

    /* renamed from: e */
    public ImageButton f9010e;

    /* renamed from: f */
    public ImageButton f9011f;

    /* renamed from: g */
    public ImageButton f9012g;

    /* renamed from: h */
    public ImageButton f9013h;

    /* renamed from: i */
    public boolean f9014i = false;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f9005j = internalBrowserListener;
    }

    public void finish() {
        InternalBrowserListener internalBrowserListener = f9005j;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        InternalBrowserListener internalBrowserListener;
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        super.onCreate(bundle);
        try {
            setContentView(mo12783a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f9007b = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f9007b)) != null) {
                this.f9006a = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f9009d.getSettings();
            boolean z = true;
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f9009d);
            this.f9009d.setWebViewClient(new C2531a(this));
            this.f9009d.setWebChromeClient(new C2532b(this));
            String stringExtra2 = intent.getStringExtra(URL_EXTRA);
            if (!C3677d0.m9924e(stringExtra2)) {
                this.f9009d.loadUrl(stringExtra2);
            } else if (C3677d0.m9923d(stringExtra2)) {
                try {
                    String decode = URLDecoder.decode(stringExtra2, "utf-8");
                    new URL(decode);
                    try {
                        this.f9009d.loadUrl(decode);
                    } catch (Exception unused) {
                        stringExtra2 = decode;
                    }
                } catch (Exception unused2) {
                    IAlog.m9906e("Failed to open Url: %s", stringExtra2);
                    finish();
                    this.f9010e.setBackgroundColor(0);
                    this.f9010e.setOnClickListener(new C2533c(this));
                    this.f9010e.setContentDescription("IABackButton");
                    this.f9011f.setBackgroundColor(0);
                    this.f9011f.setOnClickListener(new C2534d(this));
                    this.f9011f.setContentDescription("IAForwardButton");
                    this.f9012g.setBackgroundColor(0);
                    this.f9012g.setOnClickListener(new C2535e(this));
                    this.f9012g.setContentDescription("IARefreshButton");
                    this.f9013h.setBackgroundColor(0);
                    this.f9013h.setOnClickListener(new C2536f(this));
                    this.f9013h.setContentDescription("IACloseButton");
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                } catch (ActivityNotFoundException unused3) {
                    IAlog.m9906e("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                    z = false;
                }
                if (z && (internalBrowserListener = f9005j) != null) {
                    internalBrowserListener.onApplicationInBackground();
                }
                finish();
            }
            this.f9010e.setBackgroundColor(0);
            this.f9010e.setOnClickListener(new C2533c(this));
            this.f9010e.setContentDescription("IABackButton");
            this.f9011f.setBackgroundColor(0);
            this.f9011f.setOnClickListener(new C2534d(this));
            this.f9011f.setContentDescription("IAForwardButton");
            this.f9012g.setBackgroundColor(0);
            this.f9012g.setOnClickListener(new C2535e(this));
            this.f9012g.setContentDescription("IARefreshButton");
            this.f9013h.setBackgroundColor(0);
            this.f9013h.setOnClickListener(new C2536f(this));
            this.f9013h.setContentDescription("IACloseButton");
        } catch (Exception unused4) {
            finish();
        }
    }

    public void onDestroy() {
        LinearLayout linearLayout = this.f9008c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f9009d;
        if (webView != null) {
            webView.destroy();
            this.f9009d = null;
        }
        super.onDestroy();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    public void onPause() {
        super.onPause();
        this.f9014i = false;
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public final View mo12783a() {
        this.f9008c = new LinearLayout(this);
        this.f9008c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f9008c.setOrientation(1);
        this.f9008c.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f9008c.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C3707l.m9963b(getResources().getInteger(C2524R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(C3707l.m9971d(C2524R.C2525drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f9010e = mo12784a(C3707l.m9971d(C2524R.C2525drawable.ia_ib_left_arrow));
        this.f9011f = mo12784a(C3707l.m9971d(C2524R.C2525drawable.ia_ib_right_arrow));
        this.f9012g = mo12784a(C3707l.m9971d(C2524R.C2525drawable.ia_ib_refresh));
        this.f9013h = mo12784a(C3707l.m9971d(C2524R.C2525drawable.ia_ib_close));
        linearLayout.addView(this.f9010e);
        linearLayout.addView(this.f9011f);
        linearLayout.addView(this.f9012g);
        linearLayout.addView(this.f9013h);
        WebView webView = new WebView(this);
        this.f9009d = webView;
        webView.setId(C2524R.C2526id.inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f9009d.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f9009d);
        return this.f9008c;
    }

    /* renamed from: a */
    public final ImageButton mo12784a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        Resources resources = getResources();
        int i = C2524R.integer.ia_ib_button_size_dp;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C3707l.m9963b(resources.getInteger(i)), C3707l.m9963b(getResources().getInteger(i)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
