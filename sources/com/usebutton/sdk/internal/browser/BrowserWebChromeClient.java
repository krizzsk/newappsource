package com.usebutton.sdk.internal.browser;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.usebutton.sdk.internal.Navigable;
import com.usebutton.sdk.internal.WebViewObserver;
import com.usebutton.sdk.internal.browser.BrowserWebClient;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.views.PopupWebView;
import com.usebutton.sdk.internal.views.WebControls;

public class BrowserWebChromeClient extends WebChromeClient {
    private static final String TAG = "BrowserWebChromeClient";
    private final WebControls controls;
    private final BrowserWebClient.Listener listener;
    /* access modifiers changed from: private */
    public PopupWebView popupWebView;
    /* access modifiers changed from: private */
    public ViewGroup rootView;

    static {
        Class<BrowserWebChromeClient> cls = BrowserWebChromeClient.class;
    }

    public BrowserWebChromeClient(BrowserWebClient.Listener listener2, WebControls webControls, Navigable navigable) {
        this.listener = listener2;
        this.controls = webControls;
        bindControls(navigable);
    }

    private void bindControls(Navigable navigable) {
        this.controls.setController(navigable);
    }

    private Context getContext() {
        return this.controls.getContext();
    }

    private String getHref(WebView webView) {
        if (webView.getHandler() == null) {
            return null;
        }
        Message obtainMessage = webView.getHandler().obtainMessage();
        webView.requestFocusNodeHref(obtainMessage);
        if (obtainMessage.getData() == null) {
            return null;
        }
        return obtainMessage.getData().getString("url");
    }

    private boolean hasLocationPermission() {
        if (!hasPermission("android.permission.ACCESS_COARSE_LOCATION") && !hasPermission("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    private boolean hasPermission(String str) {
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 23) {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void openPopup(WebView webView, Message message) {
        this.rootView = (ViewGroup) webView.getRootView();
        PopupWebView popupWebView2 = new PopupWebView(webView.getContext(), new PopupWebView.OnPopupClosedListener() {
            public void onPopupClosed() {
                BrowserWebChromeClient.this.rootView.removeView(BrowserWebChromeClient.this.popupWebView);
                PopupWebView unused = BrowserWebChromeClient.this.popupWebView = null;
            }
        });
        this.popupWebView = popupWebView2;
        this.rootView.addView(popupWebView2);
        ((WebView.WebViewTransport) message.obj).setWebView(this.popupWebView.getWebView());
        message.sendToTarget();
    }

    public PopupWebView getPopupWebView() {
        return this.popupWebView;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        ButtonLog.verboseFormat(TAG, "onConsoleMessage %s: %s", consoleMessage.messageLevel().toString(), consoleMessage.message());
        return super.onConsoleMessage(consoleMessage);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        String href = getHref(webView);
        if (BrowserHelpers.isStoreUrl(href)) {
            this.listener.onStoreUrl(href);
            return false;
        } else if (z) {
            openPopup(webView, message);
            return true;
        } else {
            if (href != null) {
                webView.loadUrl(href);
            }
            return false;
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (hasLocationPermission()) {
            callback.invoke(str, true, true);
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public void onProgressChanged(WebView webView, int i) {
        WebViewObserver.getInstance().updateProgress(i);
    }
}
