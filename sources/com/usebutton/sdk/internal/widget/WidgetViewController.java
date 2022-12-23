package com.usebutton.sdk.internal.widget;

import com.usebutton.sdk.internal.base.BaseViewController;
import com.usebutton.sdk.purchasepath.PurchasePath;

interface WidgetViewController extends BaseViewController {
    void configureWebView(WidgetJavascriptBridge widgetJavascriptBridge);

    void hideWebView();

    void loadMarkup(String str);

    void loadUrl(String str);

    void sendMessage(String str);

    void showWebView();

    void startPurchasePath(PurchasePath purchasePath);

    void stopLoadingWebView();
}
