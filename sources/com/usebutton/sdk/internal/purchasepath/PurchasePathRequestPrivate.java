package com.usebutton.sdk.internal.purchasepath;

import com.usebutton.sdk.purchasepath.PurchasePathRequest;
import org.json.JSONObject;

public class PurchasePathRequestPrivate extends PurchasePathRequest {
    private JSONObject passThrough;

    public PurchasePathRequestPrivate(String str) {
        super(str);
    }

    public JSONObject getPassThrough() {
        return this.passThrough;
    }

    public void setPassThrough(JSONObject jSONObject) {
        this.passThrough = jSONObject;
    }
}
