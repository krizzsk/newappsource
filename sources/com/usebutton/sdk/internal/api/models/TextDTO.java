package com.usebutton.sdk.internal.api.models;

import com.appboy.models.MessageButton;
import org.json.JSONException;
import org.json.JSONObject;

public class TextDTO {
    public final String mColor;
    public final String mText;

    public TextDTO(String str, String str2) {
        this.mColor = str;
        this.mText = str2;
    }

    public static TextDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has(MessageButton.TEXT)) {
            return null;
        }
        return new TextDTO(jSONObject.getString("color"), jSONObject.getString(MessageButton.TEXT));
    }
}
