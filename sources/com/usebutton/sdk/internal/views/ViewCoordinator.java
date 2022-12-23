package com.usebutton.sdk.internal.views;

import android.view.View;
import android.webkit.WebView;
import com.usebutton.sdk.internal.views.WebViewScrollManager;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout;

public class ViewCoordinator {
    private WebViewScrollManager webViewScrollManager;

    public ViewCoordinator(WebView webView, View view, View view2, WebViewScrollManager.WebScrollEventListener webScrollEventListener) {
        WebViewScrollManager webViewScrollManager2 = new WebViewScrollManager(view, webView, view2, webScrollEventListener);
        this.webViewScrollManager = webViewScrollManager2;
        ((ObservableWebView) webView).setCustomOnScrollChangeListener(webViewScrollManager2);
    }

    public void animateMargins(BottomSheetLayout.State state) {
        this.webViewScrollManager.animateMargins(state);
    }

    public void reset() {
        this.webViewScrollManager.reset();
    }
}
