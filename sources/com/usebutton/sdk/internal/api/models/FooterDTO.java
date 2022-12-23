package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class FooterDTO {
    public final LinkDTO mAction;
    public final String mBackgroundColor;
    public final ImageDTO mIcon;
    public final TextDTO mLabel;

    public FooterDTO(LinkDTO linkDTO, String str, ImageDTO imageDTO, TextDTO textDTO) {
        this.mAction = linkDTO;
        this.mBackgroundColor = str;
        this.mIcon = imageDTO;
        this.mLabel = textDTO;
    }

    public static FooterDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new FooterDTO(LinkDTO.fromJson(jSONObject.getJSONObject("actions")), jSONObject.getJSONObject(PostInstallNotificationProvider.KEY_BG).getString("color"), ImageDTO.fromJson(jSONObject.getJSONObject("icon_image")), TextDTO.fromJson(jSONObject.getJSONObject("label_text")));
    }
}
