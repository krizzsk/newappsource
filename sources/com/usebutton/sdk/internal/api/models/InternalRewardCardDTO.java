package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class InternalRewardCardDTO {
    private static final String KEY_BACKGROUND_COLOR = "background_color";
    private static final String KEY_BODY = "body_text";
    private static final String KEY_CTA = "card_cta";
    private static final String KEY_CTA_ICON = "icon_url";
    private static final String KEY_SHOW_COUNT = "show_count";
    private static final String KEY_SHOW_DURATION_IN_MS = "show_duration_in_ms";
    private static final String KEY_TITLE = "title_text";
    public final String backgroundColor;
    public final TextDTO body;
    public final String ctaIcon;
    public final TextDTO ctaText;
    public final int showCount;
    public final long showDurationInMs;
    public final TextDTO title;

    private InternalRewardCardDTO(String str, int i, long j, String str2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3) {
        this.backgroundColor = str;
        this.showCount = i;
        this.showDurationInMs = j;
        this.ctaIcon = str2;
        this.ctaText = textDTO;
        this.title = textDTO2;
        this.body = textDTO3;
    }

    public static InternalRewardCardDTO fromJson(JSONObject jSONObject) throws JSONException {
        return new InternalRewardCardDTO(jSONObject.optString(KEY_BACKGROUND_COLOR), jSONObject.optInt("show_count", 0), jSONObject.optLong(KEY_SHOW_DURATION_IN_MS, 0), jSONObject.getJSONObject("card_cta").optString("icon_url"), TextDTO.fromJson(jSONObject.getJSONObject("card_cta").getJSONObject("title_text")), TextDTO.fromJson(jSONObject.getJSONObject("title_text")), TextDTO.fromJson(jSONObject.getJSONObject(KEY_BODY)));
    }
}
