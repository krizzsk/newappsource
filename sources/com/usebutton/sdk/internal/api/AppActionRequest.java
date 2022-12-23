package com.usebutton.sdk.internal.api;

import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class AppActionRequest {
    public static final String KEY_BVPT = "bvpt";
    public static final String KEY_CAPABILITIES = "capabilities";
    public static final String KEY_CONTEXT = "context";
    public static final String KEY_MERCHANT_ID = "merchant_id";
    public static final String KEY_PLACEMENT_ID = "placement_id";
    public static final String KEY_PUB_REF = "pub_ref";
    public static final String KEY_THIRD_PARTY_ID = "thirdparty_id";
    public static final String KEY_URL = "url";
    public static final String KEY_USER_LOCAL_TIME = "user_local_time";
    private final JSONObject body;
    private final JSONObject bvpt;
    private final JSONObject capabilities;
    private final JSONObject context;
    private final String merchantId;
    private final String placementId;
    private final String pubRef;
    private final String thirdPartyId;
    private final URL url;
    private final String userLocalTime;

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = this.capabilities;
        if (jSONObject != null) {
            this.body.put(KEY_CAPABILITIES, jSONObject);
        }
        JSONObject jSONObject2 = this.context;
        if (jSONObject2 != null) {
            this.body.put(KEY_CONTEXT, jSONObject2);
        }
        String str = this.merchantId;
        if (str != null) {
            this.body.put(KEY_MERCHANT_ID, str);
        }
        String str2 = this.placementId;
        if (str2 != null) {
            this.body.put("placement_id", str2);
        }
        String str3 = this.pubRef;
        if (str3 != null) {
            this.body.put(KEY_PUB_REF, str3);
        }
        String str4 = this.thirdPartyId;
        if (str4 != null) {
            this.body.put("thirdparty_id", str4);
        }
        URL url2 = this.url;
        if (url2 != null) {
            this.body.put("url", url2);
        }
        String str5 = this.userLocalTime;
        if (str5 != null) {
            this.body.put(KEY_USER_LOCAL_TIME, str5);
        }
        JSONObject jSONObject3 = this.bvpt;
        if (jSONObject3 != null) {
            this.body.put("bvpt", jSONObject3);
        }
        return this.body;
    }

    public static class Builder {
        private final JSONObject body;
        private JSONObject bvpt;
        private JSONObject capabilities;
        private JSONObject context;
        private String merchantId;
        private String placementId;
        private String pubRef;
        private String thirdPartyId;
        private URL url;
        private String userLocalTime;

        public Builder() {
            this.body = new JSONObject();
        }

        public AppActionRequest build() {
            return new AppActionRequest(this.body, this.capabilities, this.context, this.merchantId, this.placementId, this.pubRef, this.thirdPartyId, this.url, this.userLocalTime, this.bvpt);
        }

        public Builder bvpt(JSONObject jSONObject) {
            this.bvpt = jSONObject;
            return this;
        }

        public Builder capabilities(JSONObject jSONObject) {
            this.capabilities = jSONObject;
            return this;
        }

        public Builder context(JSONObject jSONObject) {
            this.context = jSONObject;
            return this;
        }

        public Builder merchantId(String str) {
            this.merchantId = str;
            return this;
        }

        public Builder placementId(String str) {
            this.placementId = str;
            return this;
        }

        public Builder pubRef(String str) {
            this.pubRef = str;
            return this;
        }

        public Builder thirdPartyId(String str) {
            this.thirdPartyId = str;
            return this;
        }

        public Builder url(URL url2) {
            this.url = url2;
            return this;
        }

        public Builder userLocalTime(String str) {
            this.userLocalTime = str;
            return this;
        }

        public Builder(JSONObject jSONObject) {
            this.body = jSONObject;
        }
    }

    private AppActionRequest(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, String str, String str2, String str3, String str4, URL url2, String str5, JSONObject jSONObject4) {
        this.body = jSONObject;
        this.capabilities = jSONObject2;
        this.context = jSONObject3;
        this.merchantId = str;
        this.placementId = str2;
        this.pubRef = str3;
        this.thirdPartyId = str4;
        this.url = url2;
        this.userLocalTime = str5;
        this.bvpt = jSONObject4;
    }
}
