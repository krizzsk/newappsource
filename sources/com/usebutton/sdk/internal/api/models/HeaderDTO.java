package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class HeaderDTO {
    public final String mBackgroundColor;
    public final TextDTO mSubtitle;
    public final TextDTO mTitle;

    public HeaderDTO(String str, TextDTO textDTO, TextDTO textDTO2) {
        this.mBackgroundColor = str;
        this.mTitle = textDTO;
        this.mSubtitle = textDTO2;
    }

    public static HeaderDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new HeaderDTO(jSONObject.getJSONObject(PostInstallNotificationProvider.KEY_BG).getString("color"), TextDTO.fromJson(jSONObject.getJSONObject(WidgetDTO.KEY_TITLE)), TextDTO.fromJson(jSONObject.getJSONObject("subtitle_text")));
    }
}
