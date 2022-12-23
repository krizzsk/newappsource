package com.usebutton.sdk.internal.widget;

import android.content.Intent;
import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.widget.WidgetView;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;

class FullScreenWidgetPresenter extends BasePresenter<FullScreenWidgetViewController> implements WidgetView.Listener, WidgetView.RenderListener {
    private final Intent installIntent;
    private final Widget widget;

    public FullScreenWidgetPresenter(Widget widget2, Intent intent) {
        this.widget = widget2;
        this.installIntent = intent;
    }

    public boolean handlePurchasePathRequest() {
        return false;
    }

    public void onComplete(Throwable th) {
        FullScreenWidgetViewController fullScreenWidgetViewController;
        if (th != null && (fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController()) != null) {
            fullScreenWidgetViewController.closeActivity();
        }
    }

    public void onInstallApp(String str, String str2) {
        FullScreenWidgetViewController fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController();
        if (fullScreenWidgetViewController != null) {
            fullScreenWidgetViewController.installApp(this.installIntent);
        }
    }

    public void onOpenUrl(String str, String str2) {
        FullScreenWidgetViewController fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController();
        if (fullScreenWidgetViewController != null) {
            fullScreenWidgetViewController.setOpenUrlResult(str, str2);
            fullScreenWidgetViewController.closeActivity();
        }
    }

    public void onPurchasePathRequest(PurchasePathRequest purchasePathRequest, String str) {
    }

    public void onViewAttached() {
        FullScreenWidgetViewController fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController();
        if (fullScreenWidgetViewController != null) {
            fullScreenWidgetViewController.setWidgetListener(this);
            fullScreenWidgetViewController.renderWidget(this.widget, this);
        }
    }

    public void onViewDetached() {
        FullScreenWidgetViewController fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController();
        if (fullScreenWidgetViewController != null) {
            fullScreenWidgetViewController.setWidgetListener((WidgetView.Listener) null);
        }
    }

    public void onWebViewDismiss() {
        FullScreenWidgetViewController fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController();
        if (fullScreenWidgetViewController != null) {
            fullScreenWidgetViewController.dismissWebView();
            fullScreenWidgetViewController.closeActivity();
        }
    }

    public void onWidgetDismiss() {
        FullScreenWidgetViewController fullScreenWidgetViewController = (FullScreenWidgetViewController) getViewController();
        if (fullScreenWidgetViewController != null) {
            fullScreenWidgetViewController.closeActivity();
        }
    }
}
