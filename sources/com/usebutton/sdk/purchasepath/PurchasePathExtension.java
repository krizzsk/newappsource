package com.usebutton.sdk.purchasepath;

public interface PurchasePathExtension {
    void onClosed();

    void onInitialized(BrowserInterface browserInterface);

    void onPageNavigate(BrowserInterface browserInterface, BrowserPage browserPage);

    void onProductNavigate(BrowserInterface browserInterface, ProductPage productPage);

    void onPurchaseNavigate(BrowserInterface browserInterface, PurchasePage purchasePage);

    void onStartNavigate(BrowserInterface browserInterface);
}
