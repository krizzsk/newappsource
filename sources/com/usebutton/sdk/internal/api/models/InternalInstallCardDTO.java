package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class InternalInstallCardDTO {
    private static final long DEFAULT_AUTO_SHOW_DELAY = 2000;
    private static final String KEY_APP_ICON = "app_icon_url";
    private static final String KEY_AUTO_SHOW_DELAY = "auto_show_delay_ms";
    private static final String KEY_BODY = "body_text";
    private static final String KEY_CTA = "card_cta";
    private static final String KEY_CTA_ICON = "icon_url";
    private static final String KEY_PRIMARY_ACTION = "primary_action_text";
    private static final String KEY_PRIMARY_COLOR = "primary_color";
    private static final String KEY_SECONDARY_ACTION = "secondary_action_text";
    private static final String KEY_TITLE = "title_text";
    public final String appIconUrl;
    public final long autoShowDelayInMs;
    public final TextDTO body;
    public final String ctaIcon;
    public final TextDTO ctaText;
    public final TextDTO primaryAction;
    public final String primaryColor;
    public final TextDTO secondaryAction;
    public final TextDTO title;

    private InternalInstallCardDTO(String str, TextDTO textDTO, TextDTO textDTO2, String str2, TextDTO textDTO3, TextDTO textDTO4, TextDTO textDTO5, String str3, long j) {
        this.primaryColor = str;
        this.title = textDTO;
        this.body = textDTO2;
        this.ctaIcon = str2;
        this.ctaText = textDTO3;
        this.primaryAction = textDTO4;
        this.secondaryAction = textDTO5;
        this.appIconUrl = str3;
        this.autoShowDelayInMs = j;
    }

    public static InternalInstallCardDTO fromJson(JSONObject jSONObject) throws JSONException {
        return new InternalInstallCardDTO(jSONObject.optString("primary_color"), TextDTO.fromJson(jSONObject.getJSONObject("title_text")), TextDTO.fromJson(jSONObject.getJSONObject(KEY_BODY)), jSONObject.getJSONObject("card_cta").getString("icon_url"), TextDTO.fromJson(jSONObject.getJSONObject("card_cta").getJSONObject("title_text")), TextDTO.fromJson(jSONObject.getJSONObject(KEY_PRIMARY_ACTION)), TextDTO.fromJson(jSONObject.getJSONObject(KEY_SECONDARY_ACTION)), jSONObject.optString("app_icon_url"), jSONObject.optLong(KEY_AUTO_SHOW_DELAY, DEFAULT_AUTO_SHOW_DELAY));
    }
}
