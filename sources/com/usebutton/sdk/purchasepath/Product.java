package com.usebutton.sdk.purchasepath;

import org.json.JSONObject;

public class Product {
    private static final String KEY_URL = "url";
    private String uri;

    private Product(String str) {
        this.uri = str;
    }

    public static Product fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("url");
        if (optString.isEmpty()) {
            return null;
        }
        return new Product(optString);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Product)) {
            return false;
        }
        return getUri().equals(((Product) obj).getUri());
    }

    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + 203;
    }
}
