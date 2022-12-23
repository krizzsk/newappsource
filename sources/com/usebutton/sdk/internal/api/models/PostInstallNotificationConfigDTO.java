package com.usebutton.sdk.internal.api.models;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public class PostInstallNotificationConfigDTO extends BaseDTO {
    private static final String KEY_BACKGROUND = "bg_image";
    private static final String KEY_CTA = "cta_text";
    private static final String KEY_CTA_BACKGROUND = "cta_bg_color";
    private static final String KEY_ICON = "app_icon";
    private static final String KEY_TIMEOUT = "auto_open_seconds";
    private static final String KEY_TITLE = "title_text";
    public final Uri backgroundImage;
    public final TextDTO cta;
    public final String ctaBackgroundColor;
    public final Uri icon;
    public final int timeoutWindowInSeconds;
    public final TextDTO title;

    public PostInstallNotificationConfigDTO(Uri uri, Uri uri2, int i, String str, TextDTO textDTO, TextDTO textDTO2) {
        this.icon = uri;
        this.backgroundImage = uri2;
        this.timeoutWindowInSeconds = i;
        this.ctaBackgroundColor = str;
        this.title = textDTO;
        this.cta = textDTO2;
    }

    public static PostInstallNotificationConfigDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new PostInstallNotificationConfigDTO(BaseDTO.uriOrNull(jSONObject, KEY_ICON), BaseDTO.uriOrNull(jSONObject, KEY_BACKGROUND), jSONObject.optInt(KEY_TIMEOUT, 60), jSONObject.optString(KEY_CTA_BACKGROUND), TextDTO.fromJson(jSONObject.optJSONObject("title_text")), TextDTO.fromJson(jSONObject.optJSONObject(KEY_CTA)));
    }
}
