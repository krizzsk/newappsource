package com.usebutton.sdk.internal.purchasepath;

import com.usebutton.sdk.internal.BrowserProxy;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.CardList;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;

public abstract class BaseInternalExtension implements PurchasePathExtension {
    private BrowserProxy getProxy(BrowserInterface browserInterface) {
        return (BrowserProxy) browserInterface;
    }

    public CardList getPersistentCardList(BrowserInterface browserInterface) {
        return getProxy(browserInterface).getPersistentCardList();
    }

    public CardList getPrivateCardList(BrowserInterface browserInterface) {
        return getProxy(browserInterface).getPrivateCardList();
    }

    public void hideTopCard(BrowserInterface browserInterface) {
        getProxy(browserInterface).hideTopCard(true);
    }

    public abstract boolean onShouldClose(BrowserInterface browserInterface);

    public void setPageOwnerPrivate(BrowserInterface browserInterface) {
        getProxy(browserInterface).setPageOwner(PageOwner.PRIVATE);
    }

    public void showTopCard(BrowserInterface browserInterface) {
        getProxy(browserInterface).showTopCard(true);
    }
}
