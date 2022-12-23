package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;

public interface BrowserStateMachine {

    public interface OnStateChangeListener {
        void onBatchComplete(BrowserPage browserPage);

        void onProductViewed(ProductPage productPage);

        void onPurchaseViewed(PurchasePage purchasePage);

        void onStart();
    }

    void commit(String str);

    void setJavascriptInterface(ButtonJavascriptInterface buttonJavascriptInterface);

    void start(String str);
}
