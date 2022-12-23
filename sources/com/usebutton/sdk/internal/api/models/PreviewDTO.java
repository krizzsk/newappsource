package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class PreviewDTO {
    public final String mBackgroundColor;
    public final LinkDTO mDeepLink;
    public final ImageDTO mIcon;
    public final TextDTO mLabel;
    public final TextDTO mTitle;

    private PreviewDTO(String str, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, LinkDTO linkDTO) {
        this.mBackgroundColor = str;
        this.mIcon = imageDTO;
        this.mLabel = textDTO;
        this.mDeepLink = linkDTO;
        this.mTitle = textDTO2;
    }

    public static PreviewDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new PreviewDTO(jSONObject.getJSONObject(PostInstallNotificationProvider.KEY_BG).getString("color"), ImageDTO.fromJson(jSONObject.getJSONObject("icon_image")), TextDTO.fromJson(jSONObject.getJSONObject("label_text")), TextDTO.fromJson(jSONObject.optJSONObject(WidgetDTO.KEY_TITLE)), LinkDTO.fromJson(jSONObject.optJSONObject("direct_links")));
    }
}
