package com.usebutton.sdk.internal.api.models;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GroupDTO {
    public final List<ItemDTO> mItems;
    public final TextDTO mTitle;

    public static class ItemDTO {
        public final LinkDTO mAction;
        public final ImageDTO mIcon;
        public final TextDTO mIconText;
        public final TextDTO mSubtitle;
        public final TextDTO mTitle;

        public ItemDTO(LinkDTO linkDTO, TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO, TextDTO textDTO3) {
            this.mAction = linkDTO;
            this.mTitle = textDTO;
            this.mSubtitle = textDTO2;
            this.mIcon = imageDTO;
            this.mIconText = textDTO3;
        }

        public static ItemDTO fromJson(JSONObject jSONObject) throws JSONException {
            return new ItemDTO(LinkDTO.fromJson(jSONObject.getJSONObject("actions")), TextDTO.fromJson(jSONObject.getJSONObject(WidgetDTO.KEY_TITLE)), TextDTO.fromJson(jSONObject.optJSONObject("subtitle_text")), ImageDTO.fromJson(jSONObject.optJSONObject("icon_image")), TextDTO.fromJson(jSONObject.optJSONObject("icon_text")));
        }
    }

    public GroupDTO(TextDTO textDTO, ArrayList<ItemDTO> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.mItems = arrayList2;
        this.mTitle = textDTO;
        arrayList2.addAll(arrayList);
    }

    public static List<GroupDTO> fromJson(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(fromJson(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    private static GroupDTO fromJson(JSONObject jSONObject) throws JSONException {
        TextDTO fromJson = jSONObject.has(WidgetDTO.KEY_TITLE) ? TextDTO.fromJson(jSONObject.getJSONObject(WidgetDTO.KEY_TITLE)) : null;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(ItemDTO.fromJson(jSONArray.getJSONObject(i)));
        }
        return new GroupDTO(fromJson, arrayList);
    }
}
