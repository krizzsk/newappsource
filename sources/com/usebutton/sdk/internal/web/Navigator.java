package com.usebutton.sdk.internal.web;

import android.webkit.WebView;
import com.usebutton.sdk.internal.Navigable;
import com.usebutton.sdk.internal.WebViewPresenter;
import com.usebutton.sdk.internal.functional.Observable;
import com.usebutton.sdk.internal.util.Publisher;

public class Navigator implements Navigable {
    private Publisher<Navigable.NavigationListener> mPublisher = new Publisher<>();
    private final WebViewPresenter presenter;
    private final WebView webView;

    public Navigator(WebView webView2, WebViewPresenter webViewPresenter) {
        this.webView = webView2;
        this.presenter = webViewPresenter;
    }

    public void back() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        }
    }

    public boolean canNavigateBack() {
        return this.webView.canGoBack();
    }

    public boolean canNavigateForward() {
        return this.webView.canGoForward();
    }

    public void forward() {
        if (this.webView.canGoForward()) {
            this.webView.goForward();
        }
    }

    public Observable<Navigable.NavigationListener> getObservable() {
        return this.mPublisher;
    }

    public void onNavigation() {
        this.mPublisher.perform(new Publisher.Action<Navigable.NavigationListener>() {
            public void perform(Navigable.NavigationListener navigationListener) {
                navigationListener.onNavigation(Navigator.this);
            }
        });
    }
}
