package com.appboy.p044ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.p044ui.inappmessage.IInAppMessageView;
import com.appboy.p044ui.inappmessage.InAppMessageWebViewClient;
import com.appboy.p044ui.inappmessage.listeners.IWebViewClientStateListener;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.braze.support.WebContentUtils;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p057d3.C4338b;
import p069e3.C4539d;
import p069e3.C4540e;
import p358af.C13437d;
import p584jl.C17885a;
import yi0.C25328a;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlBaseView */
public abstract class AppboyInAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageHtmlBaseView.class);
    private InAppMessageWebViewClient mInAppMessageWebViewClient;
    private boolean mIsFinished = false;
    public WebView mMessageWebView;

    public AppboyInAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !AppboyInAppMessageManager.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void finishWebViewDisplay() {
        AppboyLogger.m5448d(TAG, "Finishing WebView display");
        this.mIsFinished = true;
        WebView webView = this.mMessageWebView;
        if (webView != null) {
            webView.loadUrl("about:blank");
            this.mMessageWebView.onPause();
            this.mMessageWebView.removeAllViews();
            this.mMessageWebView = null;
        }
    }

    public View getMessageClickableView() {
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView getMessageWebView() {
        if (this.mIsFinished) {
            AppboyLogger.m5459w(TAG, "Cannot return the WebView for an already finished message");
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            AppboyLogger.m5448d(TAG, "Cannot find WebView. getWebViewViewId() returned 0.");
            return null;
        }
        WebView webView = this.mMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        this.mMessageWebView = webView2;
        if (webView2 == null) {
            String str = TAG;
            AppboyLogger.m5448d(str, "findViewById for " + webViewViewId + " returned null. Returning null for WebView.");
            return null;
        }
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        this.mMessageWebView.setLayerType(2, (Paint) null);
        this.mMessageWebView.setBackgroundColor(0);
        try {
            if (C17885a.m44438f0("FORCE_DARK") && ViewUtils.isDeviceInNightMode(getContext())) {
                C4338b.m11477a(settings, 2);
            }
            if (C17885a.m44438f0("FORCE_DARK_STRATEGY")) {
                if (C4539d.f15656b.mo20044d()) {
                    ((WebSettingsBoundaryInterface) C25328a.m63628a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) C4540e.C4541a.f15657a.f3985a).convertSettings(settings))).setForceDarkBehavior(1);
                } else {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        } catch (Throwable th) {
            AppboyLogger.m5452e(TAG, "Failed to set dark mode WebView settings", th);
        }
        this.mMessageWebView.setWebChromeClient(new WebChromeClient(this) {
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                String access$000 = AppboyInAppMessageHtmlBaseView.TAG;
                StringBuilder k = C13555b.m33972k("Braze HTML In-app Message log. Line: ");
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
        return this.mMessageWebView;
    }

    public abstract int getWebViewViewId();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !AppboyInAppMessageManager.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener iWebViewClientStateListener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.mInAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(iWebViewClientStateListener);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        getMessageWebView().setWebViewClient(inAppMessageWebViewClient);
        this.mInAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public void setWebViewContent(String str, String str2) {
        getMessageWebView().loadDataWithBaseURL(C13437d.m33706k(WebContentUtils.FILE_URI_SCHEME_PREFIX, str2, "/"), str, "text/html", "utf-8", (String) null);
    }

    public void setWebViewContent(String str) {
        getMessageWebView().loadDataWithBaseURL("file:///", str, "text/html", "utf-8", (String) null);
    }
}
