package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.support.JsonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1707v1;

@Keep
public class InAppMessageHtml extends InAppMessageHtmlBase {
    public static final String ASSET_URLS_KEY = "asset_urls";
    public static final String MESSAGE_FIELDS_KEY = "message_fields";
    public List<String> mAssetUrls;
    public JSONObject mMessageFields;
    public Map<String, String> mRemotePathToLocalAssetMap;

    public InAppMessageHtml() {
        this.mRemotePathToLocalAssetMap = new HashMap();
        this.mMessageFields = new JSONObject();
        this.mAssetUrls = new ArrayList();
    }

    public List<String> getAssetUrls() {
        return this.mAssetUrls;
    }

    public Map<String, String> getLocalPrefetchedAssetPaths() {
        return this.mRemotePathToLocalAssetMap;
    }

    public JSONObject getMessageFields() {
        return this.mMessageFields;
    }

    public MessageType getMessageType() {
        return MessageType.HTML;
    }

    public List<String> getRemoteAssetPathsForPrefetch() {
        return this.mAssetUrls;
    }

    public void setAssetUrls(List<String> list) {
        if (list != null) {
            this.mAssetUrls = list;
        }
    }

    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        this.mRemotePathToLocalAssetMap = Collections.unmodifiableMap(map);
    }

    public void setMessageFields(JSONObject jSONObject) {
        this.mMessageFields = jSONObject;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.put("type", getMessageType().name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public InAppMessageHtml(JSONObject jSONObject, C1707v1 v1Var) {
        this(jSONObject, v1Var, jSONObject.optJSONObject(MESSAGE_FIELDS_KEY), JsonUtils.convertStringJsonArrayToList(jSONObject.optJSONArray(ASSET_URLS_KEY)));
    }

    public InAppMessageHtml(JSONObject jSONObject, C1707v1 v1Var, JSONObject jSONObject2, List<String> list) {
        super(jSONObject, v1Var);
        this.mRemotePathToLocalAssetMap = new HashMap();
        this.mMessageFields = jSONObject2;
        this.mAssetUrls = Collections.unmodifiableList(list);
    }
}
