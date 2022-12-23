package com.usebutton.sdk.internal.browser;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.support.AppboyFileUtils;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.internal.web.Navigator;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Set;

public class BrowserWebClient extends WebViewClient {
    private static final String TAG = "BrowserWebClient";
    private final Set<String> blacklistedWebResources;
    private ArrayList<String> blockedResources = new ArrayList<>();
    private boolean isJsLoaded = false;
    private final ButtonJavascriptInterface jsInterface;
    private final Listener listener;
    private final Navigator navigator;

    public interface Listener {
        void onPageCommitVisible(String str);

        void onPageFinished();

        void onPageStarted(String str);

        void onStoreUrl(String str);
    }

    static {
        Class<BrowserWebClient> cls = BrowserWebClient.class;
    }

    public BrowserWebClient(Listener listener2, ButtonJavascriptInterface buttonJavascriptInterface, Navigator navigator2, Set<String> set) {
        this.listener = listener2;
        this.jsInterface = buttonJavascriptInterface;
        this.navigator = navigator2;
        this.blacklistedWebResources = set;
    }

    private WebResourceResponse emptyResponse() {
        return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream("".getBytes()));
    }

    private boolean shouldBlock(String str) {
        for (String next : this.blacklistedWebResources) {
            if (str.equals(next)) {
                this.blockedResources.add(str);
                return true;
            } else if (str.matches(next)) {
                this.blockedResources.add(str);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getBlockedResources() {
        return this.blockedResources;
    }

    @TargetApi(23)
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        ButtonLog.verboseFormat(TAG, "onPageCommitVisible %s", str);
        this.listener.onPageCommitVisible(str);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ButtonLog.verboseFormat(TAG, "onPageFinished %s", str);
        this.navigator.onNavigation();
        this.listener.onPageFinished();
        if (!this.isJsLoaded) {
            this.jsInterface.loadNavJs(webView.getContext());
            this.isJsLoaded = true;
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ButtonLog.verboseFormat(TAG, "onPageStarted %s", str);
        this.isJsLoaded = false;
        this.listener.onPageStarted(str);
        this.navigator.onNavigation();
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            ButtonLog.verboseFormat(TAG, "onError req=%s, error=%s", webResourceRequest.getUrl(), webResourceError.getDescription());
            return;
        }
        ButtonLog.verboseFormat(TAG, "onError req=%s, error=%s", webResourceRequest, webResourceError);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        ButtonLog.verboseFormat(TAG, "onReceivedSslError error=%s", sslError.toString());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (shouldBlock(str)) {
            return emptyResponse();
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = TAG;
        ButtonLog.verboseFormat(str2, "shouldOverrideUrlLoading %s", str);
        Uri parse = Uri.parse(str);
        if (BrowserHelpers.isStoreUrl(str)) {
            this.listener.onStoreUrl(str);
            return true;
        } else if (AppboyFileUtils.FILE_SCHEME.equals(parse.getScheme()) || "http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) {
            return false;
        } else {
            if (!"intent".equals(parse.getScheme()) || !str.contains("S.market_referrer")) {
                ButtonLog.verboseFormat(str2, "Stopping request to load custom scheme %s, %s", parse.getScheme(), parse.toString());
                return true;
            }
            this.listener.onStoreUrl(str);
            return true;
        }
    }

    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (shouldBlock(webResourceRequest.getUrl().toString())) {
            return emptyResponse();
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
