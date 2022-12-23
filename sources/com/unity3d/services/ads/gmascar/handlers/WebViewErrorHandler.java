package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import oc0.C12982b;
import oc0.C12988h;

public class WebViewErrorHandler implements C12982b<C12988h> {
    public void handleError(C12988h hVar) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.valueOf(hVar.getDomain()), hVar.getErrorCategory(), hVar.getErrorArguments());
    }
}
