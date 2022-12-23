package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

public final class SkuDetails {

    /* renamed from: a */
    public final String f6734a;

    /* renamed from: b */
    public final JSONObject f6735b;

    public SkuDetails(String str) throws JSONException {
        this.f6734a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f6735b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    /* renamed from: a */
    public final String mo9553a() {
        return this.f6735b.optString("type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f6734a, ((SkuDetails) obj).f6734a);
    }

    public final int hashCode() {
        return this.f6734a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6734a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
