package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class WidgetDTO {
    private static final int DEFAULT_CARD_HEIGHT = 116;
    private static final long DEFAULT_RENDER_TIMEOUT = 3000;
    public static final String KEY_CARD_HEIGHT = "card_height";
    public static final String KEY_CTA = "card_cta";
    public static final String KEY_CTA_ICON = "icon_url";
    public static final String KEY_MARKUP = "markup";
    public static final String KEY_MARKUP_URL = "markup_url";
    public static final String KEY_RENDER_TIMEOUT = "render_timeout";
    public static final String KEY_RULES = "rules";
    public static final String KEY_TITLE = "title_text";
    public static final String KEY_VIEW_TYPE = "view_type";
    public final float cardHeight;
    public final String ctaIcon;
    public final TextDTO ctaText;
    public final String markup;
    public final String markupUrl;
    public final long renderTimeout;
    public final JSONObject rules;
    public final String viewType;

    private WidgetDTO(String str, long j, String str2, String str3, String str4, TextDTO textDTO, float f, JSONObject jSONObject) {
        this.viewType = str;
        this.renderTimeout = j;
        this.markup = str2;
        this.markupUrl = str3;
        this.ctaIcon = str4;
        this.ctaText = textDTO;
        this.cardHeight = f;
        this.rules = jSONObject;
    }

    public static WidgetDTO fromJson(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = null;
        if (jSONObject2 == null || (!jSONObject2.has(KEY_MARKUP) && !jSONObject2.has(KEY_MARKUP_URL))) {
            return null;
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject(KEY_CTA);
        JSONObject optJSONObject2 = jSONObject2.optJSONObject(KEY_RULES);
        String optString = jSONObject2.optString(KEY_VIEW_TYPE);
        long optLong = jSONObject2.optLong(KEY_RENDER_TIMEOUT, DEFAULT_RENDER_TIMEOUT);
        String optString2 = jSONObject2.optString(KEY_MARKUP);
        String optString3 = jSONObject2.optString(KEY_MARKUP_URL);
        if (optJSONObject != null) {
            str = optJSONObject.optString(KEY_CTA_ICON);
        } else {
            str = "";
        }
        String str2 = str;
        if (optJSONObject != null) {
            jSONObject3 = optJSONObject.optJSONObject(KEY_TITLE);
        }
        TextDTO fromJson = TextDTO.fromJson(jSONObject3);
        float optInt = (float) jSONObject2.optInt(KEY_CARD_HEIGHT, 116);
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        return new WidgetDTO(optString, optLong, optString2, optString3, str2, fromJson, optInt, optJSONObject2);
    }
}
