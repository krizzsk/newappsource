package com.usebutton.sdk.internal.widget;

import android.net.Uri;
import com.usebutton.sdk.internal.InternalCallToAction;
import com.usebutton.sdk.internal.api.burly.Burly;
import com.usebutton.sdk.internal.browser.BrowserSession;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.purchasepath.BaseInternalExtension;
import com.usebutton.sdk.internal.widget.WidgetView;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.CardList;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;
import java.util.List;

public class WidgetExtension extends BaseInternalExtension {
    public static final String WIDGET_CARD_KEY = "widget_card_key";
    /* access modifiers changed from: private */
    public BrowserInterface browser;
    private final BrowserSession browserSession;
    private final Burly burly;
    /* access modifiers changed from: private */
    public final Listener listener;
    public WidgetCardHandler widgetCardHandler = new WidgetCardHandler();
    private final List<Widget> widgets;

    public interface Listener {
        void onInstallApp(String str, String str2);

        void onOpenUrl(String str, String str2);

        void onShowFullScreenWidget(Widget widget);

        void onWebViewDismiss();
    }

    public class WidgetCardHandler implements WidgetView.RenderListener, WidgetView.Listener {
        public WidgetCardHandler() {
        }

        public boolean handlePurchasePathRequest() {
            return false;
        }

        public void onComplete(Throwable th) {
            if (th != null) {
                WidgetExtension widgetExtension = WidgetExtension.this;
                widgetExtension.removeWidgetCard(widgetExtension.browser);
            }
        }

        public void onInstallApp(String str, String str2) {
            WidgetExtension.this.listener.onInstallApp(str, str2);
        }

        public void onOpenUrl(String str, String str2) {
            WidgetExtension.this.listener.onOpenUrl(str, str2);
        }

        public void onPurchasePathRequest(PurchasePathRequest purchasePathRequest, String str) {
        }

        public void onWebViewDismiss() {
            WidgetExtension.this.listener.onWebViewDismiss();
        }

        public void onWidgetDismiss() {
            if (WidgetExtension.this.browser != null) {
                WidgetExtension widgetExtension = WidgetExtension.this;
                widgetExtension.hideTopCard(widgetExtension.browser);
            }
        }
    }

    public WidgetExtension(List<Widget> list, Burly burly2, BrowserSession browserSession2, Listener listener2) {
        this.widgets = list;
        this.burly = burly2;
        this.browserSession = browserSession2;
        this.listener = listener2;
    }

    private boolean evaluateWidgets(BrowserInterface browserInterface) {
        String str;
        int i;
        removeWidgetCard(browserInterface);
        for (Widget next : this.widgets) {
            this.browserSession.setShowCount(next.getShowCount());
            if (this.burly.evaluate(next.getRules(), this.browserSession.toMap())) {
                if (next.getViewType().equals(Widget.VIEW_TYPE_FULLSCREEN)) {
                    this.listener.onShowFullScreenWidget(next);
                } else if (next.getViewType().equals(Widget.VIEW_TYPE_CARD)) {
                    CardList privateCardList = getPrivateCardList(browserInterface);
                    if (privateCardList == null) {
                        return true;
                    }
                    setPageOwnerPrivate(browserInterface);
                    Text ctaText = next.getCtaText();
                    Uri ctaIcon = next.getCtaIcon();
                    if (ctaText != null) {
                        str = ctaText.getCopy();
                    } else {
                        str = "";
                    }
                    if (ctaText != null) {
                        i = ctaText.getColor();
                    } else {
                        i = -16777216;
                    }
                    WidgetCard widgetCard = new WidgetCard(new InternalCallToAction(ctaIcon, str, i), next, this.widgetCardHandler);
                    widgetCard.setKey(WIDGET_CARD_KEY);
                    privateCardList.addCard(widgetCard);
                    showTopCard(browserInterface);
                }
                next.incrementShowCount();
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void removeWidgetCard(BrowserInterface browserInterface) {
        CardList privateCardList;
        if (browserInterface != null && (privateCardList = getPrivateCardList(browserInterface)) != null) {
            privateCardList.removeCard(WIDGET_CARD_KEY);
        }
    }

    public void onClosed() {
        this.browser = null;
    }

    public void onInitialized(BrowserInterface browserInterface) {
        this.browser = browserInterface;
        evaluateWidgets(browserInterface);
    }

    public void onPageNavigate(BrowserInterface browserInterface, BrowserPage browserPage) {
        evaluateWidgets(browserInterface);
    }

    public void onProductNavigate(BrowserInterface browserInterface, ProductPage productPage) {
        evaluateWidgets(browserInterface);
    }

    public void onPurchaseNavigate(BrowserInterface browserInterface, PurchasePage purchasePage) {
        evaluateWidgets(browserInterface);
    }

    public boolean onShouldClose(BrowserInterface browserInterface) {
        return evaluateWidgets(browserInterface);
    }

    public void onStartNavigate(BrowserInterface browserInterface) {
    }
}
