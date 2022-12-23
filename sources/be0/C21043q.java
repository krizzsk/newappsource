package be0;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: be0.q */
public final class C21043q {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m49209a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        webView.setVisibility(4);
    }
}
