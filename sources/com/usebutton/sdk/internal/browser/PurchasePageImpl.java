package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.purchasepath.PurchasePage;

public class PurchasePageImpl extends BrowserPageImpl implements PurchasePage {
    public PurchasePageImpl(String str, ButtonJavascriptInterface buttonJavascriptInterface) {
        super(str, buttonJavascriptInterface);
    }
}
