package com.unity3d.services.store.core;

import com.unity3d.services.core.webview.WebViewEventCategory;
import oc0.C12988h;

public class StoreWebViewError extends C12988h {
    public StoreWebViewError(Enum<?> enumR, String str, Object... objArr) {
        super(enumR, str, objArr);
    }

    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
