package com.usebutton.sdk.internal.widget;

import android.os.Handler;
import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.MainThreadExecutor;
import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.purchasepath.PurchasePathRequestPrivate;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.widget.WidgetJavascriptBridge;
import com.usebutton.sdk.internal.widget.WidgetMessageParser;
import com.usebutton.sdk.internal.widget.WidgetView;
import com.usebutton.sdk.purchasepath.PurchasePath;
import com.usebutton.sdk.purchasepath.PurchasePathInterface;
import com.usebutton.sdk.purchasepath.PurchasePathListener;
import org.json.JSONObject;

class WidgetPresenter extends BasePresenter<WidgetViewController> implements WidgetJavascriptBridge.Listener, WidgetMessageParser.Listener {
    /* access modifiers changed from: private */
    public static final String TAG = "WidgetPresenter";
    private final ButtonRepository buttonRepository;
    private final EventTracker eventTracker;
    private final WidgetJavascriptBridge javascriptBridge;
    /* access modifiers changed from: private */
    public WidgetView.Listener listener;
    private final MainThreadExecutor mainThreadExecutor;
    /* access modifiers changed from: private */
    public final WidgetMessageParser messageParser;
    private final PurchasePathInterface purchasePath;
    /* access modifiers changed from: private */
    public WidgetView.RenderListener renderListener;
    /* access modifiers changed from: private */
    public boolean timedOut;
    private final Handler timeoutHandler;

    public WidgetPresenter(WidgetJavascriptBridge widgetJavascriptBridge, WidgetMessageParser widgetMessageParser, Handler handler, MainThreadExecutor mainThreadExecutor2, EventTracker eventTracker2, PurchasePathInterface purchasePathInterface, ButtonRepository buttonRepository2) {
        this.javascriptBridge = widgetJavascriptBridge;
        this.messageParser = widgetMessageParser;
        this.timeoutHandler = handler;
        this.mainThreadExecutor = mainThreadExecutor2;
        this.eventTracker = eventTracker2;
        this.purchasePath = purchasePathInterface;
        this.buttonRepository = buttonRepository2;
    }

    /* access modifiers changed from: private */
    public void notifyWidgetListener(final Throwable th) {
        this.timeoutHandler.removeCallbacksAndMessages((Object) null);
        this.mainThreadExecutor.execute(new Runnable() {
            public void run() {
                if (WidgetPresenter.this.renderListener != null) {
                    WidgetPresenter.this.renderListener.onComplete(th);
                }
            }
        });
    }

    public void onBrowserGetContext(final String str) {
        this.buttonRepository.getBrowserSessionContext(new FailableReceiver<JSONObject>() {
            public void onError() {
                ButtonLog.warn(WidgetPresenter.TAG, "Failed to retrieve Browser Context");
            }

            public void onResult(JSONObject jSONObject) {
                WidgetViewController widgetViewController;
                if (jSONObject != null && (widgetViewController = (WidgetViewController) WidgetPresenter.this.getViewController()) != null) {
                    widgetViewController.sendMessage(String.format("%s(%s)", new Object[]{str, jSONObject.toString()}));
                }
            }
        });
    }

    public void onInstallApp(String str, String str2) {
        WidgetView.Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onInstallApp(str, str2);
        }
    }

    public void onMessageReceived(final JSONObject jSONObject) {
        this.mainThreadExecutor.execute(new Runnable() {
            public void run() {
                WidgetPresenter.this.messageParser.onMessageReceived(jSONObject);
            }
        });
    }

    public void onOpenUrl(String str, String str2) {
        WidgetView.Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onOpenUrl(str, str2);
        }
    }

    public void onPurchasePath(String str, String str2, JSONObject jSONObject) {
        PurchasePathRequestPrivate purchasePathRequestPrivate = new PurchasePathRequestPrivate(str);
        purchasePathRequestPrivate.setPassThrough(jSONObject);
        WidgetView.Listener listener2 = this.listener;
        if (listener2 == null || !listener2.handlePurchasePathRequest()) {
            this.purchasePath.fetch(purchasePathRequestPrivate, new PurchasePathListener() {
                public void onComplete(PurchasePath purchasePath, Throwable th) {
                    WidgetViewController widgetViewController;
                    if (!(purchasePath == null || (widgetViewController = (WidgetViewController) WidgetPresenter.this.getViewController()) == null)) {
                        if (WidgetPresenter.this.listener != null) {
                            WidgetPresenter.this.listener.onWebViewDismiss();
                        }
                        widgetViewController.startPurchasePath(purchasePath);
                    }
                    if (th != null) {
                        ButtonLog.warn(WidgetPresenter.TAG, "Failed to fetch purchase path", th);
                    }
                }
            });
        } else {
            this.listener.onPurchasePathRequest(purchasePathRequestPrivate, str2);
        }
    }

    public void onRender(WidgetRenderable widgetRenderable, WidgetView.RenderListener renderListener2) {
        final WidgetViewController widgetViewController = (WidgetViewController) getViewController();
        if (widgetViewController != null) {
            widgetViewController.hideWebView();
            widgetViewController.stopLoadingWebView();
        }
        if (widgetRenderable != null) {
            this.renderListener = renderListener2;
            this.timeoutHandler.removeCallbacksAndMessages((Object) null);
            this.timedOut = false;
            this.timeoutHandler.postDelayed(new Runnable() {
                public void run() {
                    WidgetPresenter.this.notifyWidgetListener(new IllegalStateException("Render timed out"));
                    boolean unused = WidgetPresenter.this.timedOut = true;
                    WidgetViewController widgetViewController = widgetViewController;
                    if (widgetViewController != null) {
                        widgetViewController.stopLoadingWebView();
                    }
                }
            }, widgetRenderable.getRenderTimeoutInMs());
            if (widgetViewController != null) {
                String markupUrl = widgetRenderable.getMarkupUrl();
                String markup = widgetRenderable.getMarkup();
                if (!markupUrl.isEmpty()) {
                    widgetViewController.loadUrl(markupUrl);
                } else {
                    widgetViewController.loadMarkup(markup);
                }
            }
        }
    }

    public void onTrackEvent(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.eventTracker.trackEvent(str);
        } else {
            this.eventTracker.trackEventWithProperties(str, jSONObject);
        }
    }

    public void onViewAttached() {
        this.javascriptBridge.setListener(this);
        this.messageParser.setListener(this);
        WidgetViewController widgetViewController = (WidgetViewController) getViewController();
        if (widgetViewController != null) {
            widgetViewController.configureWebView(this.javascriptBridge);
        }
    }

    public void onViewDetached() {
        this.javascriptBridge.setListener((WidgetJavascriptBridge.Listener) null);
        this.messageParser.setListener((WidgetMessageParser.Listener) null);
    }

    public void onWebViewDismiss() {
        WidgetView.Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onWebViewDismiss();
        }
    }

    public void onWidgetDismiss() {
        WidgetView.Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onWidgetDismiss();
        }
    }

    public void onWidgetReady(final boolean z) {
        if (!this.timedOut) {
            this.mainThreadExecutor.execute(new Runnable() {
                public void run() {
                    WidgetViewController widgetViewController = (WidgetViewController) WidgetPresenter.this.getViewController();
                    if (z) {
                        WidgetPresenter.this.notifyWidgetListener((Throwable) null);
                        if (widgetViewController != null) {
                            widgetViewController.showWebView();
                            return;
                        }
                        return;
                    }
                    WidgetPresenter.this.notifyWidgetListener(new IllegalStateException("Unknown render error"));
                }
            });
        }
    }

    public void setListener(WidgetView.Listener listener2) {
        this.listener = listener2;
    }
}
