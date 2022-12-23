package com.appboy.p044ui.inappmessage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.C0436m1;
import com.appboy.models.IInAppMessage;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.p044ui.inappmessage.listeners.IWebViewClientStateListener;
import com.appboy.p044ui.support.UriUtils;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.HandlerUtils;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p304x.C7070l;

/* renamed from: com.appboy.ui.inappmessage.InAppMessageWebViewClient */
public class InAppMessageWebViewClient extends WebViewClient {
    private static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageWebViewClient.class);
    private final Context mContext;
    private final Handler mHandler;
    private final AtomicBoolean mHasCalledPageFinishedOnListener = new AtomicBoolean(false);
    private boolean mHasPageFinishedLoading = false;
    private final IInAppMessage mInAppMessage;
    private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;
    private final int mMaxOnPageFinishedWaitTimeMs;
    private final Runnable mPostOnFinishedTimeoutRunnable;
    private IWebViewClientStateListener mWebViewClientStateListener;

    public InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        this.mInAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.mInAppMessage = iInAppMessage;
        this.mContext = context;
        this.mHandler = HandlerUtils.createHandler();
        this.mPostOnFinishedTimeoutRunnable = new C0436m1(this, 8);
        this.mMaxOnPageFinishedWaitTimeMs = new BrazeConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
    }

    private void appendBridgeJavascript(WebView webView) {
        String assetFileStringContents = AppboyFileUtils.getAssetFileStringContents(this.mContext.getAssets(), "appboy-html-in-app-message-javascript-component.js");
        if (assetFileStringContents == null) {
            AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            AppboyLogger.m5459w(TAG, "Failed to get HTML in-app message javascript additions");
            return;
        }
        webView.loadUrl("javascript:" + assetFileStringContents);
    }

    public static Bundle getBundleFromUrl(String str) {
        Bundle bundle = new Bundle();
        if (StringUtils.isNullOrBlank(str)) {
            return bundle;
        }
        Map<String, String> queryParameters = UriUtils.getQueryParameters(Uri.parse(str));
        for (String next : queryParameters.keySet()) {
            bundle.putString(next, queryParameters.get(next));
        }
        return bundle;
    }

    private boolean handleUrlOverride(String str) {
        if (this.mInAppMessageWebViewClientListener == null) {
            AppboyLogger.m5453i(TAG, "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.");
            return true;
        } else if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5453i(TAG, "InAppMessageWebViewClient.shouldOverrideUrlLoading was given null or blank url. Returning true.");
            return true;
        } else {
            Uri parse = Uri.parse(str);
            Bundle bundleFromUrl = getBundleFromUrl(str);
            if (parse.getScheme() == null || !parse.getScheme().equals("appboy")) {
                String str2 = TAG;
                AppboyLogger.m5448d(str2, "Uri scheme was null. Uri: " + parse);
                this.mInAppMessageWebViewClientListener.onOtherUrlAction(this.mInAppMessage, str, bundleFromUrl);
                return true;
            }
            String authority = parse.getAuthority();
            if (authority != null) {
                char c = 65535;
                switch (authority.hashCode()) {
                    case -1801488983:
                        if (authority.equals("customEvent")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3138974:
                        if (authority.equals("feed")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 94756344:
                        if (authority.equals("close")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mInAppMessageWebViewClientListener.onCustomEventAction(this.mInAppMessage, str, bundleFromUrl);
                        break;
                    case 1:
                        this.mInAppMessageWebViewClientListener.onNewsfeedAction(this.mInAppMessage, str, bundleFromUrl);
                        break;
                    case 2:
                        this.mInAppMessageWebViewClientListener.onCloseAction(this.mInAppMessage, str, bundleFromUrl);
                        break;
                }
            } else {
                String str3 = TAG;
                AppboyLogger.m5448d(str3, "Uri authority was null. Uri: " + parse);
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.mWebViewClientStateListener != null && this.mHasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            AppboyLogger.m5457v(TAG, "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.");
            ((C7070l) this.mWebViewClientStateListener).mo23312f();
        }
    }

    public void onPageFinished(WebView webView, String str) {
        appendBridgeJavascript(webView);
        if (this.mWebViewClientStateListener != null && this.mHasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            AppboyLogger.m5457v(TAG, "Page has finished loading. Calling onPageFinished on listener");
            ((C7070l) this.mWebViewClientStateListener).mo23312f();
        }
        this.mHasPageFinishedLoading = true;
        this.mHandler.removeCallbacks(this.mPostOnFinishedTimeoutRunnable);
    }

    public void setWebViewClientStateListener(IWebViewClientStateListener iWebViewClientStateListener) {
        if (iWebViewClientStateListener == null || !this.mHasPageFinishedLoading || !this.mHasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            this.mHandler.postDelayed(this.mPostOnFinishedTimeoutRunnable, (long) this.mMaxOnPageFinishedWaitTimeMs);
        } else {
            ((C7070l) iWebViewClientStateListener).mo23312f();
        }
        this.mWebViewClientStateListener = iWebViewClientStateListener;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return handleUrlOverride(webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return handleUrlOverride(str);
    }
}
