package com.appboy.p044ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.appboy.enums.Channel;
import com.appboy.p044ui.actions.ActionFactory;
import com.appboy.p044ui.actions.UriAction;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.appboy.ui.AppboyWebViewActivity */
public class AppboyWebViewActivity extends FragmentActivity {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyWebViewActivity.class);

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        setContentView(R$layout.com_appboy_webview_activity);
        WebView webView = (WebView) findViewById(R$id.com_appboy_webview_activity_webview);
        webView.setLayerType(2, (Paint) null);
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 29 && ViewUtils.isDeviceInNightMode(getApplicationContext())) {
            settings.setForceDark(2);
        }
        webView.setWebChromeClient(new WebChromeClient(this) {
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                String access$000 = AppboyWebViewActivity.TAG;
                StringBuilder k = C13555b.m33972k("Braze WebView Activity log. Line: ");
                k.append(consoleMessage.lineNumber());
                k.append(". SourceId: ");
                k.append(consoleMessage.sourceId());
                k.append(". Log Level: ");
                k.append(consoleMessage.messageLevel());
                k.append(". Message: ");
                k.append(consoleMessage.message());
                AppboyLogger.m5448d(access$000, k.toString());
                return true;
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            private Boolean handleUrlOverride(Context context, String str) {
                try {
                    if (AppboyFileUtils.REMOTE_SCHEMES.contains(Uri.parse(str).getScheme())) {
                        return null;
                    }
                    UriAction createUriActionFromUrlString = ActionFactory.createUriActionFromUrlString(str, AppboyWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                    if (createUriActionFromUrlString == null) {
                        return Boolean.FALSE;
                    }
                    createUriActionFromUrlString.execute(context);
                    AppboyWebViewActivity.this.finish();
                    return Boolean.TRUE;
                } catch (Exception e) {
                    String access$000 = AppboyWebViewActivity.TAG;
                    AppboyLogger.m5452e(access$000, "Unexpected exception while processing url " + str + ". Passing url back to WebView.", e);
                    return null;
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                Boolean handleUrlOverride = handleUrlOverride(webView.getContext(), webResourceRequest.getUrl().toString());
                if (handleUrlOverride != null) {
                    return handleUrlOverride.booleanValue();
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Boolean handleUrlOverride = handleUrlOverride(webView.getContext(), str);
                if (handleUrlOverride != null) {
                    return handleUrlOverride.booleanValue();
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("url") && (string = extras.getString("url")) != null) {
            webView.loadUrl(string);
        }
    }
}
