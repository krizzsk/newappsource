package com.usebutton.sdk.internal.purchasepath;

import com.usebutton.sdk.purchasepath.Commission;
import com.usebutton.sdk.purchasepath.Product;
import org.json.JSONObject;

public class PageView {
    private Commission commission;
    private MatchType matchType;
    private Product product;

    public enum MatchType {
        PRODUCT_VIEWED("product-viewed"),
        ORDER_CHECKOUT("order-checkout"),
        UNKNOWN("unknown");
        
        public final String matchType;

        private MatchType(String str) {
            this.matchType = str;
        }

        public static MatchType getType(String str) {
            for (MatchType matchType2 : values()) {
                if (matchType2.matchType.equalsIgnoreCase(str)) {
                    return matchType2;
                }
            }
            return UNKNOWN;
        }
    }

    private PageView(MatchType matchType2, Product product2, Commission commission2) {
        this.matchType = matchType2;
        this.product = product2;
        this.commission = commission2;
    }

    public static PageView fromJson(JSONObject jSONObject) {
        MatchType matchType2;
        Commission commission2;
        Product product2;
        boolean z;
        Product product3 = null;
        if (jSONObject == null || !jSONObject.has("object")) {
            return new PageView(MatchType.UNKNOWN, (Product) null, (Commission) null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("object");
        MatchType matchType3 = MatchType.UNKNOWN;
        if (optJSONObject.has("match_type")) {
            matchType2 = MatchType.getType(optJSONObject.optString("match_type"));
        } else {
            matchType2 = matchType3;
        }
        if (optJSONObject.has("commission")) {
            commission2 = Commission.fromJson(optJSONObject.optJSONObject("commission"));
        } else {
            commission2 = null;
        }
        if (optJSONObject.has("product")) {
            product2 = Product.fromJson(optJSONObject.optJSONObject("product"));
        } else {
            product2 = null;
        }
        if (product2 == null || commission2 == null) {
            z = false;
        } else {
            z = true;
        }
        if (MatchType.PRODUCT_VIEWED != matchType2 || z) {
            product3 = product2;
            matchType3 = matchType2;
        } else {
            commission2 = null;
        }
        return new PageView(matchType3, product3, commission2);
    }

    public Commission getCommission() {
        return this.commission;
    }

    public Product getProduct() {
        return this.product;
    }

    public MatchType getType() {
        return this.matchType;
    }
}
