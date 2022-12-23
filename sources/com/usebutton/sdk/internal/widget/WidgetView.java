package com.usebutton.sdk.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.usebutton.sdk.Button;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.MainThreadExecutor;
import com.usebutton.sdk.purchasepath.PurchasePath;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;

public class WidgetView extends FrameLayout implements WidgetViewController {
    private View loadingDots;
    private WidgetPresenter presenter;
    private WebView webView;

    public interface Listener {
        boolean handlePurchasePathRequest();

        void onInstallApp(String str, String str2);

        void onOpenUrl(String str, String str2);

        void onPurchasePathRequest(PurchasePathRequest purchasePathRequest, String str);

        void onWebViewDismiss();

        void onWidgetDismiss();
    }

    public interface RenderListener {
        void onComplete(Throwable th);
    }

    public WidgetView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(C12238R.layout.btn_view_widget, this, true);
            this.webView = (WebView) findViewById(C12238R.C12240id.widget_webview);
            this.loadingDots = findViewById(C12238R.C12240id.widget_loading_dots);
            WidgetPresenter widgetPresenter = new WidgetPresenter(new WidgetJavascriptBridge(), new WidgetMessageParser(), new Handler(), new MainThreadExecutor(), ButtonPrivate.getButton().getEventTracker(), Button.purchasePath(), ButtonPrivate.getButton().getButtonRepository());
            this.presenter = widgetPresenter;
            widgetPresenter.attachView(this);
        }
    }

    public void configureWebView(WidgetJavascriptBridge widgetJavascriptBridge) {
        this.webView.addJavascriptInterface(widgetJavascriptBridge, "ButtonSdk");
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
    }

    public void hideWebView() {
        this.loadingDots.setVisibility(0);
        this.webView.setVisibility(8);
    }

    public void loadMarkup(String str) {
        this.webView.loadData(str, "text/html; charset=utf-8", "utf-8");
    }

    public void loadUrl(String str) {
        this.webView.loadUrl(str);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.detachView();
    }

    public void render(WidgetRenderable widgetRenderable, RenderListener renderListener) {
        this.presenter.onRender(widgetRenderable, renderListener);
    }

    public void sendMessage(String str) {
        this.webView.evaluateJavascript(str, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
            }
        });
    }

    public void setHeight(float f) {
        getLayoutParams().height = (int) TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
        requestLayout();
    }

    public void setListener(Listener listener) {
        this.presenter.setListener(listener);
    }

    public void showWebView() {
        this.loadingDots.setVisibility(8);
        this.webView.setVisibility(0);
    }

    public void startPurchasePath(PurchasePath purchasePath) {
        purchasePath.start(getContext());
    }

    public void stopLoadingWebView() {
        this.webView.loadUrl("about:blank");
    }

    public WidgetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public WidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    @TargetApi(21)
    public WidgetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
