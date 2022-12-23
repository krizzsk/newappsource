package com.usebutton.sdk.internal.purchasepath;

import com.usebutton.sdk.internal.BrowserProxy;
import com.usebutton.sdk.internal.browser.BrowserSession;
import com.usebutton.sdk.internal.widget.WidgetExtension;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;

public class CheckoutManager {
    private static volatile CheckoutManager sInstance;
    private AppInstallExtension appInstallExtension;
    private PurchasePathExtension purchasePathExtension;
    private WidgetExtension widgetExtension;

    public static CheckoutManager getInstance() {
        if (sInstance == null) {
            synchronized (CheckoutManager.class) {
                if (sInstance == null) {
                    sInstance = new CheckoutManager();
                }
            }
        }
        return sInstance;
    }

    public AppInstallExtension getAppInstallExtension() {
        return this.appInstallExtension;
    }

    public PurchasePathExtension getExtension() {
        return this.purchasePathExtension;
    }

    public WidgetExtension getWidgetExtension() {
        return this.widgetExtension;
    }

    public boolean hasAppInstallExtension() {
        return this.appInstallExtension != null;
    }

    public boolean hasExtension() {
        return this.purchasePathExtension != null;
    }

    public boolean hasWidgetExtension() {
        return this.widgetExtension != null;
    }

    public void notifyOnClosed() {
        AppInstallExtension appInstallExtension2 = this.appInstallExtension;
        if (appInstallExtension2 != null) {
            appInstallExtension2.onClosed();
        }
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            widgetExtension2.onClosed();
        }
        PurchasePathExtension purchasePathExtension2 = this.purchasePathExtension;
        if (purchasePathExtension2 != null) {
            purchasePathExtension2.onClosed();
        }
    }

    public void notifyOnInitialized(BrowserProxy browserProxy, BrowserSession browserSession) {
        browserSession.update(BrowserSession.Event.LAUNCH);
        AppInstallExtension appInstallExtension2 = this.appInstallExtension;
        if (appInstallExtension2 != null) {
            appInstallExtension2.onInitialized(browserProxy);
        }
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            widgetExtension2.onInitialized(browserProxy);
        }
        PurchasePathExtension purchasePathExtension2 = this.purchasePathExtension;
        if (purchasePathExtension2 != null) {
            purchasePathExtension2.onInitialized(browserProxy);
        }
    }

    public void notifyOnPageNavigate(BrowserProxy browserProxy, BrowserPage browserPage, BrowserSession browserSession) {
        browserProxy.setPageOwner(PageOwner.PUBLIC);
        browserSession.update(BrowserSession.Event.PAGE_VIEW, browserPage.getUrl());
        AppInstallExtension appInstallExtension2 = this.appInstallExtension;
        if (appInstallExtension2 != null) {
            appInstallExtension2.onPageNavigate(browserProxy, browserPage);
        }
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            widgetExtension2.onPageNavigate(browserProxy, browserPage);
        }
        PurchasePathExtension purchasePathExtension2 = this.purchasePathExtension;
        if (purchasePathExtension2 != null) {
            purchasePathExtension2.onPageNavigate(browserProxy, browserPage);
        }
    }

    public void notifyOnProductNavigate(BrowserProxy browserProxy, ProductPage productPage, BrowserSession browserSession) {
        browserProxy.setPageOwner(PageOwner.PUBLIC);
        browserSession.update(BrowserSession.Event.PRODUCT_VIEW, productPage.getUrl());
        AppInstallExtension appInstallExtension2 = this.appInstallExtension;
        if (appInstallExtension2 != null) {
            appInstallExtension2.onProductNavigate(browserProxy, productPage);
        }
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            widgetExtension2.onProductNavigate(browserProxy, productPage);
        }
        PurchasePathExtension purchasePathExtension2 = this.purchasePathExtension;
        if (purchasePathExtension2 != null) {
            purchasePathExtension2.onProductNavigate(browserProxy, productPage);
        }
    }

    public void notifyOnPurchaseNavigate(BrowserProxy browserProxy, PurchasePage purchasePage, BrowserSession browserSession) {
        browserProxy.setPageOwner(PageOwner.PUBLIC);
        browserSession.update(BrowserSession.Event.ORDER_CHECKOUT, purchasePage.getUrl());
        AppInstallExtension appInstallExtension2 = this.appInstallExtension;
        if (appInstallExtension2 != null) {
            appInstallExtension2.onPurchaseNavigate(browserProxy, purchasePage);
        }
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            widgetExtension2.onPurchaseNavigate(browserProxy, purchasePage);
        }
        PurchasePathExtension purchasePathExtension2 = this.purchasePathExtension;
        if (purchasePathExtension2 != null) {
            purchasePathExtension2.onPurchaseNavigate(browserProxy, purchasePage);
        }
    }

    public void notifyOnStartNavigate(BrowserProxy browserProxy) {
        browserProxy.setPageOwner(PageOwner.PRIVATE);
        AppInstallExtension appInstallExtension2 = this.appInstallExtension;
        if (appInstallExtension2 != null) {
            appInstallExtension2.onStartNavigate(browserProxy);
        }
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            widgetExtension2.onStartNavigate(browserProxy);
        }
        PurchasePathExtension purchasePathExtension2 = this.purchasePathExtension;
        if (purchasePathExtension2 != null) {
            purchasePathExtension2.onStartNavigate(browserProxy);
        }
    }

    public boolean notifyShouldClose(BrowserProxy browserProxy, BrowserSession browserSession) {
        browserSession.update(BrowserSession.Event.DISMISS);
        WidgetExtension widgetExtension2 = this.widgetExtension;
        if (widgetExtension2 != null) {
            return widgetExtension2.onShouldClose(browserProxy);
        }
        return true;
    }

    public void setAppInstallExtension(AppInstallExtension appInstallExtension2) {
        this.appInstallExtension = appInstallExtension2;
    }

    public void setExtension(PurchasePathExtension purchasePathExtension2) {
        this.purchasePathExtension = purchasePathExtension2;
    }

    public void setWidgetExtension(WidgetExtension widgetExtension2) {
        this.widgetExtension = widgetExtension2;
    }
}
