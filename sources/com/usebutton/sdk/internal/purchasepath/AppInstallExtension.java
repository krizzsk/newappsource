package com.usebutton.sdk.internal.purchasepath;

import android.os.Handler;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.models.InternalInstallCard;
import com.usebutton.sdk.internal.purchasepath.AppInstallCard;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.Card;
import com.usebutton.sdk.purchasepath.CardList;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;

public class AppInstallExtension extends BaseInternalExtension implements AppInstallCard.Listener {
    public static final String APP_INSTALL_CARD_KEY = "btn_app_install_card";
    public static final String POST_PURCHASE_APP_INSTALL_CARD_KEY = "btn_post_purchase_app_install_card";
    /* access modifiers changed from: private */
    public String currentCardKey;
    private final Handler handler;
    private final ImageLoader imageLoader;
    private boolean isFirstPage = true;
    /* access modifiers changed from: private */
    public final Listener listener;
    private final InternalInstallCard postPurchaseInstallCard;
    private final InternalInstallCard prePurchaseInstallCard;

    public interface Listener {
        void onAcceptClicked(String str);

        void onDeclineClicked(String str);

        void onInstallCardShown(String str);
    }

    public AppInstallExtension(InternalInstallCard internalInstallCard, InternalInstallCard internalInstallCard2, ImageLoader imageLoader2, Handler handler2, Listener listener2) {
        this.prePurchaseInstallCard = internalInstallCard;
        this.postPurchaseInstallCard = internalInstallCard2;
        this.imageLoader = imageLoader2;
        this.handler = handler2;
        this.listener = listener2;
    }

    private AppInstallCard createAppInstallCard(String str) {
        InternalInstallCard internalInstallCard;
        if (str.equals(POST_PURCHASE_APP_INSTALL_CARD_KEY) && (internalInstallCard = this.postPurchaseInstallCard) != null) {
            return createAppInstallCard(internalInstallCard, str);
        }
        InternalInstallCard internalInstallCard2 = this.prePurchaseInstallCard;
        if (internalInstallCard2 != null) {
            return createAppInstallCard(internalInstallCard2, str);
        }
        return null;
    }

    private void displayAppInstallCard(final BrowserInterface browserInterface, InternalInstallCard internalInstallCard) {
        CardList privateCardList;
        if (internalInstallCard != null && (privateCardList = getPrivateCardList(browserInterface)) != null) {
            privateCardList.insertCard(createAppInstallCard(internalInstallCard, this.currentCardKey), 0);
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    if (AppInstallExtension.this.getPrivateCardList(browserInterface) != null) {
                        AppInstallExtension.this.showTopCard(browserInterface);
                        AppInstallExtension.this.listener.onInstallCardShown(AppInstallExtension.this.currentCardKey);
                    }
                }
            }, internalInstallCard.getAutoShowDelayInMs());
        }
    }

    private void ensureAppInstallCardIsInPersistentList(BrowserInterface browserInterface) {
        CardList privateCardList = getPrivateCardList(browserInterface);
        CardList persistentCardList = getPersistentCardList(browserInterface);
        if (persistentCardList != null && persistentCardList.getCard(this.currentCardKey) == null && privateCardList != null) {
            Card card = privateCardList.getCard(this.currentCardKey);
            if (card != null) {
                removeAppInstallCardFromLists(browserInterface);
            } else {
                card = createAppInstallCard(this.currentCardKey);
            }
            if (card != null) {
                persistentCardList.addCard(card);
                browserInterface.reloadCards();
            }
        }
    }

    private void onPageProductNavigateFunctionality(BrowserInterface browserInterface) {
        if (this.isFirstPage) {
            this.isFirstPage = false;
            setPageOwnerPrivate(browserInterface);
            return;
        }
        ensureAppInstallCardIsInPersistentList(browserInterface);
    }

    private void removeAppInstallCardFromLists(BrowserInterface browserInterface) {
        CardList privateCardList = getPrivateCardList(browserInterface);
        CardList persistentCardList = getPersistentCardList(browserInterface);
        if (privateCardList != null) {
            privateCardList.removeCard(APP_INSTALL_CARD_KEY);
            privateCardList.removeCard(POST_PURCHASE_APP_INSTALL_CARD_KEY);
        }
        if (persistentCardList != null) {
            persistentCardList.removeCard(APP_INSTALL_CARD_KEY);
            persistentCardList.removeCard(POST_PURCHASE_APP_INSTALL_CARD_KEY);
        }
    }

    public void onAcceptClicked(String str) {
        this.listener.onAcceptClicked(str);
    }

    public void onClosed() {
    }

    public void onDeclineClicked(String str) {
        this.listener.onDeclineClicked(str);
    }

    public void onInitialized(BrowserInterface browserInterface) {
        this.currentCardKey = APP_INSTALL_CARD_KEY;
        displayAppInstallCard(browserInterface, this.prePurchaseInstallCard);
    }

    public void onPageNavigate(BrowserInterface browserInterface, BrowserPage browserPage) {
        onPageProductNavigateFunctionality(browserInterface);
    }

    public void onProductNavigate(BrowserInterface browserInterface, ProductPage productPage) {
        onPageProductNavigateFunctionality(browserInterface);
    }

    public void onPurchaseNavigate(BrowserInterface browserInterface, PurchasePage purchasePage) {
        setPageOwnerPrivate(browserInterface);
        removeAppInstallCardFromLists(browserInterface);
        this.currentCardKey = POST_PURCHASE_APP_INSTALL_CARD_KEY;
        displayAppInstallCard(browserInterface, this.postPurchaseInstallCard);
    }

    public boolean onShouldClose(BrowserInterface browserInterface) {
        return true;
    }

    public void onStartNavigate(BrowserInterface browserInterface) {
    }

    private AppInstallCard createAppInstallCard(InternalInstallCard internalInstallCard, String str) {
        AppInstallCard appInstallCard = new AppInstallCard(internalInstallCard, this.imageLoader, this);
        appInstallCard.setKey(str);
        return appInstallCard;
    }
}
