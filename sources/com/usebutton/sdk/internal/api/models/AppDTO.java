package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class AppDTO extends BaseDTO {
    private static final String KEY_POST_INSTALL = "post_install_notification";
    public final PostInstallNotificationConfigDTO postInstallNotificationConfigDTO;

    public AppDTO(PostInstallNotificationConfigDTO postInstallNotificationConfigDTO2) {
        this.postInstallNotificationConfigDTO = postInstallNotificationConfigDTO2;
    }

    public static AppDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has(KEY_POST_INSTALL)) {
            return null;
        }
        return new AppDTO(PostInstallNotificationConfigDTO.fromJson(jSONObject.optJSONObject(KEY_POST_INSTALL)));
    }
}
