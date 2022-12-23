package com.usebutton.sdk.internal.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.usebutton.sdk.C12238R;

public class OverlayWebView extends FrameLayout {
    private View chrome;
    private ObservableWebView webView;
    private WebViewScrollManager webViewScrollManager;

    public OverlayWebView(Context context) {
        super(context);
        init();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void init() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C12238R.layout.btn_overlay_web_view, this, true);
        this.chrome = findViewById(C12238R.C12240id.overlay_web_chrome);
        ObservableWebView observableWebView = (ObservableWebView) findViewById(C12238R.C12240id.overlay_web_view);
        this.webView = observableWebView;
        observableWebView.getSettings().setJavaScriptEnabled(true);
        WebViewScrollManager webViewScrollManager2 = new WebViewScrollManager(this.chrome, this.webView);
        this.webViewScrollManager = webViewScrollManager2;
        this.webView.setCustomOnScrollChangeListener(webViewScrollManager2);
    }

    public boolean canGoBack() {
        return this.webView.canGoBack();
    }

    public void evaluateJavascript(String str) {
        this.webView.evaluateJavascript(str, (ValueCallback) null);
    }

    public void goBack() {
        this.webView.goBack();
    }

    public void loadUrl(String str) {
        this.webView.loadUrl(str);
    }

    public void resetScroll() {
        this.webViewScrollManager.reset();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.webView.setWebViewClient(webViewClient);
    }

    public OverlayWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public OverlayWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
