package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;

public class BrowserPageImpl implements BrowserPage {
    private final ButtonJavascriptInterface javascriptInterface;
    private final String url;

    public BrowserPageImpl(String str, ButtonJavascriptInterface buttonJavascriptInterface) {
        this.url = str;
        this.javascriptInterface = buttonJavascriptInterface;
    }

    public void getBrowserDom(BrowserPage.DomResultListener domResultListener) {
        this.javascriptInterface.getDom(domResultListener);
    }

    public String getUrl() {
        return this.url;
    }
}
