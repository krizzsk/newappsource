package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class MetaDTO {
    private static final double DEFAULT_SCALE = 1.0d;
    private static final String DEFAULT_TARGET = "app";
    private static final String KEY_APP_DISPLAY_NAME = "app_display_name";
    private static final String KEY_APP_ICON = "app_icon";
    private static final String KEY_CAMPAIGN_ID = "campaign_id";
    private static final String KEY_ID = "id";
    private static final String KEY_MAX_AGE_SECONDS = "max_age_seconds";
    private static final String KEY_REQUEST_TIME = "request_time";
    private static final String KEY_SOURCE_TOKEN = "source_token";
    private static final String KEY_STORE_ID = "store_id";
    private static final String KEY_TAP_SIGNAL = "tap_signal";
    private static final String KEY_TARGET = "target";
    public final ImageDTO appIcon;
    public final String appName;
    public final String campaignId;

    /* renamed from: id */
    public final String f30925id;
    public final int maxAgeSeconds;
    public final String requestTime;
    public final String sourceToken;
    public final String storeId;
    public final String tapSignal;
    public final String target;

    private MetaDTO(String str, String str2, String str3, String str4, String str5, String str6, int i, ImageDTO imageDTO, String str7, String str8) {
        this.f30925id = str;
        this.storeId = str2;
        this.sourceToken = str3;
        this.campaignId = str4;
        this.target = str5;
        this.appName = str6;
        this.maxAgeSeconds = i;
        this.appIcon = imageDTO;
        this.requestTime = str7;
        this.tapSignal = str8;
    }

    public static MetaDTO fromJson(JSONObject jSONObject) throws JSONException {
        return new MetaDTO(jSONObject.getString("id"), jSONObject.getString("store_id"), jSONObject.getString("source_token"), jSONObject.optString("campaign_id"), jSONObject.optString("target", "app"), jSONObject.optString(KEY_APP_DISPLAY_NAME), jSONObject.optInt(KEY_MAX_AGE_SECONDS), new ImageDTO((String) null, DEFAULT_SCALE, BaseDTO.uriOrNull(jSONObject, KEY_APP_ICON)), jSONObject.optString("request_time"), jSONObject.optString(KEY_TAP_SIGNAL));
    }
}
