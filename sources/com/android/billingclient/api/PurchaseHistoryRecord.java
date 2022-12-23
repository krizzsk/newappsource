package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class PurchaseHistoryRecord {

    /* renamed from: a */
    public final String f6731a;

    /* renamed from: b */
    public final String f6732b;

    /* renamed from: c */
    public final JSONObject f6733c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f6731a = str;
        this.f6732b = str2;
        this.f6733c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (!TextUtils.equals(this.f6731a, purchaseHistoryRecord.f6731a) || !TextUtils.equals(this.f6732b, purchaseHistoryRecord.f6732b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6731a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6731a);
        return valueOf.length() != 0 ? "PurchaseHistoryRecord. Json: ".concat(valueOf) : new String("PurchaseHistoryRecord. Json: ");
    }
}
