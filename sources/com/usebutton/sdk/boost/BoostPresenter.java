package com.usebutton.sdk.boost;

import com.usebutton.sdk.boost.BoostView;
import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.boost.BoostResponsePrivate;
import com.usebutton.sdk.internal.widget.WidgetRenderable;
import com.usebutton.sdk.internal.widget.WidgetView;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;

class BoostPresenter extends BasePresenter<BoostViewController> implements WidgetView.Listener {
    private BoostResponsePrivate boostResponse;
    private BoostView.Listener listener;
    private BoostView.RenderListener renderListener;

    public boolean handlePurchasePathRequest() {
        return this.listener != null;
    }

    public void onInstallApp(String str, String str2) {
    }

    public void onOpenUrl(String str, String str2) {
    }

    public void onPurchasePathRequest(PurchasePathRequest purchasePathRequest, String str) {
        BoostView.Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onPurchasePathRequest(purchasePathRequest, str);
        }
    }

    public void onRender(BoostResponse boostResponse2, BoostView.RenderListener renderListener2) {
        WidgetRenderable widgetRenderable;
        if (boostResponse2 == null || (boostResponse2 instanceof BoostResponsePrivate)) {
            this.renderListener = renderListener2;
            this.boostResponse = (BoostResponsePrivate) boostResponse2;
            BoostViewController boostViewController = (BoostViewController) getViewController();
            if (boostViewController != null) {
                if (boostResponse2 != null) {
                    widgetRenderable = (WidgetRenderable) boostResponse2;
                } else {
                    widgetRenderable = null;
                }
                boostViewController.renderWidget(widgetRenderable);
                boostViewController.removeImpressionView();
            }
        } else if (renderListener2 != null) {
            renderListener2.onComplete(new IllegalStateException("Failed to cast BoostResponse"));
        }
    }

    public void onRenderComplete(Throwable th) {
        BoostViewController boostViewController;
        BoostView.RenderListener renderListener2 = this.renderListener;
        if (renderListener2 != null) {
            renderListener2.onComplete(th);
        }
        if (th == null && (boostViewController = (BoostViewController) getViewController()) != null) {
            boostViewController.addImpressionView(this.boostResponse);
        }
    }

    public void onViewAttached() {
        BoostViewController boostViewController = (BoostViewController) getViewController();
        if (boostViewController != null) {
            boostViewController.configureWidget(this);
        }
    }

    public void onWebViewDismiss() {
    }

    public void onWidgetDismiss() {
    }

    public void setBoostViewListener(BoostView.Listener listener2) {
        this.listener = listener2;
    }
}
