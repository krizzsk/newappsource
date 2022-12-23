package com.usebutton.sdk.internal.api.models;

import com.usebutton.sdk.internal.util.ButtonLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BodyDTO {

    public static class ListDTO extends BodyDTO {
        public final List<GroupDTO> groups;
        public final boolean showHeadings;

        public ListDTO(boolean z, List<GroupDTO> list) {
            ArrayList arrayList = new ArrayList();
            this.groups = arrayList;
            this.showHeadings = z;
            arrayList.addAll(list);
        }

        public static BodyDTO fromJson(JSONObject jSONObject) throws JSONException {
            JSONArray optJSONArray;
            if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("groups")) == null || optJSONArray.length() == 0) {
                return null;
            }
            return new ListDTO(jSONObject.optBoolean("show_group_titles", false), GroupDTO.fromJson(optJSONArray));
        }
    }

    public static BodyDTO fromJson(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        if ("list".equals(str)) {
            return ListDTO.fromJson(jSONObject);
        }
        ButtonLog.visibleFormat("Didn't know how to parse body of type: %s", str);
        return null;
    }
}
