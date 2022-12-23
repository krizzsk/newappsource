package com.usebutton.sdk.internal.api.models;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BrowserDTO {
    private static final String ACTION_TEXT = "action_text";
    private static final String AUTOFILL = "autofill";
    private static final String CARDS = "cards";
    private static final String INSTALL_SHEET = "install_sheet";
    private static final String LAUNCH_WIDGET = "launch_widget";
    private static final String PRIMARY_COLOR = "primary_color";
    private static final String TITLE_TEXT = "title_text";
    private static final String WIDGETS = "widgets";
    public final TextDTO actionText;
    public final AutofillDTO autofillDTO;
    public final BrowserCardMapDTO browserCardMapDTO;
    public final InstallSheetDTO installSheet;
    public final WidgetDTO launchWidget;
    public final String primaryColor;
    public final TextDTO titleText;
    public final List<WidgetDTO> widgetDTOList;

    private BrowserDTO(String str, TextDTO textDTO, TextDTO textDTO2, InstallSheetDTO installSheetDTO, BrowserCardMapDTO browserCardMapDTO2, AutofillDTO autofillDTO2, WidgetDTO widgetDTO, List<WidgetDTO> list) {
        this.primaryColor = str;
        this.titleText = textDTO;
        this.actionText = textDTO2;
        this.installSheet = installSheetDTO;
        this.browserCardMapDTO = browserCardMapDTO2;
        this.autofillDTO = autofillDTO2;
        this.launchWidget = widgetDTO;
        this.widgetDTOList = list;
    }

    public static BrowserDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(WIDGETS);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                WidgetDTO fromJson = WidgetDTO.fromJson(optJSONArray.getJSONObject(i));
                if (fromJson != null) {
                    arrayList.add(fromJson);
                }
            }
        }
        return new BrowserDTO(jSONObject.getString("primary_color"), TextDTO.fromJson(jSONObject.optJSONObject("title_text")), TextDTO.fromJson(jSONObject.optJSONObject(ACTION_TEXT)), InstallSheetDTO.fromJson(jSONObject.optJSONObject("install_sheet")), BrowserCardMapDTO.fromJson(jSONObject.optJSONObject(CARDS)), AutofillDTO.fromJson(jSONObject.optJSONObject(AUTOFILL)), WidgetDTO.fromJson(jSONObject.optJSONObject(LAUNCH_WIDGET)), arrayList);
    }
}
