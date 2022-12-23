package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class Purchase {

    /* renamed from: a */
    public final String f6726a;

    /* renamed from: b */
    public final String f6727b;

    /* renamed from: c */
    public final JSONObject f6728c;

    /* renamed from: com.android.billingclient.api.Purchase$a */
    public static class C1938a {

        /* renamed from: a */
        public final List<Purchase> f6729a;

        /* renamed from: b */
        public final C1949f f6730b;

        public C1938a(C1949f fVar, ArrayList arrayList) {
            this.f6729a = arrayList;
            this.f6730b = fVar;
        }
    }

    public Purchase(String str, String str2) throws JSONException {
        this.f6726a = str;
        this.f6727b = str2;
        this.f6728c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (!TextUtils.equals(this.f6726a, purchase.f6726a) || !TextUtils.equals(this.f6727b, purchase.f6727b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6726a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6726a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
