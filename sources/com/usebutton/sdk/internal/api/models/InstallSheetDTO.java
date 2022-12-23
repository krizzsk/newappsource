package com.usebutton.sdk.internal.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class InstallSheetDTO {
    private static final String KEY_APP_ACTION_TEXT = "app_action_text";
    private static final String KEY_APP_SUBTITLE_TEXT = "app_subtitle_text";
    private static final String KEY_APP_TITLE_TEXT = "app_title_text";
    private static final String KEY_TITLE_TEXT = "title_text";
    private static final String KEY_WEB_ACTION_TEXT = "web_action_text";
    public final TextDTO appActionText;
    public final TextDTO appSubtitleText;
    public final TextDTO appTitleText;
    public final TextDTO titleText;
    public final TextDTO webActionText;

    public InstallSheetDTO(TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, TextDTO textDTO5) {
        this.titleText = textDTO;
        this.appTitleText = textDTO2;
        this.appSubtitleText = textDTO3;
        this.appActionText = textDTO4;
        this.webActionText = textDTO5;
    }

    public static InstallSheetDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new InstallSheetDTO(TextDTO.fromJson(jSONObject.optJSONObject("title_text")), TextDTO.fromJson(jSONObject.optJSONObject(KEY_APP_TITLE_TEXT)), TextDTO.fromJson(jSONObject.optJSONObject(KEY_APP_SUBTITLE_TEXT)), TextDTO.fromJson(jSONObject.optJSONObject(KEY_APP_ACTION_TEXT)), TextDTO.fromJson(jSONObject.optJSONObject(KEY_WEB_ACTION_TEXT)));
    }
}
