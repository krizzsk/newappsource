package com.unity3d.services.store.gpbl.bridges;

public class SkuDetailsBridge extends CommonJsonResponseBridge {
    public SkuDetailsBridge(Object obj) {
        super(obj);
    }

    public String getClassName() {
        return "com.android.billingclient.api.SkuDetails";
    }
}
