package com.usebutton.sdk.purchasepath;

public interface BrowserPage {

    public interface DomResultListener {
        void onResult(String str);
    }

    void getBrowserDom(DomResultListener domResultListener);

    String getUrl();
}
